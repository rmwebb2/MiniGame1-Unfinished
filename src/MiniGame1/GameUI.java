package MiniGame1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameUI {
    private static ArrayList<Rooms> rooms;

    public static void main(String[] args) {
        rooms = new ArrayList<Rooms>();
        //Player player = new Player();
        Scanner input = new Scanner(System.in);

        ArrayList<Rooms> rooms = new ArrayList<>();
        File roomFile = new File("src/MiniGame1/Rooms.txt");  //will fix this so it doesn't come through source


        try {
            Scanner readFile = new Scanner(roomFile);

            while (readFile.hasNext()) {

                String roomNum = readFile.nextLine();
                System.out.println(roomNum);
                String roomName = readFile.nextLine();                               
                System.out.println(roomName);
                ArrayList<String> roomDescription = new ArrayList<>();
                ArrayList<Exit> exits = new ArrayList<>();
                
                Rooms room = new Rooms(roomNum, roomName, roomDescription, exits);
                String line = readFile.nextLine();  //reading the File to read the room and adding the descriptions into roomDescription arraylist
                while (!line.equals("----------")) { 
                    room.roomDescription.add(line);
                    line = readFile.nextLine();
                }
                System.out.println(room.roomDescription);


                while (readFile.hasNextLine() && !(line = readFile.nextLine()).equals("----------")) {
                    //String[] info = line.split(" ");
                    String direction = line.split(" ")[0];   //splitting the direction (e.g."SOUTH") & destination
                    int destination = Integer.parseInt(line.split(" ")[1]);
                    exits.add(new Exit(direction, destination)); //adding direction and destination to exits arraylist

                }

                room.setExits(exits);
                rooms.add(new Rooms(roomNum, roomName, roomDescription, exits)); //adding each description into rooms arraylist
                System.out.println(room.getExits()); //getting exits

            }

            readFile.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found. Try another file name.");
            e.printStackTrace();
        }

    }
}

