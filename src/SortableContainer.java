import sorting.ISortingAlgorithm;
import java.util.List;

/**
 * Container class for sorting elements of some type T with a specified sorting algorithm.
 * @param <T> the type of elements to be contained and sorted
 */
public class SortableContainer<T> {
    private final List<T> data;
    private ISortingAlgorithm<T> sortingAlgorithm;

    /**
     * Constructs a SortableContainer with the specified data.
     * @param data the data to be contained and sorted
     */
    public SortableContainer(List<T> data) {
        this.data = data;
    }

    /**
     * Sets the sorting algorithm to be used by this container.
     * @param sortingAlgorithm the sorting algorithm to be set
     */
    public void setSortingAlgorithm(ISortingAlgorithm<T> sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    /**
     * Displays the elements of the container.
     */
    public void displayList() {
        for (T t : data) {
            System.out.print(t + " ");
        }
    }

    /**
     * Sorts the elements of the container using the specified sorting algorithm.
     */
    public void sort() {
        if (sortingAlgorithm != null) {
            sortingAlgorithm.sort(data);
        }
    }
}
