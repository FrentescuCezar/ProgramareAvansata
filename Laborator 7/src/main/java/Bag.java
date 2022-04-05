import java.util.*;


public class Bag {
    private final List<Tile> letters = new ArrayList<>();

    public Bag() {
        Random rand = new Random();
        for (char character = 'a'; character < 'z'; character++) {
            int points = rand.nextInt(10) + 1;
            for (int i = 0; i < 10; i++)
                letters.add(new Tile(character, points));
        }
    }

    public List<Tile> getLetters() {
        return letters;
    }

    public synchronized List<Tile> extractTiles(int howMany) {
        List<Tile> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (letters.isEmpty()) {
                break;
            }

            Random rand = new Random();
            int randomIndex = rand.nextInt(letters.size());
            extracted.add(letters.get(randomIndex));
            letters.remove(randomIndex);
        }
        return extracted;
    }


}