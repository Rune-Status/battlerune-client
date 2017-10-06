public class Class71 {

	Class73 aClass73_1;
	Class73 aClass73_2;

	public Class71() {
		aClass73_1 = new Class73();
		aClass73_1.aClass73_4 = aClass73_1;
		aClass73_1.aClass73_3 = aClass73_1;
	}

	public Class73 method424() {
		final Class73 class73_0 = aClass73_1.aClass73_4;
		if (class73_0 == aClass73_1) {
			aClass73_2 = null;
			return null;
		} else {
			aClass73_2 = class73_0.aClass73_4;
			return class73_0;
		}
	}

	public void method425(final Class73 class73_0) {
		if (class73_0.aClass73_3 != null) {
			class73_0.method443();
		}

		class73_0.aClass73_3 = aClass73_1.aClass73_3;
		class73_0.aClass73_4 = aClass73_1;
		class73_0.aClass73_3.aClass73_4 = class73_0;
		class73_0.aClass73_4.aClass73_3 = class73_0;
	}

	public Class73 method426() {
		final Class73 class73_0 = aClass73_2;
		if (class73_0 == aClass73_1) {
			aClass73_2 = null;
			return null;
		} else {
			aClass73_2 = class73_0.aClass73_4;
			return class73_0;
		}
	}

}
