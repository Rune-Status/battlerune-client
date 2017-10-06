import java.applet.Applet;
import java.util.Comparator;

final class Class34 implements Comparator {

	static int anInt92;
	// $FF: synthetic field
	final boolean val$preferOwnWorld;

	Class34(final boolean bool_0) {
		val$preferOwnWorld = bool_0;
	}

	int method241(final Class48 class48_0, final Class48 class48_1) {
		if (class48_1.anInt105 == class48_0.anInt105) {
			return 0;
		} else {
			if (val$preferOwnWorld) {
				if (Client.world == class48_0.anInt105) {
					return -1;
				}

				if (class48_1.anInt105 == Client.world) {
					return 1;
				}
			}

			return class48_0.anInt105 < class48_1.anInt105 ? -1 : 1;
		}
	}

	@Override
	public boolean equals(final Object object_0) {
		return super.equals(object_0);
	}

	@Override
	public int compare(final Object object_0, final Object object_1) {
		return method241((Class48) object_0, (Class48) object_1);
	}

	public static void method242(final Applet applet_0, final String string_0) {
		Class19.anApplet1 = applet_0;
		Class19.aString3 = string_0;
	}

}
