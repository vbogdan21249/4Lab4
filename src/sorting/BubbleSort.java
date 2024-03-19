package sorting;

import java.util.List;

/**
 * Bubble Sort implementation of ISortingAlgorithm.
 * @param <T> the type of elements to be sorted
 */
public class BubbleSort<T extends Comparable<T>> implements ISortingAlgorithm<T> {
    @Override
    public void sort(List<T> data) {
        int n = data.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data.get(j).compareTo(data.get(j + 1)) > 0) {
                    T temp = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
            }
        }
    }
}
