import java.awt.*;

public class WhiteTiger extends Critter{
    private boolean infected;

    public WhiteTiger() {
        this.infected = false;
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


    public Color getColor() {
        return Color.WHITE;
    }

    public String toString() {
        return this.infected ? "TGR" : "tgr";
    }
}
