import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class AClass2 {

	static int baseX;
	static SpritePixels[] mapDots;
	public int anInt166;
	public int anInt167;
	public int anInt168;
	public int anInt169;

	public abstract boolean method387(int var1, int var2, int var3, CollisionData var4);

	public static void decodeClassVerifier(final Buffer buffer_0, final int int_0) {
		final ClassInfo classinfo_0 = new ClassInfo();
		classinfo_0.count = buffer_0.readUnsignedByte();
		classinfo_0.anInt395 = buffer_0.readInt();
		classinfo_0.type = new int[classinfo_0.count];
		classinfo_0.errorIdentifiers = new int[classinfo_0.count];
		classinfo_0.fields = new Field[classinfo_0.count];
		classinfo_0.fieldValues = new int[classinfo_0.count];
		classinfo_0.methods = new Method[classinfo_0.count];
		classinfo_0.args = new byte[classinfo_0.count][][];

		for (int int_1 = 0; int_1 < classinfo_0.count; int_1++) {
			try {
				final int int_2 = buffer_0.readUnsignedByte();
				String string_0;
				String string_1;
				int int_3;
				if ((int_2 != 0) && (int_2 != 1) && (int_2 != 2)) {
					if ((int_2 == 3) || (int_2 == 4)) {
						string_0 = buffer_0.readString();
						string_1 = buffer_0.readString();
						int_3 = buffer_0.readUnsignedByte();
						final String[] strings_0 = new String[int_3];

						for (int int_4 = 0; int_4 < int_3; int_4++) {
							strings_0[int_4] = buffer_0.readString();
						}

						final String string_2 = buffer_0.readString();
						final byte[][] bytes_0 = new byte[int_3][];
						int int_6;
						if (int_2 == 3) {
							for (int int_5 = 0; int_5 < int_3; int_5++) {
								int_6 = buffer_0.readInt();
								bytes_0[int_5] = new byte[int_6];
								buffer_0.readBytes(bytes_0[int_5], 0, int_6);
							}
						}

						classinfo_0.type[int_1] = int_2;
						final Class[] classs_0 = new Class[int_3];

						for (int_6 = 0; int_6 < int_3; int_6++) {
							classs_0[int_6] = Node_Sub1.method609(strings_0[int_6]);
						}

						final Class class_0 = Node_Sub1.method609(string_2);
						if (Node_Sub1.method609(string_0).getClassLoader() == null) {
							throw new SecurityException();
						}

						final Method[] methods_0 = Node_Sub1.method609(string_0).getDeclaredMethods();
						final Method[] methods_1 = methods_0;

						for (int int_7 = 0; int_7 < methods_1.length; int_7++) {
							final Method method_0 = methods_1[int_7];
							if (method_0.getName().equals(string_1)) {
								final Class[] classs_1 = method_0.getParameterTypes();
								if (classs_0.length == classs_1.length) {
									boolean bool_0 = true;

									for (int int_8 = 0; int_8 < classs_0.length; int_8++) {
										if (classs_1[int_8] != classs_0[int_8]) {
											bool_0 = false;
											break;
										}
									}

									if (bool_0 && (class_0 == method_0.getReturnType())) {
										classinfo_0.methods[int_1] = method_0;
									}
								}
							}
						}

						classinfo_0.args[int_1] = bytes_0;
					}
				} else {
					string_0 = buffer_0.readString();
					string_1 = buffer_0.readString();
					int_3 = 0;
					if (int_2 == 1) {
						int_3 = buffer_0.readInt();
					}

					classinfo_0.type[int_1] = int_2;
					classinfo_0.fieldValues[int_1] = int_3;
					if (Node_Sub1.method609(string_0).getClassLoader() == null) {
						throw new SecurityException();
					}

					classinfo_0.fields[int_1] = Node_Sub1.method609(string_0).getDeclaredField(string_1);
				}
			} catch (final ClassNotFoundException classnotfoundexception_0) {
				classinfo_0.errorIdentifiers[int_1] = -1;
			} catch (final SecurityException securityexception_0) {
				classinfo_0.errorIdentifiers[int_1] = -2;
			} catch (final NullPointerException nullpointerexception_0) {
				classinfo_0.errorIdentifiers[int_1] = -3;
			} catch (final Exception exception_0) {
				classinfo_0.errorIdentifiers[int_1] = -4;
			} catch (final Throwable throwable_0) {
				classinfo_0.errorIdentifiers[int_1] = -5;
			}
		}

		Class95.aCombatInfoList3.method455(classinfo_0);
	}

}
