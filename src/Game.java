package src;

class Game {
    private UserInteraction userInteraction;

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
            }
        };

        userInteraction.nextInput(choices);
    }
}
