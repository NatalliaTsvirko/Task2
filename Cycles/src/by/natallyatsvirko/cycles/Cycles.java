package by.natallyatsvirko.cycles;



import java.util.Scanner;

public class Cycles {


    public static void number() {
        System.out.println("******Количество цифр в числе*****");
        int number = 777;
        if (number > 0 && number < 10 && number % 2 == 0) {
            System.out.println(" четное однозначное число");
        } else if (number > 0 && number < 10 && number % 2 != 0) {
            System.out.println("нечетное однозначное число");
        } else if (number > 9 && number < 100 && number % 2 == 0) {
            System.out.println("четное двухзначное число");
        } else if (number > 9 && number < 100 && number % 2 != 0) {
            System.out.println("нечетное двухзначное число");
        } else if (number > 99 && number < 1000 && number % 2 == 0) {
            System.out.println("четное трехзначное число");
        } else if (number > 99 && number < 1000 && number % 2 != 0) {
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
        } else if (a % 100 > 24) {
            System.out.println("прораммистов");
        } else if (a % 10 == 1) {
            System.out.println(" программист");
        } else if (a % 10 > 1 && a % 10 < 5) {
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

    public static void reversNumb() {

        System.out.println("*****Переверни число*****");

        int num = 1234567;
        int rev = 0;
        for (int i = num; i > 0; i /= 10) {
            rev = rev * 10 + i % 10;
        }
        System.out.println(rev);
    }

    public static void chekUpNum() {

        System.out.println("*****Цифры четырехзначного числа по возрастанию*****");
    }

    public static void monster() {

        System.out.println("*****Чудище*****");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст : ");
        int year = scanner.nextInt();
        int head = 3;
        int eyes = 6;
        if (year < 199) {
            head = year * 3;
            eyes = head * 2;
            System.out.println("В " + year + " у чудища " + head + " голов  и " + eyes + " глаз");
            year++;

        } else if (year >= 200) {
            head = (year * 2) + 600;
            eyes = head * 2;
            System.out.println("В " + year + " у чудища " + head + " голов  и " + eyes + " глаз");
            year++;

        } else if (year <= 400) {
            head = (year * 1) + 200;
            eyes = head * 2;
            System.out.println("В " + year + " у чудища " + head + " голов  и " + eyes + " глаз");
            year++;

        }
    }


    public static void countNumb() {

        System.out.println("*****Сумма цифр одного числа и среднее арифметическое*****");


        double a, c = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            while (a != 0) {
                c = c + a % 10;
                a /= 10;
            }
            c /= 6;
            System.out.println("Сумма всех чисел введенного числа равна " + c);
        }
    }

    public static void numberUpDown() {

        System.out.println("***** В порядке возрастания и убывания*****");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = scanner.nextInt();
        int digit = number % 10;
        number /= 10;
        if (digit < (number % 10)) {

            while (number > 0) {

                System.out.println("В порядке возрастания");
            }
        } else {
            System.out.println("В порядке убывания");
        }
    }


    public static void sameOddEven() {
        System.out.println("*****Все четные либо все нечетные*****");
    }

    public static void onlyOdd() {
        System.out.println("*****Только четные циферки или только нечетные циферки *****");
    }

    public static void sameOrDifferend() {
        System.out.println("*****Цифры заданного числа различны либо одинаковы*****");
    }

    public static void simpleNumb() {
        System.out.println("*****Является ли заданное натуральное число простым*****");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Составное");
        } else {
            System.out.println("Простое");
        }
    }

    public static void squareNumb() {

        System.out.println("*****Квадраты чисел от 10 до 20 включительно*****");

        for (int i = 10; i <= 20; i++) {

            System.out.println(i * i);
        }
    }

    public static void generationNumb() {
        System.out.println("***** Генерация случайных чисел*****");
        int a = (int) (Math.random() * 155 + 5);
        if (a >= 25 && a <= 100) {
            System.out.println(a + " попало в интервал.");
        } else {
            System.out.println(a + " не попало в интервал. ");
        }
    }

    public static void rightOrNo() {
        System.out.println("*****Верно или неверно*****");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число :");
        int a = scanner.nextInt();

        if (a == 10) {
            System.out.println("Верно.");
        } else {
            System.out.println("Неверно.");
        }
    }

    public static void houreMin() {
        System.out.println("*****Задача про четверть часа*****");

        //int min = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минуты :");
        int min = scanner.nextInt();

        if (min >= 0 && min <= 14) {
            System.out.println("В первую четверть часа.");
        } else if (min >= 15 && min <= 30) {
            System.out.println("Во вторую четверть часа.");
        } else if (min >= 31 && min <= 45) {
            System.out.println("В третью четверть часа.");
        } else if (min >= 46 && min <= 59) {
            System.out.println("В четвертую четверть часа.");
        }
    }


    public static void seasons() {

        System.out.println("*****Времена года*****");

        Scanner inputNum = new Scanner(System.in);
        System.out.println("Введите от 1 до 4");
        int num;
        num = inputNum.nextInt();

        switch (num) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;
            case 4:
                System.out.println("Осень");
                break;


        }
    }


}
