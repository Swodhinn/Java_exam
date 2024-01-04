import models.Order;
import models.Tshirt;

public class Main {
    public static void main(String[] args) {
        //models are already imported
        //defining the array size below
        String[] size=new String[]{"X","XL","M","S"};
        //putting values in tshirt1,2,3 respectively
        Tshirt tshirt1=new Tshirt("Gorkhali Batman","Graphic text: You either die a hero or live long enough to see yourself be a villain",
                1235, size,"572Brand: Karuna");
        Tshirt tshirt2=new Tshirt("ACDC","Graphic Text: Let there be Rock",1400,size,"HTHbrand: Rock");
        Tshirt tshirt3=new Tshirt("Nirvana","Graphic Text: Nevermind",1350,size,"HSBbrand: Grunge");
        //tshirt details are printed below for the user to see
        System.out.println("Welcome to Juju Tees Feel free to Browse Our Exclusive Tees\n");
        tshirt1.TShirtbill();
        System.out.println("\n");
        tshirt2.TShirtbill();
        System.out.println("\n");
        tshirt3.TShirtbill();
        System.out.println("\n");

        //the order details are filled and the final bill with VAT and total is returned
        Order order1=new Order("Swodhin Bhandari","9846055844",new int[]{1,2,3},new double[]{1235,1400,1350});
        order1.finalbill();
    }
}