package racinggame2;

public class Position {
    private int position;

    public Position () {
        this.position = 0;
    }

    public Position (int val) {
        this.position = val;
    }

    public int getPosition() {
        return this.position;
    }

    public void move(int val) {
        if (checkMove(val)) {
            this.position++;
        }
    }

    public boolean checkMove (int val) {
        if (val > 4) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return ""+position;
    }
}
