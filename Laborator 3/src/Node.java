import java.util.HashMap;
import java.util.Map;

public abstract class Node implements Comparable<Node> {
    private String name;
    private final Map<Node, Integer> cost = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Node otherNode) {
        return this.name.compareTo(otherNode.name);
    }

    public Map<Node, Integer> getCost() {
        return cost;
    }

    public void setCost(Node node, int value) {
        cost.put(node, value);
    }


    @Override
    public String toString() {
        return "Node : " + "name = '" + name + '\'' + ' ' + '\n';
    }

}
