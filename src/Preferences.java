import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Preferences {

	static int anInt172;
	int screenType;
	LinkedHashMap preferences;
	boolean hideRoofs;
	boolean muted;

	static {
		anInt172 = 4;
	}

	Preferences() {
		screenType = 1;
		preferences = new LinkedHashMap();
		method400(true);
	}

	Preferences(final Buffer buffer_0) {
		screenType = 1;
		preferences = new LinkedHashMap();
		if ((buffer_0 != null) && (buffer_0.payload != null)) {
			final int int_0 = buffer_0.readUnsignedByte();
			if ((int_0 >= 0) && (int_0 <= anInt172)) {
				if (buffer_0.readUnsignedByte() == 1) {
					hideRoofs = true;
				}

				if (int_0 > 1) {
					muted = buffer_0.readUnsignedByte() == 1;
				}

				if (int_0 > 3) {
					screenType = buffer_0.readUnsignedByte();
				}

				if (int_0 > 2) {
					final int int_1 = buffer_0.readUnsignedByte();

					for (int int_2 = 0; int_2 < int_1; int_2++) {
						final int int_3 = buffer_0.readInt();
						final int int_4 = buffer_0.readInt();
						preferences.put(Integer.valueOf(int_3), Integer.valueOf(int_4));
					}
				}
			} else {
				method400(true);
			}

		} else {
			method400(true);
		}
	}

	void method400(final boolean bool_0) {
	}

	Buffer serialize() {
		final Buffer buffer_0 = new Buffer(100);
		buffer_0.putByte(anInt172);
		buffer_0.putByte(hideRoofs ? 1 : 0);
		buffer_0.putByte(muted ? 1 : 0);
		buffer_0.putByte(screenType);
		buffer_0.putByte(preferences.size());
		final Iterator iterator_0 = preferences.entrySet().iterator();

		while (iterator_0.hasNext()) {
			final Entry map$entry_0 = (Entry) iterator_0.next();
			buffer_0.putInt(((Integer) map$entry_0.getKey()).intValue());
			buffer_0.putInt(((Integer) map$entry_0.getValue()).intValue());
		}

		return buffer_0;
	}

	public static void method401() {
		CacheableNode_Sub4.aNodeCache16.reset();
	}

}
