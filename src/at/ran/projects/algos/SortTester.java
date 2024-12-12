package at.ran.projects.algos;

public class SortTester {
    private Algorithm algorithm;

    public SortTester(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public int[] test(int[] data) {
        int[] sortedData = algorithm.sort(data);
        return sortedData;
    }

}
