package Lesson_1;

public class Wall extends Obstacles{

    private int height;

    public Wall(String name, int height) {
        super(name);

        this.height = height;
    }

    public int getHeigth() {
        return height;
    }

    @Override
    protected boolean moving(Competitions competitions) {
        System.out.println("Стена " + super.getName() + " высота: " + this.height);

        competitions.jump();

        if (getHeigth() <= competitions.getJumpHeight()) {
            System.out.println("Прыжок удался");

            return true;
        } else {
            System.out.println("Прыжок не возможен");

            return false;
        }
    }
}
