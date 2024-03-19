package sorting;

import java.util.List;

/**
 * Interface defining a sorting algorithm.
 * @param <T> the type of elements to be sorted
 */
public interface ISortingAlgorithm<T> {
    /**
     * Sorts the given list using a specific sorting algorithm.
     * @param data the list to be sorted
     */
    void sort(List<T> data);
}
