package algorithm.complexity;

public class LinearSearch implements Search{
    public int find(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String getComplexity() {
        return "O(n)";
    }

    @Override
    public String getType() {
        return "Linear search";
    }
}
