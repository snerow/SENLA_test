package Lab5;

import java.util.ArrayList;
import java.util.List;

public class SafeDeposit {

    private List<Object> bestObjects = null;

    private int volume;
    private int bestPrice;

    SafeDeposit(int volume) {
        this.volume = volume;
    }

    public int getBestPrice() {
        return bestPrice;
    }

    //вычисляет общий вес набора предметов
    private double calcVolume(List<Object> objects) {
        double result = 0;
        for (Object item : objects) {
            result += item.getVolume();
        }
        return result;
    }

    // вычисляет общую стоимость набора предметов
    private int calcPrice(List<Object> objects) {
        int result = 0;
        for (Object item : objects) {
            result += item.getPrice();
        }
        return result;
    }

    //проверка, является ли данный набор лучшим решением задачи
    private void checkSet(List<Object> objects) {
        if (this.bestObjects == null) {
            if (this.calcVolume(objects) <= this.volume) {
                this.bestObjects = objects;
                this.bestPrice = this.calcPrice(objects);
            }
        } else {
            if (this.calcVolume(objects) <= this.volume && this.calcPrice(objects) > this.bestPrice) {
                this.bestObjects = objects;
                this.bestPrice = this.calcPrice(objects);
            }
        }
    }

    //создание всех наборов перестановок значений
    public void makeAllSets(List<Object> objects) {
        if (objects.size() > 0) {
            this.checkSet(objects);
        }
        for (int i = 0; i < objects.size(); i++) {
            List<Object> newSet = new ArrayList<>(objects);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

    public void printBestObjects() {
        for (int i = 0; i < this.bestObjects.size(); i++) {
            System.out.println("- " + this.bestObjects.get(i).getName() + " " +
                                this.bestObjects.get(i).getVolume() + " " +
                                this.bestObjects.get(i).getPrice() + " ");
        }
    }

    public void printAllObjects(List<Object> objects) {
        for (Object obj : objects)
        {
            System.out.println("- " + obj.getName() + " " + obj.getVolume() + " " + obj.getPrice());
        }
    }
}