package ru.netology;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOne {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Молоко", "Творог", "Ряженка", "Масло сливочное", "Сыр с плесенью",
                "Сырок плавленный \"Дружба\""};
        int[] prices = {90, 120, 95, 420, 2600, 150};
        String volume = "литр";
        String weigth = "килограмм";
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals("Молоко") || products[i].equals("Ряженка")) {
                System.out.println(i + 1 + ". " + products[i] + " по цене " + prices[i] + " рублей за " + volume);

            } else {
                System.out.println(i + 1 + ". " + products[i] + " по цене " + prices[i] + " рублей за " + weigth);
            }

        }
        int[] purchase = new int[products.length];
        int count = 0;
        int productNumber = 0;
        int productCount = 0;
        while (true) {
            System.out.println("Введите товар и количество или введите \"end\"");
            String input = scanner.nextLine( );
            if (input.equals("end")) {
                System.out.println("Наименование товара   Количество  Цена  Общая стоимость");
                for (int i = 0; i < purchase.length; i++) {
                    if (purchase[i] != 0) {
                        System.out.println(products[i] + " " + purchase[i] + " " + prices[i] + " " + purchase[i] * prices[i]);
                    }
                }
                System.out.println("Итого " + count);
                break;
            }
            int tmp[] = calculatingPurchase(input);
            productNumber = tmp[0];
            productCount = tmp[1];
            purchase[productNumber - 1] += productCount;

            count += prices[productNumber - 1] * productCount;
        }


    }

    public static int[] calculatingPurchase(String input) {
        String[] s = input.split(" ");
        int[] tmp = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            int c = Integer.parseInt(s[i]);
            tmp[i] = c;
            if (c >= 0) {
                tmp[i] = c;
            } else {
                System.out.println("Номер товара или количество не может быть меньше 1");
                System.out.println( );
                tmp[i] = 1;
            }
        }
        return tmp;

    }


}

