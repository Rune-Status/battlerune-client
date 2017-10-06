import java.awt.Component;

public final class Tile extends Node {

	static IndexData configsIndex;
	SceneTilePaint paint;
	DecorativeObject decorativeObject;
	ItemLayer itemLayer;
	WallObject wallObject;
	int entityCount;
	GroundObject groundObject;
	GameObject[] objects;
	int physicalLevel;
	SceneTileModel overlay;
	int[] entityFlags;
	Tile bridge;
	int flags;
	int plane;
	boolean visible;
	int anInt372;
	int anInt373;
	int renderLevel;
	boolean draw;
	int wallCullDirection;
	boolean drawEntities;
	int wallUncullDirection;
	int wallDrawFlags;
	int wallCullOppositeDirection;

	Tile(final int int_0, final int int_1, final int int_2) {
		objects = new GameObject[5];
		entityFlags = new int[5];
		flags = 0;
		renderLevel = plane = int_0;
		anInt372 = int_1;
		anInt373 = int_2;
	}

	static void method640(final Component component_0) {
		component_0.removeMouseListener(MouseInput.mouse);
		component_0.removeMouseMotionListener(MouseInput.mouse);
		component_0.removeFocusListener(MouseInput.mouse);
		MouseInput.anInt275 = 0;
	}

	public static boolean method641(final int int_0) {
		return int_0 == Enum4.anEnum4_23.anInt396;
	}

}
