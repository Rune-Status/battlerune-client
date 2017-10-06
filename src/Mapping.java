public class Mapping {

	int anInt225;
	int mux;
	int[] submapFloors;
	int[] anIntArray60;

	Mapping() {
		Node_Sub2.getInt(16);
		anInt225 = Node_Sub2.getBit() != 0 ? Node_Sub2.getInt(4) + 1 : 1;
		if (Node_Sub2.getBit() != 0) {
			Node_Sub2.getInt(8);
		}

		Node_Sub2.getInt(2);
		if (anInt225 > 1) {
			mux = Node_Sub2.getInt(4);
		}

		submapFloors = new int[anInt225];
		anIntArray60 = new int[anInt225];

		for (int int_0 = 0; int_0 < anInt225; int_0++) {
			Node_Sub2.getInt(8);
			submapFloors[int_0] = Node_Sub2.getInt(8);
			anIntArray60[int_0] = Node_Sub2.getInt(8);
		}

	}

}
