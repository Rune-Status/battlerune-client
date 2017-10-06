public class Class91 implements Interface4 {

	public static final Class91 aClass91_1;
	public static final Class91 aClass91_2;
	public static final Class91 aClass91_3;
	public static final Class91 aClass91_4;
	public static final Class91 aClass91_5;
	public static final Class91 aClass91_6;
	public static final Class91 aClass91_7;
	public static final Class91 aClass91_8;
	public static final Class91 aClass91_9;
	static final Class91 aClass91_10;
	public final int anInt199;

	static {
		aClass91_1 = new Class91("", 10);
		aClass91_3 = new Class91("", 11);
		aClass91_4 = new Class91("", 12);
		aClass91_5 = new Class91("", 13);
		aClass91_6 = new Class91("", 14);
		aClass91_7 = new Class91("", 15,
				new ScriptVarType[] { ScriptVarType.aScriptVarType1, ScriptVarType.aScriptVarType1 },
				(ScriptVarType[]) null);
		aClass91_8 = new Class91("", 16,
				new ScriptVarType[] { ScriptVarType.aScriptVarType1, ScriptVarType.aScriptVarType1 },
				(ScriptVarType[]) null);
		aClass91_9 = new Class91("", 17,
				new ScriptVarType[] { ScriptVarType.aScriptVarType1, ScriptVarType.aScriptVarType1 },
				(ScriptVarType[]) null);
		aClass91_10 = new Class91("", 73, true, true);
		aClass91_2 = new Class91("", 76, true, false);
	}

	Class91(final String string_0, final int int_0) {
		this(string_0, int_0, false, (ScriptVarType[]) null, false, (ScriptVarType[]) null);
	}

	Class91(final String string_0, final int int_0, final boolean bool_0, final ScriptVarType[] scriptvartypes_0,
			final boolean bool_1, final ScriptVarType[] scriptvartypes_1) {
		anInt199 = int_0;
	}

	Class91(final String string_0, final int int_0, final ScriptVarType[] scriptvartypes_0,
			final ScriptVarType[] scriptvartypes_1) {
		this(string_0, int_0, scriptvartypes_0 != null, scriptvartypes_0, scriptvartypes_1 != null, scriptvartypes_1);
	}

	Class91(final String string_0, final int int_0, final boolean bool_0, final boolean bool_1) {
		this(string_0, int_0, bool_0, (ScriptVarType[]) null, bool_1, (ScriptVarType[]) null);
	}

	@Override
	public int rsOrdinal() {
		return anInt199;
	}

}
