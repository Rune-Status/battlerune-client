public class MachineInfo extends Node {

	String aString20;
	int[] anIntArray80;
	int osType;
	String aString21;
	boolean os32Bit;
	int osVersionType;
	String aString22;
	int javaVendorType;
	int javaVersionMajor;
	String aString23;
	int javaVersionMinor;
	String aString24;
	int javaVersionPatch;
	boolean aBool47;
	String aString25;
	int maxMemoryMB;
	int anInt401;
	int anInt402;
	int anInt403;
	int anInt404;
	int anInt405;
	int anInt406;
	int anInt407;
	int anInt408;

	public MachineInfo(final boolean bool_0) {
		anIntArray80 = new int[3];
		if (Class39.osNameLC.startsWith("win")) {
			osType = 1;
		} else if (Class39.osNameLC.startsWith("mac")) {
			osType = 2;
		} else if (Class39.osNameLC.startsWith("linux")) {
			osType = 3;
		} else {
			osType = 4;
		}

		String string_0;
		try {
			string_0 = System.getProperty("os.arch").toLowerCase();
		} catch (final Exception exception_0) {
			string_0 = "";
		}

		String string_1;
		try {
			string_1 = System.getProperty("os.version").toLowerCase();
		} catch (final Exception exception_1) {
			string_1 = "";
		}

		String string_2 = "Unknown";
		String string_3 = "1.1";

		try {
			string_2 = System.getProperty("java.vendor");
			string_3 = System.getProperty("java.version");
		} catch (final Exception exception_2) {
			;
		}

		if (!string_0.startsWith("amd64") && !string_0.startsWith("x86_64")) {
			os32Bit = false;
		} else {
			os32Bit = true;
		}

		if (osType == 1) {
			if (string_1.indexOf("4.0") != -1) {
				osVersionType = 1;
			} else if (string_1.indexOf("4.1") != -1) {
				osVersionType = 2;
			} else if (string_1.indexOf("4.9") != -1) {
				osVersionType = 3;
			} else if (string_1.indexOf("5.0") != -1) {
				osVersionType = 4;
			} else if (string_1.indexOf("5.1") != -1) {
				osVersionType = 5;
			} else if (string_1.indexOf("5.2") != -1) {
				osVersionType = 8;
			} else if (string_1.indexOf("6.0") != -1) {
				osVersionType = 6;
			} else if (string_1.indexOf("6.1") != -1) {
				osVersionType = 7;
			} else if (string_1.indexOf("6.2") != -1) {
				osVersionType = 9;
			} else if (string_1.indexOf("6.3") != -1) {
				osVersionType = 10;
			}
		} else if (osType == 2) {
			if (string_1.indexOf("10.4") != -1) {
				osVersionType = 20;
			} else if (string_1.indexOf("10.5") != -1) {
				osVersionType = 21;
			} else if (string_1.indexOf("10.6") != -1) {
				osVersionType = 22;
			} else if (string_1.indexOf("10.7") != -1) {
				osVersionType = 23;
			} else if (string_1.indexOf("10.8") != -1) {
				osVersionType = 24;
			} else if (string_1.indexOf("10.9") != -1) {
				osVersionType = 25;
			} else if (string_1.indexOf("10.10") != -1) {
				osVersionType = 26;
			}
		}

		if (string_2.toLowerCase().indexOf("sun") != -1) {
			javaVendorType = 1;
		} else if (string_2.toLowerCase().indexOf("microsoft") != -1) {
			javaVendorType = 2;
		} else if (string_2.toLowerCase().indexOf("apple") != -1) {
			javaVendorType = 3;
		} else if (string_2.toLowerCase().indexOf("oracle") != -1) {
			javaVendorType = 5;
		} else {
			javaVendorType = 4;
		}

		int int_0 = 2;
		int int_1 = 0;

		char char_0;
		try {
			while (int_0 < string_3.length()) {
				char_0 = string_3.charAt(int_0);
				if ((char_0 < 48) || (char_0 > 57)) {
					break;
				}

				int_1 = (int_1 * 10) + (char_0 - 48);
				++int_0;
			}
		} catch (final Exception exception_3) {
			;
		}

		javaVersionMajor = int_1;
		int_0 = string_3.indexOf(46, 2) + 1;
		int_1 = 0;

		try {
			while (int_0 < string_3.length()) {
				char_0 = string_3.charAt(int_0);
				if ((char_0 < 48) || (char_0 > 57)) {
					break;
				}

				int_1 = (char_0 - 48) + (10 * int_1);
				++int_0;
			}
		} catch (final Exception exception_4) {
			;
		}

		javaVersionMinor = int_1;
		int_0 = string_3.indexOf(95, 4) + 1;
		int_1 = 0;

		try {
			while (int_0 < string_3.length()) {
				char_0 = string_3.charAt(int_0);
				if ((char_0 < 48) || (char_0 > 57)) {
					break;
				}

				int_1 = (int_1 * 10) + (char_0 - 48);
				++int_0;
			}
		} catch (final Exception exception_5) {
			;
		}

		javaVersionPatch = int_1;
		aBool47 = false;
		maxMemoryMB = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		if (javaVersionMajor > 3) {
			anInt401 = Runtime.getRuntime().availableProcessors();
		} else {
			anInt401 = 0;
		}

		anInt402 = 0;
		if (aString20 == null) {
			aString20 = "";
		}

		if (aString21 == null) {
			aString21 = "";
		}

		if (aString22 == null) {
			aString22 = "";
		}

		if (aString23 == null) {
			aString23 = "";
		}

		if (aString24 == null) {
			aString24 = "";
		}

		if (aString25 == null) {
			aString25 = "";
		}

		method658();
	}

	void method658() {
		if (aString20.length() > 40) {
			aString20 = aString20.substring(0, 40);
		}

		if (aString21.length() > 40) {
			aString21 = aString21.substring(0, 40);
		}

		if (aString22.length() > 10) {
			aString22 = aString22.substring(0, 10);
		}

		if (aString23.length() > 10) {
			aString23 = aString23.substring(0, 10);
		}

	}

	public int method659() {
		final byte byte_0 = 38;
		int int_0 = byte_0 + Class45.method268(aString20);
		int_0 += Class45.method268(aString21);
		int_0 += Class45.method268(aString22);
		int_0 += Class45.method268(aString23);
		int_0 += Class45.method268(aString24);
		int_0 += Class45.method268(aString25);
		return int_0;
	}

	public void method660(final Buffer buffer_0) {
		buffer_0.putByte(6);
		buffer_0.putByte(osType);
		buffer_0.putByte(os32Bit ? 1 : 0);
		buffer_0.putByte(osVersionType);
		buffer_0.putByte(javaVendorType);
		buffer_0.putByte(javaVersionMajor);
		buffer_0.putByte(javaVersionMinor);
		buffer_0.putByte(javaVersionPatch);
		buffer_0.putByte(aBool47 ? 1 : 0);
		buffer_0.putShort(maxMemoryMB);
		buffer_0.putByte(anInt401);
		buffer_0.put24bitInt(anInt402);
		buffer_0.putShort(anInt403);
		buffer_0.putJagString(aString20);
		buffer_0.putJagString(aString21);
		buffer_0.putJagString(aString22);
		buffer_0.putJagString(aString23);
		buffer_0.putByte(anInt404);
		buffer_0.putShort(anInt405);
		buffer_0.putJagString(aString24);
		buffer_0.putJagString(aString25);
		buffer_0.putByte(anInt406);
		buffer_0.putByte(anInt407);

		// length of 3
		for (int int_0 = 0; int_0 < anIntArray80.length; int_0++) {
			buffer_0.putInt(anIntArray80[int_0]);
		}

		buffer_0.putInt(anInt408);
	}

}
