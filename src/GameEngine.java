import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {

	static volatile boolean focused;
	static GameEngine shell;
	static boolean aBool68;
	static int shellCount;
	static long aLong22;
	static int anInt619;
	static long[] aLongArray2;
	static int anInt620;
	static long[] aLongArray3;
	public static Signlink taskManager;
	protected static int FPS;
	static int anInt621;
	Clipboard aClipboard1;
	final EventQueue anEventQueue1;
	int anInt622;
	boolean aBool69;
	int anInt623;
	boolean aBool70;
	Class10 aClass10_1;
	java.awt.Frame aFrame1;
	Canvas canvas;
	int anInt624;
	int anInt625;
	volatile boolean aBool71;
	protected int anInt626;
	int anInt627;
	protected int anInt628;
	int anInt629;
	volatile long aLong23;
	volatile boolean aBool72;

	static {
		shell = null;
		shellCount = 0;
		aLong22 = 0L;
		aBool68 = false;
		anInt619 = 20;
		anInt620 = 1;
		FPS = 0;
		aLongArray3 = new long[32];
		aLongArray2 = new long[32];
		anInt621 = 500;
		focused = true;
	}

	protected GameEngine() {
		aBool70 = false;
		anInt623 = 0;
		anInt624 = 0;
		aBool71 = true;
		aBool69 = false;
		aBool72 = false;
		aLong23 = 0L;
		EventQueue eventqueue_0 = null;

		try {
			eventqueue_0 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (final Throwable throwable_0) {
			;
		}

		anEventQueue1 = eventqueue_0;
		final Class4 class4_0 = new Class4();
		Class104.anInterface2_1 = class4_0;
	}

	@Override
	public final void destroy() {
		if ((this == shell) && !aBool68) {
			aLong22 = Class6.currentTimeMs();
			Class14.method189(5000L);
			method1006();
		}
	}

	protected final boolean isValidHost() {
		String string_0 = getDocumentBase().getHost().toLowerCase();
		if (!string_0.equals("jagex.com") && !string_0.endsWith(".jagex.com")) {
			if (!string_0.equals("runescape.com") && !string_0.endsWith(".runescape.com")) {
				if (string_0.endsWith("127.0.0.1")) {
					return true;
				} else {
					while ((string_0.length() > 0) && (string_0.charAt(string_0.length() - 1) >= 48)
							&& (string_0.charAt(string_0.length() - 1) <= 57)) {
						string_0 = string_0.substring(0, string_0.length() - 1);
					}

					if (string_0.endsWith("192.168.1.")) {
						return true;
					} else {
						error("invalidhost");
						return false;
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@Override
	public final synchronized void paint(final Graphics graphics_0) {
		if ((this == shell) && !aBool68) {
			aBool71 = true;
			if ((Class6.currentTimeMs() - aLong23) > 1000L) {
				final Rectangle rectangle_0 = graphics_0.getClipBounds();
				if ((rectangle_0 == null) || ((rectangle_0.width >= Class25.canvasWidth)
						&& (rectangle_0.height >= FloorUnderlayDefinition.canvasHeight))) {
					aBool72 = true;
					return;
				}
			}

		}
	}

	Class100 method1004() {
		final Container container_0 = container();
		int int_0 = Math.max(container_0.getWidth(), anInt627);
		int int_1 = Math.max(container_0.getHeight(), anInt629);
		if (aFrame1 != null) {
			final Insets insets_0 = aFrame1.getInsets();
			int_0 -= insets_0.right + insets_0.left;
			int_1 -= insets_0.bottom + insets_0.top;
		}

		return new Class100(int_0, int_1);
	}

	Container container() {
		return aFrame1 != null ? aFrame1 : this;
	}

	protected void error(final String string_0) {
		if (!aBool70) {
			aBool70 = true;
			System.out.println("error_game_" + string_0);

			try {
				getAppletContext().showDocument(new URL(getCodeBase(), "error_game_" + string_0 + ".ws"), "_self");
			} catch (final Exception exception_0) {
				;
			}
		}
	}

	final void method1005() {
		aBool69 = true;
	}

	final synchronized void method1006() {
		if (!aBool68) {
			aBool68 = true;

			try {
				canvas.removeFocusListener(this);
			} catch (final Exception exception_0) {
				;
			}

			try {
				method1008();
			} catch (final Exception exception_1) {
				;
			}

			if (aFrame1 != null) {
				try {
					System.exit(0);
				} catch (final Throwable throwable_0) {
					;
				}
			}

			if (taskManager != null) {
				try {
					taskManager.join();
				} catch (final Exception exception_2) {
					;
				}
			}

			method1012();
		}
	}

	final synchronized void method1007() {
		final Container container_0 = container();
		if (canvas != null) {
			canvas.removeFocusListener(this);
			container_0.remove(canvas);
		}

		Class25.canvasWidth = Math.max(container_0.getWidth(), anInt627);
		FloorUnderlayDefinition.canvasHeight = Math.max(container_0.getHeight(), anInt629);
		Insets insets_0;
		if (aFrame1 != null) {
			insets_0 = aFrame1.getInsets();
			Class25.canvasWidth -= insets_0.right + insets_0.left;
			FloorUnderlayDefinition.canvasHeight -= insets_0.bottom + insets_0.top;
		}

		canvas = new RSCanvas(this);
		container_0.add(canvas);
		canvas.setSize(Class25.canvasWidth, FloorUnderlayDefinition.canvasHeight);
		canvas.setVisible(true);
		canvas.setBackground(Color.BLACK);
		if (container_0 == aFrame1) {
			insets_0 = aFrame1.getInsets();
			canvas.setLocation(insets_0.left + anInt623, insets_0.top + anInt624);
		} else {
			canvas.setLocation(anInt623, anInt624);
		}

		canvas.addFocusListener(this);
		canvas.requestFocus();
		aBool71 = true;
		if ((GZipDecompressor.aBufferProvider1 != null)
				&& (Class25.canvasWidth == GZipDecompressor.aBufferProvider1.width)
				&& (FloorUnderlayDefinition.canvasHeight == GZipDecompressor.aBufferProvider1.height)) {
			((MainBufferProvider) GZipDecompressor.aBufferProvider1).method598(canvas);
			GZipDecompressor.aBufferProvider1.method474(0, 0);
		} else {
			GZipDecompressor.aBufferProvider1 = new MainBufferProvider(Class25.canvasWidth,
					FloorUnderlayDefinition.canvasHeight, canvas);
		}

		aBool72 = false;
		aLong23 = Class6.currentTimeMs();
	}

	protected abstract void method1008();

	protected abstract void method1009();

	final void method1010() {
		final Container container_0 = container();
		if (container_0 != null) {
			final Class100 class100_0 = method1004();
			anInt626 = Math.max(class100_0.anInt211, anInt627);
			anInt628 = Math.max(class100_0.anInt212, anInt629);
			if (anInt626 <= 0) {
				anInt626 = 1;
			}

			if (anInt628 <= 0) {
				anInt628 = 1;
			}

			Class25.canvasWidth = Math.min(anInt626, anInt622);
			FloorUnderlayDefinition.canvasHeight = Math.min(anInt628, anInt625);
			anInt623 = (anInt626 - Class25.canvasWidth) / 2;
			anInt624 = 0;
			canvas.setSize(Class25.canvasWidth, FloorUnderlayDefinition.canvasHeight);
			GZipDecompressor.aBufferProvider1 = new MainBufferProvider(Class25.canvasWidth,
					FloorUnderlayDefinition.canvasHeight, canvas);
			if (container_0 == aFrame1) {
				final Insets insets_0 = aFrame1.getInsets();
				canvas.setLocation(anInt623 + insets_0.left, insets_0.top + anInt624);
			} else {
				canvas.setLocation(anInt623, anInt624);
			}

			aBool71 = true;
			method1024();
		}
	}

	protected final void method1011() {
		Timer.anImage1 = null;
		Class17.aFont2 = null;
		PacketBuffer.aFontMetrics1 = null;
	}

	protected abstract void method1012();

	protected final void method1013() {
		Class29.method228();
		final Canvas canvas_0 = canvas;
		canvas_0.setFocusTraversalKeysEnabled(false);
		canvas_0.addKeyListener(KeyFocusListener.keyboard);
		canvas_0.addFocusListener(KeyFocusListener.keyboard);
	}

	protected final void method1014() {
		final Canvas canvas_0 = canvas;
		canvas_0.addMouseListener(MouseInput.mouse);
		canvas_0.addMouseMotionListener(MouseInput.mouse);
		canvas_0.addFocusListener(MouseInput.mouse);
	}

	void method1015() {
		final long long_0 = Class6.currentTimeMs();
		final long long_1 = aLongArray2[Class14.anInt55];
		aLongArray2[Class14.anInt55] = long_0;
		Class14.anInt55 = (Class14.anInt55 + 1) & 0x1F;
		if ((long_1 != 0L) && (long_0 > long_1)) {
			;
		}

		synchronized (this) {
			Class36.aBool9 = focused;
		}

		packetHandler();
	}

	protected Interface3 method1016() {
		if (aClass10_1 == null) {
			aClass10_1 = new Class10();
			aClass10_1.method124(canvas);
		}

		return aClass10_1;
	}

	protected abstract void packetHandler();

	protected final void drawLoadingScreen(final int int_0, final String string_0, final boolean bool_0) {
		try {
			final Graphics graphics_0 = canvas.getGraphics();
			if (Class17.aFont2 == null) {
				Class17.aFont2 = new java.awt.Font("Helvetica", 1, 13);
				PacketBuffer.aFontMetrics1 = canvas.getFontMetrics(Class17.aFont2);
			}

			if (bool_0) {
				graphics_0.setColor(Color.black);
				graphics_0.fillRect(0, 0, Class25.canvasWidth, FloorUnderlayDefinition.canvasHeight);
			}

			final Color color_0 = new Color(140, 17, 17);

			try {
				if (Timer.anImage1 == null) {
					Timer.anImage1 = canvas.createImage(304, 34);
				}

				final Graphics graphics_1 = Timer.anImage1.getGraphics();
				graphics_1.setColor(color_0);
				graphics_1.drawRect(0, 0, 303, 33);
				graphics_1.fillRect(2, 2, int_0 * 3, 30);
				graphics_1.setColor(Color.black);
				graphics_1.drawRect(1, 1, 301, 31);
				graphics_1.fillRect((int_0 * 3) + 2, 2, 300 - (int_0 * 3), 30);
				graphics_1.setFont(Class17.aFont2);
				graphics_1.setColor(Color.white);
				graphics_1.drawString(string_0, (304 - PacketBuffer.aFontMetrics1.stringWidth(string_0)) / 2, 22);
				graphics_0.drawImage(Timer.anImage1, (Class25.canvasWidth / 2) - 152,
						(FloorUnderlayDefinition.canvasHeight / 2) - 18, (ImageObserver) null);
			} catch (final Exception exception_1) {
				final int int_1 = (Class25.canvasWidth / 2) - 152;
				final int int_2 = (FloorUnderlayDefinition.canvasHeight / 2) - 18;
				graphics_0.setColor(color_0);
				graphics_0.drawRect(int_1, int_2, 303, 33);
				graphics_0.fillRect(int_1 + 2, int_2 + 2, int_0 * 3, 30);
				graphics_0.setColor(Color.black);
				graphics_0.drawRect(int_1 + 1, int_2 + 1, 301, 31);
				graphics_0.fillRect((int_0 * 3) + int_1 + 2, int_2 + 2, 300 - (int_0 * 3), 30);
				graphics_0.setFont(Class17.aFont2);
				graphics_0.setColor(Color.white);
				graphics_0.drawString(string_0, int_1 + ((304 - PacketBuffer.aFontMetrics1.stringWidth(string_0)) / 2),
						int_2 + 22);
			}
		} catch (final Exception exception_0) {
			canvas.repaint();
		}
	}

	void method1017() {
		final Container container_0 = container();
		final long long_0 = Class6.currentTimeMs();
		final long long_1 = aLongArray3[Class16.anInt69];
		aLongArray3[Class16.anInt69] = long_0;
		Class16.anInt69 = (Class16.anInt69 + 1) & 0x1F;
		if ((long_1 != 0L) && (long_0 > long_1)) {
			final int int_0 = (int) (long_0 - long_1);
			FPS = ((int_0 >> 1) + 32000) / int_0;
		}

		if ((++anInt621 - 1) > 50) {
			anInt621 -= 50;
			aBool71 = true;
			canvas.setSize(Class25.canvasWidth, FloorUnderlayDefinition.canvasHeight);
			canvas.setVisible(true);
			if (container_0 == aFrame1) {
				final Insets insets_0 = aFrame1.getInsets();
				canvas.setLocation(anInt623 + insets_0.left, anInt624 + insets_0.top);
			} else {
				canvas.setLocation(anInt623, anInt624);
			}
		}

		if (aBool72) {
			method1021();
		}

		method1022();
		method1023(aBool71);
		if (aBool71) {
			method1025();
		}

		aBool71 = false;
	}

	final void method1018(final Object object_0) {
		if (anEventQueue1 != null) {
			for (int int_0 = 0; (int_0 < 50) && (anEventQueue1.peekEvent() != null); int_0++) {
				Class14.method189(1L);
			}

			if (object_0 != null) {
				anEventQueue1.postEvent(new ActionEvent(object_0, 1001, "dummy"));
			}

		}
	}

	protected void method1019() {
		aClipboard1 = getToolkit().getSystemClipboard();
	}

	protected final void method1020(final int int_0, final int int_1) {
		if ((anInt622 != int_0) || (int_1 != anInt625)) {
			method1005();
		}

		anInt622 = int_0;
		anInt625 = int_1;
	}

	final void method1021() {
		final Canvas canvas_0 = canvas;
		canvas_0.removeKeyListener(KeyFocusListener.keyboard);
		canvas_0.removeFocusListener(KeyFocusListener.keyboard);
		KeyFocusListener.anInt124 = -1;
		Tile.method640(canvas);
		if (aClass10_1 != null) {
			aClass10_1.method125(canvas);
		}

		method1007();
		final Canvas canvas_1 = canvas;
		canvas_1.setFocusTraversalKeysEnabled(false);
		canvas_1.addKeyListener(KeyFocusListener.keyboard);
		canvas_1.addFocusListener(KeyFocusListener.keyboard);
		final Canvas canvas_2 = canvas;
		canvas_2.addMouseListener(MouseInput.mouse);
		canvas_2.addMouseMotionListener(MouseInput.mouse);
		canvas_2.addFocusListener(MouseInput.mouse);
		if (aClass10_1 != null) {
			aClass10_1.method124(canvas);
		}

		method1005();
	}

	final void method1022() {
		final Class100 class100_0 = method1004();
		if ((anInt626 != class100_0.anInt211) || (class100_0.anInt212 != anInt628) || aBool69) {
			method1010();
			aBool69 = false;
		}

	}

	protected abstract void method1023(boolean var1);

	protected abstract void method1024();

	protected final void initialize(final int int_0, final int int_1, final int int_2) {
		try {
			if (shell != null) {
				++shellCount;
				if (shellCount >= 3) {
					error("alreadyloaded");
				} else {
					getAppletContext().showDocument(getDocumentBase(), "_self");
				}
			} else {
				shell = this;
				Class25.canvasWidth = int_0;
				FloorUnderlayDefinition.canvasHeight = int_1;
				RuntimeException_Sub1.revision = int_2;
				RuntimeException_Sub1.anApplet2 = this;
				if (taskManager == null) {
					taskManager = new Signlink();
				}

				taskManager.createRunnable(this, 1);
			}
		} catch (final Exception exception_0) {
			Class17.method201((String) null, exception_0);
			error("crash");
		}
	}

	void method1025() {
		final int int_0 = anInt623;
		final int int_1 = anInt624;
		final int int_2 = anInt626 - Class25.canvasWidth - int_0;
		final int int_3 = anInt628 - FloorUnderlayDefinition.canvasHeight - int_1;
		if ((int_0 > 0) || (int_2 > 0) || (int_1 > 0) || (int_3 > 0)) {
			try {
				final Container container_0 = container();
				int int_4 = 0;
				int int_5 = 0;
				if (container_0 == aFrame1) {
					final Insets insets_0 = aFrame1.getInsets();
					int_4 = insets_0.left;
					int_5 = insets_0.top;
				}

				final Graphics graphics_0 = container_0.getGraphics();
				graphics_0.setColor(Color.black);
				if (int_0 > 0) {
					graphics_0.fillRect(int_4, int_5, int_0, anInt628);
				}

				if (int_1 > 0) {
					graphics_0.fillRect(int_4, int_5, anInt626, int_1);
				}

				if (int_2 > 0) {
					graphics_0.fillRect((int_4 + anInt626) - int_2, int_5, int_2, anInt628);
				}

				if (int_3 > 0) {
					graphics_0.fillRect(int_4, (int_5 + anInt628) - int_3, anInt626, int_3);
					return;
				}
			} catch (final Exception exception_0) {
				return;
			}
		}

	}

	protected void method1026(final String string_0) {
		aClipboard1.setContents(new StringSelection(string_0), (ClipboardOwner) null);
	}

	protected final boolean method1027() {
		return aFrame1 != null;
	}

	@Override
	public final void start() {
		if ((this == shell) && !aBool68) {
			aLong22 = 0L;
		}
	}

	@Override
	public final void focusGained(final FocusEvent focusevent_0) {
		focused = true;
		aBool71 = true;
	}

	@Override
	public final void focusLost(final FocusEvent focusevent_0) {
		focused = false;
	}

	@Override
	public final void update(final Graphics graphics_0) {
		paint(graphics_0);
	}

	@Override
	public void run() {
		try {
			if (Signlink.javaVendor != null) {
				final String string_0 = Signlink.javaVendor.toLowerCase();
				if ((string_0.indexOf("sun") != -1) || (string_0.indexOf("apple") != -1)) {
					final String string_1 = Signlink.javaVersion;
					if (string_1.equals("1.1") || string_1.startsWith("1.1.") || string_1.equals("1.2")
							|| string_1.startsWith("1.2.") || string_1.equals("1.3") || string_1.startsWith("1.3.")
							|| string_1.equals("1.4") || string_1.startsWith("1.4.") || string_1.equals("1.5")
							|| string_1.startsWith("1.5.") || string_1.equals("1.6.0")) {
						error("wrongjava");
						return;
					}

					if (string_1.startsWith("1.6.0_")) {
						int int_0;
						for (int_0 = 6; (int_0 < string_1.length())
								&& Huffman.method543(string_1.charAt(int_0)); int_0++) {
							;
						}

						final String string_2 = string_1.substring(6, int_0);
						final boolean bool_0 = CacheableNode_Sub5.method831(string_2, 10, true);
						if (bool_0) {
							final int int_2 = Class104.parseInt(string_2, 10, true);
							if (int_2 < 10) {
								error("wrongjava");
								return;
							}
						}
					}

					anInt620 = 5;
				}
			}

			setFocusCycleRoot(true);
			method1007();
			method1009();

			Object object_0;
			try {
				object_0 = new NanoTimer();
			} catch (final Throwable throwable_0) {
				object_0 = new MilliTimer();
			}

			Class15.timer = (Timer) object_0;

			while ((aLong22 == 0L) || (Class6.currentTimeMs() < aLong22)) {
				Class105.anInt215 = Class15.timer.method556(anInt619, anInt620);

				for (int int_1 = 0; int_1 < Class105.anInt215; int_1++) {
					method1015();
				}

				method1017();
				method1018(canvas);
			}
		} catch (final Exception exception_0) {
			Class17.method201((String) null, exception_0);
			error("crash");
		}

		method1006();
	}

	@Override
	public final void windowActivated(final WindowEvent windowevent_0) {
	}

	@Override
	public final void windowClosing(final WindowEvent windowevent_0) {
		destroy();
	}

	@Override
	public final void windowDeactivated(final WindowEvent windowevent_0) {
	}

	@Override
	public final void windowDeiconified(final WindowEvent windowevent_0) {
	}

	@Override
	public final void windowIconified(final WindowEvent windowevent_0) {
	}

	@Override
	public final void windowOpened(final WindowEvent windowevent_0) {
	}

	@Override
	public abstract void init();

	@Override
	public final void stop() {
		if ((this == shell) && !aBool68) {
			aLong22 = Class6.currentTimeMs() + 4000L;
		}
	}

	@Override
	public final void windowClosed(final WindowEvent windowevent_0) {
	}

	public static String method1028(final int int_0, final boolean bool_0) {
		return bool_0 && (int_0 >= 0) ? Class57.method348(int_0, 10, bool_0) : Integer.toString(int_0);
	}

	static final void method1029(final boolean bool_0) {
		while (true) {
			if (Client.secretPacketBuffer2.bitsAvail(Client.packetLength) >= 27) {
				final int int_0 = Client.secretPacketBuffer2.getBits(15);
				if (int_0 != 32767) {
					boolean bool_1 = false;
					if (Client.cachedNPCs[int_0] == null) {
						Client.cachedNPCs[int_0] = new NPC();
						bool_1 = true;
					}

					final NPC npc_0 = Client.cachedNPCs[int_0];
					Client.npcIndices[++Client.anInt690 - 1] = int_0;
					npc_0.anInt562 = Client.gameCycle;
					int int_1;
					if (bool_0) {
						int_1 = Client.secretPacketBuffer2.getBits(8);
						if (int_1 > 127) {
							int_1 -= 256;
						}
					} else {
						int_1 = Client.secretPacketBuffer2.getBits(5);
						if (int_1 > 15) {
							int_1 -= 32;
						}
					}

					npc_0.composition = Class81.getNpcDefinition(Client.secretPacketBuffer2.getBits(14));
					final int int_2 = Client.anIntArray167[Client.secretPacketBuffer2.getBits(3)];
					if (bool_1) {
						npc_0.orientation = npc_0.angle = int_2;
					}

					int int_3;
					if (bool_0) {
						int_3 = Client.secretPacketBuffer2.getBits(8);
						if (int_3 > 127) {
							int_3 -= 256;
						}
					} else {
						int_3 = Client.secretPacketBuffer2.getBits(5);
						if (int_3 > 15) {
							int_3 -= 32;
						}
					}

					final int int_4 = Client.secretPacketBuffer2.getBits(1);
					final int int_5 = Client.secretPacketBuffer2.getBits(1);
					if (int_5 == 1) {
						Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = int_0;
					}

					npc_0.anInt542 = npc_0.composition.anInt518;
					npc_0.anInt564 = npc_0.composition.anInt531;
					if (npc_0.anInt564 == 0) {
						npc_0.angle = 0;
					}

					npc_0.anInt545 = npc_0.composition.anInt520;
					npc_0.anInt546 = npc_0.composition.anInt525;
					npc_0.anInt548 = npc_0.composition.anInt526;
					npc_0.anInt549 = npc_0.composition.anInt527;
					npc_0.idlePoseAnimation = npc_0.composition.anInt519;
					npc_0.anInt543 = npc_0.composition.anInt521;
					npc_0.anInt544 = npc_0.composition.anInt522;
					npc_0.method1000(int_1 + Script.localPlayer.pathX[0], int_3 + Script.localPlayer.pathY[0],
							int_4 == 1);
					continue;
				}
			}

			Client.secretPacketBuffer2.byteAccess();
			return;
		}
	}

	static Script method1030(final int int_0, final Class91 class91_0) {
		Script script_0 = (Script) Script.aNodeCache19.get(int_0 << 16);
		if (script_0 != null) {
			return script_0;
		} else {
			final String string_0 = String.valueOf(int_0);
			final int int_1 = Class99.indexScripts.getFile(string_0);
			if (int_1 == -1) {
				return null;
			} else {
				final byte[] bytes_0 = Class99.indexScripts.method434(int_1);
				if (bytes_0 != null) {
					if (bytes_0.length <= 1) {
						return null;
					}

					script_0 = NPC.method1003(bytes_0);
					if (script_0 != null) {
						Script.aNodeCache19.put(script_0, int_0 << 16);
						return script_0;
					}
				}

				return null;
			}
		}
	}

	public static final void method1031() {
		Class56.aBool16 = false;
		Class56.anInt145 = 0;
	}

}
