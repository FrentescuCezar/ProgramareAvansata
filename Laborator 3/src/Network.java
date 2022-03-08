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
        for(int i = 0 ;i<listOfNodes.length;i++)
            nodes.add(listOfNodes[i]);
    }

    public void sortNodes() {
        Collections.sort(this.nodes);
    }

    @Override
    public String toString() {
        return "Network{" + "nodes= \n " + nodes + '}';
    }
}