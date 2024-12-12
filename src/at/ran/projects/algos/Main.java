package at.ran.projects.algos;

public class Main {
    public static void main(String[] args) {

        Algorithm a1 = new BubbleSort();
        Algorithm a2 = new InsertSort();

        SortTester s = new SortTester(a1);
        s.test(new int[] { 4, 3, 1 });

        s.setAlgorithm(a2);
        
    }
}
