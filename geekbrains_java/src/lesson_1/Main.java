package lesson_1;

public class Main {

    public static void main(String[] args) {
        // примитивные типы данных
        byte b1 = 1;
        short s1 = 300;
        int i1 = 3000;
        long l1 = 20000;

        float f1 = 123.5f;
        double d1 = 123.5;

        boolean bol1 = true;
        char c1 = 's';

        //ссылочные типы данныых
        String str = "Hello!";

        System.out.println(mathFormula(2, 3, 20, 5));

        int summ = summTwoNumber(2, 3);
        System.out.println(summ >= 10 && summ <= 20 ? true : false);

        int a = numberSign(-7);


        int b = signNumber(-5);


        String c = nameUser("Анна");


        int year = leapYear(2000);

    }

    static int mathFormula(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    static int summTwoNumber(int a, int b) {
        return a + b;
    }

    static int numberSign(int a) {
        System.out.println(a < 0 ? "Отрицательное число" : "Положительное число");
        return a;

    }

    static int signNumber(int b) {
        System.out.println(b < 0 ? true : false);
        return b;
    }

    static String nameUser(String c) {
        System.out.println("Привет, " + c + "!");
        return c;
    }

    static int leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "- високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
        return year;
    }
}


