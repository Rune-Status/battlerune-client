import java.util.Calendar;

public class Class45 {

	static int[] anIntArray23;
	static int[][] SHAPE_VERTICIES;
	static int[] intStack;
	static String[] scriptStringStack;
	static int scriptStackCount;
	static ScriptState[] scriptStack;
	static Calendar aCalendar1;
	static final String[] aStringArray2;
	static int anInt102;
	static Class9 aClass9_1;
	static int[] scriptLocalInts;
	static String[] scriptLocalStrings;
	static Widget aWidget6;

	static {
		anIntArray23 = new int[5];
		SHAPE_VERTICIES = new int[5][5000];
		intStack = new int[1000];
		scriptStringStack = new String[1000];
		scriptStackCount = 0;
		scriptStack = new ScriptState[50];
		aCalendar1 = Calendar.getInstance();
		aStringArray2 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
				"Dec" };
		anInt102 = 0;
	}

	public static int method268(final String string_0) {
		return string_0.length() + 2;
	}

	public static ItemComposition getItemDefinition(final int int_0) {
		ItemComposition itemcomposition_0 = (ItemComposition) ItemComposition.items.get(int_0);
		if (itemcomposition_0 != null) {
			return itemcomposition_0;
		} else {
			final byte[] bytes_0 = FrameMap.item_ref.getConfigData(10, int_0);
			itemcomposition_0 = new ItemComposition();
			itemcomposition_0.anInt533 = int_0;
			if (bytes_0 != null) {
				itemcomposition_0.loadBuffer(new Buffer(bytes_0));
			}

			itemcomposition_0.post();
			if (itemcomposition_0.notedTemplate != -1) {
				itemcomposition_0.method871(getItemDefinition(itemcomposition_0.notedTemplate),
						getItemDefinition(itemcomposition_0.note));
			}

			if (itemcomposition_0.notedId != -1) {
				itemcomposition_0.method872(getItemDefinition(itemcomposition_0.notedId),
						getItemDefinition(itemcomposition_0.unnotedId));
			}

			if (itemcomposition_0.anInt535 != -1) {
				itemcomposition_0.method873(getItemDefinition(itemcomposition_0.anInt535),
						getItemDefinition(itemcomposition_0.anInt536));
			}

			if (!ItemComposition.isMembersWorld && itemcomposition_0.isMembers) {
				itemcomposition_0.name = "Members object";
				itemcomposition_0.aBool60 = false;
				itemcomposition_0.groundActions = null;
				itemcomposition_0.inventoryActions = null;
				itemcomposition_0.team = -1;
				itemcomposition_0.anInt534 = 0;
				if (itemcomposition_0.aClass70_6 != null) {
					boolean bool_0 = false;

					for (Node node_0 = itemcomposition_0.aClass70_6
							.method422(); node_0 != null; node_0 = itemcomposition_0.aClass70_6.method420()) {
						final CacheableNode_Sub4 cacheablenode_sub4_0 = Enum5.method656((int) node_0.hash);
						if (cacheablenode_sub4_0.aBool55) {
							node_0.unlink();
						} else {
							bool_0 = true;
						}
					}

					if (!bool_0) {
						itemcomposition_0.aClass70_6 = null;
					}
				}
			}

			ItemComposition.items.put(itemcomposition_0, int_0);
			return itemcomposition_0;
		}
	}

	public static Object method269(final byte[] bytes_0, final boolean bool_0) {
		if (bytes_0 == null) {
			return null;
		} else {
			if ((bytes_0.length > 136) && !AbstractByteBuffer.aBool10) {
				try {
					final DirectByteBuffer directbytebuffer_0 = new DirectByteBuffer();
					directbytebuffer_0.put(bytes_0);
					return directbytebuffer_0;
				} catch (final Throwable throwable_0) {
					AbstractByteBuffer.aBool10 = true;
				}
			}

			return bytes_0;
		}
	}

}
