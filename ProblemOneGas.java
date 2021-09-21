import java.util.*;


public class ProblemOneGas {
    public static void main(String[] args) {

       

        Scanner sc= new Scanner (System.in);
        System.out.println("How many liters do you need?");

        int liters =sc.nextInt();
        double lt= (liters*1.00);

        if(liters<1){

            System.out.println(liters+" is an Invalid Input");
            System.exit(0);

        }

        System.out.println("Enter the distance covered");

        int di =sc.nextInt();
        double dici= (di*1.00);

        if(di<1){
            System.out.println(di+" is an Invalid Input");
            System.exit(0);
        }

        double hundred = ((lt/dici)*100);

        System.out.println("Liters/100KM");
        System.out.println(hundred);

        double miles = (dici*0.6214);
        double gallons =(lt*0.2642);
        double mg = miles/gallons;

        System.out.println("Miles/gallons");
        System.out.println(hundred);




    }






}
