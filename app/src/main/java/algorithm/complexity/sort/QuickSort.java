package algorithm.complexity.sort;

public class QuickSort implements Sort{
    @Override
    public int[] sort(int[] inputArray) {

        int[] array = inputArray.clone();
        int low = 0;
        int high = array.length-1;

        sort(array, low, high);

        return array;
    }

    private void sort(int[] array, int low, int high) {
        if (low < high) {

            int pivot = partition(array, low, high);

            sort(array, low, pivot-1);
            sort(array, pivot+1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low-1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                //swap
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        //swap
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }

    @Override
    public String getComplexity() {
        return "O (n log n)";
    }

    @Override
    public String getType() {
        return "Quick Sort";
    }
}
