package Lab5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Object> objects = new ArrayList<>();
        objects.add(new Object("Gold", 1, 600));
        objects.add(new Object("MacBook", 2, 5000));
        objects.add(new Object("IPhone", 4, 3500));
        objects.add(new Object("Documents", 2, 40000));
        objects.add(new Object("Ring", 1, 500));

        SafeDeposit safe = new SafeDeposit(8);
        System.out.println("Все предметы (название, объём, ценность):");
        safe.makeAllSets(objects);
        safe.printAllObjects(objects);
        System.out.println("\n\nВ сейфе (название, объём, ценность):");
        safe.printBestObjects();
        System.out.println("\nЛучшая ценность в сейфе: " + safe.getBestPrice());
    }
}