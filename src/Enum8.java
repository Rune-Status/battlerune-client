import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public enum Enum8 implements RSEnum {

	anEnum8_1(2, 0), anEnum8_2(1, 1), anEnum8_3(0, 2);

	public final int anInt411;
	final int anInt412;

	Enum8(final int int_1, final int int_2) {
		anInt411 = int_1;
		anInt412 = int_2;
	}

	@Override
	public int rsOrdinal() {
		return anInt412;
	}

	public static void encodeClassVerifier(final PacketBuffer packetbuffer_0) {
		final ClassInfo classinfo_0 = (ClassInfo) Class95.aCombatInfoList3.method452();
		if (classinfo_0 != null) {
			final int int_0 = packetbuffer_0.offset;
			packetbuffer_0.putInt(classinfo_0.anInt395);

			for (int int_1 = 0; int_1 < classinfo_0.count; int_1++) {
				if (classinfo_0.errorIdentifiers[int_1] != 0) {
					packetbuffer_0.putByte(classinfo_0.errorIdentifiers[int_1]);
				} else {
					try {
						final int int_2 = classinfo_0.type[int_1];
						Field field_0;
						int int_3;
						if (int_2 == 0) {
							field_0 = classinfo_0.fields[int_1];
							int_3 = field_0.getInt((Object) null);
							packetbuffer_0.putByte(0);
							packetbuffer_0.putInt(int_3);
						} else if (int_2 == 1) {
							field_0 = classinfo_0.fields[int_1];
							field_0.setInt((Object) null, classinfo_0.fieldValues[int_1]);
							packetbuffer_0.putByte(0);
						} else if (int_2 == 2) {
							field_0 = classinfo_0.fields[int_1];
							int_3 = field_0.getModifiers();
							packetbuffer_0.putByte(0);
							packetbuffer_0.putInt(int_3);
						}

						Method method_0;
						if (int_2 != 3) {
							if (int_2 == 4) {
								method_0 = classinfo_0.methods[int_1];
								int_3 = method_0.getModifiers();
								packetbuffer_0.putByte(0);
								packetbuffer_0.putInt(int_3);
							}
						} else {
							method_0 = classinfo_0.methods[int_1];
							final byte[][] bytes_0 = classinfo_0.args[int_1];
							final Object[] objects_0 = new Object[bytes_0.length];

							for (int int_4 = 0; int_4 < bytes_0.length; int_4++) {
								final ObjectInputStream objectinputstream_0 = new ObjectInputStream(
										new ByteArrayInputStream(bytes_0[int_4]));
								objects_0[int_4] = objectinputstream_0.readObject();
							}

							final Object object_0 = method_0.invoke((Object) null, objects_0);
							if (object_0 == null) {
								packetbuffer_0.putByte(0);
							} else if (object_0 instanceof Number) {
								packetbuffer_0.putByte(1);
								packetbuffer_0.putLong(((Number) object_0).longValue());
							} else if (object_0 instanceof String) {
								packetbuffer_0.putByte(2);
								packetbuffer_0.putString((String) object_0);
							} else {
								packetbuffer_0.putByte(4);
							}
						}
					} catch (final ClassNotFoundException classnotfoundexception_0) {
						packetbuffer_0.putByte(-10);
					} catch (final InvalidClassException invalidclassexception_0) {
						packetbuffer_0.putByte(-11);
					} catch (final StreamCorruptedException streamcorruptedexception_0) {
						packetbuffer_0.putByte(-12);
					} catch (final OptionalDataException optionaldataexception_0) {
						packetbuffer_0.putByte(-13);
					} catch (final IllegalAccessException illegalaccessexception_0) {
						packetbuffer_0.putByte(-14);
					} catch (final IllegalArgumentException illegalargumentexception_0) {
						packetbuffer_0.putByte(-15);
					} catch (final InvocationTargetException invocationtargetexception_0) {
						packetbuffer_0.putByte(-16);
					} catch (final SecurityException securityexception_0) {
						packetbuffer_0.putByte(-17);
					} catch (final IOException ioexception_0) {
						packetbuffer_0.putByte(-18);
					} catch (final NullPointerException nullpointerexception_0) {
						packetbuffer_0.putByte(-19);
					} catch (final Exception exception_0) {
						packetbuffer_0.putByte(-20);
					} catch (final Throwable throwable_0) {
						packetbuffer_0.putByte(-21);
					}
				}
			}

			packetbuffer_0.putCrc(int_0);
			classinfo_0.unlink();
		}
	}

}
