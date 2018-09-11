package com.epam.mentoring.devices;

import java.util.Scanner;

public class Calculator implements Battery {
    private int batteryCharge;

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }
    //TODO: AK Опять же не понятен смысл Battery интерфейса, т.к. тут есть свои методы для работы с полем batteryCharge
    //Если немножно развить идею, наверное, было бы правильнее создать некий абстрактный класс, например 'PortableDevice' в котором
    // будет поле batteryCharge и свои методы и от этого класса наследовать все наши устройства
    public int getBatteryCharge() {
        return batteryCharge;
    }

    //считывание чисел с консоли
    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа.Введите другое значение.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    // выбор операции
    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    //вычисление
    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println(" Результат операции:" + result);
    }
}
