import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import netscape.javascript.JSObject;

public final class Client extends GameEngine {

	static boolean aBool75;
	static int anInt644;
	static int socketType;
	static int widgetRoot;
	static Widget aWidget9;
	static int loginState;
	static int gameCycle;
	static int gameState;
	static int anInt645;
	static int menuOptionCount;
	static int world;
	static int anInt646;
	static int anInt647;
	static int anInt648;
	static long aLong24;
	static int anInt649;
	static int js5State;
	static int flags;
	static int[] menuTypes;
	static boolean[] aBoolArray8;
	static int packetType;
	static boolean[] aBoolArray9;
	static boolean[] aBoolArray10;
	static boolean isMenuOpen;
	static int anInt650;
	static String[] menuTargets;
	static boolean aBool76;
	static int secondLastFrameId;
	public static boolean isMembers;
	static boolean socketError;
	static int packetLength;
	static int anInt651;
	static PacketBuffer secretPacketBuffer2;
	static boolean aBool77;
	static boolean lowMemory;
	static String[] menuOptions;
	static int thridLastFrameId;
	static boolean isResized;
	static int languageId;
	static int anInt652;
	static boolean aBool78;
	static boolean aBool79;
	static int anInt653;
	static int anInt654;
	static boolean aBool80;
	static int anInt655;
	static boolean aBool81;
	static int anInt656;
	static int[] menuActionParams0;
	static CollisionData[] collisionMaps;
	static int anInt657;
	static int[] menuActionParams1;
	static long aLong25;
	static int gameDrawingMode;
	static int anInt658;
	static PacketBuffer secretPacketBuffer1;
	static int anInt659;
	static XHashTable widgetFlags;
	static int anInt660;
	static int[] menuIdentifiers;
	static int itemSelectionState;
	static int anInt661;
	static boolean spellSelected;
	static int anInt662;
	static Widget aWidget10;
	static boolean aBool82;
	static boolean aBool83;
	static XHashTable componentTable;
	static boolean displayFps;
	static int[] widgetBoundsWidth;
	static int anInt663;
	static int[] widgetPositionX;
	static int[] boostedSkillLevels;
	static int anInt664;
	static int anInt665;
	static int[] realSkillLevels;
	static int anInt666;
	static int anInt667;
	static int anInt668;
	static String selectedItemName;
	static String aString33;
	static int[] skillExperiences;
	static int anInt669;
	static int[] widgetPositionY;
	static int anInt670;
	static int[] widgetBoundsHeight;
	static int anInt671;
	static String aString34;
	static int anInt672;
	static int[] anIntArray142;
	static int[] anIntArray143;
	static int anInt673;
	static int hintArrowX;
	static int anInt674;
	static int anInt675;
	static int anInt676;
	static final AClass2_Sub1 anAClass2_Sub1_1;
	static int hintArrowY;
	static int hintArrowType;
	static int anInt677;
	static int anInt678;
	static Widget aWidget11;
	static int anInt679;
	static int anInt680;
	static int anInt681;
	static int anInt682;
	static Enum2 anEnum2_5;
	static int loadingStage;
	static int anInt683;
	static int energy;
	static Enum2 anEnum2_6;
	static int weight;
	static int anInt684;
	static Player[] cachedPlayers;
	static int anInt685;
	static Deque aDeque7;
	static int anInt686;
	static int cursorState;
	static int anInt687;
	static IndexData indexSoundEffects;
	static int anInt688;
	static int destinationX;
	static boolean aBool84;
	static int audioEffectCount;
	static int lastFrameId;
	static int destinationY;
	static int anInt689;
	static IndexData indexTextures;
	static byte[] aByteArray29;
	static NPC[] cachedNPCs;
	static int anInt690;
	static HashMap aHashMap9;
	static int[] npcIndices;
	static int pendingNpcFlagsCount;
	static int[] pendingNpcFlagsIndices;
	static XGrandExchangeOffer[] grandExchangeOffers;
	static int anInt691;
	static Widget aWidget12;
	static PlayerComposition aPlayerComposition1;
	static PacketBuffer aPacketBuffer1;
	static boolean[] aBoolArray11;
	static int[] anIntArray144;
	static Widget aWidget13;
	static int anInt692;
	static int anInt693;
	static int anInt694;
	static int[] anIntArray145;
	static boolean isDynamicRegion;
	static int[] anIntArray146;
	static int anInt695;
	static int ignoreCount;
	static int[] anIntArray147;
	static int rights;
	static int anInt696;
	static Ignore[] ignores;
	static int anInt697;
	static int friendCount;
	static int anInt698;
	static Friend[] friends;
	static int anInt699;
	static boolean aBool85;
	static int anInt700;
	static int anInt701;
	static int[] anIntArray148;
	static int localInteractingIndex;
	static int[] anIntArray149;
	static int[] anIntArray150;
	static int anInt702;
	static int mapAngle;
	static int anInt703;
	static int[] anIntArray151;
	static int[] interfaceItemTriggers;
	static SoundEffect[] audioEffects;
	static int[] anIntArray152;
	static int anInt704;
	static int anInt705;
	static int anInt706;
	static int[] anIntArray153;
	static boolean aBool86;
	static int anInt707;
	static int anInt708;
	static Deque pendingSpawns;
	static int mapScale;
	static Deque[][][] groundItemDeque;
	static int[][][] anIntArrayArrayArray2;
	static int anInt709;
	static long aLong26;
	static int anInt710;
	static long aLong27;
	static boolean aBool87;
	static long aLong28;
	static Class71 aClass71_1;
	static String clanChatOwner;
	static int mapScaleDelta;
	static String clanChatName;
	static final int[] anIntArray154;
	static int anInt711;
	static int anInt712;
	static int[] anIntArray155;
	static long[] aLongArray4;
	static int anInt713;
	static int[] anIntArray156;
	static int anInt714;
	static int anInt715;
	static int anInt716;
	static int anInt717;
	static int anInt718;
	static int anInt719;
	static SpritePixels[] aSpritePixelsArray4;
	static int anInt720;
	static int anInt721;
	static int anInt722;
	static int anInt723;
	static int anInt724;
	static int anInt725;
	static int[][] anIntArrayArray21;
	static int anInt726;
	static int mapOffset;
	static int anInt727;
	static Deque graphicsObjectDeque;
	static int anInt728;
	static int anInt729;
	static int anInt730;
	static Deque projectiles;
	static int anInt731;
	static int anInt732;
	static int anInt733;
	static short aShort3;
	static short aShort4;
	static boolean aBool88;
	static int anInt734;
	static String[] playerOptions;
	static short aShort5;
	static boolean[] playerOptionsPriorities;
	static short aShort6;
	static int anInt735;
	static short aShort7;
	static short aShort8;
	static short aShort9;
	static int anInt736;
	static short aShort10;
	static int anInt737;
	static int anInt738;
	static int anInt739;
	static int scale;
	static int anInt740;
	static int viewportHeight;
	static int viewportWidth;
	static int anInt741;
	static int anInt742;
	static int anInt743;
	static int[] anIntArray157;
	static int[] anIntArray158;
	static int[] anIntArray159;
	static int anInt744;
	static int[] anIntArray160;
	static int anInt745;
	static int anInt746;
	static int anInt747;
	static int[] anIntArray161;
	static int anInt748;
	static int[] anIntArray162;
	static int[] anIntArray163;
	static int[] anIntArray164;
	static String[] aStringArray6;
	static Deque aDeque8;
	static int[] anIntArray165;
	static Deque aDeque9;
	static int screenY;
	static int[] anIntArray166;
	static int screenX;
	static int anInt749;
	static int anInt750;
	static int[] anIntArray167;
	static final int[] playerMenuTypes;
	static boolean aBool89;
	static boolean aBool90;
	static int anInt751;
	static short[] aShortArray17;
	static String aString35;
	static int[] anIntArray168;
	static int anInt752;

	static {
		aBool75 = true;
		world = 1;
		flags = 0;
		socketType = 0;
		isMembers = false;
		lowMemory = false;
		languageId = 0;
		gameState = 0;
		aBool81 = true;
		gameCycle = 0;
		aLong25 = -1L;
		anInt659 = -1;
		anInt660 = -1;
		anInt661 = -1;
		aBool82 = true;
		displayFps = false;
		anInt644 = 0;
		anInt667 = 0;
		anInt669 = 0;
		anInt671 = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowType = 0;
		anInt677 = 0;
		anInt681 = 0;
		anEnum2_5 = Enum2.anEnum2_4;
		anEnum2_6 = Enum2.anEnum2_4;
		loadingStage = 0;
		js5State = 0;
		anInt649 = 0;
		anInt652 = 0;
		loginState = 0;
		anInt653 = 0;
		anInt645 = 0;
		anInt689 = 0;
		aByteArray29 = null;
		cachedNPCs = new NPC[32768];
		anInt690 = 0;
		npcIndices = new int[32768];
		pendingNpcFlagsCount = 0;
		pendingNpcFlagsIndices = new int[250];
		secretPacketBuffer1 = new PacketBuffer(5000);
		aPacketBuffer1 = new PacketBuffer(5000);
		secretPacketBuffer2 = new PacketBuffer(15000);
		packetLength = 0;
		packetType = 0;
		anInt687 = 0;
		audioEffectCount = 0;
		lastFrameId = 0;
		secondLastFrameId = 0;
		thridLastFrameId = 0;
		anInt646 = 0;
		socketError = false;
		aHashMap9 = new HashMap();
		anInt668 = 0;
		anInt670 = 1;
		anInt672 = 0;
		anInt674 = 1;
		anInt664 = 0;
		collisionMaps = new CollisionData[4];
		isDynamicRegion = false;
		anIntArrayArrayArray2 = new int[4][13][13];
		anIntArray154 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		anInt714 = 0;
		anInt716 = 2;
		anInt720 = 0;
		anInt721 = 2;
		anInt723 = 0;
		anInt725 = 1;
		anInt726 = 0;
		mapScale = 0;
		mapOffset = 2;
		mapScaleDelta = 0;
		anInt728 = 1;
		anInt730 = 0;
		anInt662 = 0;
		anInt708 = 2301979;
		anInt719 = 5063219;
		anInt732 = 3353893;
		anInt724 = 7759444;
		aBool88 = false;
		anInt734 = 0;
		anInt712 = 128;
		mapAngle = 0;
		anInt735 = 0;
		anInt736 = 0;
		anInt737 = 0;
		anInt738 = 0;
		anInt739 = 50;
		anInt703 = 0;
		aBool86 = false;
		anInt741 = 0;
		anInt742 = 0;
		anInt743 = 50;
		anIntArray157 = new int[anInt743];
		anIntArray158 = new int[anInt743];
		anIntArray159 = new int[anInt743];
		anIntArray160 = new int[anInt743];
		anIntArray161 = new int[anInt743];
		anIntArray162 = new int[anInt743];
		anIntArray163 = new int[anInt743];
		aStringArray6 = new String[anInt743];
		anIntArrayArray21 = new int[104][104];
		anInt699 = 0;
		screenY = -1;
		screenX = -1;
		anInt685 = 0;
		anInt686 = 0;
		anInt688 = 0;
		cursorState = 0;
		anInt676 = 0;
		anInt680 = 0;
		anInt678 = 0;
		anInt673 = 0;
		anInt675 = 0;
		anInt749 = 0;
		aBool83 = false;
		anInt663 = 0;
		anInt715 = 0;
		cachedPlayers = new Player[2048];
		localInteractingIndex = -1;
		anInt717 = 0;
		anInt748 = 0;
		anIntArray166 = new int[1000];
		playerMenuTypes = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		playerOptions = new String[8];
		playerOptionsPriorities = new boolean[8];
		anIntArray167 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
		anInt709 = -1;
		groundItemDeque = new Deque[4][104][104];
		pendingSpawns = new Deque();
		projectiles = new Deque();
		graphicsObjectDeque = new Deque();
		boostedSkillLevels = new int[25];
		realSkillLevels = new int[25];
		skillExperiences = new int[25];
		anInt655 = 0;
		isMenuOpen = false;
		menuOptionCount = 0;
		menuActionParams0 = new int[500];
		menuActionParams1 = new int[500];
		menuTypes = new int[500];
		menuIdentifiers = new int[500];
		menuOptions = new String[500];
		menuTargets = new String[500];
		aBool90 = false;
		anInt654 = -1;
		aBool77 = false;
		anInt650 = -1;
		anInt651 = -1;
		anInt707 = 0;
		anInt706 = 50;
		itemSelectionState = 0;
		selectedItemName = null;
		spellSelected = false;
		anInt750 = -1;
		anInt752 = -1;
		aString33 = null;
		aString34 = null;
		widgetRoot = -1;
		componentTable = new XHashTable(8);
		anInt731 = 0;
		anInt733 = 0;
		aWidget12 = null;
		energy = 0;
		weight = 0;
		rights = 0;
		anInt740 = -1;
		aBool87 = false;
		aBool79 = false;
		aBool89 = false;
		aWidget11 = null;
		aWidget9 = null;
		aWidget10 = null;
		anInt656 = 0;
		anInt657 = 0;
		aWidget13 = null;
		aBool78 = false;
		anInt658 = -1;
		anInt665 = -1;
		aBool76 = false;
		anInt682 = -1;
		anInt683 = -1;
		aBool84 = false;
		anInt692 = 1;
		anIntArray152 = new int[32];
		anInt705 = 0;
		interfaceItemTriggers = new int[32];
		anInt704 = 0;
		anIntArray149 = new int[32];
		anInt702 = 0;
		anInt751 = 0;
		anInt697 = 0;
		anInt710 = 0;
		anInt694 = 0;
		anInt746 = 0;
		anInt695 = 0;
		anInt679 = 0;
		aDeque7 = new Deque();
		aDeque8 = new Deque();
		aDeque9 = new Deque();
		widgetFlags = new XHashTable(512);
		anInt647 = 0;
		anInt648 = -2;
		aBoolArray8 = new boolean[100];
		aBoolArray10 = new boolean[100];
		aBoolArray9 = new boolean[100];
		widgetPositionX = new int[100];
		widgetPositionY = new int[100];
		widgetBoundsWidth = new int[100];
		widgetBoundsHeight = new int[100];
		gameDrawingMode = 0;
		aLong24 = 0L;
		isResized = true;
		anIntArray168 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		anInt727 = 0;
		anInt729 = 0;
		aString35 = "";
		aLongArray4 = new long[100];
		anInt718 = 0;
		anInt744 = 0;
		anIntArray165 = new int[128];
		anIntArray164 = new int[128];
		aLong28 = -1L;
		clanChatOwner = null;
		clanChatName = null;
		anInt722 = -1;
		anInt711 = 0;
		anIntArray155 = new int[1000];
		anIntArray156 = new int[1000];
		aSpritePixelsArray4 = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		anInt701 = 0;
		anInt713 = 255;
		anInt666 = -1;
		aBool80 = false;
		anInt698 = 127;
		anInt684 = 127;
		anInt700 = 0;
		anIntArray148 = new int[50];
		anIntArray150 = new int[50];
		anIntArray151 = new int[50];
		anIntArray153 = new int[50];
		audioEffects = new SoundEffect[50];
		aBool85 = false;
		aBoolArray11 = new boolean[5];
		anIntArray144 = new int[5];
		anIntArray145 = new int[5];
		anIntArray146 = new int[5];
		anIntArray147 = new int[5];
		aShort4 = 256;
		aShort3 = 205;
		aShort9 = 256;
		aShort8 = 320;
		aShort10 = 1;
		aShort7 = 32767;
		aShort5 = 1;
		aShort6 = 32767;
		anInt745 = 0;
		anInt747 = 0;
		viewportHeight = 0;
		viewportWidth = 0;
		scale = 0;
		friendCount = 0;
		anInt696 = 0;
		friends = new Friend[400];
		aClass71_1 = new Class71();
		ignoreCount = 0;
		ignores = new Ignore[400];
		aPlayerComposition1 = new PlayerComposition();
		anInt691 = -1;
		anInt693 = -1;
		grandExchangeOffers = new XGrandExchangeOffer[8];
		aLong27 = -1L;
		aLong26 = -1L;
		anAClass2_Sub1_1 = new AClass2_Sub1();
		anIntArray142 = new int[50];
		anIntArray143 = new int[50];
	}

	void processJS5Connection() {
		if (gameState != 1000) {
			final boolean bool_0 = PlayerComposition.method488();
			if (!bool_0) {
				method1040();
			}

		}
	}

	void method1038() {
		int int_0 = Class25.canvasWidth;
		int int_1 = FloorUnderlayDefinition.canvasHeight;
		if (super.anInt626 < int_0) {
			int_0 = super.anInt626;
		}

		if (super.anInt628 < int_1) {
			int_1 = super.anInt628;
		}

		if (Class28.preferences != null) {
			try {
				final Client client_1 = AClass1.clientInstance;
				final Object[] objects_0 = new Object[] { Integer.valueOf(Player.method1035()) };
				JSObject.getWindow(client_1).call("resize", objects_0);
			} catch (final Throwable throwable_0) {
				return;
			}
		}

	}

	@Override
	protected final void method1008() {
		if (Class6.chatMessages.changed()) {
			Class6.chatMessages.serialize();
		}

		if (KeyFocusListener.aClass21_1 != null) {
			KeyFocusListener.aClass21_1.aBool6 = false;
		}

		KeyFocusListener.aClass21_1 = null;
		if (Occluder.rssocket != null) {
			Occluder.rssocket.close();
			Occluder.rssocket = null;
		}

		if (KeyFocusListener.keyboard != null) {
			synchronized (KeyFocusListener.keyboard) {
				KeyFocusListener.keyboard = null;
			}
		}

		Class23.method213();
		Actor.anInterface3_1 = null;
		if (AClass3.soundSystem0 != null) {
			AClass3.soundSystem0.method336();
		}

		if (KeyFocusListener.soundSystem1 != null) {
			KeyFocusListener.soundSystem1.method336();
		}

		if (Class93.aRSSocket1 != null) {
			Class93.aRSSocket1.close();
		}

		RuntimeException_Sub1.method892();
		FrameMap.method654();
	}

	@Override
	protected final void method1009() {
		Class47.anInt103 = socketType == 0 ? 43594 : world + 40000;
		GameObject.anInt230 = socketType == 0 ? 443 : world + 50000;
		AClass4.myWorldPort = Class47.anInt103;
		PlayerComposition.colorsToFind = Class89.aShortArray1;
		Class76.colorsToReplace = Class89.aShortArrayArray1;
		PlayerComposition.aShortArray3 = Class89.aShortArray2;
		Enum2.aShortArrayArray3 = Class89.aShortArrayArray2;
		method1013();
		method1014();
		Actor.anInterface3_1 = method1016();
		World.anIndexFile1 = new IndexFile(255, Class57.aCacheFile2, Class57.aCacheFile3, 500000);
		Class28.preferences = Class101.method497();
		method1019();
		Class34.method242(this, Spotanim.aString27);
		if (socketType != 0) {
			displayFps = true;
		}

		Class38.method255(Class28.preferences.screenType);
	}

	final void method1039(final boolean bool_0) {
		final int int_0 = widgetRoot;
		final int int_1 = Class25.canvasWidth;
		final int int_2 = FloorUnderlayDefinition.canvasHeight;
		if (Class14.loadWidget(int_0)) {
			Class50.method306(Widget.widgets[int_0], -1, int_1, int_2, bool_0);
		}
	}

	void error(final int int_0) {
		BaseVarType.socket = null;
		Class40.rssocket = null;
		js5State = 0;
		if (AClass4.myWorldPort == Class47.anInt103) {
			AClass4.myWorldPort = GameObject.anInt230;
		} else {
			AClass4.myWorldPort = Class47.anInt103;
		}

		++anInt652;
		if ((anInt652 >= 2) && ((int_0 == 7) || (int_0 == 9))) {
			if (gameState > 5) {
				anInt649 = 3000;
				return;
			}

			this.error("js5connect_full");
			gameState = 1000;
		} else {
			if ((anInt652 >= 2) && (int_0 == 6)) {
				this.error("js5connect_outofdate");
				gameState = 1000;
				return;
			}

			if (anInt652 >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					gameState = 1000;
					return;
				}

				anInt649 = 3000;
				return;
			}
		}

	}

	@Override
	protected final void method1012() {
	}

	@Override
	protected final void packetHandler() {
		++gameCycle;
		processJS5Connection();
		RSCanvas.method693();
		Class55.method345();
		Class6.method105();
		Class37.method251();
		synchronized (MouseInput.mouse) {
			MouseInput.anInt281 = MouseInput.anInt275 * 1223886835;
			MouseInput.anInt278 = MouseInput.mouseX;
			MouseInput.anInt280 = MouseInput.mouseY;
			MouseInput.anInt277 = MouseInput.anInt284;
			MouseInput.anInt282 = MouseInput.anInt276;
			MouseInput.anInt283 = MouseInput.anInt279;
			MouseInput.aLong19 = MouseInput.aLong18;
			MouseInput.anInt284 = 0;
		}

		if (Actor.anInterface3_1 != null) {
			final int int_0 = Actor.anInterface3_1.method4();
			anInt679 = int_0;
		}

		if (gameState == 0) {
			BaseVarType.load();
			Class48.method278();
		} else if (gameState == 5) {
			Class8.method118(this);
			BaseVarType.load();
			Class48.method278();
		} else if ((gameState != 10) && (gameState != 11)) {
			if (gameState == 20) {
				Class8.method118(this);
				method1043();
			} else if (gameState == 25) {
				Class56.flush(false);
				anInt668 = 0;
				boolean bool_2 = true;

				int int_1;
				for (int_1 = 0; int_1 < Class3.aByteArrayArray1.length; int_1++) {
					if ((AClass4_Sub1.anIntArray81[int_1] != -1) && (Class3.aByteArrayArray1[int_1] == null)) {
						Class3.aByteArrayArray1[int_1] = Class33.indexMaps
								.getConfigData(AClass4_Sub1.anIntArray81[int_1], 0);
						if (Class3.aByteArrayArray1[int_1] == null) {
							bool_2 = false;
							++anInt668;
						}
					}

					if ((CombatInfoListHolder.landRegionFielIds[int_1] != -1)
							&& (Class51.aByteArrayArray2[int_1] == null)) {
						Class51.aByteArrayArray2[int_1] = Class33.indexMaps.getConfigData(
								CombatInfoListHolder.landRegionFielIds[int_1], 0, AClass2_Sub1.xteaKeys[int_1]);
						if (Class51.aByteArrayArray2[int_1] == null) {
							bool_2 = false;
							++anInt668;
						}
					}
				}

				if (!bool_2) {
					anInt664 = 1;
				} else {
					anInt672 = 0;
					bool_2 = true;

					int int_2;
					int int_3;
					Buffer buffer_0;
					int int_5;
					int int_6;
					int int_8;
					int int_9;
					int int_10;
					int int_11;
					int int_12;
					int int_13;
					int int_14;
					for (int_1 = 0; int_1 < Class3.aByteArrayArray1.length; int_1++) {
						final byte[] bytes_0 = Class51.aByteArrayArray2[int_1];
						if (bytes_0 != null) {
							int_2 = ((RSCanvas.mapRegions[int_1] >> 8) * 64) - AClass2.baseX;
							int_3 = ((RSCanvas.mapRegions[int_1] & 0xFF) * 64) - AClass4_Sub1.baseY;
							if (isDynamicRegion) {
								int_2 = 10;
								int_3 = 10;
							}

							boolean bool_0 = true;
							buffer_0 = new Buffer(bytes_0);
							int_5 = -1;

							label496: while (true) {
								int_6 = buffer_0.getUSmart();
								if (int_6 == 0) {
									bool_2 &= bool_0;
									break;
								}

								int_5 += int_6;
								int_8 = 0;
								boolean bool_1 = false;

								while (true) {
									while (!bool_1) {
										int_9 = buffer_0.getUSmart();
										if (int_9 == 0) {
											continue label496;
										}

										int_8 += int_9 - 1;
										int_10 = int_8 & 0x3F;
										int_11 = (int_8 >> 6) & 0x3F;
										int_12 = buffer_0.readUnsignedByte() >> 2;
										int_13 = int_2 + int_11;
										int_14 = int_3 + int_10;
										if ((int_13 > 0) && (int_14 > 0) && (int_13 < 103) && (int_14 < 103)) {
											final ObjectComposition objectcomposition_0 = PlayerComposition
													.getObjectDefinition(int_5);
											if ((int_12 != 22) || !lowMemory || (objectcomposition_0.anInt491 != 0)
													|| (objectcomposition_0.interactType == 1)
													|| objectcomposition_0.aBool54) {
												if (!objectcomposition_0.method798()) {
													++anInt672;
													bool_0 = false;
												}

												bool_1 = true;
											}
										}
									}

									int_9 = buffer_0.getUSmart();
									if (int_9 == 0) {
										break;
									}

									buffer_0.readUnsignedByte();
								}
							}
						}
					}

					if (!bool_2) {
						anInt664 = 2;
					} else {
						if (anInt664 != 0) {
							Class30.drawStatusBox("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
						}

						Class6.method105();
						MilliTimer.method687();
						Class6.method105();
						Class8.region.reset();
						Class6.method105();
						System.gc();

						for (int_1 = 0; int_1 < 4; int_1++) {
							collisionMaps[int_1].reset();
						}

						int int_15;
						for (int_1 = 0; int_1 < 4; int_1++) {
							for (int_15 = 0; int_15 < 104; int_15++) {
								for (int_2 = 0; int_2 < 104; int_2++) {
									Class18.tileSettings[int_1][int_15][int_2] = 0;
								}
							}
						}

						Class6.method105();
						Class46.method271();
						int_1 = Class3.aByteArrayArray1.length;
						Class33.method236();
						Class56.flush(true);
						int int_4;
						int int_7;
						int int_20;
						int int_21;
						if (!isDynamicRegion) {
							int_15 = 0;

							label434: while (true) {
								byte[] bytes_1;
								if (int_15 >= int_1) {
									for (int_15 = 0; int_15 < int_1; int_15++) {
										int_2 = ((RSCanvas.mapRegions[int_15] >> 8) * 64) - AClass2.baseX;
										int_3 = ((RSCanvas.mapRegions[int_15] & 0xFF) * 64) - AClass4_Sub1.baseY;
										bytes_1 = Class3.aByteArrayArray1[int_15];
										if ((bytes_1 == null) && (Class12.anInt39 < 800)) {
											Class6.method105();
											CacheFile.method534(int_2, int_3, 64, 64);
										}
									}

									Class56.flush(true);
									int_15 = 0;

									while (true) {
										if (int_15 >= int_1) {
											break label434;
										}

										final byte[] bytes_2 = Class51.aByteArrayArray2[int_15];
										if (bytes_2 != null) {
											int_3 = ((RSCanvas.mapRegions[int_15] >> 8) * 64) - AClass2.baseX;
											int_4 = ((RSCanvas.mapRegions[int_15] & 0xFF) * 64) - AClass4_Sub1.baseY;
											Class6.method105();
											final Region region_0 = Class8.region;
											final CollisionData[] collisiondatas_0 = collisionMaps;
											buffer_0 = new Buffer(bytes_2);
											int_5 = -1;

											while (true) {
												int_6 = buffer_0.getUSmart();
												if (int_6 == 0) {
													break;
												}

												int_5 += int_6;
												int_8 = 0;

												while (true) {
													int_21 = buffer_0.getUSmart();
													if (int_21 == 0) {
														break;
													}

													int_8 += int_21 - 1;
													int_9 = int_8 & 0x3F;
													int_10 = (int_8 >> 6) & 0x3F;
													int_11 = int_8 >> 12;
													int_12 = buffer_0.readUnsignedByte();
													int_13 = int_12 >> 2;
													int_14 = int_12 & 0x3;
													final int int_17 = int_3 + int_10;
													final int int_18 = int_9 + int_4;
													if ((int_17 > 0) && (int_18 > 0) && (int_17 < 103)
															&& (int_18 < 103)) {
														int int_19 = int_11;
														if ((Class18.tileSettings[1][int_17][int_18] & 0x2) == 2) {
															int_19 = int_11 - 1;
														}

														CollisionData collisiondata_0 = null;
														if (int_19 >= 0) {
															collisiondata_0 = collisiondatas_0[int_19];
														}

														Class22.addObject(int_11, int_17, int_18, int_5, int_14, int_13,
																region_0, collisiondata_0);
													}
												}
											}
										}

										++int_15;
									}
								}

								int_2 = ((RSCanvas.mapRegions[int_15] >> 8) * 64) - AClass2.baseX;
								int_3 = ((RSCanvas.mapRegions[int_15] & 0xFF) * 64) - AClass4_Sub1.baseY;
								bytes_1 = Class3.aByteArrayArray1[int_15];
								if (bytes_1 != null) {
									Class6.method105();
									int_7 = (Class7.anInt27 * 8) - 48;
									int_20 = (Class12.anInt39 * 8) - 48;
									final CollisionData[] collisiondatas_1 = collisionMaps;
									int_5 = 0;

									label431: while (true) {
										if (int_5 >= 4) {
											final Buffer buffer_1 = new Buffer(bytes_1);
											int_6 = 0;

											while (true) {
												if (int_6 >= 4) {
													break label431;
												}

												for (int_8 = 0; int_8 < 64; int_8++) {
													for (int_21 = 0; int_21 < 64; int_21++) {
														Class40.loadTerrain(buffer_1, int_6, int_8 + int_2,
																int_21 + int_3, int_7, int_20, 0);
													}
												}

												++int_6;
											}
										}

										for (int_6 = 0; int_6 < 64; int_6++) {
											for (int_8 = 0; int_8 < 64; int_8++) {
												if (((int_2 + int_6) > 0) && ((int_6 + int_2) < 103)
														&& ((int_3 + int_8) > 0) && ((int_8 + int_3) < 103)) {
													collisiondatas_1[int_5].flags[int_6 + int_2][int_8
															+ int_3] &= 0xFEFFFFFF;
												}
											}
										}

										++int_5;
									}
								}

								++int_15;
							}
						}

						int int_16;
						if (isDynamicRegion) {
							int_15 = 0;

							label367: while (true) {
								if (int_15 >= 4) {
									for (int_15 = 0; int_15 < 13; int_15++) {
										for (int_2 = 0; int_2 < 13; int_2++) {
											int_3 = anIntArrayArrayArray2[0][int_15][int_2];
											if (int_3 == -1) {
												CacheFile.method534(int_15 * 8, int_2 * 8, 8, 8);
											}
										}
									}

									Class56.flush(true);
									int_15 = 0;

									while (true) {
										if (int_15 >= 4) {
											break label367;
										}

										Class6.method105();

										for (int_2 = 0; int_2 < 13; int_2++) {
											for (int_3 = 0; int_3 < 13; int_3++) {
												int_4 = anIntArrayArrayArray2[int_15][int_2][int_3];
												if (int_4 != -1) {
													int_7 = (int_4 >> 24) & 0x3;
													int_20 = (int_4 >> 1) & 0x3;
													int_16 = (int_4 >> 14) & 0x3FF;
													int_5 = (int_4 >> 3) & 0x7FF;
													int_6 = ((int_16 / 8) << 8) + (int_5 / 8);

													for (int_8 = 0; int_8 < RSCanvas.mapRegions.length; int_8++) {
														if ((RSCanvas.mapRegions[int_8] == int_6)
																&& (Class51.aByteArrayArray2[int_8] != null)) {
															Enum1.method578(Class51.aByteArrayArray2[int_8], int_15,
																	int_2 * 8, int_3 * 8, int_7, (int_16 & 0x7) * 8,
																	(int_5 & 0x7) * 8, int_20, Class8.region,
																	collisionMaps);
															break;
														}
													}
												}
											}
										}

										++int_15;
									}
								}

								Class6.method105();

								for (int_2 = 0; int_2 < 13; int_2++) {
									for (int_3 = 0; int_3 < 13; int_3++) {
										boolean bool_3 = false;
										int_7 = anIntArrayArrayArray2[int_15][int_2][int_3];
										if (int_7 != -1) {
											int_20 = (int_7 >> 24) & 0x3;
											int_16 = (int_7 >> 1) & 0x3;
											int_5 = (int_7 >> 14) & 0x3FF;
											int_6 = (int_7 >> 3) & 0x7FF;
											int_8 = ((int_5 / 8) << 8) + (int_6 / 8);

											for (int_21 = 0; int_21 < RSCanvas.mapRegions.length; int_21++) {
												if ((RSCanvas.mapRegions[int_21] == int_8)
														&& (Class3.aByteArrayArray1[int_21] != null)) {
													AClass4_Sub2.method705(Class3.aByteArrayArray1[int_21], int_15,
															int_2 * 8, int_3 * 8, int_20, (int_5 & 0x7) * 8,
															(int_6 & 0x7) * 8, int_16, collisionMaps);
													bool_3 = true;
													break;
												}
											}
										}

										if (!bool_3) {
											XGrandExchangeOffer.method114(int_15, int_2 * 8, int_3 * 8);
										}
									}
								}

								++int_15;
							}
						}

						Class56.flush(true);
						MilliTimer.method687();
						Class6.method105();
						PendingSpawn.method637(Class8.region, collisionMaps);
						Class56.flush(true);
						int_15 = Class18.anInt71;
						if (int_15 > AClass1_Sub1.plane) {
							int_15 = AClass1_Sub1.plane;
						}

						if (int_15 < (AClass1_Sub1.plane - 1)) {
							int_15 = AClass1_Sub1.plane - 1;
						}

						if (lowMemory) {
							Class8.region.setup(Class18.anInt71);
						} else {
							Class8.region.setup(0);
						}

						for (int_2 = 0; int_2 < 104; int_2++) {
							for (int_3 = 0; int_3 < 104; int_3++) {
								Class9.groundItemSpawned(int_2, int_3);
							}
						}

						Class6.method105();
						Signlink.method479();
						ObjectComposition.aNodeCache10.reset();
						if (AClass1.clientInstance.method1027()) {
							secretPacketBuffer1.putOpcode(65);
							secretPacketBuffer1.putInt(1057001181);
						}

						if (!isDynamicRegion) {
							int_2 = (Class7.anInt27 - 6) / 8;
							int_3 = (Class7.anInt27 + 6) / 8;
							int_4 = (Class12.anInt39 - 6) / 8;
							int_7 = (Class12.anInt39 + 6) / 8;

							for (int_20 = int_2 - 1; int_20 <= (int_3 + 1); int_20++) {
								for (int_16 = int_4 - 1; int_16 <= (int_7 + 1); int_16++) {
									if ((int_20 < int_2) || (int_20 > int_3) || (int_16 < int_4) || (int_16 > int_7)) {
										Class33.indexMaps.method442("m" + int_20 + "_" + int_16);
										Class33.indexMaps.method442("l" + int_20 + "_" + int_16);
									}
								}
							}
						}

						WorldMapType2.setGameState(30);
						Class6.method105();
						Class38.resetMapInfo();
						secretPacketBuffer1.putOpcode(90);
						Class48.method278();
					}
				}
			}
		} else {
			Class8.method118(this);
		}

		if (gameState == 30) {
			method1044();
		} else if ((gameState == 40) || (gameState == 45)) {
			method1043();
			return;
		}

	}

	final boolean processServerPacket() {
		if (Occluder.rssocket == null) {
			return false;
		} else {
			int int_2;
			String string_0;
			try {
				int int_0 = Occluder.rssocket.available();
				if (int_0 == 0) {
					return false;
				}

				// TODO game packets
				if (packetType == -1) {
					Occluder.rssocket.read(secretPacketBuffer2.payload, 0, 1);
					secretPacketBuffer2.offset = 0;
					packetType = secretPacketBuffer2.readOpcode();
					packetLength = Class97.anIntArray49[packetType];
					--int_0;
				}

				//System.out.println("packet: " + packetType + " length: " + packetLength);

				if (packetLength == -1) {
					if (int_0 <= 0) {
						return false;
					}

					Occluder.rssocket.read(secretPacketBuffer2.payload, 0, 1);
					packetLength = secretPacketBuffer2.payload[0] & 0xFF;
					--int_0;
				}

				if (packetLength == -2) {
					if (int_0 <= 1) {
						return false;
					}

					Occluder.rssocket.read(secretPacketBuffer2.payload, 0, 2);
					secretPacketBuffer2.offset = 0;
					packetLength = secretPacketBuffer2.readUnsignedShort();
					int_0 -= 2;
				}

				if (int_0 < packetLength) {
					return false;
				}

				secretPacketBuffer2.offset = 0;
				Occluder.rssocket.read(secretPacketBuffer2.payload, 0, packetLength);
				anInt687 = 0;
				thridLastFrameId = secondLastFrameId;
				secondLastFrameId = lastFrameId;
				lastFrameId = packetType;
				int int_1;
				if (packetType == 131) {
					aBool85 = false;

					for (int_1 = 0; int_1 < 5; int_1++) {
						aBoolArray11[int_1] = false;
					}

					packetType = -1;
					return true;
				}

				if (packetType == 180) {
					anInt696 = 1;
					anInt697 = anInt692;
					packetType = -1;
					return true;
				}

				if (packetType == 79) {
					for (int_1 = 0; int_1 < cachedPlayers.length; int_1++) {
						if (cachedPlayers[int_1] != null) {
							cachedPlayers[int_1].animation = -1;
						}
					}

					for (int_1 = 0; int_1 < cachedNPCs.length; int_1++) {
						if (cachedNPCs[int_1] != null) {
							cachedNPCs[int_1].animation = -1;
						}
					}

					packetType = -1;
					return true;
				}

				if (packetType == 106) {
					for (int_1 = 0; int_1 < VarPlayerType.anInt537; int_1++) {
						final VarPlayerType varplayertype_0 = Class65.method396(int_1);
						if (varplayertype_0 != null) {
							Class86.settings[int_1] = 0;
							Class86.widgetSettings[int_1] = 0;
						}
					}

					Class46.method270();
					anInt705 += 32;
					packetType = -1;
					return true;
				}

				if (packetType == 228) {
					for (int_1 = 0; int_1 < Class86.widgetSettings.length; int_1++) {
						if (Class86.widgetSettings[int_1] != Class86.settings[int_1]) {
							Class86.widgetSettings[int_1] = Class86.settings[int_1];
							Class44.method266(int_1);
							anIntArray152[(++anInt705 - 1) & 0x1F] = int_1;
						}
					}

					packetType = -1;
					return true;
				}

				if (packetType == 107) {
					anInt701 = secretPacketBuffer2.readUnsignedByte();
					packetType = -1;
					return true;
				}

				if (packetType == 186) {
					anInt644 = secretPacketBuffer2.readUShortA() * 30;
					anInt695 = anInt692;
					packetType = -1;
					return true;
				}

				int int_5;
				if (packetType == 123) {
					int_2 = secretPacketBuffer2.readUnsignedByte();
					final Class103[] class103s_0 = new Class103[] { Class103.aClass103_3, Class103.aClass103_1,
							Class103.aClass103_2 };
					final Class103[] class103s_1 = class103s_0;
					int_5 = 0;

					Class103 class103_1;
					while (true) {
						if (int_5 >= class103s_1.length) {
							class103_1 = null;
							break;
						}

						final Class103 class103_0 = class103s_1[int_5];
						if (int_2 == class103_0.anInt214) {
							class103_1 = class103_0;
							break;
						}

						++int_5;
					}

					MouseInput.aClass103_4 = class103_1;
					packetType = -1;
					return true;
				}

				int int_9;
				int int_10;
				int int_11;
				long long_7;
				int int_12;
				String string_5;
				String string_6;
				String string_7;
				int int_15;
				String string_10;
				if (packetType == 23) {
					string_0 = secretPacketBuffer2.readString();
					AClass4_Sub2.sessionToken = string_0;

					try {
						string_5 = AClass1.clientInstance.getParameter(Parameters.aParameters9.key);
						string_6 = AClass1.clientInstance.getParameter(Parameters.aParameters13.key);
						string_10 = string_5 + "settings=" + string_0 + "; version=1; path=/; domain=" + string_6;
						String string_8;
						if (string_0.length() == 0) {
							string_10 = string_10 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
						} else {
							string_7 = string_10 + "; Expires=";
							long_7 = Class6.currentTimeMs() + 94608000000L;
							Class68.aCalendar2.setTime(new Date(long_7));
							int_9 = Class68.aCalendar2.get(7);
							int_10 = Class68.aCalendar2.get(5);
							int_15 = Class68.aCalendar2.get(2);
							final int int_16 = Class68.aCalendar2.get(1);
							int_12 = Class68.aCalendar2.get(11);
							int_11 = Class68.aCalendar2.get(12);
							final int int_13 = Class68.aCalendar2.get(13);
							string_8 = Class68.aStringArray3[int_9 - 1] + ", " + (int_10 / 10) + (int_10 % 10) + "-"
									+ Class68.aStringArrayArray1[0][int_15] + "-" + int_16 + " " + (int_12 / 10)
									+ (int_12 % 10) + ":" + (int_11 / 10) + (int_11 % 10) + ":" + (int_13 / 10)
									+ (int_13 % 10) + " GMT";
							string_10 = string_7 + string_8 + "; Max-Age=" + 94608000L;
						}

						final Client client_1 = AClass1.clientInstance;
						string_8 = "document.cookie=\"" + string_10 + "\"";
						JSObject.getWindow(client_1).eval(string_8);
					} catch (final Throwable throwable_0) {
						;
					}

					packetType = -1;
					return true;
				}

				if (packetType == 185) {
					int_1 = secretPacketBuffer2.readIntIM();
					AClass4_Sub2.aTask3 = GameEngine.taskManager.createHost(int_1);
					packetType = -1;
					return true;
				}

				int int_3;
				if (packetType == 168) {
					int_1 = secretPacketBuffer2.readByteOb1();
					if (int_1 == 65535) {
						int_1 = -1;
					}

					if ((int_1 == -1) && !aBool80) {
						Class76.anAClass5_Sub3_1.method764();
						Class76.anInt186 = 1;
						Class76.anIndexDataBase3 = null;
					} else if ((int_1 != -1) && (int_1 != anInt666) && (anInt713 != 0) && !aBool80) {
						final IndexData indexdata_0 = Class68.indexTrack1;
						int_3 = anInt713;
						Class76.anInt186 = 1;
						Class76.anIndexDataBase3 = indexdata_0;
						Class76.anInt187 = int_1;
						MilliTimer.anInt422 = 0;
						Class76.anInt188 = int_3;
						Class76.aBool21 = false;
						AClass2_Sub1.anInt334 = 2;
					}

					anInt666 = int_1;
					packetType = -1;
					return true;
				}

				if (packetType == 212) {
					int_1 = secretPacketBuffer2.method671();
					final XItemContainer xitemcontainer_0 = (XItemContainer) XItemContainer.itemContainers.get(int_1);
					if (xitemcontainer_0 != null) {
						xitemcontainer_0.unlink();
					}

					interfaceItemTriggers[(++anInt704 - 1) & 0x1F] = int_1 & 0x7FFF;
					packetType = -1;
					return true;
				}

				Widget widget_1;
				if (packetType == 127) {
					int_1 = secretPacketBuffer2.readIntIM();
					widget_1 = Class18.method202(int_1);

					for (int_3 = 0; int_3 < widget_1.itemIds.length; int_3++) {
						widget_1.itemIds[int_3] = -1;
						widget_1.itemIds[int_3] = 0;
					}

					Class15.method196(widget_1);
					packetType = -1;
					return true;
				}

				if (packetType == 28) {
					int_1 = secretPacketBuffer2.readIntLE();
					widget_1 = Class18.method202(int_1);
					widget_1.modelType = 3;
					widget_1.modelId = Script.localPlayer.composition.method483();
					Class15.method196(widget_1);
					packetType = -1;
					return true;
				}

				if (packetType == 136) {
					Class46.method270();
					weight = secretPacketBuffer2.readShort();
					anInt695 = anInt692;
					packetType = -1;
					return true;
				}

				if (packetType == 72) {
					Class46.method270();
					energy = secretPacketBuffer2.readUnsignedByte();
					anInt695 = anInt692;
					packetType = -1;
					return true;
				}

				if (packetType == 80) {
					anInt727 = secretPacketBuffer2.readUnsignedByte();
					anInt729 = secretPacketBuffer2.readUnsignedByte();
					packetType = -1;
					return true;
				}

				if (packetType == 141) {
					WorldMapType2.anInt242 = secretPacketBuffer2.readUnsignedByte();
					CacheableNode_Sub4.anInt515 = secretPacketBuffer2.method673();
					packetType = -1;
					return true;
				}

				if (packetType == 14) {
					destinationX = secretPacketBuffer2.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = secretPacketBuffer2.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					packetType = -1;
					return true;
				}

				if (packetType == 234) {
					int_1 = secretPacketBuffer2.method679();
					int_2 = secretPacketBuffer2.readUnsignedShort();
					if (int_2 == 65535) {
						int_2 = -1;
					}

					if ((anInt713 != 0) && (int_2 != -1)) {
						Friend.method503(AClass4_Sub1.indexTrack2, int_2, 0, anInt713, false);
						aBool80 = true;
					}

					packetType = -1;
					return true;
				}

				boolean bool_2;
				if (packetType == 223) {
					bool_2 = secretPacketBuffer2.readUnsignedByte() == 1;
					if (bool_2) {
						Ignore.aLong13 = Class6.currentTimeMs() - secretPacketBuffer2.readLong();
						XClanMember.aClass39_1 = new Class39(secretPacketBuffer2, true);
					} else {
						XClanMember.aClass39_1 = null;
					}

					anInt746 = anInt692;
					packetType = -1;
					return true;
				}

				if (packetType == 216) {
					int_1 = secretPacketBuffer2.readUnsignedByte();
					if (secretPacketBuffer2.readUnsignedByte() == 0) {
						grandExchangeOffers[int_1] = new XGrandExchangeOffer();
						secretPacketBuffer2.offset += 18;
					} else {
						--secretPacketBuffer2.offset;
						grandExchangeOffers[int_1] = new XGrandExchangeOffer(secretPacketBuffer2, false);
					}

					anInt694 = anInt692;
					packetType = -1;
					return true;
				}

				if (packetType == 52) {
					string_0 = secretPacketBuffer2.readString();
					final PacketBuffer packetbuffer_1 = secretPacketBuffer2;

					try {
						int_5 = packetbuffer_1.getUSmart();
						if (int_5 > 32767) {
							int_5 = 32767;
						}

						final byte[] bytes_2 = new byte[int_5];
						packetbuffer_1.offset += Class99.aHuffman1.decompress(packetbuffer_1.payload,
								packetbuffer_1.offset, bytes_2, 0, int_5);
						final String string_9 = Class46.getString(bytes_2, 0, int_5);
						string_10 = string_9;
					} catch (final Exception exception_1) {
						string_10 = "Cabbage";
					}

					string_10 = FontTypeFace.appendTags(XGrandExchangeOffer.method113(string_10));
					WidgetNode.sendGameMessage(6, string_0, string_10);
					packetType = -1;
					return true;
				}

				Widget widget_2;
				// interface text
				if (packetType == 244) {
					string_0 = secretPacketBuffer2.readString();
					int_2 = secretPacketBuffer2.readIntIM();
					widget_2 = Class18.method202(int_2);
					if (!string_0.equals(widget_2.text)) {
						widget_2.text = string_0;
						Class15.method196(widget_2);
					}

					System.out.println("interfaceText(" + (int_2 >> 16) + ", " + (int_2 & 0xFFFF) + ", \"" + string_0 + "\");");

					packetType = -1;
					return true;
				}

				int int_4;
				int int_6;
				if (packetType == 177) {
					int_1 = secretPacketBuffer2.readIntLE();
					int_2 = secretPacketBuffer2.readByteOb1();
					int_3 = (int_2 >> 10) & 0x1F;
					int_4 = (int_2 >> 5) & 0x1F;
					int_5 = int_2 & 0x1F;
					int_6 = (int_4 << 11) + (int_3 << 19) + (int_5 << 3);
					final Widget widget_3 = Class18.method202(int_1);
					if (int_6 != widget_3.textColor) {
						widget_3.textColor = int_6;
						Class15.method196(widget_3);
					}

					packetType = -1;
					return true;
				}

				boolean bool_4;
				if (packetType == 154) {
					int_1 = secretPacketBuffer2.readInt();
					bool_4 = secretPacketBuffer2.readUnsignedByte() == 1;
					widget_2 = Class18.method202(int_1);
					if (bool_4 != widget_2.isHidden) {
						widget_2.isHidden = bool_4;
						Class15.method196(widget_2);
					}

					packetType = -1;
					return true;
				}

				if (packetType == 200) {
					int_1 = secretPacketBuffer2.readIntLE();
					int_2 = secretPacketBuffer2.method663();
					widget_2 = Class18.method202(int_1);
					if ((int_2 != widget_2.anInt295) || (int_2 == -1)) {
						widget_2.anInt295 = int_2;
						widget_2.anInt301 = 0;
						widget_2.anInt300 = 0;
						Class15.method196(widget_2);
					}

					packetType = -1;
					return true;
				}

				if (packetType == 227) {
					int_1 = secretPacketBuffer2.readIntIM();
					int_2 = secretPacketBuffer2.method671();
					widget_2 = Class18.method202(int_1);
					if ((widget_2.modelType != 1) || (int_2 != widget_2.modelId)) {
						widget_2.modelType = 1;
						widget_2.modelId = int_2;
						Class15.method196(widget_2);
					}

					packetType = -1;
					return true;
				}

				if (packetType == 161) {
					int_1 = secretPacketBuffer2.readIntIM();
					int_2 = secretPacketBuffer2.readByteOb1();
					widget_2 = Class18.method202(int_1);
					if ((widget_2.modelType != 2) || (int_2 != widget_2.modelId)) {
						widget_2.modelType = 2;
						widget_2.modelId = int_2;
						Class15.method196(widget_2);
					}

					packetType = -1;
					return true;
				}

				if (packetType == 252) {
					int_1 = secretPacketBuffer2.readInt();
					int_2 = secretPacketBuffer2.readUShortA();
					widget_2 = Class18.method202(int_1);
					if ((widget_2 != null) && (widget_2.type == 0)) {
						if (int_2 > (widget_2.scrollHeight - widget_2.height)) {
							int_2 = widget_2.scrollHeight - widget_2.height;
						}

						if (int_2 < 0) {
							int_2 = 0;
						}

						if (int_2 != widget_2.scrollY) {
							widget_2.scrollY = int_2;
							Class15.method196(widget_2);
						}
					}

					packetType = -1;
					return true;
				}

				if (packetType == 120) {
					CacheableNode_Sub4.anInt515 = secretPacketBuffer2.method669();
					WorldMapType2.anInt242 = secretPacketBuffer2.method669();

					for (int_1 = WorldMapType2.anInt242; int_1 < (WorldMapType2.anInt242 + 8); int_1++) {
						for (int_2 = CacheableNode_Sub4.anInt515; int_2 < (CacheableNode_Sub4.anInt515 + 8); int_2++) {
							if (groundItemDeque[AClass1_Sub1.plane][int_1][int_2] != null) {
								groundItemDeque[AClass1_Sub1.plane][int_1][int_2] = null;
								Class9.groundItemSpawned(int_1, int_2);
							}
						}
					}

					for (PendingSpawn pendingspawn_0 = (PendingSpawn) pendingSpawns
							.getFront(); pendingspawn_0 != null; pendingspawn_0 = (PendingSpawn) pendingSpawns
									.getNext()) {
						if ((pendingspawn_0.anInt363 >= WorldMapType2.anInt242)
								&& (pendingspawn_0.anInt363 < (WorldMapType2.anInt242 + 8))
								&& (pendingspawn_0.anInt364 >= CacheableNode_Sub4.anInt515)
								&& (pendingspawn_0.anInt364 < (CacheableNode_Sub4.anInt515 + 8))
								&& (pendingspawn_0.level == AClass1_Sub1.plane)) {
							pendingspawn_0.hitpoints = 0;
						}
					}

					packetType = -1;
					return true;
				}

				// Varp Large
				if (packetType == 217) {
					int_1 = secretPacketBuffer2.readInt();
					int_2 = secretPacketBuffer2.readUnsignedShort();
					Class86.settings[int_2] = int_1;
					if (Class86.widgetSettings[int_2] != int_1) {
						Class86.widgetSettings[int_2] = int_1;
					}

					Class44.method266(int_2);
					anIntArray152[(++anInt705 - 1) & 0x1F] = int_2;
					packetType = -1;
					return true;
				}

				if ((packetType != 248) && (packetType != 214) && (packetType != 122) && (packetType != 102)
						&& (packetType != 221) && (packetType != 56) && (packetType != 105) && (packetType != 34)
						&& (packetType != 109)) {

					// varp small
					if (packetType == 189) {
						int_1 = secretPacketBuffer2.method671();
						final byte byte_1 = secretPacketBuffer2.readByteN();
						Class86.settings[int_1] = byte_1;
						if (Class86.widgetSettings[int_1] != byte_1) {
							Class86.widgetSettings[int_1] = byte_1;
						}

						Class44.method266(int_1);
						anIntArray152[(++anInt705 - 1) & 0x1F] = int_1;
						packetType = -1;
						return true;
					}

					if (packetType == 62) {
						int_1 = secretPacketBuffer2.readUnsignedByte();
						int_2 = secretPacketBuffer2.readUByteN();
						string_6 = secretPacketBuffer2.readString();
						if ((int_2 >= 1) && (int_2 <= 8)) {
							if (string_6.equalsIgnoreCase("null")) {
								string_6 = null;
							}

							playerOptions[int_2 - 1] = string_6;
							playerOptionsPriorities[int_2 - 1] = int_1 == 0;
						}

						packetType = -1;
						return true;
					}

					if (packetType == 19) {
						int_1 = secretPacketBuffer2.readUnsignedShort();
						int_2 = secretPacketBuffer2.readUnsignedByte();
						int_3 = secretPacketBuffer2.readUnsignedShort();
						if ((anInt698 != 0) && (int_2 != 0) && (anInt700 < 50)) {
							anIntArray148[anInt700] = int_1;
							anIntArray150[anInt700] = int_2;
							anIntArray151[anInt700] = int_3;
							audioEffects[anInt700] = null;
							anIntArray153[anInt700] = 0;
							++anInt700;
						}

						packetType = -1;
						return true;
					}

					Widget widget_4;
					if (packetType == 215) {
						int_1 = secretPacketBuffer2.readByteOb1();
						int_2 = secretPacketBuffer2.method671();
						int_3 = secretPacketBuffer2.readIntME();
						widget_4 = Class18.method202(int_3);
						widget_4.anInt299 = int_1 + (int_2 << 16);
						packetType = -1;
						return true;
					}

					if (packetType == 226) {
						Class46.method270();
						int_1 = secretPacketBuffer2.readIntLE();
						int_2 = secretPacketBuffer2.readUByteN();
						int_3 = secretPacketBuffer2.readUByteN();
						skillExperiences[int_3] = int_1;
						boostedSkillLevels[int_3] = int_2;
						realSkillLevels[int_3] = 1;

						for (int_4 = 0; int_4 < 98; int_4++) {
							if (int_1 >= Class88.anIntArray47[int_4]) {
								realSkillLevels[int_3] = int_4 + 2;
							}
						}

						anIntArray149[(++anInt702 - 1) & 0x1F] = int_3;
						packetType = -1;
						return true;
					}

					if (packetType == 162) {
						int_1 = secretPacketBuffer2.readIntME();
						int_2 = secretPacketBuffer2.method677();
						int_3 = secretPacketBuffer2.method678();
						widget_4 = Class18.method202(int_1);
						if ((int_3 != widget_4.originalX) || (int_2 != widget_4.originalY) || (widget_4.anInt290 != 0)
								|| (widget_4.anInt293 != 0)) {
							widget_4.originalX = int_3;
							widget_4.originalY = int_2;
							widget_4.anInt290 = 0;
							widget_4.anInt293 = 0;
							Class15.method196(widget_4);
							method1045(widget_4);
							if (widget_4.type == 0) {
								Class5.method89(Widget.widgets[int_1 >> 16], widget_4, false);
							}
						}

						packetType = -1;
						return true;
					}

					if (packetType == 57) {
						int_1 = secretPacketBuffer2.readIntME();
						int_2 = secretPacketBuffer2.readInt();
						int_3 = secretPacketBuffer2.readByteOb1();
						if (int_3 == 65535) {
							int_3 = -1;
						}

						widget_4 = Class18.method202(int_1);
						ItemComposition itemcomposition_0;
						if (!widget_4.hasScript) {
							if (int_3 == -1) {
								widget_4.modelType = 0;
								packetType = -1;
								return true;
							}

							itemcomposition_0 = Class45.getItemDefinition(int_3);
							widget_4.modelType = 4;
							widget_4.modelId = int_3;
							widget_4.rotationX = itemcomposition_0.xan2d;
							widget_4.rotationZ = itemcomposition_0.yan2d;
							widget_4.modelZoom = (itemcomposition_0.zoom2d * 100) / int_2;
							Class15.method196(widget_4);
						} else {
							widget_4.itemId = int_3;
							widget_4.itemQuantity = int_2;
							itemcomposition_0 = Class45.getItemDefinition(int_3);
							widget_4.rotationX = itemcomposition_0.xan2d;
							widget_4.rotationZ = itemcomposition_0.yan2d;
							widget_4.rotationY = itemcomposition_0.zan2d;
							widget_4.anInt313 = itemcomposition_0.offsetX2d;
							widget_4.anInt314 = itemcomposition_0.offsetY2d;
							widget_4.modelZoom = itemcomposition_0.zoom2d;
							if (itemcomposition_0.isStackable == 1) {
								widget_4.anInt316 = 1;
							} else {
								widget_4.anInt316 = 2;
							}

							if (widget_4.anInt315 > 0) {
								widget_4.modelZoom = (widget_4.modelZoom * 32) / widget_4.anInt315;
							} else if (widget_4.originalWidth > 0) {
								widget_4.modelZoom = (widget_4.modelZoom * 32) / widget_4.originalWidth;
							}

							Class15.method196(widget_4);
						}

						packetType = -1;
						return true;
					}

					if (packetType == 100) {
						int_1 = secretPacketBuffer2.readUnsignedByte();
						int_2 = secretPacketBuffer2.readUnsignedByte();
						int_3 = secretPacketBuffer2.readUnsignedByte();
						int_4 = secretPacketBuffer2.readUnsignedByte();
						aBoolArray11[int_1] = true;
						anIntArray144[int_1] = int_2;
						anIntArray145[int_1] = int_3;
						anIntArray146[int_1] = int_4;
						anIntArray147[int_1] = 0;
						packetType = -1;
						return true;
					}

					if (packetType == 203) {
						while (secretPacketBuffer2.offset < packetLength) {
							int_1 = secretPacketBuffer2.readUnsignedByte();
							bool_4 = (int_1 & 0x1) == 1;
							string_6 = secretPacketBuffer2.readString();
							string_10 = secretPacketBuffer2.readString();
							secretPacketBuffer2.readString();

							for (int_5 = 0; int_5 < ignoreCount; int_5++) {
								final Ignore ignore_1 = ignores[int_5];
								if (bool_4) {
									if (string_10.equals(ignore_1.name)) {
										ignore_1.name = string_6;
										ignore_1.previousName = string_10;
										string_6 = null;
										break;
									}
								} else if (string_6.equals(ignore_1.name)) {
									ignore_1.name = string_6;
									ignore_1.previousName = string_10;
									string_6 = null;
									break;
								}
							}

							if ((string_6 != null) && (ignoreCount < 400)) {
								final Ignore ignore_0 = new Ignore();
								ignores[ignoreCount] = ignore_0;
								ignore_0.name = string_6;
								ignore_0.previousName = string_10;
								++ignoreCount;
							}
						}

						anInt697 = anInt692;
						packetType = -1;
						return true;
					}

					int int_7;
					boolean bool_3;
					if (packetType == 11) {
						string_0 = secretPacketBuffer2.readString();
						int_2 = secretPacketBuffer2.readUnsignedShort();
						final byte byte_0 = secretPacketBuffer2.readByte();
						bool_3 = false;
						if (byte_0 == -128) {
							bool_3 = true;
						}

						if (bool_3) {
							if (Signlink.clanChatCount == 0) {
								packetType = -1;
								return true;
							}

							for (int_5 = 0; (int_5 < Signlink.clanChatCount)
									&& (!WorldMapData_Sub1.clanMembers[int_5].username.equals(string_0)
											|| (int_2 != WorldMapData_Sub1.clanMembers[int_5].world)); int_5++) {
								;
							}

							if (int_5 < Signlink.clanChatCount) {
								while (int_5 < (Signlink.clanChatCount - 1)) {
									WorldMapData_Sub1.clanMembers[int_5] = WorldMapData_Sub1.clanMembers[int_5 + 1];
									++int_5;
								}

								--Signlink.clanChatCount;
								WorldMapData_Sub1.clanMembers[Signlink.clanChatCount] = null;
							}
						} else {
							secretPacketBuffer2.readString();
							final XClanMember xclanmember_0 = new XClanMember();
							xclanmember_0.username = string_0;
							xclanmember_0.aString17 = Class75.method446(xclanmember_0.username, Class59.aClass110_1);
							xclanmember_0.world = int_2;
							xclanmember_0.rank = byte_0;

							for (int_6 = Signlink.clanChatCount - 1; int_6 >= 0; --int_6) {
								int_7 = WorldMapData_Sub1.clanMembers[int_6].aString17
										.compareTo(xclanmember_0.aString17);
								if (int_7 == 0) {
									WorldMapData_Sub1.clanMembers[int_6].world = int_2;
									WorldMapData_Sub1.clanMembers[int_6].rank = byte_0;
									if (string_0.equals(Script.localPlayer.name)) {
										Enum1.clanChatRank = byte_0;
									}

									anInt710 = anInt692;
									packetType = -1;
									return true;
								}

								if (int_7 < 0) {
									break;
								}
							}

							if (Signlink.clanChatCount >= WorldMapData_Sub1.clanMembers.length) {
								packetType = -1;
								return true;
							}

							for (int_7 = Signlink.clanChatCount - 1; int_7 > int_6; --int_7) {
								WorldMapData_Sub1.clanMembers[int_7 + 1] = WorldMapData_Sub1.clanMembers[int_7];
							}

							if (Signlink.clanChatCount == 0) {
								WorldMapData_Sub1.clanMembers = new XClanMember[100];
							}

							WorldMapData_Sub1.clanMembers[int_6 + 1] = xclanmember_0;
							++Signlink.clanChatCount;
							if (string_0.equals(Script.localPlayer.name)) {
								Enum1.clanChatRank = byte_0;
							}
						}

						anInt710 = anInt692;
						packetType = -1;
						return true;
					}

					if (packetType == 70) {
						Class40.anInt94 = 0;

						for (int_1 = 0; int_1 < 2048; int_1++) {
							Class40.aBufferArray1[int_1] = null;
							Class40.aByteArray5[int_1] = 1;
						}

						for (int_1 = 0; int_1 < 2048; int_1++) {
							cachedPlayers[int_1] = null;
						}

						Class37.initializeGPI(secretPacketBuffer2);
						packetType = -1;
						return true;
					}

					long long_4;
					if (packetType == 169) {
						int_1 = secretPacketBuffer2.readIntIM();
						int_2 = secretPacketBuffer2.readByteOb1();
						if (int_2 == 65535) {
							int_2 = -1;
						}

						int_3 = secretPacketBuffer2.readUShortA();
						if (int_3 == 65535) {
							int_3 = -1;
						}

						int_4 = secretPacketBuffer2.readIntIM();

						for (int_5 = int_2; int_5 <= int_3; int_5++) {
							long_4 = int_5 + ((long) int_1 << 32);
							final Node node_0 = widgetFlags.get(long_4);
							if (node_0 != null) {
								node_0.unlink();
							}

							widgetFlags.put(new WidgetConfig(int_4), long_4);
						}

						packetType = -1;
						return true;
					}

					if (packetType == 81) {
						int_1 = secretPacketBuffer2.getUSmart();
						bool_4 = secretPacketBuffer2.readUnsignedByte() == 1;
						string_6 = "";
						bool_3 = false;
						if (bool_4) {
							string_6 = secretPacketBuffer2.readString();
							if (MilliTimer.isIgnored(string_6)) {
								bool_3 = true;
							}
						}

						string_7 = secretPacketBuffer2.readString();
						if (!bool_3) {
							WidgetNode.sendGameMessage(int_1, string_6, string_7);
						}

						packetType = -1;
						return true;
					}

					Widget widget_0;
					if (packetType == 71) {
						int_1 = secretPacketBuffer2.readByteOb1();
						int_2 = secretPacketBuffer2.readUShortA();
						int_3 = secretPacketBuffer2.readUShortA();
						int_4 = secretPacketBuffer2.readIntME();
						widget_0 = Class18.method202(int_4);
						if ((int_2 != widget_0.rotationX) || (int_3 != widget_0.rotationZ)
								|| (int_1 != widget_0.modelZoom)) {
							widget_0.rotationX = int_2;
							widget_0.rotationZ = int_3;
							widget_0.modelZoom = int_1;
							Class15.method196(widget_0);
						}

						packetType = -1;
						return true;
					}

					if (packetType == 198) {
						aBool85 = true;
						ScriptState.anInt240 = secretPacketBuffer2.readUnsignedByte();
						XItemContainer.anInt421 = secretPacketBuffer2.readUnsignedByte();
						PendingSpawn.anInt362 = secretPacketBuffer2.readUnsignedShort();
						DecorativeObject.anInt189 = secretPacketBuffer2.readUnsignedByte();
						Class2.anInt16 = secretPacketBuffer2.readUnsignedByte();
						if (Class2.anInt16 >= 100) {
							Class13.cameraX = (ScriptState.anInt240 * 128) + 64;
							Class46.cameraY = (XItemContainer.anInt421 * 128) + 64;
							XItemContainer.cameraZ = Actor.getTileHeight(Class13.cameraX, Class46.cameraY,
									AClass1_Sub1.plane) - PendingSpawn.anInt362;
						}

						packetType = -1;
						return true;
					}

					if (packetType == 190) {
						aBool85 = true;
						Class67.anInt171 = secretPacketBuffer2.readUnsignedByte();
						GraphicsObject.anInt572 = secretPacketBuffer2.readUnsignedByte();
						BaseVarType.anInt349 = secretPacketBuffer2.readUnsignedShort();
						Timer.anInt285 = secretPacketBuffer2.readUnsignedByte();
						Class7.anInt26 = secretPacketBuffer2.readUnsignedByte();
						if (Class7.anInt26 >= 100) {
							int_1 = (Class67.anInt171 * 128) + 64;
							int_2 = (GraphicsObject.anInt572 * 128) + 64;
							int_3 = Actor.getTileHeight(int_1, int_2, AClass1_Sub1.plane) - BaseVarType.anInt349;
							int_4 = int_1 - Class13.cameraX;
							int_5 = int_3 - XItemContainer.cameraZ;
							int_6 = int_2 - Class46.cameraY;
							int_7 = (int) Math.sqrt((int_4 * int_4) + (int_6 * int_6));
							AClass4_Sub2.cameraPitch = (int) (Math.atan2(int_5, int_7) * 325.949D) & 0x7FF;
							Friend.cameraYaw = (int) (Math.atan2(int_4, int_6) * -325.949D) & 0x7FF;
							if (AClass4_Sub2.cameraPitch < 128) {
								AClass4_Sub2.cameraPitch = 128;
							}

							if (AClass4_Sub2.cameraPitch > 383) {
								AClass4_Sub2.cameraPitch = 383;
							}
						}

						packetType = -1;
						return true;
					}

					long long_0;
					long long_1;
					long long_2;
					if (packetType == 41) {
						string_0 = secretPacketBuffer2.readString();
						long_0 = secretPacketBuffer2.readUnsignedShort();
						long_1 = secretPacketBuffer2.read24BitInt();
						final Permission[] permissions_1 = new Permission[] { Permission.aPermission1,
								Permission.aPermission4, Permission.aPermission2, Permission.aPermission6,
								Permission.aPermission5, Permission.aPermission3 };
						final Permission permission_0 = (Permission) PendingSpawn.forOrdinal(permissions_1,
								secretPacketBuffer2.readUnsignedByte());
						long_2 = (long_0 << 32) + long_1;
						boolean bool_8 = false;

						for (int_15 = 0; int_15 < 100; int_15++) {
							if (long_2 == aLongArray4[int_15]) {
								bool_8 = true;
								break;
							}
						}

						if (MilliTimer.isIgnored(string_0)) {
							bool_8 = true;
						}

						if (!bool_8 && (anInt715 == 0)) {
							aLongArray4[anInt718] = long_2;
							anInt718 = (anInt718 + 1) % 100;
							final PacketBuffer packetbuffer_2 = secretPacketBuffer2;

							String string_3;
							try {
								int_11 = packetbuffer_2.getUSmart();
								if (int_11 > 32767) {
									int_11 = 32767;
								}

								final byte[] bytes_3 = new byte[int_11];
								packetbuffer_2.offset += Class99.aHuffman1.decompress(packetbuffer_2.payload,
										packetbuffer_2.offset, bytes_3, 0, int_11);
								final String string_2 = Class46.getString(bytes_3, 0, int_11);
								string_3 = string_2;
							} catch (final Exception exception_2) {
								string_3 = "Cabbage";
							}

							string_3 = FontTypeFace.appendTags(XGrandExchangeOffer.method113(string_3));
							byte byte_2;
							if (permission_0.aBool37) {
								byte_2 = 7;
							} else {
								byte_2 = 3;
							}

							if (permission_0.anInt322 != -1) {
								WidgetNode.sendGameMessage(byte_2,
										CombatInfo1.method650(permission_0.anInt322) + string_0, string_3);
							} else {
								WidgetNode.sendGameMessage(byte_2, string_0, string_3);
							}
						}

						packetType = -1;
						return true;
					}

					if (packetType == 239) {
						anInt667 = secretPacketBuffer2.readUnsignedByte();
						if (anInt667 == 1) {
							anInt669 = secretPacketBuffer2.readUnsignedShort();
						}

						if ((anInt667 >= 2) && (anInt667 <= 6)) {
							if (anInt667 == 2) {
								anInt677 = 64;
								anInt681 = 64;
							}

							if (anInt667 == 3) {
								anInt677 = 0;
								anInt681 = 64;
							}

							if (anInt667 == 4) {
								anInt677 = 128;
								anInt681 = 64;
							}

							if (anInt667 == 5) {
								anInt677 = 64;
								anInt681 = 0;
							}

							if (anInt667 == 6) {
								anInt677 = 64;
								anInt681 = 128;
							}

							anInt667 = 2;
							hintArrowX = secretPacketBuffer2.readUnsignedShort();
							hintArrowY = secretPacketBuffer2.readUnsignedShort();
							hintArrowType = secretPacketBuffer2.readUnsignedByte();
						}

						if (anInt667 == 10) {
							anInt671 = secretPacketBuffer2.readUnsignedShort();
						}

						packetType = -1;
						return true;
					}

					if (packetType == 94) {
						int_1 = secretPacketBuffer2.readInt();
						int_2 = secretPacketBuffer2.readUnsignedShort();
						if (int_1 < -70000) {
							int_2 += 32768;
						}

						if (int_1 >= 0) {
							widget_2 = Class18.method202(int_1);
						} else {
							widget_2 = null;
						}

						if (widget_2 != null) {
							for (int_4 = 0; int_4 < widget_2.itemIds.length; int_4++) {
								widget_2.itemIds[int_4] = 0;
								widget_2.itemQuantities[int_4] = 0;
							}
						}

						AClass4.resetItemTable(int_2);
						int_4 = secretPacketBuffer2.readUnsignedShort();

						for (int_5 = 0; int_5 < int_4; int_5++) {
							int_6 = secretPacketBuffer2.readByteOb1();
							int_7 = secretPacketBuffer2.readUnsignedByte();
							if (int_7 == 255) {
								int_7 = secretPacketBuffer2.readIntLE();
							}

							if ((widget_2 != null) && (int_5 < widget_2.itemIds.length)) {
								widget_2.itemIds[int_5] = int_6;
								widget_2.itemQuantities[int_5] = int_7;
							}

							Enum1.setItemTableSlot(int_2, int_5, int_6 - 1, int_7);
						}

						if (widget_2 != null) {
							Class15.method196(widget_2);
						}

						Class46.method270();
						interfaceItemTriggers[(++anInt704 - 1) & 0x1F] = int_2 & 0x7FFF;
						packetType = -1;
						return true;
					}

					if (packetType == 0) {
						int_1 = secretPacketBuffer2.readInt();
						int_2 = secretPacketBuffer2.readUnsignedShort();
						if (int_1 < -70000) {
							int_2 += 32768;
						}

						if (int_1 >= 0) {
							widget_2 = Class18.method202(int_1);
						} else {
							widget_2 = null;
						}

						for (; secretPacketBuffer2.offset < packetLength; Enum1.setItemTableSlot(int_2, int_4,
								int_5 - 1, int_6)) {
							int_4 = secretPacketBuffer2.getUSmart();
							int_5 = secretPacketBuffer2.readUnsignedShort();
							int_6 = 0;
							if (int_5 != 0) {
								int_6 = secretPacketBuffer2.readUnsignedByte();
								if (int_6 == 255) {
									int_6 = secretPacketBuffer2.readInt();
								}
							}

							if ((widget_2 != null) && (int_4 >= 0) && (int_4 < widget_2.itemIds.length)) {
								widget_2.itemIds[int_4] = int_5;
								widget_2.itemQuantities[int_4] = int_6;
							}
						}

						if (widget_2 != null) {
							Class15.method196(widget_2);
						}

						Class46.method270();
						interfaceItemTriggers[(++anInt704 - 1) & 0x1F] = int_2 & 0x7FFF;
						packetType = -1;
						return true;
					}

					long long_5;
					if (packetType == 59) {
						string_0 = secretPacketBuffer2.readString();
						long_0 = secretPacketBuffer2.readLong();
						long_1 = secretPacketBuffer2.readUnsignedShort();
						long_4 = secretPacketBuffer2.read24BitInt();
						final Permission[] permissions_0 = new Permission[] { Permission.aPermission1,
								Permission.aPermission4, Permission.aPermission2, Permission.aPermission6,
								Permission.aPermission5, Permission.aPermission3 };
						final Permission permission_1 = (Permission) PendingSpawn.forOrdinal(permissions_0,
								secretPacketBuffer2.readUnsignedByte());
						long_5 = (long_1 << 32) + long_4;
						boolean bool_1 = false;

						for (int_12 = 0; int_12 < 100; int_12++) {
							if (aLongArray4[int_12] == long_5) {
								bool_1 = true;
								break;
							}
						}

						if (permission_1.aBool38 && MilliTimer.isIgnored(string_0)) {
							bool_1 = true;
						}

						if (!bool_1 && (anInt715 == 0)) {
							aLongArray4[anInt718] = long_5;
							anInt718 = (anInt718 + 1) % 100;
							final PacketBuffer packetbuffer_0 = secretPacketBuffer2;

							String string_1;
							try {
								int int_14 = packetbuffer_0.getUSmart();
								if (int_14 > 32767) {
									int_14 = 32767;
								}

								final byte[] bytes_0 = new byte[int_14];
								packetbuffer_0.offset += Class99.aHuffman1.decompress(packetbuffer_0.payload,
										packetbuffer_0.offset, bytes_0, 0, int_14);
								final String string_4 = Class46.getString(bytes_0, 0, int_14);
								string_1 = string_4;
							} catch (final Exception exception_3) {
								string_1 = "Cabbage";
							}

							string_1 = FontTypeFace.appendTags(XGrandExchangeOffer.method113(string_1));
							if (permission_1.anInt322 != -1) {
								Class32.addChatMessage(9, CombatInfo1.method650(permission_1.anInt322) + string_0,
										string_1, PendingSpawn.method638(long_0));
							} else {
								Class32.addChatMessage(9, string_0, string_1, PendingSpawn.method638(long_0));
							}
						}

						packetType = -1;
						return true;
					}

					if (packetType == 126) {
						int_1 = secretPacketBuffer2.readInt();
						int_2 = secretPacketBuffer2.readInt();
						if ((Player.aGarbageCollectorMXBean1 == null) || !Player.aGarbageCollectorMXBean1.isValid()) {
							try {
								final Iterator iterator_0 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

								while (iterator_0.hasNext()) {
									final GarbageCollectorMXBean garbagecollectormxbean_0 = (GarbageCollectorMXBean) iterator_0
											.next();
									if (garbagecollectormxbean_0.isValid()) {
										Player.aGarbageCollectorMXBean1 = garbagecollectormxbean_0;
										aLong26 = -1L;
										aLong27 = -1L;
									}
								}
							} catch (final Throwable throwable_1) {
								;
							}
						}

						final long long_3 = Class6.currentTimeMs();
						int_5 = -1;
						if (Player.aGarbageCollectorMXBean1 != null) {
							long_4 = Player.aGarbageCollectorMXBean1.getCollectionTime();
							if (aLong27 != -1L) {
								long_2 = long_4 - aLong27;
								long_5 = long_3 - aLong26;
								if (long_5 != 0L) {
									int_5 = (int) ((long_2 * 100L) / long_5);
								}
							}

							aLong27 = long_4;
							aLong26 = long_3;
						}

						secretPacketBuffer1.putOpcode(234);
						secretPacketBuffer1.method675(GameEngine.FPS);
						secretPacketBuffer1.method676(int_5);
						secretPacketBuffer1.method668(int_1);
						secretPacketBuffer1.method666(int_2);
						packetType = -1;
						return true;
					}

					int int_8;
					boolean bool_6;
					if (packetType == 209) {
						anInt710 = anInt692;
						if (packetLength == 0) {
							clanChatOwner = null;
							clanChatName = null;
							Signlink.clanChatCount = 0;
							WorldMapData_Sub1.clanMembers = null;
							packetType = -1;
							return true;
						}

						clanChatName = secretPacketBuffer2.readString();
						final long long_6 = secretPacketBuffer2.readLong();
						long_1 = long_6;
						if ((long_6 > 0L) && (long_6 < 6582952005840035281L)) {
							if ((long_6 % 37L) == 0L) {
								string_6 = null;
							} else {
								int_6 = 0;

								for (long_7 = long_6; long_7 != 0L; long_7 /= 37L) {
									++int_6;
								}

								final StringBuilder stringbuilder_0 = new StringBuilder(int_6);

								while (long_1 != 0L) {
									long_5 = long_1;
									long_1 /= 37L;
									stringbuilder_0.append(Class94.aCharArray2[(int) (long_5 - (37L * long_1))]);
								}

								string_6 = stringbuilder_0.reverse().toString();
							}
						} else {
							string_6 = null;
						}

						clanChatOwner = string_6;
						FaceNormal.aByte2 = secretPacketBuffer2.readByte();
						int_6 = secretPacketBuffer2.readUnsignedByte();
						if (int_6 == 255) {
							packetType = -1;
							return true;
						}

						Signlink.clanChatCount = int_6;
						final XClanMember[] xclanmembers_0 = new XClanMember[100];

						for (int_8 = 0; int_8 < Signlink.clanChatCount; int_8++) {
							xclanmembers_0[int_8] = new XClanMember();
							xclanmembers_0[int_8].username = secretPacketBuffer2.readString();
							xclanmembers_0[int_8].aString17 = Class75.method446(xclanmembers_0[int_8].username,
									Class59.aClass110_1);
							xclanmembers_0[int_8].world = secretPacketBuffer2.readUnsignedShort();
							xclanmembers_0[int_8].rank = secretPacketBuffer2.readByte();
							secretPacketBuffer2.readString();
							if (xclanmembers_0[int_8].username.equals(Script.localPlayer.name)) {
								Enum1.clanChatRank = xclanmembers_0[int_8].rank;
							}
						}

						bool_6 = false;
						int_10 = Signlink.clanChatCount;

						while (int_10 > 0) {
							bool_6 = true;
							--int_10;

							for (int_15 = 0; int_15 < int_10; int_15++) {
								if (xclanmembers_0[int_15].aString17
										.compareTo(xclanmembers_0[int_15 + 1].aString17) > 0) {
									final XClanMember xclanmember_1 = xclanmembers_0[int_15];
									xclanmembers_0[int_15] = xclanmembers_0[int_15 + 1];
									xclanmembers_0[int_15 + 1] = xclanmember_1;
									bool_6 = false;
								}
							}

							if (bool_6) {
								break;
							}
						}

						WorldMapData_Sub1.clanMembers = xclanmembers_0;
						packetType = -1;
						return true;
					}

					if (packetType == 153) {
						while (secretPacketBuffer2.offset < packetLength) {
							bool_2 = secretPacketBuffer2.readUnsignedByte() == 1;
							string_5 = secretPacketBuffer2.readString();
							string_6 = secretPacketBuffer2.readString();
							int_4 = secretPacketBuffer2.readUnsignedShort();
							int_5 = secretPacketBuffer2.readUnsignedByte();
							int_6 = secretPacketBuffer2.readUnsignedByte();
							final boolean bool_5 = (int_6 & 0x2) != 0;
							bool_6 = (int_6 & 0x1) != 0;
							if (int_4 > 0) {
								secretPacketBuffer2.readString();
								secretPacketBuffer2.readUnsignedByte();
								secretPacketBuffer2.readInt();
							}

							secretPacketBuffer2.readString();

							for (int_9 = 0; int_9 < friendCount; int_9++) {
								final Friend friend_0 = friends[int_9];
								if (!bool_2) {
									if (string_5.equals(friend_0.name)) {
										if (int_4 != friend_0.world) {
											boolean bool_0 = true;

											for (Class73_Sub1 class73_sub1_0 = (Class73_Sub1) aClass71_1
													.method424(); class73_sub1_0 != null; class73_sub1_0 = (Class73_Sub1) aClass71_1
															.method426()) {
												if (class73_sub1_0.aString18.equals(string_5)) {
													if ((int_4 != 0) && (class73_sub1_0.aShort1 == 0)) {
														class73_sub1_0.method443();
														bool_0 = false;
													} else if ((int_4 == 0) && (class73_sub1_0.aShort1 != 0)) {
														class73_sub1_0.method443();
														bool_0 = false;
													}
												}
											}

											if (bool_0) {
												aClass71_1.method425(new Class73_Sub1(string_5, int_4));
											}

											friend_0.world = int_4;
										}

										friend_0.previousName = string_6;
										friend_0.rank = int_5;
										friend_0.aBool23 = bool_5;
										friend_0.aBool24 = bool_6;
										string_5 = null;
										break;
									}
								} else if (string_6.equals(friend_0.name)) {
									friend_0.name = string_5;
									friend_0.previousName = string_6;
									string_5 = null;
									break;
								}
							}

							if ((string_5 != null) && (friendCount < 400)) {
								final Friend friend_2 = new Friend();
								friends[friendCount] = friend_2;
								friend_2.name = string_5;
								friend_2.previousName = string_6;
								friend_2.world = int_4;
								friend_2.rank = int_5;
								friend_2.aBool23 = bool_5;
								friend_2.aBool24 = bool_6;
								++friendCount;
							}
						}

						anInt696 = 2;
						anInt697 = anInt692;
						bool_2 = false;
						int_2 = friendCount;

						while (int_2 > 0) {
							bool_2 = true;
							--int_2;

							for (int_3 = 0; int_3 < int_2; int_3++) {
								bool_3 = false;
								final Friend friend_3 = friends[int_3];
								final Friend friend_1 = friends[int_3 + 1];
								if ((friend_3.world != world) && (friend_1.world == world)) {
									bool_3 = true;
								}

								if (!bool_3 && (friend_3.world == 0) && (friend_1.world != 0)) {
									bool_3 = true;
								}

								if (!bool_3 && !friend_3.aBool23 && friend_1.aBool23) {
									bool_3 = true;
								}

								if (!bool_3 && !friend_3.aBool24 && friend_1.aBool24) {
									bool_3 = true;
								}

								if (bool_3) {
									final Friend friend_4 = friends[int_3];
									friends[int_3] = friends[int_3 + 1];
									friends[int_3 + 1] = friend_4;
									bool_2 = false;
								}
							}

							if (bool_2) {
								break;
							}
						}

						packetType = -1;
						return true;
					}

					if (packetType == 137) {
						AClass2.decodeClassVerifier(secretPacketBuffer2, packetLength);
						packetType = -1;
						return true;
					}

					if (packetType == 165) {
						Node_Sub6.method645();
						packetType = -1;
						return false;
					}

					if (packetType == 232) {
						secretPacketBuffer2.offset += 28;
						if (secretPacketBuffer2.checkCrc()) {
							final PacketBuffer packetbuffer_3 = secretPacketBuffer2;
							int_2 = secretPacketBuffer2.offset - 28;
							final byte[] bytes_1 = packetbuffer_3.payload;
							if (aByteArray29 == null) {
								aByteArray29 = new byte[24];
							}

							Class78.method449(bytes_1, int_2, aByteArray29, 0, 24);
							if (Class57.aCacheFile1 != null) {
								try {
									Class57.aCacheFile1.seek(0L);
									Class57.aCacheFile1.write(packetbuffer_3.payload, int_2, 24);
								} catch (final Exception exception_4) {
									;
								}
							}
						}

						packetType = -1;
						return true;
					}

					if (packetType == 17) {
						final World world_0 = new World();
						world_0.address = secretPacketBuffer2.readString();
						world_0.anInt227 = secretPacketBuffer2.readUnsignedShort();
						int_2 = secretPacketBuffer2.readInt();
						world_0.mask = int_2;
						WorldMapType2.setGameState(45);
						Occluder.rssocket.close();
						Occluder.rssocket = null;
						Class12.method169(world_0);
						packetType = -1;
						return false;
					}

					if (packetType == 84) {
						Class4.method88(false);
						packetType = -1;
						return true;
					}

					if (packetType == 151) {
						Class4.method88(true);
						packetType = -1;
						return true;
					}

					if (packetType != 121) {
						if (packetType == 167) {
							CacheableNode_Sub4.anInt515 = secretPacketBuffer2.method673();
							WorldMapType2.anInt242 = secretPacketBuffer2.readUByteN();

							while (secretPacketBuffer2.offset < packetLength) {
								packetType = secretPacketBuffer2.readUnsignedByte();
								Class92.method476();
							}

							packetType = -1;
							return true;
						}

						if (packetType == 16) {
							GroundObject.method537(secretPacketBuffer2, packetLength);
							packetType = -1;
							return true;
						}

						// static region
						if (packetType == 60) {
							Class31.xteaChanged(false);
							secretPacketBuffer2.readOpcode();
							int_1 = secretPacketBuffer2.readUnsignedShort();
							GroundObject.method537(secretPacketBuffer2, int_1);
							packetType = -1;
							return true;
						}

						// dynamic region
						if (packetType == 44) {
							Class31.xteaChanged(true);
							secretPacketBuffer2.readOpcode();
							int_1 = secretPacketBuffer2.readUnsignedShort();
							GroundObject.method537(secretPacketBuffer2, int_1);
							packetType = -1;
							return true;
						}

						if (packetType == 55) {
							if (widgetRoot != -1) {
								Class12.method170(widgetRoot, 0);
							}

							packetType = -1;
							return true;
						}

						if (packetType == 6) {
							int_1 = secretPacketBuffer2.readInt();
							final WidgetNode widgetnode_2 = (WidgetNode) componentTable.get(int_1);
							if (widgetnode_2 != null) {
								MilliTimer.method690(widgetnode_2, true);
							}

							if (aWidget12 != null) {
								Class15.method196(aWidget12);
								aWidget12 = null;
							}

							packetType = -1;
							return true;
						}

						// root interface
						if (packetType == 129) {
							int_1 = secretPacketBuffer2.readUShortA();
							widgetRoot = int_1;
							method1039(false);
							AClass1_Sub2.method607(int_1);
							Class90.method473(widgetRoot);

							for (int_2 = 0; int_2 < 100; int_2++) {
								aBoolArray8[int_2] = true;
							}

							System.out.println("rootInterface(" + int_1 + ");");

							packetType = -1;
							return true;
						}

						// interface transform
						WidgetNode widgetnode_1;
						if (packetType == 78) {
							int_1 = secretPacketBuffer2.readIntLE();
							int_2 = secretPacketBuffer2.readIntLE();
							final WidgetNode widgetnode_3 = (WidgetNode) componentTable.get(int_1);
							widgetnode_1 = (WidgetNode) componentTable.get(int_2);
							if (widgetnode_1 != null) {
								MilliTimer.method690(widgetnode_1,
										(widgetnode_3 == null) || (widgetnode_1.anInt392 != widgetnode_3.anInt392));
							}

							if (widgetnode_3 != null) {
								widgetnode_3.unlink();
								componentTable.put(widgetnode_3, int_2);
							}

							widget_0 = Class18.method202(int_1);
							if (widget_0 != null) {
								Class15.method196(widget_0);
							}

							widget_0 = Class18.method202(int_2);
							if (widget_0 != null) {
								Class15.method196(widget_0);
								Class5.method89(Widget.widgets[widget_0.anInt289 >>> 16], widget_0, true);
							}

							if (widgetRoot != -1) {
								Class12.method170(widgetRoot, 1);
							}

							System.out.println("interfaceTransform(" + (int_2 >> 16) + ", " + (int_2 & 0xFFFF) + ", " + (int_1 >> 16) + ", " + (int_1 & 0xFFFF) + ");");

							packetType = -1;
							return true;
						}

						// interface
						if (packetType == 111) {
							int_1 = secretPacketBuffer2.readUByteN();
							int_2 = secretPacketBuffer2.readIntME();
							int_3 = secretPacketBuffer2.readUShortA();

							widgetnode_1 = (WidgetNode) componentTable.get(int_2);
							if (widgetnode_1 != null) {
								MilliTimer.method690(widgetnode_1, int_3 != widgetnode_1.anInt392);
							}

							System.out.println("interface(" + (int_2 >> 16) + ", " + (int_2 & 0xFFFF) + ", " + int_3 + ", " + (int_1 == 1) + "); int_2: " + int_2);

							GameObject.method535(int_2, int_3, int_1);
							packetType = -1;
							return true;
						}

						if (packetType == 42) {
							string_0 = secretPacketBuffer2.readString();
							final Object[] objects_0 = new Object[string_0.length() + 1];

							for (int_3 = string_0.length() - 1; int_3 >= 0; --int_3) {
								if (string_0.charAt(int_3) == 115) {
									objects_0[int_3 + 1] = secretPacketBuffer2.readString();
								} else {
									objects_0[int_3 + 1] = new Integer(secretPacketBuffer2.readInt());
								}
							}

							objects_0[0] = new Integer(secretPacketBuffer2.readInt());
							final ScriptEvent scriptevent_0 = new ScriptEvent();
							scriptevent_0.anObjectArray22 = objects_0;
							Class30.method229(scriptevent_0);
							packetType = -1;
							return true;
						}

						if (packetType == 128) {
							int_1 = packetLength + secretPacketBuffer2.offset;
							int_2 = secretPacketBuffer2.readUnsignedShort();
							int_3 = secretPacketBuffer2.readUnsignedShort();
							if (int_2 != widgetRoot) {
								widgetRoot = int_2;
								method1039(false);
								AClass1_Sub2.method607(widgetRoot);
								Class90.method473(widgetRoot);

								for (int_4 = 0; int_4 < 100; int_4++) {
									aBoolArray8[int_4] = true;
								}
							}

							WidgetNode widgetnode_0;
							for (; int_3-- > 0; widgetnode_0.aBool46 = true) {
								int_4 = secretPacketBuffer2.readInt();
								int_5 = secretPacketBuffer2.readUnsignedShort();
								int_6 = secretPacketBuffer2.readUnsignedByte();
								widgetnode_0 = (WidgetNode) componentTable.get(int_4);
								if ((widgetnode_0 != null) && (int_5 != widgetnode_0.anInt392)) {
									MilliTimer.method690(widgetnode_0, true);
									widgetnode_0 = null;
								}

								if (widgetnode_0 == null) {
									widgetnode_0 = GameObject.method535(int_4, int_5, int_6);
								}
							}

							for (widgetnode_1 = (WidgetNode) componentTable
									.method515(); widgetnode_1 != null; widgetnode_1 = (WidgetNode) componentTable
											.method516()) {
								if (widgetnode_1.aBool46) {
									widgetnode_1.aBool46 = false;
								} else {
									MilliTimer.method690(widgetnode_1, true);
								}
							}

							widgetFlags = new XHashTable(512);

							while (secretPacketBuffer2.offset < int_1) {
								int_4 = secretPacketBuffer2.readInt();
								int_5 = secretPacketBuffer2.readUnsignedShort();
								int_6 = secretPacketBuffer2.readUnsignedShort();
								int_7 = secretPacketBuffer2.readInt();

								for (int_8 = int_5; int_8 <= int_6; int_8++) {
									final long long_8 = int_8 + ((long) int_4 << 32);
									widgetFlags.put(new WidgetConfig(int_7), long_8);
								}
							}

							packetType = -1;
							return true;
						}

						Class17.method201(
								"" + packetType + "," + secondLastFrameId + "," + thridLastFrameId + "," + packetLength,
								(Throwable) null);
						Node_Sub6.method645();
						return true;
					}
				}

				Class92.method476();
				packetType = -1;
				return true;
			} catch (final IOException ioexception_0) {
				if (anInt646 > 0) {
					Node_Sub6.method645();
				} else {
					WorldMapType2.setGameState(40);
					Class101.aRSSocket2 = Occluder.rssocket;
					Occluder.rssocket = null;
				}
			} catch (final Exception exception_0) {
				string_0 = "" + packetType + "," + secondLastFrameId + "," + thridLastFrameId + "," + packetLength + ","
						+ (Script.localPlayer.pathX[0] + AClass2.baseX) + ","
						+ (Script.localPlayer.pathY[0] + AClass4_Sub1.baseY) + ",";

				for (int_2 = 0; (int_2 < packetLength) && (int_2 < 50); int_2++) {
					string_0 = string_0 + secretPacketBuffer2.payload[int_2] + ",";
				}

				Class17.method201(string_0, exception_0);
				Node_Sub6.method645();
			}

			return true;
		}
	}

	void method1040() {
		if (Class93.anInt203 >= 4) {
			this.error("js5crc");
			gameState = 1000;
		} else {
			if (Class93.anInt205 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					gameState = 1000;
					return;
				}

				anInt649 = 3000;
				Class93.anInt205 = 3;
			}

			if ((--anInt649 + 1) <= 0) {
				try {

					if (js5State == 0) {
						BaseVarType.socket = GameEngine.taskManager.createSocket(Class32.host, AClass4.myWorldPort);
						++js5State;
					}

					if (js5State == 1) {
						if (BaseVarType.socket.status == 2) {
							this.error(-1);
							return;
						}

						if (BaseVarType.socket.status == 1) {
							++js5State;
						}
					}

					if (js5State == 2) {
						Class40.rssocket = new RSSocket((Socket) BaseVarType.socket.value, GameEngine.taskManager);
						final Buffer buffer_0 = new Buffer(5);
						buffer_0.putByte(15);
						buffer_0.putInt(149);
						Class40.rssocket.queueForWrite(buffer_0.payload, 0, 5);
						++js5State;
						Class15.aLong1 = Class6.currentTimeMs();
					}

					if (js5State == 3) {
						if ((gameState > 5) && (Class40.rssocket.available() <= 0)) {
							if ((Class6.currentTimeMs() - Class15.aLong1) > 30000L) {
								this.error(-2);
								return;
							}
						} else {
							final int int_0 = Class40.rssocket.readByte();
							if (int_0 != 0) {
								this.error(int_0);
								return;
							}

							++js5State;
						}
					}

					if (js5State == 4) {
						final RSSocket rssocket_0 = Class40.rssocket;
						final boolean bool_0 = gameState > 20;
						if (Class93.aRSSocket1 != null) {
							try {
								Class93.aRSSocket1.close();
							} catch (final Exception exception_0) {
								;
							}

							Class93.aRSSocket1 = null;
						}

						Class93.aRSSocket1 = rssocket_0;
						Actor.sendConInfo(bool_0);
						Class93.aBuffer4.offset = 0;
						Class94.currentRequest = null;
						Class38.aBuffer1 = null;
						Class93.anInt210 = 0;

						//TODO here
						while (true) {
							FileRequest filerequest_0 = (FileRequest) Class93.aXHashTable5.method515();
							if (filerequest_0 == null) {
								while (true) {
									filerequest_0 = (FileRequest) Class93.aXHashTable6.method515();
									if (filerequest_0 == null) {

										if (Class93.aByte1 != 0) {
											try {
												final Buffer buffer_1 = new Buffer(4);
												buffer_1.putByte(4);
												buffer_1.putByte(Class93.aByte1);
												buffer_1.putShort(0);
												Class93.aRSSocket1.queueForWrite(buffer_1.payload, 0, 4);
											} catch (final IOException ioexception_1) {
												try {
													Class93.aRSSocket1.close();
												} catch (final Exception exception_1) {
													;
												}

												++Class93.anInt205;
												Class93.aRSSocket1 = null;
											}
										}

										Class93.anInt204 = 0;
										Class93.aLong12 = Class6.currentTimeMs();
										BaseVarType.socket = null;
										Class40.rssocket = null;
										js5State = 0;
										anInt652 = 0;
										return;
									}

									Class93.aNode2LinkedList1.setHead(filerequest_0);
									Class93.aXHashTable3.put(filerequest_0, filerequest_0.hash);
									++Class93.anInt209;
									--Class93.anInt208;
								}
							}

							Class93.aXHashTable4.put(filerequest_0, filerequest_0.hash);
							++Class93.anInt206;
							--Class93.anInt207;
						}

					}

				} catch (final IOException ioexception_0) {
					this.error(-3);
				}
			}
		}
	}

	final void method1041(final int int_0, final int int_1) {
		int int_2 = Class36.aFont3.method965("Choose Option");

		int int_3;
		for (int_3 = 0; int_3 < menuOptionCount; int_3++) {
			final Font font_0 = Class36.aFont3;
			String string_0;
			if (int_3 < 0) {
				string_0 = "";
			} else if (menuTargets[int_3].length() > 0) {
				string_0 = menuOptions[int_3] + " " + menuTargets[int_3];
			} else {
				string_0 = menuOptions[int_3];
			}

			final int int_4 = font_0.method965(string_0);
			if (int_4 > int_2) {
				int_2 = int_4;
			}
		}

		int_2 += 8;
		int_3 = (menuOptionCount * 15) + 22;
		int int_5 = int_0 - (int_2 / 2);
		if ((int_5 + int_2) > Class25.canvasWidth) {
			int_5 = Class25.canvasWidth - int_2;
		}

		if (int_5 < 0) {
			int_5 = 0;
		}

		int int_6 = int_1;
		if ((int_1 + int_3) > FloorUnderlayDefinition.canvasHeight) {
			int_6 = FloorUnderlayDefinition.canvasHeight - int_3;
		}

		if (int_6 < 0) {
			int_6 = 0;
		}

		Class8.region.method352(AClass1_Sub1.plane, int_0, int_1, false);
		isMenuOpen = true;
		Class18.menuX = int_5;
		AClass4_Sub1.menuY = int_6;
		AClass4_Sub1.menuWidth = int_2;
		Class28.menuHeight = (menuOptionCount * 15) + 22;
	}

	final void method1042() {
		int int_0;
		if (widgetRoot != -1) {
			int_0 = widgetRoot;
			if (Class14.loadWidget(int_0)) {
				Class97.method493(Widget.widgets[int_0], -1);
			}
		}

		for (int_0 = 0; int_0 < anInt647; int_0++) {
			if (aBoolArray8[int_0]) {
				aBoolArray10[int_0] = true;
			}

			aBoolArray9[int_0] = aBoolArray8[int_0];
			aBoolArray8[int_0] = false;
		}

		anInt648 = gameCycle;
		anInt650 = -1;
		anInt651 = -1;
		Class23.aWidget4 = null;
		if (widgetRoot != -1) {
			anInt647 = 0;
			VertexNormal.drawWidget(widgetRoot, 0, 0, Class25.canvasWidth, FloorUnderlayDefinition.canvasHeight, 0, 0,
					-1);
		}

		Rasterizer2D.noClip();
		int int_1;
		int int_2;
		if (!isMenuOpen) {
			if (anInt650 != -1) {
				int_0 = anInt650;
				int_1 = anInt651;
				if ((menuOptionCount >= 2) || (itemSelectionState != 0) || spellSelected) {
					int_2 = Class56.method347();
					String string_0;
					if ((itemSelectionState == 1) && (menuOptionCount < 2)) {
						string_0 = "Use" + " " + selectedItemName + " " + "->";
					} else if (spellSelected && (menuOptionCount < 2)) {
						string_0 = aString33 + " " + aString34 + " " + "->";
					} else {
						String string_1;
						if (int_2 < 0) {
							string_1 = "";
						} else if (menuTargets[int_2].length() > 0) {
							string_1 = menuOptions[int_2] + " " + menuTargets[int_2];
						} else {
							string_1 = menuOptions[int_2];
						}

						string_0 = string_1;
					}

					if (menuOptionCount > 2) {
						string_0 = string_0 + Class6.getColTags(16777215) + " " + '\u002f' + " " + (menuOptionCount - 2)
								+ " more options";
					}

					Class36.aFont3.drawRandomizedMouseoverText(string_0, int_0 + 4, int_1 + 15, 16777215, 0,
							gameCycle / 1000);
				}
			}
		} else {
			Player.method1036();
		}

		if (gameDrawingMode == 3) {
			for (int_0 = 0; int_0 < anInt647; int_0++) {
				if (aBoolArray9[int_0]) {
					Rasterizer2D.fillRectangle(widgetPositionX[int_0], widgetPositionY[int_0], widgetBoundsWidth[int_0],
							widgetBoundsHeight[int_0], 16711935, 128);
				} else if (aBoolArray10[int_0]) {
					Rasterizer2D.fillRectangle(widgetPositionX[int_0], widgetPositionY[int_0], widgetBoundsWidth[int_0],
							widgetBoundsHeight[int_0], 16711680, 128);
				}
			}
		}

		int_0 = AClass1_Sub1.plane;
		int_1 = Script.localPlayer.anInt547;
		int_2 = Script.localPlayer.anInt550;
		final int int_3 = anInt662;

		for (Node_Sub1 node_sub1_0 = (Node_Sub1) Node_Sub1.aDeque3
				.getFront(); node_sub1_0 != null; node_sub1_0 = (Node_Sub1) Node_Sub1.aDeque3.getNext()) {
			if ((node_sub1_0.anInt337 != -1) || (node_sub1_0.anIntArray76 != null)) {
				int int_4 = 0;
				if (int_1 > node_sub1_0.anInt341) {
					int_4 += int_1 - node_sub1_0.anInt341;
				} else if (int_1 < node_sub1_0.anInt342) {
					int_4 += node_sub1_0.anInt342 - int_1;
				}

				if (int_2 > node_sub1_0.anInt343) {
					int_4 += int_2 - node_sub1_0.anInt343;
				} else if (int_2 < node_sub1_0.anInt344) {
					int_4 += node_sub1_0.anInt344 - int_2;
				}

				if (((int_4 - 64) <= node_sub1_0.anInt338) && (anInt684 != 0) && (int_0 == node_sub1_0.anInt345)) {
					int_4 -= 64;
					if (int_4 < 0) {
						int_4 = 0;
					}

					final int int_5 = ((node_sub1_0.anInt338 - int_4) * anInt684) / node_sub1_0.anInt338;
					if (node_sub1_0.anAClass5_Sub2_1 == null) {
						if (node_sub1_0.anInt337 >= 0) {
							final SoundEffect soundeffect_0 = SoundEffect.getTrack(WorldMapType2.anIndexData4,
									node_sub1_0.anInt337, 0);
							if (soundeffect_0 != null) {
								final AClass7_Sub1 aclass7_sub1_0 = soundeffect_0.method402()
										.method709(Overlay.aClass53_1);
								final AClass5_Sub2 aclass5_sub2_0 = AClass5_Sub2.method749(aclass7_sub1_0, 100, int_5);
								aclass5_sub2_0.method727(-1);
								Class76.anAClass5_Sub1_1.method699(aclass5_sub2_0);
								node_sub1_0.anAClass5_Sub2_1 = aclass5_sub2_0;
							}
						}
					} else {
						node_sub1_0.anAClass5_Sub2_1.method729(int_5);
					}

					if (node_sub1_0.anAClass5_Sub2_2 == null) {
						if ((node_sub1_0.anIntArray76 != null) && ((node_sub1_0.anInt346 -= int_3) <= 0)) {
							final int int_6 = (int) (Math.random() * node_sub1_0.anIntArray76.length);
							final SoundEffect soundeffect_1 = SoundEffect.getTrack(WorldMapType2.anIndexData4,
									node_sub1_0.anIntArray76[int_6], 0);
							if (soundeffect_1 != null) {
								final AClass7_Sub1 aclass7_sub1_1 = soundeffect_1.method402()
										.method709(Overlay.aClass53_1);
								final AClass5_Sub2 aclass5_sub2_1 = AClass5_Sub2.method749(aclass7_sub1_1, 100, int_5);
								aclass5_sub2_1.method727(0);
								Class76.anAClass5_Sub1_1.method699(aclass5_sub2_1);
								node_sub1_0.anAClass5_Sub2_2 = aclass5_sub2_1;
								node_sub1_0.anInt346 = node_sub1_0.anInt339
										+ (int) (Math.random() * (node_sub1_0.anInt340 - node_sub1_0.anInt339));
							}
						}
					} else {
						node_sub1_0.anAClass5_Sub2_2.method729(int_5);
						if (!node_sub1_0.anAClass5_Sub2_2.linked()) {
							node_sub1_0.anAClass5_Sub2_2 = null;
						}
					}
				} else {
					if (node_sub1_0.anAClass5_Sub2_1 != null) {
						Class76.anAClass5_Sub1_1.method700(node_sub1_0.anAClass5_Sub2_1);
						node_sub1_0.anAClass5_Sub2_1 = null;
					}

					if (node_sub1_0.anAClass5_Sub2_2 != null) {
						Class76.anAClass5_Sub1_1.method700(node_sub1_0.anAClass5_Sub2_2);
						node_sub1_0.anAClass5_Sub2_2 = null;
					}
				}
			}
		}

		anInt662 = 0;
	}

	@Override
	protected final void method1023(final boolean bool_0) {
		boolean bool_1;
		label137: {
			try {
				if (Class76.anInt186 == 2) {
					if (Enum3.aTrack1_1 == null) {
						Enum3.aTrack1_1 = Track1.getMusicFile(Class76.anIndexDataBase3, Class76.anInt187,
								MilliTimer.anInt422);
						if (Enum3.aTrack1_1 == null) {
							bool_1 = false;
							break label137;
						}
					}

					if (Class76.aClass54_1 == null) {
						Class76.aClass54_1 = new Class54(Class76.anIndexDataBase4, Class96.anIndexDataBase9);
					}

					if (Class76.anAClass5_Sub3_1.method773(Enum3.aTrack1_1, Class76.anIndexDataBase6,
							Class76.aClass54_1, 22050)) {
						Class76.anAClass5_Sub3_1.method777();
						Class76.anAClass5_Sub3_1.method781(Class76.anInt188);
						Class76.anAClass5_Sub3_1.method783(Enum3.aTrack1_1, Class76.aBool21);
						Class76.anInt186 = 0;
						Enum3.aTrack1_1 = null;
						Class76.aClass54_1 = null;
						Class76.anIndexDataBase3 = null;
						bool_1 = true;
						break label137;
					}
				}
			} catch (final Exception exception_0) {
				exception_0.printStackTrace();
				Class76.anAClass5_Sub3_1.method764();
				Class76.anInt186 = 0;
				Enum3.aTrack1_1 = null;
				Class76.aClass54_1 = null;
				Class76.anIndexDataBase3 = null;
			}

			bool_1 = false;
		}

		if (bool_1 && aBool80 && (AClass3.soundSystem0 != null)) {
			AClass3.soundSystem0.method333();
		}

		if (((gameState == 10) || (gameState == 20) || (gameState == 30)) && (aLong24 != 0L)
				&& (Class6.currentTimeMs() > aLong24)) {
			Class38.method255(Player.method1035());
		}

		int int_0;
		if (bool_0) {
			for (int_0 = 0; int_0 < 100; int_0++) {
				aBoolArray8[int_0] = true;
			}
		}

		if (gameState == 0) {
			drawLoadingScreen(Class26.loadingBarPercentage, Class26.loadingText, bool_0);
		} else if (gameState == 5) {
			XClanMember.drawLoginScreen(Class36.aFont3, Class82.aFont4, Class31.font_p12full, bool_0);
		} else if ((gameState != 10) && (gameState != 11)) {
			if (gameState == 20) {
				XClanMember.drawLoginScreen(Class36.aFont3, Class82.aFont4, Class31.font_p12full, bool_0);
			} else if (gameState == 25) {
				if (anInt664 == 1) {
					if (anInt668 > anInt670) {
						anInt670 = anInt668;
					}

					int_0 = ((anInt670 * 50) - (anInt668 * 50)) / anInt670;
					Class30.drawStatusBox("Loading - please wait." + "<br>" + " (" + int_0 + "%" + ")", false);
				} else if (anInt664 == 2) {
					if (anInt672 > anInt674) {
						anInt674 = anInt672;
					}

					int_0 = (((anInt674 * 50) - (anInt672 * 50)) / anInt674) + 50;
					Class30.drawStatusBox("Loading - please wait." + "<br>" + " (" + int_0 + "%" + ")", false);
				} else {
					Class30.drawStatusBox("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				method1042();
			} else if (gameState == 40) {
				Class30.drawStatusBox("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				Class30.drawStatusBox("Please wait...", false);
			}
		} else {
			XClanMember.drawLoginScreen(Class36.aFont3, Class82.aFont4, Class31.font_p12full, bool_0);
		}

		if ((gameState == 30) && (gameDrawingMode == 0) && !bool_0 && !isResized) {
			for (int_0 = 0; int_0 < anInt647; int_0++) {
				if (aBoolArray10[int_0]) {
					GZipDecompressor.aBufferProvider1.method475(widgetPositionX[int_0], widgetPositionY[int_0],
							widgetBoundsWidth[int_0], widgetBoundsHeight[int_0]);
					aBoolArray10[int_0] = false;
				}
			}

		} else {
			if (gameState > 0) {
				GZipDecompressor.aBufferProvider1.method474(0, 0);

				for (int_0 = 0; int_0 < anInt647; int_0++) {
					aBoolArray10[int_0] = false;
				}
			}

		}
	}

	@Override
	protected final void method1024() {
		aLong24 = Class6.currentTimeMs() + 500L;
		method1038();
		if (widgetRoot != -1) {
			method1039(true);
		}

	}

	final void method1043() {
		try {
			if (loginState == 0) {
				if (Occluder.rssocket != null) {
					Occluder.rssocket.close();
					Occluder.rssocket = null;
				}

				AClass4_Sub1.aTask2 = null;
				socketError = false;
				anInt653 = 0;
				loginState = 1;
			}

			if (loginState == 1) {
				if (AClass4_Sub1.aTask2 == null) {
					AClass4_Sub1.aTask2 = GameEngine.taskManager.createSocket(Class32.host, AClass4.myWorldPort);
				}

				if (AClass4_Sub1.aTask2.status == 2) {
					throw new IOException();
				}

				if (AClass4_Sub1.aTask2.status == 1) {
					Occluder.rssocket = new RSSocket((Socket) AClass4_Sub1.aTask2.value, GameEngine.taskManager);
					AClass4_Sub1.aTask2 = null;
					loginState = 2;
				}
			}

			if (loginState == 2) {
				secretPacketBuffer1.offset = 0;
				secretPacketBuffer1.putByte(14);
				Occluder.rssocket.queueForWrite(secretPacketBuffer1.payload, 0, 1);
				secretPacketBuffer2.offset = 0;
				loginState = 3;
			}

			int int_0;
			if (loginState == 3) {
				if (AClass3.soundSystem0 != null) {
					AClass3.soundSystem0.method337();
				}

				if (KeyFocusListener.soundSystem1 != null) {
					KeyFocusListener.soundSystem1.method337();
				}

				int_0 = Occluder.rssocket.readByte();
				if (AClass3.soundSystem0 != null) {
					AClass3.soundSystem0.method337();
				}

				if (KeyFocusListener.soundSystem1 != null) {
					KeyFocusListener.soundSystem1.method337();
				}

				if (int_0 != 0) {
					Class28.method226(int_0);
					return;
				}

				secretPacketBuffer2.offset = 0;
				loginState = 4;
			}

			if (loginState == 4) {
				if (secretPacketBuffer2.offset < 8) {
					int_0 = Occluder.rssocket.available();
					if (int_0 > (8 - secretPacketBuffer2.offset)) {
						int_0 = 8 - secretPacketBuffer2.offset;
					}

					if (int_0 > 0) {
						Occluder.rssocket.read(secretPacketBuffer2.payload, secretPacketBuffer2.offset, int_0);
						secretPacketBuffer2.offset += int_0;
					}
				}

				if (secretPacketBuffer2.offset == 8) {
					secretPacketBuffer2.offset = 0;
					Class32.aLong3 = secretPacketBuffer2.readLong();
					loginState = 5;
				}
			}

			int int_1;
			int int_2;
			if (loginState == 5) {
				final int[] ints_0 = new int[] { (int) (Math.random() * 9.9999999E7D),
						(int) (Math.random() * 9.9999999E7D), (int) (Class32.aLong3 >> 32),
						(int) (Class32.aLong3 & 0xFFFFFFFFFFFFFFFFL) };
				secretPacketBuffer1.offset = 0;

				// login opcode
				secretPacketBuffer1.putByte(1);

				// authorization type
				secretPacketBuffer1.putByte(Class26.anEnum3_1.rsOrdinal());

				// keys
				secretPacketBuffer1.putInt(ints_0[0]);
				secretPacketBuffer1.putInt(ints_0[1]);
				secretPacketBuffer1.putInt(ints_0[2]);
				secretPacketBuffer1.putInt(ints_0[3]);

				// authorization
				switch (Class26.anEnum3_1.anInt370) {
				case 0:
					secretPacketBuffer1.putInt(((Integer) Class28.preferences.preferences
							.get(Integer.valueOf(Enum6.method657(Class26.username)))).intValue());
					secretPacketBuffer1.offset += 4;
					break;
				case 1:
				case 2:
					secretPacketBuffer1.put24bitInt(Class44.authCodeForLogin);
					secretPacketBuffer1.offset += 5;
					break;
				case 3:
					secretPacketBuffer1.offset += 8;
				}

				secretPacketBuffer1.putString(Class26.password);
				secretPacketBuffer1.encryptRsa(Class37.rsaKeyExponent, Class37.rsaKeyModulus);
				aPacketBuffer1.offset = 0;
				if (gameState == 40) {
					aPacketBuffer1.putByte(18);
				} else {
					aPacketBuffer1.putByte(16);
				}

				aPacketBuffer1.putShort(0);
				int_1 = aPacketBuffer1.offset;
				aPacketBuffer1.putInt(149);
				aPacketBuffer1.putBytes(secretPacketBuffer1.payload, 0, secretPacketBuffer1.offset);
				int_2 = aPacketBuffer1.offset;

				// username
				aPacketBuffer1.putString(Class26.username);

				// resizable and lowmem
				aPacketBuffer1.putByte(((isResized ? 1 : 0) << 1) | (lowMemory ? 1 : 0));

				// client width
				aPacketBuffer1.putShort(Class25.canvasWidth);

				// client height
				aPacketBuffer1.putShort(FloorUnderlayDefinition.canvasHeight);
				Renderable.method691(aPacketBuffer1);
				aPacketBuffer1.putString(AClass4_Sub2.sessionToken);

				// ??
				aPacketBuffer1.putInt(Class51.anInt112);

				final Buffer buffer_0 = new Buffer(Class75.aMachineInfo1.method659());
				Class75.aMachineInfo1.method660(buffer_0);
				aPacketBuffer1.putBytes(buffer_0.payload, 0, buffer_0.payload.length);
				aPacketBuffer1.putByte(Class12.anInt38);
				aPacketBuffer1.putInt(0);
				aPacketBuffer1.putInt(Class12.indexInterfaces.crc);
				aPacketBuffer1.putInt(indexSoundEffects.crc);
				aPacketBuffer1.putInt(Tile.configsIndex.crc);
				aPacketBuffer1.putInt(BuildType.anIndexData3.crc);
				aPacketBuffer1.putInt(WorldMapType2.anIndexData4.crc);
				aPacketBuffer1.putInt(Class33.indexMaps.crc);
				aPacketBuffer1.putInt(Class68.indexTrack1.crc);
				aPacketBuffer1.putInt(Renderable.indexModels.crc);
				aPacketBuffer1.putInt(Class50.indexSprites.crc);
				aPacketBuffer1.putInt(indexTextures.crc);
				aPacketBuffer1.putInt(Class17.anIndexData1.crc);
				aPacketBuffer1.putInt(AClass4_Sub1.indexTrack2.crc);
				aPacketBuffer1.putInt(Class99.indexScripts.crc);
				aPacketBuffer1.putInt(Player.anIndexData5.crc);
				aPacketBuffer1.putInt(Class21.vorbisIndex.crc);
				aPacketBuffer1.putInt(Class19.anIndexData2.crc);
				aPacketBuffer1.putInt(Class44.indexWorldMap.crc);

				aPacketBuffer1.encryptXtea(ints_0, int_2, aPacketBuffer1.offset);
				aPacketBuffer1.putShortLength(aPacketBuffer1.offset - int_1);
				Occluder.rssocket.queueForWrite(aPacketBuffer1.payload, 0, aPacketBuffer1.offset);
				secretPacketBuffer1.seed(ints_0);

				for (int int_3 = 0; int_3 < 4; int_3++) {
					ints_0[int_3] += 50;
				}

				secretPacketBuffer2.seed(ints_0);
				loginState = 6;
			}

			if ((loginState == 6) && (Occluder.rssocket.available() > 0)) {
				int_0 = Occluder.rssocket.readByte();

				if ((int_0 == 21) && (gameState == 20)) {
					loginState = 7;
				} else if (int_0 == 2) {
					loginState = 9;
				} else if ((int_0 == 15) && (gameState == 40)) {
					packetLength = -1;
					loginState = 13;
				} else if ((int_0 == 23) && (anInt645 < 1)) {
					++anInt645;
					loginState = 0;
				} else {
					if (int_0 != 29) {
						Class28.method226(int_0);
						return;
					}

					loginState = 11;
				}
			}

			if ((loginState == 7) && (Occluder.rssocket.available() > 0)) {
				anInt689 = (Occluder.rssocket.readByte() + 3) * 60;
				loginState = 8;
			}

			//System.out.println("loginState: " + loginState);

			if (loginState == 8) {
				anInt653 = 0;
				Class41.method261("You have only just left another world.", "Your profile will be transferred in:",
						(anInt689 / 60) + " seconds.");
				if (--anInt689 <= 0) {
					loginState = 0;
				}
			} else {

				if ((loginState == 9) && (Occluder.rssocket.available() >= 13)) {
					final boolean bool_0 = Occluder.rssocket.readByte() == 1;

					Occluder.rssocket.read(secretPacketBuffer2.payload, 0, 4);
					secretPacketBuffer2.offset = 0;
					if (bool_0) {
						int_1 = secretPacketBuffer2.readOpcode() << 24;
						int_1 |= secretPacketBuffer2.readOpcode() << 16;
						int_1 |= secretPacketBuffer2.readOpcode() << 8;
						int_1 |= secretPacketBuffer2.readOpcode();
						int_2 = Enum6.method657(Class26.username);
						if ((Class28.preferences.preferences.size() >= 10)
								&& !Class28.preferences.preferences.containsKey(Integer.valueOf(int_2))) {
							final Iterator iterator_0 = Class28.preferences.preferences.entrySet().iterator();
							iterator_0.next();
							iterator_0.remove();
						}

						Class28.preferences.preferences.put(Integer.valueOf(int_2), Integer.valueOf(int_1));
						PendingSpawn.method635();
					}

					rights = Occluder.rssocket.readByte();
					aBool87 = Occluder.rssocket.readByte() == 1; // members
					localInteractingIndex = Occluder.rssocket.readByte(); //playerIndex
					localInteractingIndex <<= 8;
					localInteractingIndex += Occluder.rssocket.readByte(); //playerIndex
					anInt717 = Occluder.rssocket.readByte(); // used for an interface
					Occluder.rssocket.read(secretPacketBuffer2.payload, 0, 1);
					secretPacketBuffer2.offset = 0;
					packetType = secretPacketBuffer2.readOpcode();
					Occluder.rssocket.read(secretPacketBuffer2.payload, 0, 2);
					secretPacketBuffer2.offset = 0;
					packetLength = secretPacketBuffer2.readUnsignedShort();

					try {
						Class20.method208(AClass1.clientInstance, "zap");
					} catch (final Throwable throwable_0) {
						;
					}

					loginState = 10;
				}

				if (loginState == 10) {
					if (Occluder.rssocket.available() >= packetLength) {
						secretPacketBuffer2.offset = 0;
						Occluder.rssocket.read(secretPacketBuffer2.payload, 0, packetLength);
						Class44.method267();
						Class37.initializeGPI(secretPacketBuffer2);
						Class7.anInt27 = -1;
						Class31.xteaChanged(false);
						packetType = -1;
					}
				} else {
					if ((loginState == 11) && (Occluder.rssocket.available() >= 2)) {
						secretPacketBuffer2.offset = 0;
						Occluder.rssocket.read(secretPacketBuffer2.payload, 0, 2);
						secretPacketBuffer2.offset = 0;
						CacheableNode_Sub2.anInt500 = secretPacketBuffer2.readUnsignedShort();
						loginState = 12;
					}

					if ((loginState == 12) && (Occluder.rssocket.available() >= CacheableNode_Sub2.anInt500)) {
						secretPacketBuffer2.offset = 0;
						Occluder.rssocket.read(secretPacketBuffer2.payload, 0, CacheableNode_Sub2.anInt500);
						secretPacketBuffer2.offset = 0;
						final String string_2 = secretPacketBuffer2.readString();
						final String string_0 = secretPacketBuffer2.readString();
						final String string_1 = secretPacketBuffer2.readString();
						Class41.method261(string_2, string_0, string_1);
						WorldMapType2.setGameState(10);
					}

					if (loginState != 13) {
						++anInt653;
						if (anInt653 > 2000) {
							if (anInt645 < 1) {
								if (AClass4.myWorldPort == Class47.anInt103) {
									AClass4.myWorldPort = GameObject.anInt230;
								} else {
									AClass4.myWorldPort = Class47.anInt103;
								}

								++anInt645;
								loginState = 0;
							} else {
								Class28.method226(-3);
							}
						}
					} else {
						if (packetLength == -1) {
							if (Occluder.rssocket.available() < 2) {
								return;
							}

							Occluder.rssocket.read(secretPacketBuffer2.payload, 0, 2);
							secretPacketBuffer2.offset = 0;
							packetLength = secretPacketBuffer2.readUnsignedShort();
						}

						if (Occluder.rssocket.available() >= packetLength) {
							Occluder.rssocket.read(secretPacketBuffer2.payload, 0, packetLength);
							secretPacketBuffer2.offset = 0;
							int_0 = packetLength;
							secretPacketBuffer1.offset = 0;
							secretPacketBuffer2.offset = 0;
							packetType = -1;
							lastFrameId = -1;
							secondLastFrameId = -1;
							thridLastFrameId = -1;
							packetLength = 0;
							anInt687 = 0;
							anInt644 = 0;
							menuOptionCount = 0;
							anInt654 = -1;
							isMenuOpen = false;
							anInt701 = 0;
							destinationX = 0;

							for (int_1 = 0; int_1 < 2048; int_1++) {
								cachedPlayers[int_1] = null;
							}

							Script.localPlayer = null;

							for (int_1 = 0; int_1 < cachedNPCs.length; int_1++) {
								final NPC npc_0 = cachedNPCs[int_1];
								if (npc_0 != null) {
									npc_0.interacting = -1;
									npc_0.aBool62 = false;
								}
							}

							XItemContainer.itemContainers = new XHashTable(32);
							WorldMapType2.setGameState(30);

							for (int_1 = 0; int_1 < 100; int_1++) {
								aBoolArray8[int_1] = true;
							}

							Class11.method166();
							Class37.initializeGPI(secretPacketBuffer2);
							if (int_0 != secretPacketBuffer2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (final IOException ioexception_0) {
			if (anInt645 < 1) {
				if (AClass4.myWorldPort == Class47.anInt103) {
					AClass4.myWorldPort = GameObject.anInt230;
				} else {
					AClass4.myWorldPort = Class47.anInt103;
				}

				++anInt645;
				loginState = 0;
			} else {
				Class28.method226(-2);
			}
		}
	}

	final void method1044() {
		if (anInt644 > 1) {
			--anInt644;
		}

		if (anInt646 > 0) {
			--anInt646;
		}

		if (socketError) {
			socketError = false;
			if (anInt646 > 0) {
				Node_Sub6.method645();
			} else {
				WorldMapType2.setGameState(40);
				Class101.aRSSocket2 = Occluder.rssocket;
				Occluder.rssocket = null;
			}
		} else {
			if (!isMenuOpen) {
				menuOptionCount = 0;
				anInt654 = -1;
				isMenuOpen = false;
				menuOptions[0] = "Cancel";
				menuTargets[0] = "";
				menuTypes[0] = 1006;
				menuOptionCount = 1;
			}

			int int_0;
			for (int_0 = 0; (int_0 < 100) && processServerPacket(); int_0++) {
				;
			}

			if (gameState == 30) {
				while (AClass4_Sub2.method704()) {
					secretPacketBuffer1.putOpcode(161);
					secretPacketBuffer1.putByte(0);
					int_0 = secretPacketBuffer1.offset;
					Enum8.encodeClassVerifier(secretPacketBuffer1);
					secretPacketBuffer1.putLength(secretPacketBuffer1.offset - int_0);
				}

				int int_1;
				int int_2;
				int int_3;
				int int_4;
				int int_5;
				int int_6;
				int int_7;
				int int_8;
				synchronized (KeyFocusListener.aClass21_1.anObject1) {
					if (!aBool75) {
						KeyFocusListener.aClass21_1.anInt74 = 0;
					} else if ((MouseInput.anInt277 != 0) || (KeyFocusListener.aClass21_1.anInt74 >= 40)) {

						secretPacketBuffer1.putOpcode(206);
						secretPacketBuffer1.putByte(0);
						int_1 = secretPacketBuffer1.offset;
						int_2 = 0;

						for (int_3 = 0; (int_3 < KeyFocusListener.aClass21_1.anInt74)
								&& ((secretPacketBuffer1.offset - int_1) < 240); int_3++) {
							++int_2;
							int_4 = KeyFocusListener.aClass21_1.anIntArray10[int_3];
							if (int_4 < 0) {
								int_4 = 0;
							} else if (int_4 > 502) {
								int_4 = 502;
							}

							int_5 = KeyFocusListener.aClass21_1.anIntArray9[int_3];
							if (int_5 < 0) {
								int_5 = 0;
							} else if (int_5 > 764) {
								int_5 = 764;
							}

							int_6 = int_5 + (765 * int_4);
							if ((KeyFocusListener.aClass21_1.anIntArray10[int_3] == -1)
									&& (KeyFocusListener.aClass21_1.anIntArray9[int_3] == -1)) {
								int_5 = -1;
								int_4 = -1;
								int_6 = 524287;
							}

							if ((int_5 == anInt659) && (int_4 == anInt660)) {
								if (anInt661 < 2047) {
									++anInt661;
								}
							} else {
								int_7 = int_5 - anInt659;
								anInt659 = int_5;
								int_8 = int_4 - anInt660;
								anInt660 = int_4;
								if ((anInt661 < 8) && (int_7 >= -32) && (int_7 <= 31) && (int_8 >= -32)
										&& (int_8 <= 31)) {
									int_7 += 32;
									int_8 += 32;
									secretPacketBuffer1.putShort(int_8 + (anInt661 << 12) + (int_7 << 6));
									anInt661 = 0;
								} else if (anInt661 < 8) {
									secretPacketBuffer1.put24bitInt((anInt661 << 19) + 8388608 + int_6);
									anInt661 = 0;
								} else {
									secretPacketBuffer1.putInt(int_6 + (anInt661 << 19) + -1073741824);
									anInt661 = 0;
								}
							}
						}

						secretPacketBuffer1.putLength(secretPacketBuffer1.offset - int_1);
						if (int_2 >= KeyFocusListener.aClass21_1.anInt74) {
							KeyFocusListener.aClass21_1.anInt74 = 0;
						} else {
							KeyFocusListener.aClass21_1.anInt74 -= int_2;

							for (int_3 = 0; int_3 < KeyFocusListener.aClass21_1.anInt74; int_3++) {
								KeyFocusListener.aClass21_1.anIntArray9[int_3] = KeyFocusListener.aClass21_1.anIntArray9[int_2
										+ int_3];
								KeyFocusListener.aClass21_1.anIntArray10[int_3] = KeyFocusListener.aClass21_1.anIntArray10[int_2
										+ int_3];
							}
						}
					}
				}

				if ((MouseInput.anInt277 == 1) || (!Class14.aBool5 && (MouseInput.anInt277 == 4))
						|| (MouseInput.anInt277 == 2)) {
					long long_0 = (MouseInput.aLong19 - aLong25) / 50L;
					if (long_0 > 4095L) {
						long_0 = 4095L;
					}

					aLong25 = MouseInput.aLong19;
					int_2 = MouseInput.anInt283;
					if (int_2 < 0) {
						int_2 = 0;
					} else if (int_2 > FloorUnderlayDefinition.canvasHeight) {
						int_2 = FloorUnderlayDefinition.canvasHeight;
					}

					int_3 = MouseInput.anInt282;
					if (int_3 < 0) {
						int_3 = 0;
					} else if (int_3 > Class25.canvasWidth) {
						int_3 = Class25.canvasWidth;
					}

					int_4 = (int) long_0;
					secretPacketBuffer1.putOpcode(11);
					secretPacketBuffer1.putShort((int_4 << 1) + (MouseInput.anInt277 == 2 ? 1 : 0));
					secretPacketBuffer1.putShort(int_3);
					secretPacketBuffer1.putShort(int_2);
				}

				if (KeyFocusListener.anInt128 > 0) {
					secretPacketBuffer1.putOpcode(184);
					secretPacketBuffer1.putShort(0);
					int_0 = secretPacketBuffer1.offset;
					final long long_1 = Class6.currentTimeMs();

					for (int_3 = 0; int_3 < KeyFocusListener.anInt128; int_3++) {
						long long_2 = long_1 - aLong28;
						if (long_2 > 16777215L) {
							long_2 = 16777215L;
						}

						aLong28 = long_1;
						secretPacketBuffer1.putByte(KeyFocusListener.anIntArray32[int_3]);
						secretPacketBuffer1.put24bitInt((int) long_2);
					}

					secretPacketBuffer1.putShortLength(secretPacketBuffer1.offset - int_0);
				}

				if (anInt703 > 0) {
					--anInt703;
				}

				if (KeyFocusListener.aBoolArray3[96] || KeyFocusListener.aBoolArray3[97]
						|| KeyFocusListener.aBoolArray3[98] || KeyFocusListener.aBoolArray3[99]) {
					aBool86 = true;
				}

				if (aBool86 && (anInt703 <= 0)) {
					anInt703 = 20;
					aBool86 = false;
					secretPacketBuffer1.putOpcode(193);
					secretPacketBuffer1.putShortOb2(mapAngle);
					secretPacketBuffer1.putShortOb2(anInt712);
				}

				if (Class36.aBool9 && !aBool82) {
					aBool82 = true;
					secretPacketBuffer1.putOpcode(138);
					secretPacketBuffer1.putByte(1);
				}

				if (!Class36.aBool9 && aBool82) {
					aBool82 = false;
					secretPacketBuffer1.putOpcode(138);
					secretPacketBuffer1.putByte(0);
				}

				Class46.method273();
				if (gameState == 30) {
					Class41.method263();

					for (int_0 = 0; int_0 < anInt700; int_0++) {
						--anIntArray151[int_0];
						if (anIntArray151[int_0] >= -10) {
							SoundEffect soundeffect_0 = audioEffects[int_0];
							if (soundeffect_0 == null) {
								soundeffect_0 = SoundEffect.getTrack(WorldMapType2.anIndexData4, anIntArray148[int_0],
										0);
								if (soundeffect_0 == null) {
									continue;
								}

								anIntArray151[int_0] += soundeffect_0.calculateDelay();
								audioEffects[int_0] = soundeffect_0;
							}

							if (anIntArray151[int_0] < 0) {
								if (anIntArray153[int_0] != 0) {
									int_3 = (anIntArray153[int_0] & 0xFF) * 128;
									int_4 = (anIntArray153[int_0] >> 16) & 0xFF;
									int_5 = ((int_4 * 128) + 64) - Script.localPlayer.anInt547;
									if (int_5 < 0) {
										int_5 = -int_5;
									}

									int_6 = (anIntArray153[int_0] >> 8) & 0xFF;
									int_7 = ((int_6 * 128) + 64) - Script.localPlayer.anInt550;
									if (int_7 < 0) {
										int_7 = -int_7;
									}

									int_8 = (int_7 + int_5) - 128;
									if (int_8 > int_3) {
										anIntArray151[int_0] = -100;
										continue;
									}

									if (int_8 < 0) {
										int_8 = 0;
									}

									int_2 = ((int_3 - int_8) * anInt684) / int_3;
								} else {
									int_2 = anInt698;
								}

								if (int_2 > 0) {
									final AClass7_Sub1 aclass7_sub1_0 = soundeffect_0.method402()
											.method709(Overlay.aClass53_1);
									final AClass5_Sub2 aclass5_sub2_0 = AClass5_Sub2.method749(aclass7_sub1_0, 100,
											int_2);
									aclass5_sub2_0.method727(anIntArray150[int_0] - 1);
									Class76.anAClass5_Sub1_1.method699(aclass5_sub2_0);
								}

								anIntArray151[int_0] = -100;
							}
						} else {
							--anInt700;

							for (int_1 = int_0; int_1 < anInt700; int_1++) {
								anIntArray148[int_1] = anIntArray148[int_1 + 1];
								audioEffects[int_1] = audioEffects[int_1 + 1];
								anIntArray150[int_1] = anIntArray150[int_1 + 1];
								anIntArray151[int_1] = anIntArray151[int_1 + 1];
								anIntArray153[int_1] = anIntArray153[int_1 + 1];
							}

							--int_0;
						}
					}

					if (aBool80) {
						boolean bool_0;
						if (Class76.anInt186 != 0) {
							bool_0 = true;
						} else {
							bool_0 = Class76.anAClass5_Sub3_1.method780();
						}

						if (!bool_0) {
							if ((anInt713 != 0) && (anInt666 != -1)) {
								Friend.method503(Class68.indexTrack1, anInt666, 0, anInt713, false);
							}

							aBool80 = false;
						}
					}

					++anInt687;
					if (anInt687 > 750) {
						if (anInt646 > 0) {
							Node_Sub6.method645();
						} else {
							WorldMapType2.setGameState(40);
							Class101.aRSSocket2 = Occluder.rssocket;
							Occluder.rssocket = null;
						}
					} else {
						int_0 = Class40.anInt94;
						final int[] ints_0 = Class40.anIntArray17;

						for (int_2 = 0; int_2 < int_0; int_2++) {
							final Player player_0 = cachedPlayers[ints_0[int_2]];
							if (player_0 != null) {
								WorldMapType1.method550(player_0);
							}
						}

						for (int_0 = 0; int_0 < anInt690; int_0++) {
							int_1 = npcIndices[int_0];
							final NPC npc_0 = cachedNPCs[int_1];
							if (npc_0 != null) {
								WorldMapType1.method550(npc_0);
							}
						}

						Class49.method280();
						++anInt662;
						if (cursorState != 0) {
							anInt688 += 20;
							if (anInt688 >= 400) {
								cursorState = 0;
							}
						}

						if (Class1.aWidget1 != null) {
							++anInt676;
							if (anInt676 >= 15) {
								Class15.method196(Class1.aWidget1);
								Class1.aWidget1 = null;
							}
						}

						final Widget widget_0 = XGrandExchangeOffer.aWidget3;
						final Widget widget_1 = Class1.aWidget2;
						XGrandExchangeOffer.aWidget3 = null;
						Class1.aWidget2 = null;
						aWidget13 = null;
						aBool76 = false;
						aBool78 = false;
						anInt744 = 0;

						while (Class54.method329() && (anInt744 < 128)) {
							if ((rights >= 2) && KeyFocusListener.aBoolArray3[82]
									&& (KeyFocusListener.anInt130 == 66)) {
								String string_0 = "";

								MessageNode messagenode_0;
								for (final Iterator iterator_0 = Class42.aClass70_1.iterator(); iterator_0
										.hasNext(); string_0 = string_0 + messagenode_0.name + '\u003a'
												+ messagenode_0.value + '\n') {
									messagenode_0 = (MessageNode) iterator_0.next();
								}

								AClass1.clientInstance.method1026(string_0);
							} else {
								anIntArray164[anInt744] = KeyFocusListener.anInt130;
								anIntArray165[anInt744] = Class76.aChar1;
								++anInt744;
							}
						}

						if (widgetRoot != -1) {
							AClass1_Sub1.method585(widgetRoot, 0, 0, Class25.canvasWidth,
									FloorUnderlayDefinition.canvasHeight, 0, 0);
						}

						++anInt692;

						while (true) {
							Widget widget_2;
							Widget widget_3;
							ScriptEvent scriptevent_0;
							do {
								scriptevent_0 = (ScriptEvent) aDeque8.popFront();
								if (scriptevent_0 == null) {
									while (true) {
										do {
											scriptevent_0 = (ScriptEvent) aDeque9.popFront();
											if (scriptevent_0 == null) {
												while (true) {
													do {
														scriptevent_0 = (ScriptEvent) aDeque7.popFront();
														if (scriptevent_0 == null) {
															method1046();
															Class37.method252();
															if (aWidget9 != null) {
																method1047();
															}

															if (Ignore.aWidget7 != null) {
																Class15.method196(Ignore.aWidget7);
																++anInt663;
																if (MouseInput.anInt281 == 0) {
																	if (aBool83) {
																		if ((Class23.aWidget4 == Ignore.aWidget7)
																				&& (anInt678 != anInt749)) {
																			final Widget widget_4 = Ignore.aWidget7;
																			byte byte_0 = 0;
																			if ((anInt733 == 1)
																					&& (widget_4.contentType == 206)) {
																				byte_0 = 1;
																			}

																			if (widget_4.itemIds[anInt749] <= 0) {
																				byte_0 = 0;
																			}

																			int_5 = Class6.getWidgetConfig(widget_4);
																			final boolean bool_2 = ((int_5 >> 29)
																					& 0x1) != 0;
																			if (bool_2) {
																				int_6 = anInt678;
																				int_7 = anInt749;
																				widget_4.itemIds[int_7] = widget_4.itemIds[int_6];
																				widget_4.itemQuantities[int_7] = widget_4.itemQuantities[int_6];
																				widget_4.itemIds[int_6] = -1;
																				widget_4.itemQuantities[int_6] = 0;
																			} else if (byte_0 == 1) {
																				int_6 = anInt678;
																				int_7 = anInt749;

																				while (int_6 != int_7) {
																					if (int_6 > int_7) {
																						widget_4.method567(int_6 - 1,
																								int_6);
																						--int_6;
																					} else if (int_6 < int_7) {
																						widget_4.method567(int_6 + 1,
																								int_6);
																						++int_6;
																					}
																				}
																			} else {
																				widget_4.method567(anInt749, anInt678);
																			}

																			secretPacketBuffer1.putOpcode(116);
																			secretPacketBuffer1.method675(byte_0);
																			secretPacketBuffer1
																					.putLEInt(Ignore.aWidget7.anInt289);
																			secretPacketBuffer1.putShort(anInt749);
																			secretPacketBuffer1.putLEShortA(anInt678);
																		}
																	} else {
																		label898: {
																			int_2 = Class56.method347();
																			if (menuOptionCount > 2) {
																				label883: {
																					label861: {
																						boolean bool_1;
																						if (anInt655 == 1) {
																							if (menuOptionCount <= 0) {
																								bool_1 = false;
																							} else if (aBool77
																									&& KeyFocusListener.aBoolArray3[81]
																									&& (anInt654 != -1)) {
																								bool_1 = true;
																							} else {
																								bool_1 = false;
																							}

																							if (!bool_1) {
																								break label861;
																							}
																						}

																						if (int_2 < 0) {
																							bool_1 = false;
																						} else {
																							int_4 = menuTypes[int_2];
																							if (int_4 >= 2000) {
																								int_4 -= 2000;
																							}

																							if (int_4 == 1007) {
																								bool_1 = true;
																							} else {
																								bool_1 = false;
																							}
																						}

																						if (!bool_1) {
																							break label883;
																						}
																					}

																					method1041(anInt673, anInt675);
																					break label898;
																				}
																			}

																			if (menuOptionCount > 0) {
																				int_3 = anInt673;
																				int_4 = anInt675;
																				Class14.method190(Class42.aClass30_1,
																						int_3, int_4);
																				Class42.aClass30_1 = null;
																			}
																		}
																	}

																	anInt676 = 10;
																	MouseInput.anInt277 = 0;
																	Ignore.aWidget7 = null;
																} else if ((anInt663 >= 5)
																		&& ((MouseInput.anInt278 > (anInt673 + 5))
																				|| (MouseInput.anInt278 < (anInt673
																						- 5))
																				|| (MouseInput.anInt280 > (anInt675
																						+ 5))
																				|| (MouseInput.anInt280 < (anInt675
																						- 5)))) {
																	aBool83 = true;
																}
															}

															if (Region.method374()) {
																int_2 = Region.selectedRegionTileX;
																int_3 = Region.selectedRegionTileY;
																secretPacketBuffer1.putOpcode(4);
																secretPacketBuffer1.putByte(5);
																secretPacketBuffer1
																		.putShortLE(KeyFocusListener.aBoolArray3[82]
																				? (KeyFocusListener.aBoolArray3[81] ? 2
																						: 1)
																				: 0);
																secretPacketBuffer1.putLEShortA(int_2 + AClass2.baseX);
																secretPacketBuffer1
																		.putShortOb2(int_3 + AClass4_Sub1.baseY);
																Region.method379();
																anInt685 = MouseInput.anInt282;
																anInt686 = MouseInput.anInt283;
																cursorState = 1;
																anInt688 = 0;
																destinationX = int_2;
																destinationY = int_3;
															}

															if (widget_0 != XGrandExchangeOffer.aWidget3) {
																if (widget_0 != null) {
																	Class15.method196(widget_0);
																}

																if (XGrandExchangeOffer.aWidget3 != null) {
																	Class15.method196(XGrandExchangeOffer.aWidget3);
																}
															}

															if ((widget_1 != Class1.aWidget2)
																	&& (anInt706 == anInt707)) {
																if (widget_1 != null) {
																	Class15.method196(widget_1);
																}

																if (Class1.aWidget2 != null) {
																	Class15.method196(Class1.aWidget2);
																}
															}

															if (Class1.aWidget2 != null) {
																if (anInt707 < anInt706) {
																	++anInt707;
																	if (anInt706 == anInt707) {
																		Class15.method196(Class1.aWidget2);
																	}
																}
															} else if (anInt707 > 0) {
																--anInt707;
															}

															Class19.method206();
															if (aBool85) {
																int_2 = (ScriptState.anInt240 * 128) + 64;
																int_3 = (XItemContainer.anInt421 * 128) + 64;
																int_4 = Actor.getTileHeight(int_2, int_3,
																		AClass1_Sub1.plane) - PendingSpawn.anInt362;
																if (Class13.cameraX < int_2) {
																	Class13.cameraX += DecorativeObject.anInt189
																			+ ((Class2.anInt16
																					* (int_2 - Class13.cameraX))
																					/ 1000);
																	if (Class13.cameraX > int_2) {
																		Class13.cameraX = int_2;
																	}
																}

																if (Class13.cameraX > int_2) {
																	Class13.cameraX -= ((Class2.anInt16
																			* (Class13.cameraX - int_2)) / 1000)
																			+ DecorativeObject.anInt189;
																	if (Class13.cameraX < int_2) {
																		Class13.cameraX = int_2;
																	}
																}

																if (XItemContainer.cameraZ < int_4) {
																	XItemContainer.cameraZ += (((int_4
																			- XItemContainer.cameraZ) * Class2.anInt16)
																			/ 1000) + DecorativeObject.anInt189;
																	if (XItemContainer.cameraZ > int_4) {
																		XItemContainer.cameraZ = int_4;
																	}
																}

																if (XItemContainer.cameraZ > int_4) {
																	XItemContainer.cameraZ -= (((XItemContainer.cameraZ
																			- int_4) * Class2.anInt16) / 1000)
																			+ DecorativeObject.anInt189;
																	if (XItemContainer.cameraZ < int_4) {
																		XItemContainer.cameraZ = int_4;
																	}
																}

																if (Class46.cameraY < int_3) {
																	Class46.cameraY += (((int_3 - Class46.cameraY)
																			* Class2.anInt16) / 1000)
																			+ DecorativeObject.anInt189;
																	if (Class46.cameraY > int_3) {
																		Class46.cameraY = int_3;
																	}
																}

																if (Class46.cameraY > int_3) {
																	Class46.cameraY -= ((Class2.anInt16
																			* (Class46.cameraY - int_3)) / 1000)
																			+ DecorativeObject.anInt189;
																	if (Class46.cameraY < int_3) {
																		Class46.cameraY = int_3;
																	}
																}

																int_2 = (Class67.anInt171 * 128) + 64;
																int_3 = (GraphicsObject.anInt572 * 128) + 64;
																int_4 = Actor.getTileHeight(int_2, int_3,
																		AClass1_Sub1.plane) - BaseVarType.anInt349;
																int_5 = int_2 - Class13.cameraX;
																int_6 = int_4 - XItemContainer.cameraZ;
																int_7 = int_3 - Class46.cameraY;
																int_8 = (int) Math
																		.sqrt((int_5 * int_5) + (int_7 * int_7));
																int int_10 = (int) (Math.atan2(int_6, int_8) * 325.949D)
																		& 0x7FF;
																final int int_11 = (int) (Math.atan2(int_5, int_7)
																		* -325.949D) & 0x7FF;
																if (int_10 < 128) {
																	int_10 = 128;
																}

																if (int_10 > 383) {
																	int_10 = 383;
																}

																if (AClass4_Sub2.cameraPitch < int_10) {
																	AClass4_Sub2.cameraPitch += (((int_10
																			- AClass4_Sub2.cameraPitch)
																			* Class7.anInt26) / 1000) + Timer.anInt285;
																	if (AClass4_Sub2.cameraPitch > int_10) {
																		AClass4_Sub2.cameraPitch = int_10;
																	}
																}

																if (AClass4_Sub2.cameraPitch > int_10) {
																	AClass4_Sub2.cameraPitch -= ((Class7.anInt26
																			* (AClass4_Sub2.cameraPitch - int_10))
																			/ 1000) + Timer.anInt285;
																	if (AClass4_Sub2.cameraPitch < int_10) {
																		AClass4_Sub2.cameraPitch = int_10;
																	}
																}

																int int_12 = int_11 - Friend.cameraYaw;
																if (int_12 > 1024) {
																	int_12 -= 2048;
																}

																if (int_12 < -1024) {
																	int_12 += 2048;
																}

																if (int_12 > 0) {
																	Friend.cameraYaw += Timer.anInt285
																			+ ((int_12 * Class7.anInt26) / 1000);
																	Friend.cameraYaw &= 0x7FF;
																}

																if (int_12 < 0) {
																	Friend.cameraYaw -= ((-int_12 * Class7.anInt26)
																			/ 1000) + Timer.anInt285;
																	Friend.cameraYaw &= 0x7FF;
																}

																int int_13 = int_11 - Friend.cameraYaw;
																if (int_13 > 1024) {
																	int_13 -= 2048;
																}

																if (int_13 < -1024) {
																	int_13 += 2048;
																}

																if (((int_13 < 0) && (int_12 > 0))
																		|| ((int_13 > 0) && (int_12 < 0))) {
																	Friend.cameraYaw = int_11;
																}
															}

															for (int_2 = 0; int_2 < 5; int_2++) {
																++anIntArray147[int_2];
															}

															Class6.chatMessages.process();
															int_2 = AClass4_Sub2.method706();
															int_3 = KeyFocusListener.keyboardIdleTicks;
															if ((int_2 > 15000) && (int_3 > 15000)) {
																anInt646 = 250;
																MouseInput.mouseIdleTicks = 14500;
																secretPacketBuffer1.putOpcode(194);
															}

															++anInt726;
															if (anInt726 > 500) {
																anInt726 = 0;
																int_5 = (int) (Math.random() * 8.0D);
																if ((int_5 & 0x1) == 1) {
																	anInt714 += anInt716;
																}

																if ((int_5 & 0x2) == 2) {
																	anInt720 += anInt721;
																}

																if ((int_5 & 0x4) == 4) {
																	anInt723 += anInt725;
																}
															}

															if (anInt714 < -50) {
																anInt716 = 2;
															}

															if (anInt714 > 50) {
																anInt716 = -2;
															}

															if (anInt720 < -55) {
																anInt721 = 2;
															}

															if (anInt720 > 55) {
																anInt721 = -2;
															}

															if (anInt723 < -40) {
																anInt725 = 1;
															}

															if (anInt723 > 40) {
																anInt725 = -1;
															}

															++anInt730;
															if (anInt730 > 500) {
																anInt730 = 0;
																int_5 = (int) (Math.random() * 8.0D);
																if ((int_5 & 0x1) == 1) {
																	mapScale += mapOffset;
																}

																if ((int_5 & 0x2) == 2) {
																	mapScaleDelta += anInt728;
																}
															}

															if (mapScale < -60) {
																mapOffset = 2;
															}

															if (mapScale > 60) {
																mapOffset = -2;
															}

															if (mapScaleDelta < -20) {
																anInt728 = 1;
															}

															if (mapScaleDelta > 10) {
																anInt728 = -1;
															}

															for (Class73_Sub1 class73_sub1_0 = (Class73_Sub1) aClass71_1
																	.method424(); class73_sub1_0 != null; class73_sub1_0 = (Class73_Sub1) aClass71_1
																			.method426()) {
																if (class73_sub1_0.anInt335 < ((Class6.currentTimeMs()
																		/ 1000L) - 5L)) {
																	if (class73_sub1_0.aShort1 > 0) {
																		WidgetNode.sendGameMessage(5, "",
																				class73_sub1_0.aString18
																						+ " has logged in.");
																	}

																	if (class73_sub1_0.aShort1 == 0) {
																		WidgetNode.sendGameMessage(5, "",
																				class73_sub1_0.aString18
																						+ " has logged out.");
																	}

																	class73_sub1_0.method443();
																}
															}

															++audioEffectCount;
															if (audioEffectCount > 50) {
																secretPacketBuffer1.putOpcode(102);
															}

															try {
																if ((Occluder.rssocket != null)
																		&& (secretPacketBuffer1.offset > 0)) {
																	Occluder.rssocket.queueForWrite(
																			secretPacketBuffer1.payload, 0,
																			secretPacketBuffer1.offset);
																	secretPacketBuffer1.offset = 0;
																	audioEffectCount = 0;
																}

																return;
															} catch (final IOException ioexception_0) {
																if (anInt646 > 0) {
																	Node_Sub6.method645();
																	return;
																}

																WorldMapType2.setGameState(40);
																Class101.aRSSocket2 = Occluder.rssocket;
																Occluder.rssocket = null;
																return;
															}
														}

														widget_2 = scriptevent_0.widget;
														if (widget_2.index < 0) {
															break;
														}

														widget_3 = Class18.method202(widget_2.parentId);
													} while ((widget_3 == null) || (widget_3.children == null)
															|| (widget_2.index >= widget_3.children.length)
															|| (widget_2 != widget_3.children[widget_2.index]));

													Class30.method229(scriptevent_0);
												}
											}

											widget_2 = scriptevent_0.widget;
											if (widget_2.index < 0) {
												break;
											}

											widget_3 = Class18.method202(widget_2.parentId);
										} while ((widget_3 == null) || (widget_3.children == null)
												|| (widget_2.index >= widget_3.children.length)
												|| (widget_2 != widget_3.children[widget_2.index]));

										Class30.method229(scriptevent_0);
									}
								}

								widget_2 = scriptevent_0.widget;
								if (widget_2.index < 0) {
									break;
								}

								widget_3 = Class18.method202(widget_2.parentId);
							} while ((widget_3 == null) || (widget_3.children == null)
									|| (widget_2.index >= widget_3.children.length)
									|| (widget_2 != widget_3.children[widget_2.index]));

							Class30.method229(scriptevent_0);
						}
					}
				}
			}
		}
	}

	void method1045(final Widget widget_0) {
		final Widget widget_1 = widget_0.parentId == -1 ? null : Class18.method202(widget_0.parentId);
		int int_0;
		int int_1;
		if (widget_1 == null) {
			int_0 = Class25.canvasWidth;
			int_1 = FloorUnderlayDefinition.canvasHeight;
		} else {
			int_0 = widget_1.width;
			int_1 = widget_1.height;
		}

		Class67.method399(widget_0, int_0, int_1, false);
		Class59.method381(widget_0, int_0, int_1);
	}

	final void method1046() {
		World.method525();
		if (Ignore.aWidget7 == null) {
			if (aWidget9 == null) {
				int int_0 = MouseInput.anInt277;
				int int_1;
				int int_2;
				int int_3;
				int int_4;
				int int_5;
				int int_6;
				int int_7;
				int int_8;
				if (isMenuOpen) {
					if ((int_0 != 1) && (Class14.aBool5 || (int_0 != 4))) {
						int_1 = MouseInput.anInt278;
						int_2 = MouseInput.anInt280;
						if ((int_1 < (Class18.menuX - 10)) || (int_1 > (AClass4_Sub1.menuWidth + Class18.menuX + 10))
								|| (int_2 < (AClass4_Sub1.menuY - 10))
								|| (int_2 > (Class28.menuHeight + AClass4_Sub1.menuY + 10))) {
							isMenuOpen = false;
							Class3.method85(Class18.menuX, AClass4_Sub1.menuY, AClass4_Sub1.menuWidth,
									Class28.menuHeight);
						}
					}

					if ((int_0 == 1) || (!Class14.aBool5 && (int_0 == 4))) {
						int_1 = Class18.menuX;
						int_2 = AClass4_Sub1.menuY;
						int_3 = AClass4_Sub1.menuWidth;
						int_4 = MouseInput.anInt282;
						int_5 = MouseInput.anInt283;
						int int_10 = -1;

						for (int_6 = 0; int_6 < menuOptionCount; int_6++) {
							int_7 = int_2 + 31 + ((menuOptionCount - 1 - int_6) * 15);
							if ((int_4 > int_1) && (int_4 < (int_3 + int_1)) && (int_5 > (int_7 - 13))
									&& (int_5 < (int_7 + 3))) {
								int_10 = int_6;
							}
						}

						if ((int_10 != -1) && (int_10 >= 0)) {
							int_6 = menuActionParams0[int_10];
							int_7 = menuActionParams1[int_10];
							final int int_11 = menuTypes[int_10];
							int_8 = menuIdentifiers[int_10];
							final String string_0 = menuOptions[int_10];
							final String string_1 = menuTargets[int_10];
							Class11.menuAction(int_6, int_7, int_11, int_8, string_0, string_1, MouseInput.anInt282,
									MouseInput.anInt283);
						}

						isMenuOpen = false;
						Class3.method85(Class18.menuX, AClass4_Sub1.menuY, AClass4_Sub1.menuWidth, Class28.menuHeight);
						return;
					}
				} else {
					int_1 = Class56.method347();
					if (((int_0 == 1) || (!Class14.aBool5 && (int_0 == 4))) && (int_1 >= 0)) {
						int_2 = menuTypes[int_1];
						if ((int_2 == 39) || (int_2 == 40) || (int_2 == 41) || (int_2 == 42) || (int_2 == 43)
								|| (int_2 == 33) || (int_2 == 34) || (int_2 == 35) || (int_2 == 36) || (int_2 == 37)
								|| (int_2 == 38) || (int_2 == 1005)) {
							int_3 = menuActionParams0[int_1];
							int_4 = menuActionParams1[int_1];
							final Widget widget_0 = Class18.method202(int_4);
							int_6 = Class6.getWidgetConfig(widget_0);
							final boolean bool_0 = ((int_6 >> 28) & 0x1) != 0;
							if (bool_0 || MilliTimer.method688(Class6.getWidgetConfig(widget_0))) {
								if ((Ignore.aWidget7 != null) && !aBool83) {
									int_7 = Class56.method347();
									if (anInt655 != 1) {
										boolean bool_1;
										if (int_7 < 0) {
											bool_1 = false;
										} else {
											int_8 = menuTypes[int_7];
											if (int_8 >= 2000) {
												int_8 -= 2000;
											}

											if (int_8 == 1007) {
												bool_1 = true;
											} else {
												bool_1 = false;
											}
										}

										if (!bool_1 && (menuOptionCount > 0)) {
											int_8 = anInt673;
											final int int_9 = anInt675;
											Class14.method190(Class42.aClass30_1, int_8, int_9);
											Class42.aClass30_1 = null;
										}
									}
								}

								aBool83 = false;
								anInt663 = 0;
								if (Ignore.aWidget7 != null) {
									Class15.method196(Ignore.aWidget7);
								}

								Ignore.aWidget7 = Class18.method202(int_4);
								anInt678 = int_3;
								anInt673 = MouseInput.anInt282;
								anInt675 = MouseInput.anInt283;
								if (int_1 >= 0) {
									Class42.aClass30_1 = new Class30();
									Class42.aClass30_1.anInt87 = menuActionParams0[int_1];
									Class42.aClass30_1.anInt88 = menuActionParams1[int_1];
									Class42.aClass30_1.anInt89 = menuTypes[int_1];
									Class42.aClass30_1.anInt90 = menuIdentifiers[int_1];
									Class42.aClass30_1.aString5 = menuOptions[int_1];
								}

								Class15.method196(Ignore.aWidget7);
								return;
							}
						}
					}

					if ((int_0 == 1) || (!Class14.aBool5 && (int_0 == 4))) {
						label255: {
							label240: {
								boolean bool_2;
								if ((anInt655 == 1) && (menuOptionCount > 2)) {
									if (menuOptionCount <= 0) {
										bool_2 = false;
									} else if (aBool77 && KeyFocusListener.aBoolArray3[81] && (anInt654 != -1)) {
										bool_2 = true;
									} else {
										bool_2 = false;
									}

									if (!bool_2) {
										break label240;
									}
								}

								if (int_1 < 0) {
									bool_2 = false;
								} else {
									int_3 = menuTypes[int_1];
									if (int_3 >= 2000) {
										int_3 -= 2000;
									}

									if (int_3 == 1007) {
										bool_2 = true;
									} else {
										bool_2 = false;
									}
								}

								if (!bool_2) {
									break label255;
								}
							}

							int_0 = 2;
						}
					}

					if (((int_0 == 1) || (!Class14.aBool5 && (int_0 == 4))) && (menuOptionCount > 0) && (int_1 >= 0)) {
						int_2 = menuActionParams0[int_1];
						int_3 = menuActionParams1[int_1];
						int_4 = menuTypes[int_1];
						int_5 = menuIdentifiers[int_1];
						final String string_2 = menuOptions[int_1];
						final String string_3 = menuTargets[int_1];
						Class11.menuAction(int_2, int_3, int_4, int_5, string_2, string_3, MouseInput.anInt282,
								MouseInput.anInt283);
					}

					if ((int_0 == 2) && (menuOptionCount > 0)) {
						method1041(MouseInput.anInt282, MouseInput.anInt283);
						return;
					}
				}

			}
		}
	}

	final void method1047() {
		Class15.method196(aWidget9);
		++Class14.anInt54;
		if (aBool76 && aBool78) {
			int int_0 = MouseInput.anInt278;
			int int_1 = MouseInput.anInt280;
			int_0 -= anInt656;
			int_1 -= anInt657;
			if (int_0 < anInt658) {
				int_0 = anInt658;
			}

			if ((int_0 + aWidget9.width) > (anInt658 + aWidget10.width)) {
				int_0 = (anInt658 + aWidget10.width) - aWidget9.width;
			}

			if (int_1 < anInt665) {
				int_1 = anInt665;
			}

			if ((int_1 + aWidget9.height) > (anInt665 + aWidget10.height)) {
				int_1 = (anInt665 + aWidget10.height) - aWidget9.height;
			}

			final int int_2 = int_0 - anInt682;
			final int int_3 = int_1 - anInt683;
			final int int_4 = aWidget9.anInt304;
			if ((Class14.anInt54 > aWidget9.anInt306)
					&& ((int_2 > int_4) || (int_2 < -int_4) || (int_3 > int_4) || (int_3 < -int_4))) {
				aBool84 = true;
			}

			final int int_5 = (int_0 - anInt658) + aWidget10.scrollX;
			final int int_6 = (int_1 - anInt665) + aWidget10.scrollY;
			ScriptEvent scriptevent_0;
			if ((aWidget9.anObjectArray3 != null) && aBool84) {
				scriptevent_0 = new ScriptEvent();
				scriptevent_0.widget = aWidget9;
				scriptevent_0.anInt415 = int_5;
				scriptevent_0.anInt416 = int_6;
				scriptevent_0.anObjectArray22 = aWidget9.anObjectArray3;
				Class30.method229(scriptevent_0);
			}

			if (MouseInput.anInt281 == 0) {
				if (aBool84) {
					if (aWidget9.anObjectArray4 != null) {
						scriptevent_0 = new ScriptEvent();
						scriptevent_0.widget = aWidget9;
						scriptevent_0.anInt415 = int_5;
						scriptevent_0.anInt416 = int_6;
						scriptevent_0.aWidget8 = aWidget13;
						scriptevent_0.anObjectArray22 = aWidget9.anObjectArray4;
						Class30.method229(scriptevent_0);
					}

					if ((aWidget13 != null) && (Class25.method219(aWidget9) != null)) {
						secretPacketBuffer1.putOpcode(239);
						secretPacketBuffer1.method668(aWidget13.anInt289);
						secretPacketBuffer1.method670(aWidget9.index);
						secretPacketBuffer1.method670(aWidget9.itemId);
						secretPacketBuffer1.putLEInt(aWidget9.anInt289);
						secretPacketBuffer1.putShort(aWidget13.index);
						secretPacketBuffer1.putShortOb2(aWidget13.itemId);
					}
				} else {
					label105: {
						final int int_7 = Class56.method347();
						int int_8;
						if (menuOptionCount > 2) {
							label109: {
								if ((anInt655 != 1) || Coordinates.method492()) {
									boolean bool_0;
									if (int_7 < 0) {
										bool_0 = false;
									} else {
										int_8 = menuTypes[int_7];
										if (int_8 >= 2000) {
											int_8 -= 2000;
										}

										if (int_8 == 1007) {
											bool_0 = true;
										} else {
											bool_0 = false;
										}
									}

									if (!bool_0) {
										break label109;
									}
								}

								method1041(anInt656 + anInt682, anInt683 + anInt657);
								break label105;
							}
						}

						if (menuOptionCount > 0) {
							final int int_9 = anInt656 + anInt682;
							int_8 = anInt657 + anInt683;
							Class14.method190(Class42.aClass30_1, int_9, int_8);
							Class42.aClass30_1 = null;
						}
					}
				}

				aWidget9 = null;
			}
		} else {
			if (Class14.anInt54 > 1) {
				aWidget9 = null;
			}

		}
	}

	@Override
	public final void init() {
		if (isValidHost()) {
			final Parameters[] parameterss_0 = new Parameters[] { Parameters.aParameters2, Parameters.aParameters3,
					Parameters.aParameters1, Parameters.aParameters4, Parameters.aParameters5, Parameters.aParameters6,
					Parameters.aParameters8, Parameters.aParameters9, Parameters.aParameters10,
					Parameters.aParameters11, Parameters.aParameters12, Parameters.aParameters13,
					Parameters.aParameters14, Parameters.aParameters7, Parameters.aParameters15 };
			final Parameters[] parameterss_1 = parameterss_0;

			int int_0;
			String string_0;
			int int_4;
			int int_6;
			for (int_0 = 0; int_0 < parameterss_1.length; int_0++) {
				final Parameters parameters_0 = parameterss_1[int_0];
				string_0 = getParameter(parameters_0.key);
				if (string_0 != null) {
					switch (Integer.parseInt(parameters_0.key)) {
					case 2:
						Class12.anInt38 = Integer.parseInt(string_0);
						break;
					case 3:
						MouseInput.aString14 = string_0;
					case 4:
					case 14:
					default:
						break;
					case 5:
						if (string_0.equalsIgnoreCase("true")) {
							isMembers = true;
						} else {
							isMembers = false;
						}
						break;
					case 6:
						AClass4_Sub2.sessionToken = string_0;
						break;
					case 7:
						final Enum6[] enum6s_0 = new Enum6[] { Enum6.anEnum6_7, Enum6.anEnum6_2, Enum6.anEnum6_6,
								Enum6.anEnum6_4, Enum6.anEnum6_5, Enum6.anEnum6_3 };
						Varcs.anEnum6_1 = (Enum6) PendingSpawn.forOrdinal(enum6s_0, Integer.parseInt(string_0));
						if (Enum6.anEnum6_7 == Varcs.anEnum6_1) {
							Class59.aClass110_1 = Class110.aClass110_2;
						} else {
							Class59.aClass110_1 = Class110.aClass110_10;
						}
						break;
					case 8:
						int_6 = Integer.parseInt(string_0);
						final BuildType[] buildtypes_1 = new BuildType[] { BuildType.BUILD_LIVE, BuildType.WIP,
								BuildType.LIVE, BuildType.aBuildType2 };
						final BuildType[] buildtypes_0 = buildtypes_1;
						int_4 = 0;

						BuildType buildtype_0;
						while (true) {
							if (int_4 >= buildtypes_0.length) {
								buildtype_0 = null;
								break;
							}

							final BuildType buildtype_1 = buildtypes_0[int_4];
							if (int_6 == buildtype_1.ordinal) {
								buildtype_0 = buildtype_1;
								break;
							}

							++int_4;
						}

						Class49.aBuildType1 = buildtype_0;
						break;
					case 9:
						flags = Integer.parseInt(string_0);
						break;
					case 10:
						socketType = Integer.parseInt(string_0);
						break;
					case 11:
						languageId = Integer.parseInt(string_0);
						break;
					case 12:
						if (string_0.equalsIgnoreCase("true")) {
							;
						}
						break;
					case 13:
						Class51.anInt112 = Integer.parseInt(string_0);
						break;
					case 15:
						world = Integer.parseInt(string_0);
					}
				}
			}

			Class1.method74();
			Class32.host = getCodeBase().getHost();
			final String string_2 = Class49.aBuildType1.identifier;
			final byte byte_0 = 0;

			try {
				Class57.anInt150 = 17;
				WorldMapType2.anInt241 = byte_0;

				try {
					Class57.osName = System.getProperty("os.name");
				} catch (final Exception exception_1) {
					Class57.osName = "Unknown";
				}

				Class39.osNameLC = Class57.osName.toLowerCase();

				try {
					Class23.userHome = System.getProperty("user.home");
					if (Class23.userHome != null) {
						Class23.userHome = Class23.userHome + "/";
					}
				} catch (final Exception exception_2) {
					;
				}

				try {
					if (Class39.osNameLC.startsWith("win")) {
						if (Class23.userHome == null) {
							Class23.userHome = System.getenv("USERPROFILE");
						}
					} else if (Class23.userHome == null) {
						Class23.userHome = System.getenv("HOME");
					}

					if (Class23.userHome != null) {
						Class23.userHome = Class23.userHome + "/";
					}
				} catch (final Exception exception_3) {
					;
				}

				if (Class23.userHome == null) {
					Class23.userHome = "~/";
				}

				Class41.cacheLocations = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/",
						Class23.userHome, "/tmp/", "" };
				Class25.aStringArray1 = new String[] { ".jagex_cache_" + WorldMapType2.anInt241,
						".file_store_" + WorldMapType2.anInt241 };
				int_0 = 0;

				label272: while (int_0 < 4) {
					string_0 = int_0 == 0 ? "" : "" + int_0;
					Class57.aFile2 = new File(Class23.userHome, "jagex_cl_oldschool_" + string_2 + string_0 + ".dat");
					String string_3 = null;
					String string_1 = null;
					boolean bool_0 = false;
					Buffer buffer_0;
					File file_5;
					if (Class57.aFile2.exists()) {
						try {
							final FileOnDisk fileondisk_0 = new FileOnDisk(Class57.aFile2, "rw", 10000L);

							int int_1;
							for (buffer_0 = new Buffer((int) fileondisk_0
									.length()); buffer_0.offset < buffer_0.payload.length; buffer_0.offset += int_1) {
								int_1 = fileondisk_0.read(buffer_0.payload, buffer_0.offset,
										buffer_0.payload.length - buffer_0.offset);
								if (int_1 == -1) {
									throw new IOException();
								}
							}

							buffer_0.offset = 0;
							int_1 = buffer_0.readUnsignedByte();
							if ((int_1 < 1) || (int_1 > 3)) {
								throw new IOException("" + int_1);
							}

							int int_2 = 0;
							if (int_1 > 1) {
								int_2 = buffer_0.readUnsignedByte();
							}

							if (int_1 <= 2) {
								string_3 = buffer_0.getJagString();
								if (int_2 == 1) {
									string_1 = buffer_0.getJagString();
								}
							} else {
								string_3 = buffer_0.getCESU8();
								if (int_2 == 1) {
									string_1 = buffer_0.getCESU8();
								}
							}

							fileondisk_0.close();
						} catch (final IOException ioexception_0) {
							ioexception_0.printStackTrace();
						}

						if (string_3 != null) {
							file_5 = new File(string_3);
							if (!file_5.exists()) {
								string_3 = null;
							}
						}

						if (string_3 != null) {
							file_5 = new File(string_3, "test.dat");
							if (!Class46.method272(file_5, true)) {
								string_3 = null;
							}
						}
					}

					if ((string_3 == null) && (int_0 == 0)) {
						label247: for (int int_3 = 0; int_3 < Class25.aStringArray1.length; int_3++) {
							for (int_4 = 0; int_4 < Class41.cacheLocations.length; int_4++) {
								final File file_6 = new File(
										Class41.cacheLocations[int_4] + Class25.aStringArray1[int_3]
												+ File.separatorChar + "oldschool" + File.separatorChar);
								if (file_6.exists() && Class46.method272(new File(file_6, "test.dat"), true)) {
									string_3 = file_6.toString();
									bool_0 = true;
									break label247;
								}
							}
						}
					}

					if (string_3 == null) {
						string_3 = Class23.userHome + File.separatorChar + "jagexcache" + string_0 + File.separatorChar
								+ "oldschool" + File.separatorChar + string_2 + File.separatorChar;
						bool_0 = true;
					}

					File file_4;
					if (string_1 != null) {
						file_4 = new File(string_1);
						file_5 = new File(string_3);

						try {
							final File[] files_3 = file_4.listFiles();
							final File[] files_0 = files_3;

							for (int int_5 = 0; int_5 < files_0.length; int_5++) {
								final File file_0 = files_0[int_5];
								final File file_1 = new File(file_5, file_0.getName());
								final boolean bool_1 = file_0.renameTo(file_1);
								if (!bool_1) {
									throw new IOException();
								}
							}
						} catch (final Exception exception_4) {
							exception_4.printStackTrace();
						}

						bool_0 = true;
					}

					if (bool_0) {
						file_4 = new File(string_3);
						buffer_0 = null;

						try {
							final FileOnDisk fileondisk_1 = new FileOnDisk(Class57.aFile2, "rw", 10000L);
							final Buffer buffer_1 = new Buffer(500);
							buffer_1.putByte(3);
							buffer_1.putByte(buffer_0 != null ? 1 : 0);
							buffer_1.putCESU8(file_4.getPath());
							if (buffer_0 != null) {
								buffer_1.putCESU8("");
							}

							fileondisk_1.write(buffer_1.payload, 0, buffer_1.offset);
							fileondisk_1.close();
						} catch (final IOException ioexception_1) {
							ioexception_1.printStackTrace();
						}
					}

					final File file_3 = new File(string_3);
					Class57.aFile1 = file_3;
					if (!Class57.aFile1.exists()) {
						Class57.aFile1.mkdirs();
					}

					final File[] files_1 = Class57.aFile1.listFiles();
					if (files_1 != null) {
						final File[] files_2 = files_1;

						for (int_6 = 0; int_6 < files_2.length; int_6++) {
							final File file_7 = files_2[int_6];
							if (!Class46.method272(file_7, false)) {
								++int_0;
								continue label272;
							}
						}
					}
					break;
				}

				final File file_2 = Class57.aFile1;
				Class58.aFile3 = file_2;
				if (!Class58.aFile3.exists()) {
					throw new RuntimeException("");
				}

				Class58.aBool18 = true;
				Class2.method81();
				Class57.aCacheFile2 = new CacheFile(
						new FileOnDisk(Class36.method248("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
				Class57.aCacheFile3 = new CacheFile(
						new FileOnDisk(Class36.method248("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
				Class57.aCacheFileArray1 = new CacheFile[Class57.anInt150];

				for (int int_7 = 0; int_7 < Class57.anInt150; int_7++) {
					Class57.aCacheFileArray1[int_7] = new CacheFile(
							new FileOnDisk(Class36.method248("main_file_cache.idx" + int_7), "rw", 1048576L), 6000, 0);
				}
			} catch (final Exception exception_0) {
				Class17.method201((String) null, exception_0);
			}

			AClass1.clientInstance = this;
			initialize(765, 503, 149);
		}
	}

	public static void method1048(final IndexDataBase indexdatabase_0, final IndexDataBase indexdatabase_1,
			final IndexDataBase indexdatabase_2) {
		Sequence.seq_ref = indexdatabase_0;
		Sequence.skel_ref = indexdatabase_1;
		Class6.skin_ref = indexdatabase_2;
	}

}
