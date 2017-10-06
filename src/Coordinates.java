public class Coordinates {

	public int plane;
	public int worldX;
	public int worldY;

	public Coordinates() {
		plane = -1;
	}

	public Coordinates(final Coordinates coordinates_1) {
		plane = coordinates_1.plane;
		worldX = coordinates_1.worldX;
		worldY = coordinates_1.worldY;
	}

	public Coordinates(final int int_0, final int int_1, final int int_2) {
		plane = int_0;
		worldX = int_1;
		worldY = int_2;
	}

	public Coordinates(final int int_0) {
		if (int_0 == -1) {
			plane = -1;
		} else {
			plane = (int_0 >> 28) & 0x3;
			worldX = (int_0 >> 14) & 0x3FFF;
			worldY = int_0 & 0x3FFF;
		}
	}

	public int method489() {
		return (plane << 28) | (worldX << 14) | worldY;
	}

	public void method490(final int int_0, final int int_1, final int int_2) {
		plane = int_0;
		worldX = int_1;
		worldY = int_2;
	}

	boolean method491(final Coordinates coordinates_1) {
		return plane != coordinates_1.plane ? false
				: (worldX != coordinates_1.worldX ? false : worldY == coordinates_1.worldY);
	}

	@Override
	public boolean equals(final Object object_0) {
		return this == object_0 ? true
				: (!(object_0 instanceof Coordinates) ? false : method491((Coordinates) object_0));
	}

	@Override
	public int hashCode() {
		return method489();
	}

	@Override
	public String toString() {
		return plane + "," + (worldX >> 6) + "," + (worldY >> 6) + "," + (worldX & 0x3F) + "," + (worldY & 0x3F);
	}

	static final boolean method492() {
		return Client.menuOptionCount <= 0 ? false
				: Client.aBool77 && KeyFocusListener.aBoolArray3[81] && (Client.anInt654 != -1);
	}

}
