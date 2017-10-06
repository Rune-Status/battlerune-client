public class FileSystem extends Node {

	int anInt361;
	IndexFile index;
	byte[] aByteArray13;
	IndexData data;

	public static String method634(final int int_0) {
		return ((int_0 >> 24) & 0xFF) + "." + ((int_0 >> 16) & 0xFF) + "." + ((int_0 >> 8) & 0xFF) + "."
				+ (int_0 & 0xFF);
	}

}
