import java.util.ArrayList;
import java.util.List;

public class Player {
    private String userName;
    private List<Integer> gameScores;

    public Player(String userName) {
        this.userName = userName;
        this.gameScores = new ArrayList<>();
    }

    public void addScore(int score) {
        gameScores.add(score);
    }

    public int compareTo(Player out) {
        return 0;
    }
}
