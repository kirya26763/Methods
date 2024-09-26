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

    public static int calculatedDeliveryDistance(int deliveryDistance) {
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

    public static void printSeparator() {
        System.out.println("++++++++");
        System.out.println("--------");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] issuesByMouths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMouths.length; i++) {
            printIssues(issuesByMouths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMouths);
        printIssues(total);

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
        int i = calculatedDeliveryDistance(deliveryDistance);
        if (i == 0) {
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + i);
        }
    }
}