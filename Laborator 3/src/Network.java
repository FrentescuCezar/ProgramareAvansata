import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Network {
    private final List<Node> nodes = new ArrayList<>();

    public List<Node> getNodes() {
        return nodes;
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addNodes(Node ... listOfNodes) {
        nodes.addAll(Arrays.asList(listOfNodes));
    }

    public void sortNodes() {
        Collections.sort(this.nodes);
    }

    @Override
    public String toString() {
        Collections.sort(nodes);
        return "Locations are: " + nodes ;

    }
}