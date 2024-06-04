package Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите числа, которые нужно просуммировать: ");
        Lab1_SumNumbers s_string = new Lab1_SumNumbers(in.nextLine());
        System.out.println("\nСумма введённых чисел:");
        System.out.println(s_string.sumNumbersInStr());

        in.close();
    }
}