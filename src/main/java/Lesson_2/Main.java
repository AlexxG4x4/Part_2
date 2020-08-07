package Lesson_2;

public class Main {public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

    String[][] array44 = {{"10", "20", "30", "40"}, {"1", "2", "3", "4"}, {"10", "20", "30", "40"}, {"1", "2", "3", "4"}};

    String[][] array33 = {{"1", "2", "3"}, {"1", "2", "3"}};

    getArray(array44);
    getArray(array33);
}

    public static void getArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int row, column, sum = 0;

        row = array.length;
        column = array[0].length;

        if (array.length == 4 && array[0].length == 4) {
            System.out.println("It's OK!");
        } else {
            throw new MyArraySizeException("MyNewException: Не верный размер массива!");
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("MyException: Не возможно преобразовать " + i + " : " + j);
                }
            }
        }
        System.out.println(sum);
    }
}