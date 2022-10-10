import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class TreeTest {

    Tree tree = null;

    @Before
    public void before() {
        tree = new Tree();
    }

    @Test
    public void testCase_1() {
        System.out.println("Test case : when list is empty");
        List<String> input = new ArrayList<>();
        Tree tree = new Tree();
        tree.addNodes(input);
        tree.display();
    }

    @Test
    public void testCase_2() {
        List<String> input = new ArrayList<>();
        input.add("1.2.3.4");
        System.out.println("Test case : single node tree: " + input);
        Tree tree = new Tree();
        tree.addNodes(input);
        tree.display();
    }

    @Test
    public void testCase_3() {
        List<String> input = new ArrayList<>();
        input.add("2.3.5.8");
        input.add("1.2.3.4");
        input.add("1.2.5.6");
        System.out.println("Test case : tree: " + input);
        Tree tree = new Tree();
        tree.addNodes(input);
        tree.display();
    }

    @Test
    public void testCase_4() {
        List<String> input = new ArrayList<>();
        input.add("1.2.3");
        input.add("1.2.5");
        input.add("1.5.6");
        input.add("1.2.4");
        input.add("2.5.6");
        input.add("1.5.7");
        input.add("2.5.3");
        System.out.println("Test case : tree: " + input);
        Tree tree = new Tree();
        tree.addNodes(input);
        tree.display();
    }

    @Test
    public void test_NullPointerException() {
        tree = new Tree();
        assertThrows(NullPointerException.class, () ->
                tree.addNodes(null));
    }

    @Test
    public void test_IllegalArgumentException() {
        tree = new Tree();
        assertThrows(
                IllegalArgumentException.class,
                () -> tree.addNodes(new ArrayList<String>(Collections.singleton("s"))));

    }
}
