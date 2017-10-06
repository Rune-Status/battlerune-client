import java.awt.Image;

public abstract class Timer {

	static Image anImage1;
	static int anInt285;

	public abstract int method556(int var1, int var2);

	public abstract void method557();

	static int method558(final Class70 class70_0, final int int_0, final int int_1) {
		if (class70_0 == null) {
			return int_1;
		} else {
			final WidgetConfig widgetconfig_0 = (WidgetConfig) class70_0.method419(int_0);
			return widgetconfig_0 == null ? int_1 : widgetconfig_0.config;
		}
	}

	static final void method559() {
		for (Projectile projectile_0 = (Projectile) Client.projectiles
				.getFront(); projectile_0 != null; projectile_0 = (Projectile) Client.projectiles.getNext()) {
			if ((projectile_0.floor == AClass1_Sub1.plane) && (Client.gameCycle <= projectile_0.cycle)) {
				if (Client.gameCycle >= projectile_0.startTime) {
					if (projectile_0.interacting > 0) {
						final NPC npc_0 = Client.cachedNPCs[projectile_0.interacting - 1];
						if ((npc_0 != null) && (npc_0.anInt547 >= 0) && (npc_0.anInt547 < 13312)
								&& (npc_0.anInt550 >= 0) && (npc_0.anInt550 < 13312)) {
							projectile_0.method938(npc_0.anInt547, npc_0.anInt550,
									Actor.getTileHeight(npc_0.anInt547, npc_0.anInt550, projectile_0.floor)
											- projectile_0.endHeight,
									Client.gameCycle);
						}
					}

					if (projectile_0.interacting < 0) {
						final int int_0 = -projectile_0.interacting - 1;
						Player player_0;
						if (int_0 == Client.localInteractingIndex) {
							player_0 = Script.localPlayer;
						} else {
							player_0 = Client.cachedPlayers[int_0];
						}

						if ((player_0 != null) && (player_0.anInt547 >= 0) && (player_0.anInt547 < 13312)
								&& (player_0.anInt550 >= 0) && (player_0.anInt550 < 13312)) {
							projectile_0.method938(player_0.anInt547, player_0.anInt550,
									Actor.getTileHeight(player_0.anInt547, player_0.anInt550, projectile_0.floor)
											- projectile_0.endHeight,
									Client.gameCycle);
						}
					}

					projectile_0.method937(Client.anInt662);
					Class8.region.method356(AClass1_Sub1.plane, (int) projectile_0.aDouble1,
							(int) projectile_0.velocityZ, (int) projectile_0.aDouble3, 60, projectile_0,
							projectile_0.rotationX, -1, false);
				}
			} else {
				projectile_0.unlink();
			}
		}

	}

	static void method560(final Player player_0, final int int_0, final int int_1) {
		if ((player_0.animation == int_0) && (int_0 != -1)) {
			final int int_2 = Class54.getAnimation(int_0).replyMode;
			if (int_2 == 1) {
				player_0.actionFrame = 0;
				player_0.anInt559 = 0;
				player_0.actionAnimationDisable = int_1;
				player_0.anInt560 = 0;
			}

			if (int_2 == 2) {
				player_0.anInt560 = 0;
			}
		} else if ((int_0 == -1) || (player_0.animation == -1) || (Class54.getAnimation(int_0).forcedPriority >= Class54
				.getAnimation(player_0.animation).forcedPriority)) {
			player_0.animation = int_0;
			player_0.actionFrame = 0;
			player_0.anInt559 = 0;
			player_0.actionAnimationDisable = int_1;
			player_0.anInt560 = 0;
			player_0.anInt540 = player_0.queueSize;
			return;
		}

	}

}
