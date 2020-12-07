package algorithm.complexity;

public class BinarySearch implements Search{
    public int find(int value, int[] array) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    @Override
    public String getComplexity() {
        return "O(log n)";
    }

    @Override
    public String getType() {
        return "Binary search";
    }
}
