package src;

public class Main {
    public static void main(String[] args) {
        final Action[] choices = {
            new Action("New Game") {
                public void call(UserInteraction userInteraction) {
                    Game game = new Game(userInteraction);
                    game.createNewPlayer();
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
