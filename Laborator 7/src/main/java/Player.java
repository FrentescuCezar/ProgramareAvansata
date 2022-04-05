import java.util.List;

public class Player implements Runnable {
    private String name;
    private Game game;
    private boolean running;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    private boolean submitWord() {
        List<Tile> extracted = game.getBag().extractTiles(7);
        if (extracted.isEmpty()) {
            return false;
        }
        //create a word with all the extracted tiles;
        //game.getBoard().addWord(this, word);
        //make the player sleep 50ms;
        return true;
    }


    public void run() {
        //implement the run method;
    }

}
