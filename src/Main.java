import sorting.*;
import java.util.ArrayList;

/**
 * Client class to demonstrate the usage of SortableContainer.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(5);
        integerArrayList.add(3);
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(4);

        SortableContainer<Integer> integerContainer = new SortableContainer<>(integerArrayList);

        integerContainer.setSortingAlgorithm(new BubbleSort<>());
        integerContainer.sort();
        integerContainer.displayList();

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("e");
        stringArrayList.add("c");
        stringArrayList.add("a");
        stringArrayList.add("b");
        stringArrayList.add("d");

        SortableContainer<String> stringContainer = new SortableContainer<>(stringArrayList);
        stringContainer.setSortingAlgorithm(new QuickSort<>());
        stringContainer.sort();
        stringContainer.displayList();

    }
}