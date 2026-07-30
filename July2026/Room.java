package July2026;

class House{
    // variables 
    int roomnum;
    int windowNum;
    String color;
    boolean hasAc;
    int door;


    // methods 
    void openDoor(){
        System.out.println("Door is open");
    }

    void cleanRoom(){
        System.out.println("The room is clean");
    }


}
public class Room {
    public static void main(String[] args){

        House obj = new House();
        obj.cleanRoom();
        obj.openDoor();

    }
}
