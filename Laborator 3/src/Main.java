import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Node computer1 = new Computer("C1","135.234.135.254",500);
        Node computer2 = new Computer("C2","175.234.135.251",250);
        Node computer3 = new Computer("C3","535.234.131.734",1000);
        Node router = new Router("R1");
        Node switch1 = new Switch("S1");
        Node switch2 = new Switch("S2");
        Node switch3 = new Switch("S3");

        Network network = new Network();
        network.addNodes(computer1,computer2,computer3,router,switch1,switch2,switch3);
        network.sortNodes();

        System.out.println(network);
    }
}
