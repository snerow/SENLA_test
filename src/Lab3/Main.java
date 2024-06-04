package Lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите предложение русским текстом: ");
        Lab3_Vowels s_number = new Lab3_Vowels(in.nextLine());
        s_number.printWordsAndVowels();
        s_number.printAllVowels();
        System.out.println("\nОтсортированные слова (по убыванию кол-ва гласных):");
        s_number.sortedWords();
        System.out.println("\nПредложение с заглавной первой гласной в словах:");
        s_number.firstCapitalVowel();

        in.close();
    }
}