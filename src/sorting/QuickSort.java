package sorting;

import java.util.List;

/**
 * Quick Sort implementation of ISortingAlgorithm.
 * @param <T> the type of elements to be sorted
 */
public class QuickSort<T extends Comparable<T>> implements ISortingAlgorithm<T> {
    @Override
    public void sort(List<T> data) {
        quickSort(data, 0, data.size() - 1);
    }

    private void quickSort(List<T> data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
    }

    private int partition(List<T> data, int low, int high) {
        T pivot = data.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (data.get(j).compareTo(pivot) < 0) {
                i++;
                T temp = data.get(i);
                data.set(i, data.get(j));
                data.set(j, temp);
            }
        }
        T temp = data.get(i + 1);
        data.set(i + 1, data.get(high));
        data.set(high, temp);
        return i + 1;
    }
}
