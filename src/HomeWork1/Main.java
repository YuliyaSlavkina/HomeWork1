package HomeWork1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Задача 1
//        Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите ваше число: ");
//        int number = sc.nextInt();
//        sc.close();
//
//        FirstTask task1 = new FirstTask();
//        System.out.println(task1.sum(number));


//        Задача 2
//        Вывести все простые числа от 1 до 1000
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите ваше число: ");
//        int num = sc.nextInt();
//        sc.close();
//
//        SecondTask task2 = new SecondTask();
//        task2.getOdd(num);

//        Задача 3
//        Реализовать простой калькулятор

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите действие (+, -, *, /): ");
        char action = sc.nextLine().charAt(0);
        System.out.print("Введите первое число: ");
        double num1 = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = sc.nextDouble();

        ThirdTask task3 = new ThirdTask();
        task3.calculation(action, num1, num2);


    }
}