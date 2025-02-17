package src;

public abstract class Action {
    String name;

    public Action(String name) {
        this.name = name;
    }

    public abstract void call(UserInteraction userInteraction);
}
