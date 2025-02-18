package src;

import src.models.Player;

class Game {
    Player player;
    private double balance;
    private int currentDay;

    void getMainChoices(UserInteraction userInteraction) {
        final Action[] choices = {
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
                    buyNewRoom(userInteraction);
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

        String headerContent = String.format("Day: %d", this.getCurrentDay() )
            + String.format("\n" + "Player: %s", player.getName())
            + String.format("\n" + "Balance: $%.2f", this.getBalance());

        userInteraction.nextInput(headerContent, choices);
    }

    void createNewPlayer(UserInteraction userInteraction) {
        System.out.print("\nEnter Player Name: ");
        String playerName = userInteraction.scanner.nextLine();

        this.player = new Player(playerName);
        this.balance = 5000;
        this.currentDay = 1;
    }

    void buyNewRoom(UserInteraction userInteraction) {
        String headerContent = "Buy a New Room" + String.format("\n" + "Balance: $%.2f", Game.this.getBalance());

        final Action[] choices = {
            new Action("Single Room") {
                public void call(UserInteraction userInteraction) {
                    Game.this.balance -= 2000;
                    System.out.println("\nYou bought a Single Room.\nNew Balance: $" + Game.this.getBalance());

                    System.out.print("\nPress Enter to continue...");
                    userInteraction.scanner.nextLine();

                    getMainChoices(userInteraction);
                }
            }
        };

        userInteraction.nextInput(headerContent, choices);
    }

    int getCurrentDay() {
        return this.currentDay;
    }

    double getBalance() {
        return this.balance;
    }
}
