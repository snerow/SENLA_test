package Lab5;

import java.util.Scanner;
import java.util.ArrayList;

public class MyArrayList extends ArrayList {
    private ArrayList<Object> objects = new ArrayList<>();

    public void inputObjects()
    {
        Scanner in = new Scanner(System.in);

        long number_of_items = in.nextLong();
        for (long i = 0; i < number_of_items; i++)
        {
            Object temporary_obj = new Object(in.nextLong(), in.nextLong());
            this.objects.add(temporary_obj);
        }
        for (Object obj : this.objects)
        {
            obj.printObject();
        }
    }
}
