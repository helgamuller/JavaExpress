package practice2;

public class GameSettings {
    static int maxPlayers=4;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }
    public static void setMaxPlayers(int newMax) {
        maxPlayers = newMax;
    }
    public void addPlayer() {
        if (this.currentPlayers<maxPlayers) {
            this.currentPlayers++;
        }


        }
        public void printGameStatus() {
            System.out.println("GameName is: " + this.gameName + " CurrentPlayers amount is: " + this.currentPlayers + " Max players amount is : " + maxPlayers);
        }
    }

