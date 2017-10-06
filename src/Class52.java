public class Class52 {

	static final void method310(final Widget widget_0) {
		final int int_0 = widget_0.contentType;
		if (int_0 == 324) {
			if (Client.anInt691 == -1) {
				Client.anInt691 = widget_0.spriteId;
				Client.anInt693 = widget_0.anInt286;
			}

			if (Client.aPlayerComposition1.isFemale) {
				widget_0.spriteId = Client.anInt691;
			} else {
				widget_0.spriteId = Client.anInt693;
			}
		} else if (int_0 == 325) {
			if (Client.anInt691 == -1) {
				Client.anInt691 = widget_0.spriteId;
				Client.anInt693 = widget_0.anInt286;
			}

			if (Client.aPlayerComposition1.isFemale) {
				widget_0.spriteId = Client.anInt693;
			} else {
				widget_0.spriteId = Client.anInt691;
			}
		} else if (int_0 == 327) {
			widget_0.rotationX = 150;
			widget_0.rotationZ = (int) (Math.sin(Client.gameCycle / 40.0D) * 256.0D) & 0x7FF;
			widget_0.modelType = 5;
			widget_0.modelId = 0;
		} else if (int_0 == 328) {
			widget_0.rotationX = 150;
			widget_0.rotationZ = (int) (Math.sin(Client.gameCycle / 40.0D) * 256.0D) & 0x7FF;
			widget_0.modelType = 5;
			widget_0.modelId = 1;
		}
	}

}
