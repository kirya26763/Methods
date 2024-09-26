public class Main {
    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkDevice(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int checkDeliveryDistance(int deliveryDistance) {
        int day = 0;
        if (deliveryDistance > 100) {
            day = 0;
        } else if (deliveryDistance <= 20) {
            day = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = 3;
        }
        return day;
    }

    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int year = 2000;
        checkYear(year);
        //Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        int clientOS = 0;
        checkDevice(clientOS, clientDeviceYear);
        //Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 60;
        int days = checkDeliveryDistance(deliveryDistance);
        if (days == 0) {
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }
}