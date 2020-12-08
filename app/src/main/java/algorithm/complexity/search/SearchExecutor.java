package algorithm.complexity.search;

import algorithm.complexity.search.Search;

public class SearchExecutor {
    private Search search;

    public SearchExecutor(Search linearSearch) {
        this.search = linearSearch;
    }

    public void search(int value, int[] array) {
        long startTime = System.nanoTime();
        int result =  search.find(value, array);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("--------------------------------------------------");
        System.out.println("---" + search.getComplexity());
        System.out.println("---" + search.getType() + " result:   " + result);
        System.out.println("---" + search.getType() + " duration: " + (double)duration/1000000+ "ms");
        System.out.println("--------------------------------------------------");
    }
}
