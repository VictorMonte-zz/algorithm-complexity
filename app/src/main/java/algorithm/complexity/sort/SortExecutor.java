package algorithm.complexity.sort;

import java.util.Arrays;

public class SortExecutor {
    private Sort sorter;

    public SortExecutor(Sort sorter) {
        this.sorter = sorter;
    }

    public void sort(int[] array) {
        long startTime = System.nanoTime();
        int[] result =  sorter.sort(array);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("--------------------------------------------------");
        System.out.println("--- " + sorter.getComplexity());
        System.out.println("--- " + sorter.getType() + " result:   " + Arrays.toString(result));
        System.out.println("--- " + sorter.getType() + " duration: " + (double)duration/1000000+ "ms");
        System.out.println("--------------------------------------------------");
    }
}
