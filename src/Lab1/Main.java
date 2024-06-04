package Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите цифры, которые нужно просуммировать: ");
        SumNumbers s_string = new SumNumbers(in.nextLine());
        System.out.println("\nСумма введённых цифр:");
        System.out.println(s_string.sumNumbersInStr());

        in.close();
    }
}