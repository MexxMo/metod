import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Задание 1: ");

        System.out.println("Введите год");
        task1(console.nextInt());

        System.out.println("Задание 2: ");

        System.out.println("Введите ОС (0 - Айфон, 1 - Андроид) и год выпуска устройства");
        task2(console.nextInt(), console.nextInt());

        System.out.println("Задание 3: ");

        System.out.println("Введите кол-во км до клиента");
        task3(deliveryDays(console.nextInt()));

        console.close();
    }

    private static void task1(int console) {

        if (isLeapYear(console)) {
            System.out.printf("Год %d - високосный%n", console);
        } else {
            System.out.printf("Год %d - невисокосный%n", console);
        }
    }

    private static void task2(int clientOS, int clientDeviceYear) {
        downloadApp(clientOS, clientDeviceYear);
    }

    private static void task3(int deliveryDays) {

        if (deliveryDays < 0) {
            System.out.println("Доставки нет.");
        } else {
            System.out.printf("Потребуется дней: %d %n", deliveryDays);
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }


    private static void downloadApp(int os, int yearDevice) {
        int currentYear = LocalDate.now().getYear();

        if (os == 0)
            if (yearDevice > currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        if (os == 1)
            if (yearDevice > currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
    }

    private static int deliveryDays(int deliveryDistance) {
        int deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
        }
        return deliveryDays;
    }
}
