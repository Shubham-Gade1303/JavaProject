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

        House obj = new House();// object is real 
        House obj2 = new House();

        obj.color="white";
        obj.roomnum =1;
        obj.hasAc= true;
        obj.windowNum= 5;
        obj.cleanRoom();
        
        obj2.roomnum=5;
        obj2.color="offWhite";
        obj2.hasAc= false;
        obj2.windowNum=1;
obj.cleanRoom();




    }
}
