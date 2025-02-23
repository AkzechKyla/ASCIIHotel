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

        RoomType singleRoom = RoomType.SINGLE;
        RoomType standardDoubleRoom = RoomType.STANDARD_DOUBLE;
        RoomType standardTwinRoom = RoomType.STANDARD_TWIN;
        RoomType deluxeRoom = RoomType.DELUXE_ROOM;
        RoomType studioApartment = RoomType.STUDIO_APARTMENT;
        RoomType juniorSuite = RoomType.JUNIOR_SUITE;
        RoomType executiveSuite = RoomType.EXECUTIVE_SUITE;
        RoomType presidentialSuite = RoomType.PRESIDENTIAL_SUITE;

        // Rooms can only be unlocked at certain levels, but try to display all rooms first.

        final Action[] choices = {
            new Action("Single Room") {
                public void call(UserInteraction userInteraction) {
                    deductBalance(singleRoom.getPropertyPrice());
                    System.out.println("\nYou bought a Single Room.\nNew Balance: $" + getBalance());

                    System.out.print("\nPress Enter to continue...");
                    userInteraction.scanner.nextLine();

                    getMainChoices(userInteraction);
                }
            },
            new Action("Standard Double Room") {
                public void call(UserInteraction userInteraction) {
                    deductBalance(standardDoubleRoom.getPropertyPrice());
                    System.out.println("\nYou bought a Single Room.\nNew Balance: $" + getBalance());

                    System.out.print("\nPress Enter to continue...");
                    userInteraction.scanner.nextLine();

                    getMainChoices(userInteraction);
                }
            },
            new Action("Standard Twin Room") {
                public void call(UserInteraction userInteraction) {
                    deductBalance(standardTwinRoom.getPropertyPrice());
                    System.out.println("\nYou bought a Single Room.\nNew Balance: $" + getBalance());

                    System.out.print("\nPress Enter to continue...");
                    userInteraction.scanner.nextLine();

                    getMainChoices(userInteraction);
                }
            },
            new Action("Deluxe Room") {
                public void call(UserInteraction userInteraction) {
                    deductBalance(deluxeRoom.getPropertyPrice());
                    System.out.println("\nYou bought a Single Room.\nNew Balance: $" + getBalance());

                    System.out.print("\nPress Enter to continue...");
                    userInteraction.scanner.nextLine();

                    getMainChoices(userInteraction);
                }
            },
            new Action("Studio Apartment") {
                public void call(UserInteraction userInteraction) {
                    deductBalance(studioApartment.getPropertyPrice());
                    System.out.println("\nYou bought a Single Room.\nNew Balance: $" + getBalance());

                    System.out.print("\nPress Enter to continue...");
                    userInteraction.scanner.nextLine();

                    getMainChoices(userInteraction);
                }
            },
            new Action("Junior Suite") {
                public void call(UserInteraction userInteraction) {
                    deductBalance(juniorSuite.getPropertyPrice());
                    System.out.println("\nYou bought a Single Room.\nNew Balance: $" + getBalance());

                    System.out.print("\nPress Enter to continue...");
                    userInteraction.scanner.nextLine();

                    getMainChoices(userInteraction);
                }
            },
            new Action("Executive Suite") {
                public void call(UserInteraction userInteraction) {
                    deductBalance(executiveSuite.getPropertyPrice());
                    System.out.println("\nYou bought a Single Room.\nNew Balance: $" + getBalance());

                    System.out.print("\nPress Enter to continue...");
                    userInteraction.scanner.nextLine();

                    getMainChoices(userInteraction);
                }
            },
            new Action("Presidential Suite") {
                public void call(UserInteraction userInteraction) {
                    deductBalance(presidentialSuite.getPropertyPrice());
                    System.out.println("\nYou bought a Single Room.\nNew Balance: $" + getBalance());

                    System.out.print("\nPress Enter to continue...");
                    userInteraction.scanner.nextLine();

                    getMainChoices(userInteraction);
                }
            }
        };

        userInteraction.nextInput(headerContent, choices);
    }

    void deductBalance(int amount) {
        this.balance -= amount;
    }

    int getCurrentDay() {
        return this.currentDay;
    }

    double getBalance() {
        return this.balance;
    }
}
