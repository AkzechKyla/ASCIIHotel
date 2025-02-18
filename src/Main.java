package src;

public class Main {
    public static void main(String[] args)  {
        final Action[] choices = {
            new Action("New Game") {
                public void call(UserInteraction userInteraction) {
                    Game game = new Game();
                    game.createNewPlayer(userInteraction);
                    game.getMainChoices(userInteraction);
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
        String headerContent = "Welcome to ASCII Hotel!";
        userInteraction.nextInput(headerContent, choices);
    }
}
