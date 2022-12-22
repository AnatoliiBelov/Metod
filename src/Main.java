import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printCheckLeapYear();
        printMassageMassageDownload();
        printMassageDelivery();
    }


    public static boolean checkLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    public static void printCheckLeapYear() {
        System.out.println("Задача 1");
        int year = 1900;
        if (checkLeapYear(year)) {
            System.out.println(year + " — високосный год");
        } else System.out.println(year + " — невисокосный год");
        System.out.println();
    }

    public static String checkMobileOS(int mobileOS) {

        if (mobileOS == 0) {
            return "IOS";
        } else if (mobileOS == 1) {
            return "Android";
        } else return "ошибка";
    }

    public static String checkMobileYear(int mobileYear) {
        int currentYear = LocalDate.now().getYear();
        if (mobileYear < currentYear) {
            return "облегченную";
        } else if (mobileYear == currentYear) {
            return "обычную";
        } else return "ошибка";
    }

    public static void printMassageMassageDownload() {
        System.out.println("Задача 2");
        int mobileOS = 1;
        int mobileYear = 2029;
        if (checkMobileYear(mobileYear) == "ошибка" || checkMobileOS(mobileOS) == "ошибка") {
            System.out.println("ОС или год выпуска телефона введен некорректно");

        } else
            System.out.println("Установите " + checkMobileYear(mobileYear) + " версию приложения для " + checkMobileOS(mobileOS) + " по ссылке");
        System.out.println();
    }

    public static String checkDistance(int distance) {
        if (distance < 20) {
            return "1 сутки";
        } else if (distance >= 20 && distance < 60) {
            return "2ое суток";
        } else if (distance >= 60 && distance <= 100) {
            return "3ое суток";
        } else return "Доставки нет";
    }

    public static void printMassageDelivery() {
        System.out.println("Задача 3");
        int distanceToAdress = 150;
        if (checkDistance(distanceToAdress) == "Доставки нет") {
            System.out.println("Доставки нет");

        } else System.out.println("Потребуется суток: " + checkDistance(distanceToAdress));
    }
}