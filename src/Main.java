package src;

import src.models.Player;

public class Main {
    public static void main(String[] args) {
        final Action[] choices = {
            new Action("New Game") {
                public void call(UserInteraction userInteraction) {
                    String playerName = userInteraction.getPlayerName();
                    Player player = new Player(playerName, 500);
                    System.out.println(player.getMoney());
                }
            },
            new Action("Load Game") {
                public void call(UserInteraction userInteraction) {
                    System.out.println("Load Game... ");
                }
            },
            new Action("Exit") {
                public void call(UserInteraction userInteraction) {
                    System.out.println("Goodbye!");
                }
            }
        };

        final UserInteraction userInteraction = new UserInteraction();
        userInteraction.nextInput(choices);
    }
}
