//Задание 1 Создайте проект, используя IntelliJ IDEA.
//        Создайте класс Calculator. В теле класса создайте четыре метода для арифметических действий: (a dd – сложение, sub – вычитание, m ul – умножение, d iv – деление).  Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать
//        исключение.  Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию. При возникновении ошибок должны выбрасываться исключения.

import java.util.Scanner;

public class Calculator {
    static Scanner userInput = new Scanner(System.in);

    public static double Add(){
        System.out.print("Введите два значения ");
        double x = userInput.nextDouble();
        double y = userInput.nextDouble();
        return x + y;

    }
    public static double Mul(){
        System.out.print("Введите два значения: ");
        double x = userInput.nextDouble();
        double y = userInput.nextDouble();
        return x * y;

    }
    public static double Sub(){
        System.out.print("Введите два значения: ");
        double x = userInput.nextDouble();
        double y = userInput.nextDouble();
        return x - y;

    }
    public static double Div(){
        System.out.print("Введите первое значение: ");
        double x = userInput.nextDouble();
        if(x==0){
            System.err.print("На ноль не делится ");
        }

        System.out.print("Введите второе значение:");
        double y = userInput.nextDouble();
        if(y==0){
            System.err.print("На ноль не делится ");
        }
        return x / y;
    }

    public static void main(String[] args){
        System.out.print("Введите операцию: ");
        String operationChoose = userInput.nextLine();
        if(operationChoose.equals("+")){
            System.out.println(Add());
        }

        if(operationChoose.equals("-")){
            System.out.println(Sub());
        }

        if(operationChoose.equals("*")){
            System.out.println(Mul());
        }

        if(operationChoose.equals("/")){
            System.out.println(Div());

        }

    }
}