package Game;

import java.util.Random;

public class MarioGame {
    private int score;

    private MarioState marioState;

    public MarioGame() {
        this.score = 0;
        this.marioState = new Small(this);
    }

    public void takeMysteryBox() {
        Random random = new Random();

        switch (random.nextInt(4)) {
            case 0 -> takeFlower();
            case 1 -> takeMushroom();
            case 2 -> takeFeather();
            case 3 -> takeDamage();
        }
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

    public MarioState getMarioState() {
        return marioState;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setMarioState(MarioState marioState) {
        this.marioState = marioState;
    }
}
