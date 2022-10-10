import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Node {

    int value;
    Map<Integer, Node> children = new TreeMap<>();
    int level;

    /**
     *
     * It is a constructor.
     *
     * @param value  The value to put in the list.
     * @param level  The level of the element in list.
     */
    public Node(int value, int level) {
        this.value = value;
        this.level = level;
    }

    public Map<Integer, Node> getChildren() {
        return this.children;
    }

    /**
     *
     * It is a constructor.
     *
     * @param value  The value to put in the list.
     * @param level  The level of the element in list.
     */
    public Node addChild(int value, int level) {
        Node node;
        if (children.containsKey(value)) {
            node = children.get(value);
        } else {
            node = new Node(value, level);
            children.put(value, node);
        }
        return node;
    }

    public void print() {
        display(this);
    }

    private void display(Node node) {
        IntStream stream = IntStream.range(0, node.level);
        stream.forEach(x ->
                System.out.print("--"));
        System.out.println(node.value);
        node.getChildren()
                .entrySet()
                .stream()
                .forEach(child ->
                        display(child.getValue()));

    }
}

class Tree {
    private Map<Integer, Node> nodes = new TreeMap<>();

    public Map<Integer, Node> getNodes() {
        return this.nodes;

    }

    /**
     *
     * It is a constructor.
     *
     * @param list  the list
     */
    public void addNodes(List<String> list) {
        list.stream()
                .map(inputRecord -> Arrays.stream(inputRecord.split("\\."))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())).forEach(arr -> addNode(arr));
    }

    /**
     *
     * It is a constructor.
     *
     * @param lsElement  the ls element
     */
    private void addNode(List<Integer> lsElement) {
        Node node;
        Integer firstElement = lsElement.get(0);
        if (nodes.containsKey(firstElement)) {
            node = nodes.get(firstElement);
        } else {
            node = new Node(firstElement, 0);
            nodes.put(firstElement, node);
        }
        for (int i = 1; i < lsElement.size(); i++) {
            node = node.addChild(lsElement.get(i), i);
        }
    }
    public void display() {
        this.nodes.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .forEach(Node::print);

    }
}



