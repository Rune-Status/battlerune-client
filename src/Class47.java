import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class47 {

	static final BigInteger aBigInteger1;
	static int anInt103;
	static final BigInteger aBigInteger2;
	static SpritePixels compass;
	static int anInt104;

	static {
		aBigInteger1 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		aBigInteger2 = new BigInteger(
				"7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	static void method275() {
		Class26.username = Class26.username.trim();
		if (Class26.username.length() == 0) {
			Class41.method261("Please enter your username.", "If you created your account after November",
					"2010, this will be the creation email address.");
		} else {
			long long_1;
			try {

				final URL url_0 = new URL(WidgetNode.method647("services", false) + "m=accountappeal/login.ws");
				final URLConnection urlconnection_0 = url_0.openConnection();
				urlconnection_0.setRequestProperty("connection", "close");
				urlconnection_0.setDoInput(true);
				urlconnection_0.setDoOutput(true);
				urlconnection_0.setConnectTimeout(5000);
				final OutputStreamWriter outputstreamwriter_0 = new OutputStreamWriter(
						urlconnection_0.getOutputStream());
				outputstreamwriter_0.write("data1=req");
				outputstreamwriter_0.flush();
				final InputStream inputstream_0 = urlconnection_0.getInputStream();
				final Buffer buffer_0 = new Buffer(new byte[1000]);

				while (true) {
					final int int_0 = inputstream_0.read(buffer_0.payload, buffer_0.offset, 1000 - buffer_0.offset);
					if (int_0 == -1) {
						buffer_0.offset = 0;
						final long long_0 = buffer_0.readLong();
						long_1 = long_0;
						break;
					}

					buffer_0.offset += int_0;
					if (buffer_0.offset >= 1000) {
						long_1 = 0L;
						break;
					}
				}
			} catch (final Exception exception_0) {
				long_1 = 0L;
			}

			byte byte_0;
			if (long_1 == 0L) {
				byte_0 = 5;
			} else {
				final String string_2 = Class26.username;
				final Random random_0 = new Random();
				final Buffer buffer_1 = new Buffer(128);
				final Buffer buffer_2 = new Buffer(128);
				final int[] ints_0 = new int[] { random_0.nextInt(), random_0.nextInt(), (int) (long_1 >> 32),
						(int) long_1 };
				buffer_1.putByte(10);

				int int_1;
				for (int_1 = 0; int_1 < 4; int_1++) {
					buffer_1.putInt(random_0.nextInt());
				}

				buffer_1.putInt(ints_0[0]);
				buffer_1.putInt(ints_0[1]);
				buffer_1.putLong(long_1);
				buffer_1.putLong(0L);

				for (int_1 = 0; int_1 < 4; int_1++) {
					buffer_1.putInt(random_0.nextInt());
				}

				buffer_1.encryptRsa(aBigInteger1, aBigInteger2);
				buffer_2.putByte(10);

				for (int_1 = 0; int_1 < 3; int_1++) {
					buffer_2.putInt(random_0.nextInt());
				}

				buffer_2.putLong(random_0.nextLong());
				buffer_2.method674(random_0.nextLong());
				Renderable.method691(buffer_2);
				buffer_2.putLong(random_0.nextLong());
				buffer_2.encryptRsa(aBigInteger1, aBigInteger2);
				int_1 = DecorativeObject.getLength(string_2);
				if ((int_1 % 8) != 0) {
					int_1 += 8 - (int_1 % 8);
				}

				final Buffer buffer_3 = new Buffer(int_1);
				buffer_3.putString(string_2);
				buffer_3.offset = int_1;
				buffer_3.encryptXtea2(ints_0);
				Buffer buffer_4 = new Buffer(buffer_3.offset + buffer_1.offset + 5 + buffer_2.offset);
				buffer_4.putByte(2);
				buffer_4.putByte(buffer_1.offset);
				buffer_4.putBytes(buffer_1.payload, 0, buffer_1.offset);
				buffer_4.putByte(buffer_2.offset);
				buffer_4.putBytes(buffer_2.payload, 0, buffer_2.offset);
				buffer_4.putShort(buffer_3.offset);
				buffer_4.putBytes(buffer_3.payload, 0, buffer_3.offset);
				final String string_0 = Class16.method199(buffer_4.payload);

				byte byte_1;
				try {
					final URL url_1 = new URL(WidgetNode.method647("services", false) + "m=accountappeal/login.ws");
					final URLConnection urlconnection_1 = url_1.openConnection();
					urlconnection_1.setDoInput(true);
					urlconnection_1.setDoOutput(true);
					urlconnection_1.setConnectTimeout(5000);
					final OutputStreamWriter outputstreamwriter_1 = new OutputStreamWriter(
							urlconnection_1.getOutputStream());
					outputstreamwriter_1.write(
							"data2=" + Enum2.method604(string_0) + "&dest=" + Enum2.method604("passwordchoice.ws"));
					outputstreamwriter_1.flush();
					final InputStream inputstream_1 = urlconnection_1.getInputStream();
					buffer_4 = new Buffer(new byte[1000]);

					while (true) {
						final int int_2 = inputstream_1.read(buffer_4.payload, buffer_4.offset, 1000 - buffer_4.offset);
						if (int_2 == -1) {
							outputstreamwriter_1.close();
							inputstream_1.close();
							String string_1 = new String(buffer_4.payload);
							if (string_1.startsWith("OFFLINE")) {
								byte_1 = 4;
							} else if (string_1.startsWith("WRONG")) {
								byte_1 = 7;
							} else if (string_1.startsWith("RELOAD")) {
								byte_1 = 3;
							} else if (string_1.startsWith("Not permitted for social network accounts.")) {
								byte_1 = 6;
							} else {
								buffer_4.decryptXtea(ints_0);

								while ((buffer_4.offset > 0) && (buffer_4.payload[buffer_4.offset - 1] == 0)) {
									--buffer_4.offset;
								}

								string_1 = new String(buffer_4.payload, 0, buffer_4.offset);
								if (Widget.method571(string_1)) {
									Class5.method91(string_1, true, false);
									byte_1 = 2;
								} else {
									byte_1 = 5;
								}
							}
							break;
						}

						buffer_4.offset += int_2;
						if (buffer_4.offset >= 1000) {
							byte_1 = 5;
							break;
						}
					}
				} catch (final Throwable throwable_0) {
					throwable_0.printStackTrace();
					byte_1 = 5;
				}

				byte_0 = byte_1;
			}

			switch (byte_0) {
			case 2:
				Class41.method261("", "Page has opened in a new window.", "(Please check your popup blocker.)");
				Class26.loginIndex = 6;
				return;
			case 3:
				Class41.method261("", "Error connecting to server.", "");
				return;
			case 4:
				Class41.method261("The part of the website you are trying", "to connect to is offline at the moment.",
						"Please try again later.");
				return;
			case 5:
				Class41.method261("Sorry, there was an error trying to", "log you in to this part of the website.",
						"Please try again later.");
				return;
			case 6:
				Class41.method261("", "Error connecting to server.", "");
				return;
			case 7:
				Class41.method261("You must enter a valid login to proceed. For accounts",
						"created after 24th November 2010, please use your",
						"email address. Otherwise please use your username.");
				return;
			default:
			}
		}
	}

}
