public class InvType extends CacheableNode {

	public static NodeCache aNodeCache7;
	public static IndexDataBase anIndexDataBase18;
	public int anInt466;

	static {
		aNodeCache7 = new NodeCache(64);
	}

	public InvType() {
		anInt466 = 0;
	}

	void method754(final Buffer buffer_0, final int int_0) {
		if (int_0 == 2) {
			anInt466 = buffer_0.readUnsignedShort();
		}

	}

	public void decode(final Buffer buffer_0) {
		while (true) {
			final int int_0 = buffer_0.readUnsignedByte();
			if (int_0 == 0) {
				return;
			}

			method754(buffer_0, int_0);
		}
	}

	public static Spotanim getSpotAnimType(final int int_0) {
		Spotanim spotanim_0 = (Spotanim) Spotanim.spotanims.get(int_0);
		if (spotanim_0 != null) {
			return spotanim_0;
		} else {
			final byte[] bytes_0 = Spotanim.anIndexDataBase16.getConfigData(13, int_0);
			spotanim_0 = new Spotanim();
			spotanim_0.anInt440 = int_0;
			if (bytes_0 != null) {
				spotanim_0.decode(new Buffer(bytes_0));
			}

			Spotanim.spotanims.put(spotanim_0, int_0);
			return spotanim_0;
		}
	}

}
