import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5, 6, 2, 10, 2, 10};
        int n = input.length;
        Monotone monotone = new Monotone();
        int[] out = monotone.monotoneLongestIncSubArr(input, n);
        System.out.println("print Monotone sub Array from input in line 6");
        Arrays.stream(out).forEach(System.out::println);
        System.out.println("print length of sub Array");
        Arrays.stream(new int[]{out.length}).forEach(System.out::println);

        System.out.println("<------------------>>");
        int[] array = {1, 2, 3, 4, 5, 6, 2, 10, 2, 10};
        MontoneSubArray montoneSubArray = new MontoneSubArray();
        int[] response = montoneSubArray.monotoneIncArray(array);
        System.out.println("print Monotone sub Array from input in line 22");
        Arrays.stream(response).forEach(System.out::println);
        System.out.println("print length of sub Array");
        Arrays.stream(new int[]{response.length}).forEach(System.out::println);

        System.out.println("<------------------>>");
        System.out.println("print Tree structure for below");
        List<String> treeInput = new ArrayList<>();
        treeInput.add("1.2.3");
        treeInput.add("1.2.5");
        treeInput.add("1.5.6");
        treeInput.add("1.2.4");
        treeInput.add("2.5.6");
        treeInput.add("1.5.7");
        treeInput.add("2.5.3");
        System.out.println("Test case : tree: " + treeInput);
        Tree tree = new Tree();
        tree.addNodes(treeInput);
        tree.display();
    }
}
