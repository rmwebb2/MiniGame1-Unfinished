package MiniGame1;

public class Exit {
    private String direction;
    private int destination;

    public Exit() {

    }

    public Exit(String direction, int destination) {
        this.direction = direction;
        this.destination = destination;
    }
    
    public String getDirection() {
        return direction;
    }

    public int getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return direction + " " + destination;
    }
}
