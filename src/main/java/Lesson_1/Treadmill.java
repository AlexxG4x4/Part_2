package Lesson_1;

public class Treadmill extends Obstacles{

    private int length;

    public Treadmill(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Competitions competitions) {
        System.out.println("Беговая дорожка " + super.getName() + " длина: " + this.length);

        competitions.run();

        if (getLength() <= competitions.getRunDistance()) {
            System.out.println("Пробежка успешна");

            return true;
        } else {
            System.out.println("Пробежка не возможна");

            return false;
        }
    }
}
