public class Class12 {

	public static int[] offsetsY;
	static int anInt38;
	static IndexData indexInterfaces;
	static int anInt39;
	final int anInt40;
	final int anInt41;
	final int anInt42;

	Class12(final int int_0, final int int_1, final int int_2) {
		anInt40 = int_0;
		anInt41 = int_1;
		anInt42 = int_2;
	}

	static void method169(final World world_0) {
		if (world_0.method519() != Client.isMembers) {
			Client.isMembers = world_0.method519();
			WorldMapData_Sub1.method592(world_0.method519());
		}

		Class32.host = world_0.address;
		Client.world = world_0.anInt227;
		Client.flags = world_0.mask;
		Class47.anInt103 = Client.socketType == 0 ? 43594 : world_0.anInt227 + 40000;
		GameObject.anInt230 = Client.socketType == 0 ? 443 : world_0.anInt227 + 50000;
		AClass4.myWorldPort = Class47.anInt103;
	}

	static final void method170(final int int_0, final int int_1) {
		if (Class14.loadWidget(int_0)) {
			Class19.method205(Widget.widgets[int_0], int_1);
		}
	}

}
