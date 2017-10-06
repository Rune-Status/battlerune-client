import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Signlink implements Runnable {

	public static String javaVendor;
	public static String javaVersion;
	static int clanChatCount;
	boolean closed;
	Task currentTask;
	Thread sysEventQueue;
	Task cachedTask;

	public Signlink() {
		currentTask = null;
		cachedTask = null;
		closed = false;
		javaVendor = "Unknown";
		javaVersion = "1.6";

		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (final Exception exception_0) {
			;
		}

		closed = false;
		sysEventQueue = new Thread(this);
		sysEventQueue.setPriority(10);
		sysEventQueue.setDaemon(true);
		sysEventQueue.start();
	}

	final Task method477(final int int_0, final int int_1, final int int_2, final Object object_0) {
		final Task task_0 = new Task();
		task_0.type = int_0;
		task_0.anInt224 = int_1;
		task_0.anObject3 = object_0;
		synchronized (this) {
			if (cachedTask != null) {
				cachedTask.task = task_0;
				cachedTask = task_0;
			} else {
				cachedTask = currentTask = task_0;
			}

			notify();
			return task_0;
		}
	}

	public final Task createURL(final URL url_0) {
		return method477(4, 0, 0, url_0);
	}

	public final Task createRunnable(final Runnable runnable_0, final int int_0) {
		return method477(2, int_0, 0, runnable_0);
	}

	public final void join() {
		synchronized (this) {
			closed = true;
			notifyAll();
		}

		try {
			sysEventQueue.join();
		} catch (final InterruptedException interruptedexception_0) {
			;
		}
	}

	public final Task createSocket(final String string_0, final int int_0) {
		return method477(1, int_0, 0, string_0);
	}

	public final Task createHost(final int int_0) {
		return method477(3, int_0, 0, (Object) null);
	}

	@Override
	public final void run() {
		while (true) {
			Task task_0;
			synchronized (this) {
				while (true) {
					if (closed) {
						return;
					}

					if (currentTask != null) {
						task_0 = currentTask;
						currentTask = currentTask.task;
						if (currentTask == null) {
							cachedTask = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (final InterruptedException interruptedexception_0) {
						;
					}
				}
			}

			try {
				final int int_0 = task_0.type;
				if (int_0 == 1) {
					task_0.value = new Socket(InetAddress.getByName((String) task_0.anObject3), task_0.anInt224);
				} else if (int_0 == 2) {
					final Thread thread_0 = new Thread((Runnable) task_0.anObject3);
					thread_0.setDaemon(true);
					thread_0.start();
					thread_0.setPriority(task_0.anInt224);
					task_0.value = thread_0;
				} else if (int_0 == 4) {
					task_0.value = new DataInputStream(((URL) task_0.anObject3).openStream());
				} else if (int_0 == 3) {
					final String string_0 = ((task_0.anInt224 >> 24) & 0xFF) + "." + ((task_0.anInt224 >> 16) & 0xFF)
							+ "." + ((task_0.anInt224 >> 8) & 0xFF) + "." + (task_0.anInt224 & 0xFF);
					task_0.value = InetAddress.getByName(string_0).getHostName();
				}

				task_0.status = 1;
			} catch (final ThreadDeath threaddeath_0) {
				throw threaddeath_0;
			} catch (final Throwable throwable_0) {
				task_0.status = 2;
			}
		}
	}

	static final void method478(final PendingSpawn pendingspawn_0) {
		int int_0 = 0;
		int int_1 = -1;
		int int_2 = 0;
		int int_3 = 0;
		if (pendingspawn_0.type == 0) {
			int_0 = Class8.region.method361(pendingspawn_0.level, pendingspawn_0.anInt363, pendingspawn_0.anInt364);
		}

		if (pendingspawn_0.type == 1) {
			int_0 = Class8.region.method362(pendingspawn_0.level, pendingspawn_0.anInt363, pendingspawn_0.anInt364);
		}

		if (pendingspawn_0.type == 2) {
			int_0 = Class8.region.method365(pendingspawn_0.level, pendingspawn_0.anInt363, pendingspawn_0.anInt364);
		}

		if (pendingspawn_0.type == 3) {
			int_0 = Class8.region.method363(pendingspawn_0.level, pendingspawn_0.anInt363, pendingspawn_0.anInt364);
		}

		if (int_0 != 0) {
			final int int_4 = Class8.region.method364(pendingspawn_0.level, pendingspawn_0.anInt363,
					pendingspawn_0.anInt364, int_0);
			int_1 = (int_0 >> 14) & 0x7FFF;
			int_2 = int_4 & 0x1F;
			int_3 = (int_4 >> 6) & 0x3;
		}

		pendingspawn_0.anInt365 = int_1;
		pendingspawn_0.anInt367 = int_2;
		pendingspawn_0.anInt369 = int_3;
	}

	static final void method479() {
		for (PendingSpawn pendingspawn_0 = (PendingSpawn) Client.pendingSpawns
				.getFront(); pendingspawn_0 != null; pendingspawn_0 = (PendingSpawn) Client.pendingSpawns.getNext()) {
			if (pendingspawn_0.hitpoints == -1) {
				pendingspawn_0.delay = 0;
				method478(pendingspawn_0);
			} else {
				pendingspawn_0.unlink();
			}
		}

	}

}
