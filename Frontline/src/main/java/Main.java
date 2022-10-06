import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        First first = new First();
        //int[] input = {1,2,3,2,10,1,2,3,4,5};
        int[] input = {1,2,3,4,5,6,9,10,2,10};
       //int[] input = {5, 6, 3, 0, 7, 8, 9, 1, 2};
       Arrays.stream(first.monotoneIncArray(input)).forEach(System.out::println);

        System.out.println("<------------------>>");
        Second second = new Second();
        second.printTree(new ArrayList<>(){
            {
                add("1.2.3");
                add("1.2.5");
                add("1.5.6");
                add("1.2.4");
                add("2.5.6");
                add("1.5.7");
                add("2.5.3");
            }
        });

    }
}
