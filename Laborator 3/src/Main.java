import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Node v1 = new Computer("C1","135.234.135.254",500);
        Node v2 = new Computer("C2","175.234.135.251",250);
        Node v3 = new Computer("C3","535.234.131.734",1000);
        Node v4 = new Router("R1", "535.234.131.734");
        Node v5 = new Switch("S1");
        Node v6 = new Switch("S2");

        v1.setCost(v2,10); v1.setCost(v3,50);
        v2.setCost(v3,20); v2.setCost(v4,20); v2.setCost(v5,20);
        v3.setCost(v4,10);
        v4.setCost(v5,30); v4.setCost(v6,10);
        v5.setCost(v6,20);


        Network network = new Network();
        network.addNodes(v1,v2,v3,v4,v5,v6);
        network.sortNodes();

        for(int i=0; i<network.getNodes().size(); i++){
            Node cost = network.getNodes().get(i);
            System.out.println(cost);
        }

    }
}
