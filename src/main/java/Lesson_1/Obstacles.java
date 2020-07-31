package Lesson_1;

public abstract class Obstacles {
    private String name;

    public Obstacles(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Competitions competitions);

    public String getName() {
        return name;
    }
}
