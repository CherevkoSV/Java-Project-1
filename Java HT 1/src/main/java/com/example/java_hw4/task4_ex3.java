package com.example.java_hw4;
import java.util.Scanner;
import static java.lang.Math.pow;

public class task4_ex3 {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        double creditSum = getCreditSum ("Загальна сума кредиту: ");
        double monthProcent = getMonthProcent ("Місячний відсоток на залишок по кредиту: ");

        int type = getType("Обрати один з двух варіантів:" +
                "\n 1 - Розрахувати кількість щомісячних платежів, які необхідно зробити для повного погашення кредиту;" +
                "\n 2 - Розрахувати суму щомісячного платежу;");

        if (type == 1) {
            double monthFee = getMonthFee("Введіть суму щомісячного взносу: ");
            printInt(getMounthQuantityPayment(creditSum, monthProcent, monthFee), "Кількість місяців");
        }

        if (type == 2) {
            int paymentQuantity = getPaymentQuantity("Введіть кількість платежів: ");
            printDouble(annuityPayment(creditSum, monthProcent, paymentQuantity),"Сума щомісячного платежу");
        }
    }

    private static double getCreditSum(String title) {
        System.out.println(title);
        return SCANNER.nextDouble();
    }

    private static double getMonthProcent(String title) {
        System.out.println(title);
        return SCANNER.nextDouble();
    }

    private static int getType(String title) {
        System.out.println(title);
        return SCANNER.nextInt();
    }

    private static double getMonthFee(String title) {
        System.out.println(title);
        return SCANNER.nextDouble();
    }

    private static int getPaymentQuantity(String title) {
        System.out.println(title);
        return SCANNER.nextInt();
    }

    private static int getMounthQuantityPayment(double creditSum, double monthProcent, double monthFee){
        int months = 1;
        double temp = creditSum;
        while (temp > monthFee) {
            temp = temp - monthFee;
            temp = temp + (temp/100 * monthProcent);

            if (months> 50 * 12) {
                System.out.println("Йоосип! ти шо дурак такий відсоток брати!?");
                break;
            }

            months++;
        }
        return months;
    }

    public static double annuityPayment(double creditSum, double monthProcent, int paymentQuantity) {
        double annuityPayment = (creditSum * ((monthProcent/100)/12) / (1 - pow(1 + ((monthProcent/100)/12), -paymentQuantity)));
        return annuityPayment;
    }


    private static void printInt(int intToDisplay, String titleToPrint) {
        System.out.println(titleToPrint + ": " + intToDisplay);
    }

    private static void printDouble(double amountMonthPayment, String titleToPrint) {
        System.out.println(titleToPrint + ": " + amountMonthPayment);
    }
}
