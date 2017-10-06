import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class39 {

	public static Comparator aComparator1;
	public static String osNameLC;
	public static Comparator aComparator2;
	public static Comparator aComparator3;
	public static Comparator aComparator4;
	public final List aList3;

	static {
		aComparator1 = new Class35();
		new Class33();
		aComparator2 = new Class50();
		aComparator3 = new Class32();
		aComparator4 = new Class29();
	}

	public Class39(final Buffer buffer_0, final boolean bool_0) {
		final int int_0 = buffer_0.readUnsignedShort();
		final boolean bool_1 = buffer_0.readUnsignedByte() == 1;
		byte byte_0;
		if (bool_1) {
			byte_0 = 1;
		} else {
			byte_0 = 0;
		}

		final int int_1 = buffer_0.readUnsignedShort();
		aList3 = new ArrayList(int_1);

		for (int int_2 = 0; int_2 < int_1; int_2++) {
			aList3.add(new Class48(buffer_0, byte_0, int_0));
		}

	}

	public void method257(final Comparator comparator_0, final boolean bool_0) {
		if (bool_0) {
			Collections.sort(aList3, comparator_0);
		} else {
			Collections.sort(aList3, Collections.reverseOrder(comparator_0));
		}
	}

	static final void method258(final int int_0, final int int_1) {
		if (Client.anInt667 == 2) {
			Class15.method197(((Client.hintArrowX - AClass2.baseX) << 7) + Client.anInt677,
					((Client.hintArrowY - AClass4_Sub1.baseY) << 7) + Client.anInt681, Client.hintArrowType * 2);
			if ((Client.screenY > -1) && ((Client.gameCycle % 20) < 10)) {
				Class28.pkIcons[0].method916((int_0 + Client.screenY) - 12, (Client.screenX + int_1) - 28);
			}

		}
	}

}
