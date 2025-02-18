package src;

import src.models.Player;

class Game {
    private UserInteraction userInteraction;
    private Player player;

    Game(UserInteraction userInteraction) {
        this.userInteraction = userInteraction;
    }

    void getMainChoices() {
        final Action[] choices = {
            new Action("Check Finances") {
                public void call(UserInteraction userInteraction) {
                    System.out.println("Checking Finances...");
                }
            },
            new Action("Advertise") {
                public void call(UserInteraction userInteraction) {
                    System.out.println("Checking Advertisements...");
                }
            },
            new Action("Upgrade Hotel") {
                public void call(UserInteraction userInteraction) {
                    System.out.println("Upgrade Hotel...");
                }
            },
            new Action("Manage Tenants") {
                public void call(UserInteraction userInteraction) {
                    System.out.println("Managing Tenants...");
                }
            },
            new Action("Buy a New Room") {
                public void call(UserInteraction userInteraction) {
                    System.out.println("Buying a New Room...");
                }
            },
            new Action("End Day") {
                public void call(UserInteraction userInteraction) {
                    System.out.println("Ending the Day...");
                }
            },
            new Action("Go to Main Menu") {
                public void call(UserInteraction userInteraction) {
                    Main.main(null);
                }
            }
        };

        userInteraction.nextInput(choices);
    }

    void createNewPlayer() {
        System.out.print("\nEnter Player Name: ");
        String playerName = userInteraction.scanner.nextLine();

        this.player = new Player(playerName);
    }
}
