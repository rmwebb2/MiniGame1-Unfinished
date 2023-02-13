package MiniGame1;

import java.util.ArrayList;

public class Player {
    private String name;
    private int location;

    public Player() {
    }

    public Player(String name, int location) {
        this.name = "Player";
        this.location = 0;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void move(String direction, ArrayList<Rooms> room) {
        ArrayList<Exit> exits = room.get(location).getExits();
        direction = direction.toLowerCase();
        //Rooms current = room.get(location);

        for (Exit ex : exits) {
            if (ex.getDirection().equalsIgnoreCase(direction)) {
                setLocation(ex.getDestination());
            }
        }

    }
}

