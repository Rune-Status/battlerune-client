public class Class28 {

	static Preferences preferences;
	static int menuHeight;
	static SpritePixels[] pkIcons;

	static void method226(final int int_0) {
		if (int_0 == -3) {
			Class41.method261("Connection timed out.", "Please try using a different world.", "");
		} else if (int_0 == -2) {
			Class41.method261("", "Error connecting to server.", "");
		} else if (int_0 == -1) {
			Class41.method261("No response from server.", "Please try using a different world.", "");
		} else if (int_0 == 3) {
			Class26.loginIndex = 3;
		} else if (int_0 == 4) {
			Class41.method261("Your account has been disabled.", "Please check your message-centre for details.", "");
		} else if (int_0 == 5) {
			Class41.method261("Your account has not logged out from its last",
					"session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (int_0 == 6) {
			Class41.method261("RuneScape has been updated!", "Please reload this page.", "");
		} else if (int_0 == 7) {
			Class41.method261("This world is full.", "Please use a different world.", "");
		} else if (int_0 == 8) {
			Class41.method261("Unable to connect.", "Login server offline.", "");
		} else if (int_0 == 9) {
			Class41.method261("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (int_0 == 10) {
			Class41.method261("Unable to connect.", "Bad session id.", "");
		} else if (int_0 == 11) {
			Class41.method261("We suspect someone knows your password.",
					"Press \'change your password\' on front page.", "");
		} else if (int_0 == 12) {
			Class41.method261("You need a members account to login to this world.",
					"Please subscribe, or use a different world.", "");
		} else if (int_0 == 13) {
			Class41.method261("Could not complete login.", "Please try using a different world.", "");
		} else if (int_0 == 14) {
			Class41.method261("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (int_0 == 16) {
			Class41.method261("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (int_0 == 17) {
			Class41.method261("You are standing in a members-only area.",
					"To play on this world move to a free area first", "");
		} else if (int_0 == 18) {
			Class41.method261("Account locked as we suspect it has been stolen.",
					"Press \'recover a locked account\' on front page.", "");
		} else if (int_0 == 19) {
			Class41.method261("This world is running a closed Beta.", "Sorry invited players only.",
					"Please use a different world.");
		} else if (int_0 == 20) {
			Class41.method261("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (int_0 == 22) {
			Class41.method261("Malformed login packet.", "Please try again.", "");
		} else if (int_0 == 23) {
			Class41.method261("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (int_0 == 24) {
			Class41.method261("Error loading your profile.", "Please contact customer support.", "");
		} else if (int_0 == 25) {
			Class41.method261("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (int_0 == 26) {
			Class41.method261("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (int_0 == 27) {
			Class41.method261("", "Service unavailable.", "");
		} else if (int_0 == 31) {
			Class41.method261("Your account must have a displayname set", "in order to play the game.  Please set it",
					"via the website, or the main game.");
		} else if (int_0 == 32) {
			Class41.method261("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort",
					"this out by visiting the billing system.");
		} else if (int_0 == 37) {
			Class41.method261("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (int_0 == 38) {
			Class41.method261("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (int_0 == 55) {
			Class41.method261("Sorry, but your account is not eligible to",
					"play this version of the game.  Please try", "playing the main game instead!");
		} else {
			if (int_0 == 56) {
				Class41.method261("Enter the 6-digit code generated by your", "authenticator app.", "");
				WorldMapType2.setGameState(11);
				return;
			}

			if (int_0 == 57) {
				Class41.method261("The code you entered was incorrect.", "Please try again.", "");
				WorldMapType2.setGameState(11);
				return;
			}

			Class41.method261("Unexpected server response", "Please try using a different world.", "");
		}

		WorldMapType2.setGameState(10);
	}

}
