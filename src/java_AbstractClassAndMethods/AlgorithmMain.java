package java_AbstractClassAndMethods;
public class AlgorithmMain {
    public static void main(String[] args) {
    	
        Algorithm sortingAlgorithm = new SortingAlgorithm();
        Algorithm SearchingAlgorithm = new SearchingAlgorithm();

        System.out.println("Running sorting algorithm:");
        sortingAlgorithm.solve();

        System.out.println("\nRunning searching algorithm:");
        SearchingAlgorithm.solve();
    }
}
