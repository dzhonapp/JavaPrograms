/**
 * Created by bma on 12/21/17.
 */
public class GameEntry {

    private String name;
    private int score;

    public GameEntry(String n, int sc) {
        this.name = n;
        this.score = sc;

    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    public void setName (String n) {
        name = n;
    }
    public void setScore(int sc) {
        score = sc;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + score + ")";
    }
}
