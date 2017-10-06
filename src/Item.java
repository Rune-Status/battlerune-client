public final class Item extends Renderable {

	static byte[][][] underlayIds;
	int anInt584;
	int quantity;

	@Override
	protected final Model getModel() {
		return Class45.getItemDefinition(anInt584).getModel(quantity);
	}

}
