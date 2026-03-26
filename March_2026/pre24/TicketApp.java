package March_2026.pre24;
import java.util.*;
class ticket{
    private int Id;
    private String Name;
    private double Price;
    public ticket(int Id , String Name, double Price){
        this.Id=Id;
        this.Name=Name;
        this.Price=Price;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getPrice() {
        return Price;
    }
    public void setPrice(double price) {
        Price = price;
    }

     @Override
    public String toString() {
        return " :- [  Id= " + Id + ", Name= " + Name + ", Price= " + Price + " ]";
    }

}

public class TicketApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ticket> tickets = Arrays.asList(
            new ticket(1,"movie",250.60),
            new ticket(2, "bus", 70.83),
            new ticket(3, "Train", 500),
            new ticket(4, "Flight", 5000),
            new ticket(5, "Concert", 1500),
            new ticket(6, "Metro", 50),
            new ticket(7, "Event", 800),
            new ticket(8, "Theater", 300),
            new ticket( 9,"Cricket Match", 2000),
            new ticket(10, "Museum", 200));
        System.out.print("Enter sreach Id of : ");

            int searchId = sc.nextInt();

            Optional<ticket> result = tickets.stream()
                    .filter(t-> t.getId()==searchId)
                    .findFirst(); 

            result.ifPresentOrElse(
                t -> System.out.println("Ticket Found "+ result.get()),
                () -> System.out.println("Not Found....")
            );
    }
}
