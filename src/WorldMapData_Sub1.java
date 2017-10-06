import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class WorldMapData_Sub1 extends WorldMapData {

	static Buffer aBuffer5;
	static XClanMember[] clanMembers;
	List aList4;
	HashSet aHashSet7;
	HashSet aHashSet8;

	void method589(final Buffer buffer_0, final boolean bool_0) {
		aList4 = new LinkedList();
		final int int_0 = buffer_0.readUnsignedShort();

		for (int int_1 = 0; int_1 < int_0; int_1++) {
			final int int_2 = buffer_0.method661();
			final Coordinates coordinates_0 = new Coordinates(buffer_0.readInt());
			final boolean bool_1 = buffer_0.readUnsignedByte() == 1;
			if (bool_0 || !bool_1) {
				aList4.add(new Class51(int_2, coordinates_0));
			}
		}

	}

	void method590(final Buffer buffer_0, final Buffer buffer_1, final Buffer buffer_2, final int int_0,
			final boolean bool_0) {
		loadMapData(buffer_0, int_0);
		final int int_1 = buffer_2.readUnsignedShort();
		aHashSet7 = new HashSet(int_1);

		int int_2;
		for (int_2 = 0; int_2 < int_1; int_2++) {
			final AClass1_Sub2 aclass1_sub2_0 = new AClass1_Sub2();

			try {
				aclass1_sub2_0.method606(buffer_1, buffer_2);
			} catch (final IllegalStateException illegalstateexception_0) {
				continue;
			}

			aHashSet7.add(aclass1_sub2_0);
		}

		int_2 = buffer_2.readUnsignedShort();
		aHashSet8 = new HashSet(int_2);

		for (int int_3 = 0; int_3 < int_2; int_3++) {
			final AClass1_Sub1 aclass1_sub1_0 = new AClass1_Sub1();

			try {
				aclass1_sub1_0.method582(buffer_1, buffer_2);
			} catch (final IllegalStateException illegalstateexception_1) {
				continue;
			}

			aHashSet8.add(aclass1_sub1_0);
		}

		method589(buffer_1, bool_0);
	}

	public static final void method591(final int int_0, final int int_1, final int int_2, final int int_3,
			final int int_4, final int int_5, final int int_6) {
		final int int_7 = Math.min(int_3, Math.min(int_4, int_5)) - int_6;
		final int int_8 = Math.max(int_3, Math.max(int_4, int_5)) + int_6;
		final int int_9 = Math.min(int_0, Math.min(int_1, int_2)) - int_6;
		final int int_10 = Math.max(int_0, Math.max(int_1, int_2)) + int_6;
		Class46.aCombatInfoList1.method455(new AClass4_Sub2(int_7, int_9, int_8, int_10, -49088));
	}

	public static void method592(final boolean bool_0) {
		if (bool_0 != ItemComposition.isMembersWorld) {
			ItemComposition.items.reset();
			ItemComposition.itemModelCache.reset();
			ItemComposition.itemSpriteCache.reset();
			ItemComposition.isMembersWorld = bool_0;
		}

	}

}
