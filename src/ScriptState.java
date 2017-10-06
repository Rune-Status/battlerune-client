public class ScriptState {

	static int anInt240;
	int invokedFromPc;
	Script invokedFromScript;
	int[] savedLocalInts;
	String[] savedLocalStrings;

	ScriptState() {
		invokedFromPc = -1;
	}

}
