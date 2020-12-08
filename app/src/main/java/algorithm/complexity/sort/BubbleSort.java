package algorithm.complexity.sort;

public class BubbleSort implements Sort{
    public int[] sort(int[] originArray) {

        int[] array = originArray.clone();

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }

    @Override
    public String getComplexity() {
        return "O(n^2)";
    }

    @Override
    public String getType() {
        return "Bubble Sort";
    }
}
