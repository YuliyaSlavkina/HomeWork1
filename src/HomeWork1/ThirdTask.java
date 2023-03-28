package HomeWork1;

public class ThirdTask {

    public void calculation(char action, double num1, double num2) {
        if (action == '+') {
            System.out.print(num1 + num2);
        } else if (action == '-') {
            System.out.print(num1 - num2);
        } else if (action == '*') {
            System.out.print(num1 * num2);
        } else if (action == '/') {
            if (num2 != 0) {
                System.out.print(num1 / num2);
            } else {
                System.out.print("Ошибка деления на 0! ");
            }
        } else {
            System.out.print("Ошибка. ");
        }
    }
}

