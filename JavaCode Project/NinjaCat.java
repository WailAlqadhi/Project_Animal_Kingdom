import java.awt.*;

public class NinjaCat extends Tiger {

    public boolean infected;

    public NinjaCat() {
        infected = false;
    }

    public Color getColor() {
        if (infected) {
            return Color.MAGENTA;
        } else {
            return Color.orange;
        }

    }


    public String toString() {
        if (infected) {
            return "NC";
        } else {
            return "nc";
        }
    }

    public Action getMove(CritterInfo info) {
        //Same as a Tiger
        if (info.getFront()==Neighbor.OTHER){
            this.infected = true;
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.WALL||info.getRight()==Neighbor.WALL){
            return Action.LEFT;
        } else if (info.getFront()==Neighbor.SAME){
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}