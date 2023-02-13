package MiniGame1;

import java.util.ArrayList;

public class Rooms {
    private String roomNum;
    private String roomName;
    ArrayList<String> roomDescription;
    //private boolean isVisited;
    ArrayList<Exit> exits; //maybe don't need?

    public Rooms(String roomNum, String roomName, ArrayList<String> roomDescription, ArrayList<Exit> exits) {
        this.roomNum = roomNum;
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        //this.isVisited = false;
        this.exits = exits;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public ArrayList<String> getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(ArrayList<String> roomDescription) {
        this.roomDescription = roomDescription;
    }

    public ArrayList<Exit> getExits() {
        return exits;
    }

    public void setExits(ArrayList<Exit> exits) {
        this.exits = exits;
    }

}
