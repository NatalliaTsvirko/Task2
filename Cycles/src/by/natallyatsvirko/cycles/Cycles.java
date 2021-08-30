package by.natallyatsvirko.cycles;


import java.util.Scanner;

public class Cycles {


    public static void number() {
        System.out.println("******Количество цифр в числе*****");
        int number = 777;
        if (number > 0 && number < 10) { // % 2 == 0) {
            System.out.println(" однозначное число");
        } else if (number > 0 && number < 10) { // % 2 != 0) {
            System.out.println("однозначное число");
        } else if (number > 9 && number < 100) { // % 2 == 0) {
            System.out.println(" двухзначное число");
        } else if (number > 9 && number < 100) { // % 2 != 0) {
            System.out.println(" двухзначное число");
        } else if (number > 99 && number < 1000) { // % 2 == 0) {
            System.out.println("трехзначное число");
        } else if (number > 99 && number < 1000) { // % 2 != 0) {
            System.out.println("нечетное трехзначное число");
        }
    }

    public static void triangle() {
        System.out.println("*****Существующий, несуществующий треугольник*****");
        int a = 5;
        int b = 7;
        int c = 5;
        if ((a < b + c) && (b < c + a) && (c < a + b)) {
            System.out.println("Такой треугольник существует");
        } else {
            System.out.println("Такой треугольник не существует ");
        }
    }

    public static void evenOdd() {
        System.out.println("*****Положительное и отрицательное число*****");
        int count = 5;
        int even = 0;
        int odd = 0;
        while (count > 0) {
            if (count % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            count = count / 10;
            System.out.println("Even : " + even + ", Odd : " + odd);
        }
    }

    public static void countPositive() {
        System.out.println("*****Количество четных чисел*****");
        int a = 11, b = -3, c = 2;
        int counter = 0;
        if (a > 0) {
            counter++;
        }
        if (b > 0) {
            counter++;
        }
        if (c > 0) {
            counter++;
        }
        System.out.println(counter);
    }

    public static void counterPositiveNegative() {
        System.out.println("*****Количество четных и нечетных чисел*****");
        int a = 11, b = -3, c = 2;
        int counterPositive = 0;
        int counterNegstive = 0;
        if (a > 0) {
            counterPositive++;
        } else if (a < 0) {
            counterNegstive++;
        }
        if (b > 0) {
            counterPositive++;
        } else if (b < 0) {
            counterNegstive++;
        }
        if (c > 0) {
            counterPositive++;
        } else if (c < 0) {
            counterNegstive++;
        }
        System.out.println("CounterPositive : " + counterPositive + ", CounterNegative : " + counterNegstive);
    }

    public static void moreNumber() {
        System.out.println("*****Большее число*****");
        int a = 9, b = 7;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }


    public static void endOfTheWord() {
        System.out.println("*****Вывод правильного окончания*****");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        int a = scanner.nextInt();
        if (a % 100 > 4 && a % 100 < 21) {
            System.out.println(" программистов");
        } else if (a % 100 > 24 ) {
            System.out.println("прораммистов");
        } else if (a % 10 == 1) {
            System.out.println(" программист");
        }else if (a % 10 > 1 && a % 10 < 5) {
            System.out.println(" программиста");
        }
    }

    public static void sportDistance() {
        System.out.println("*****Задача про спортсмена и дистанцию*****");
        double day1 = 10;
        double resulte = day1;
        for (int i = 0; i < 7; i++) {
            day1 *= 1.1;
            resulte += day1;
        }
        System.out.println(resulte);
    }

    public static void divisionAmoeba() {
        System.out.println("*****Деление амебы*****");
        int count = 1;
        int houre = 3;
        for (int i = 3; i < 24; i += 3) {
            count *= 2;
        }
        System.out.println(count);
    }

    public static void calculate() {
        System.out.println("****Вычисление*****");
        int initialNumber = 1;
        int result = initialNumber;
        while (initialNumber < 256) {
            initialNumber *= 2;
            result += initialNumber;
        }
        System.out.println(result);
    }

    public static void calcAB() {
        System.out.println("****Вычисление А*В*****");
        int a = 10;
        int b = 3;
        int result = 0;
        while (b < 0) {
            result += a;
            b--;
        }
        System.out.println(b);
    }

    public static void inchToSm() {

        System.out.println("*****Из дюймов в сантиметры*****");

        double sm = 0;
        for (int i = 1; i <= 20; i++) {
            sm = i * 2.54;
            System.out.println(sm);
        }
    }

    public static void evenNumb() {
        System.out.println("*****Вывод четных чисел*****");
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public static void sumOfOddNumb() {

        System.out.println("****Сумма всех нечетных чисел*****");
        int sum = 0;
        for (int i = 0; i <= 99; i++) {
            i += 1;
            sum += i;
            System.out.println(sum);

        }
    }

    public static void triangleUpAndDown() {

        System.out.println("****Треугольник из звездочек*****");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();


        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++)

                System.out.print("*");
            System.out.println();
        }
    }

}
