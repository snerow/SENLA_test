package Lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Введите число: ");
            PrimeFactors s_number = new PrimeFactors(in.nextLong());
            System.out.println("\nПростые множители введённого числа: ");
            s_number.primeFactorsNumber();
        } catch (InputMismatchException e) {
            System.out.println("\nНеправильный ввод. Пожалуйста, введите целое число");
        }
        finally {
            in.close();
        }
    }
}