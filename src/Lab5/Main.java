package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Object> objects = new ArrayList<>();

        System.out.println("Введите сначала кол-во предметов, а после их объём и ценность:");
        long number_of_items = in.nextLong();
        for (long i = 0; i < number_of_items; i++)
        {
            Object temporary_obj = new Object(in.nextLong(), in.nextLong());
            objects.add(temporary_obj);
        }
        for (Object obj : objects)
        {
            obj.printObject();
        }

        in.close();
    }
}