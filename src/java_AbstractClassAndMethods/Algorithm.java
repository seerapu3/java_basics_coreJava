package java_AbstractClassAndMethods;

abstract class Algorithm {
    abstract void solve();
    
    void analyze() {
        System.out.println("Analyzing the algorithm.");
    }
}

class SortingAlgorithm extends Algorithm {
    @Override
    void solve() {
        System.out.println("Solving sorting algorithm.");
    }
}

class SearchingAlgorithm extends Algorithm {
    @Override
    void solve() {
        System.out.println("Solving searching algorithm.");
    }
}
