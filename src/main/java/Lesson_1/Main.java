package Lesson_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Competitions[] competitions = new Competitions[3];

        int distance = 100;
        int heigth = 3;
        competitions[0] = new Human("Влад", distance, heigth);

        distance = 200;
        heigth = 10;
        competitions[1] = new Robot("Робби", distance, heigth);

        distance = 50;
        heigth = 5;
        competitions[2] = new Cat("Шера", distance, heigth);

        Obstacles[] obstacles = new Obstacles[3];

        boolean isTreadmill;
        for (int i = 0; i < obstacles.length; i++) {
            distance = rand.nextInt(150);
            isTreadmill = rand.nextBoolean();
            if (isTreadmill) {
                obstacles[i] = new Treadmill("Беговая дорожка " + i, distance);
            } else {
                obstacles[i] = new Wall("Стена " + i, distance);
            }
        }

        for (int i = 0; i < competitions.length; i++) {
            boolean result = true;
            for (int j = 0; j < obstacles.length; j++) {
                result = obstacles[j].moving(competitions[i]);
                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Успешно!!!");
            } else {
                System.out.println("Выполнить упражнения не возможно!!!");
            }
        }
    }
}
