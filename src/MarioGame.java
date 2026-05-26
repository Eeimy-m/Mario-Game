public class MarioGame {
    private int score;

    private MarioState marioState;

    public MarioGame() {
        this.score = 0;
    }

    public void takeMysteryBox() {

    }

    public void takeFlower() {
        marioState.takeFlower();
    }

    public void takeMushroom() {
        marioState.takeMushroom();
    }

    public void takeFeather() {
        marioState.takeFeather();
    }

    public void takeDamage() {
        marioState.takeDamage();
    }

    public void nextState(MarioState state) {

    }

    public void incrementScore() {

    }

    public boolean isDone() {
        return true;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
