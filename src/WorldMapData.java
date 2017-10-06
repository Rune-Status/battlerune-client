import java.util.Iterator;
import java.util.LinkedList;

public class WorldMapData {

	String aString9;
	int anInt106;
	int fileId;
	boolean aBool14;
	String aString10;
	int anInt107;
	Coordinates aCoordinates6;
	LinkedList aLinkedList2;
	int anInt108;
	int anInt109;
	int anInt110;
	int anInt111;

	public WorldMapData() {
		fileId = -1;
		anInt106 = -1;
		anInt107 = -1;
		aCoordinates6 = null;
		anInt110 = Integer.MAX_VALUE;
		anInt108 = 0;
		anInt111 = Integer.MAX_VALUE;
		anInt109 = 0;
		aBool14 = false;
	}

	public void loadMapData(final Buffer buffer_0, final int int_0) {
		fileId = int_0;
		aString10 = buffer_0.readString();
		aString9 = buffer_0.readString();
		aCoordinates6 = new Coordinates(buffer_0.readInt());
		anInt106 = buffer_0.readInt();
		buffer_0.readUnsignedByte();
		aBool14 = buffer_0.readUnsignedByte() == 1;
		anInt107 = buffer_0.readUnsignedByte();
		final int int_1 = buffer_0.readUnsignedByte();
		aLinkedList2 = new LinkedList();

		for (int int_2 = 0; int_2 < int_1; int_2++) {
			aLinkedList2.add(method295(buffer_0));
		}

		method294();
	}

	public String method282() {
		return aString10;
	}

	public boolean method283(final int int_0, final int int_1) {
		final int int_2 = int_0 / 64;
		final int int_3 = int_1 / 64;
		if ((int_2 >= anInt110) && (int_2 <= anInt108)) {
			if ((int_3 >= anInt111) && (int_3 <= anInt109)) {
				final Iterator iterator_0 = aLinkedList2.iterator();

				WorldMapSectionBase worldmapsectionbase_0;
				do {
					if (!iterator_0.hasNext()) {
						return false;
					}

					worldmapsectionbase_0 = (WorldMapSectionBase) iterator_0.next();
				} while (!worldmapsectionbase_0.method5(int_0, int_1));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public int method284() {
		return fileId;
	}

	public int[] method285(final int int_0, final int int_1, final int int_2) {
		final Iterator iterator_0 = aLinkedList2.iterator();

		WorldMapSectionBase worldmapsectionbase_0;
		do {
			if (!iterator_0.hasNext()) {
				return null;
			}

			worldmapsectionbase_0 = (WorldMapSectionBase) iterator_0.next();
		} while (!worldmapsectionbase_0.method6(int_0, int_1, int_2));

		return worldmapsectionbase_0.method9(int_0, int_1, int_2);
	}

	public int method286() {
		return anInt110;
	}

	public int method287() {
		return anInt111;
	}

	public boolean method288(final int int_0, final int int_1, final int int_2) {
		final Iterator iterator_0 = aLinkedList2.iterator();

		WorldMapSectionBase worldmapsectionbase_0;
		do {
			if (!iterator_0.hasNext()) {
				return false;
			}

			worldmapsectionbase_0 = (WorldMapSectionBase) iterator_0.next();
		} while (!worldmapsectionbase_0.method6(int_0, int_1, int_2));

		return true;
	}

	public Coordinates method289(final int int_0, final int int_1) {
		final Iterator iterator_0 = aLinkedList2.iterator();

		WorldMapSectionBase worldmapsectionbase_0;
		do {
			if (!iterator_0.hasNext()) {
				return null;
			}

			worldmapsectionbase_0 = (WorldMapSectionBase) iterator_0.next();
		} while (!worldmapsectionbase_0.method5(int_0, int_1));

		return worldmapsectionbase_0.method8(int_0, int_1);
	}

	public int method290() {
		return aCoordinates6.plane;
	}

	public int method291() {
		return aCoordinates6.worldX;
	}

	public int method292() {
		return aCoordinates6.worldY;
	}

	public int method293() {
		return anInt107;
	}

	void method294() {
		final Iterator iterator_0 = aLinkedList2.iterator();

		while (iterator_0.hasNext()) {
			final WorldMapSectionBase worldmapsectionbase_0 = (WorldMapSectionBase) iterator_0.next();
			worldmapsectionbase_0.method7(this);
		}

	}

	WorldMapSectionBase method295(final Buffer buffer_0) {
		final int int_0 = buffer_0.readUnsignedByte();
		final Enum1 enum1_0 = (Enum1) PendingSpawn.forOrdinal(Enum1.method576(), int_0);
		Object object_0 = null;
		switch (enum1_0.anInt323) {
		case 0:
			object_0 = new WorldMapType1();
			break;
		case 1:
			object_0 = new WorldMapType3();
			break;
		case 2:
			object_0 = new Class15();
			break;
		case 3:
			object_0 = new WorldMapType2();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSectionBase) object_0).method10(buffer_0);
		return (WorldMapSectionBase) object_0;
	}

	public boolean method296() {
		return aBool14;
	}

	public int method297() {
		return anInt108;
	}

	public int method298() {
		return anInt109;
	}

	int method299() {
		return anInt106;
	}

	public String method300() {
		return aString9;
	}

	public Coordinates method301() {
		return new Coordinates(aCoordinates6);
	}

	static int method302(final int int_0, final int int_1) {
		final Overlay overlay_0 = CacheableNode_Sub5.method830(int_0);
		if (overlay_0 == null) {
			return int_1;
		} else if (overlay_0.otherRgbColor >= 0) {
			return overlay_0.otherRgbColor | 0xFF000000;
		} else {
			int int_2;
			if (overlay_0.texture >= 0) {
				int_2 = Class109.method514(Graphics3D.textureLoader.getAverageTextureRGB(overlay_0.texture), 96);
				return Graphics3D.colorPalette[int_2] | 0xFF000000;
			} else if (overlay_0.color == 16711935) {
				return int_1;
			} else {
				int_2 = XGrandExchangeOffer.method112(overlay_0.hue, overlay_0.saturation, overlay_0.lightness);
				final int int_3 = Class109.method514(int_2, 96);
				return Graphics3D.colorPalette[int_3] | 0xFF000000;
			}
		}
	}

	static void method303(final int int_0) {
		for (WidgetConfig widgetconfig_0 = (WidgetConfig) Client.widgetFlags
				.method515(); widgetconfig_0 != null; widgetconfig_0 = (WidgetConfig) Client.widgetFlags.method516()) {
			if (int_0 == ((widgetconfig_0.hash >> 48) & 0xFFFFL)) {
				widgetconfig_0.unlink();
			}
		}

	}

	static final int method304(final Class110 class110_0) {
		if (class110_0 == null) {
			return 12;
		} else {
			switch (class110_0.anInt222) {
			case 6:
				return 20;
			default:
				return 12;
			}
		}
	}

}
