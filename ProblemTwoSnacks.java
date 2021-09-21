import java.util.Scanner;

public class ProblemTwoSnacks {

    public static void main(String[] args) {
        int totalprice;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of pizzas bought:");

        int pizza = sc.nextInt();
        System.out.print("Enter the number of puffs bought:");

        int puffs = sc.nextInt();
        System.out.print("Enter the number of cool drinks bought:");

        int coolDrinks = sc.nextInt();


        System.out.println("Total");
        System.out.println("Pizza:"+pizza);
        System.out.println("Puffs:"+puffs);
        System.out.println("Cooldrinks:"+coolDrinks);
        totalprice = pizza + puffs + coolDrinks;
        System.out.println("Total price=" +totalprice);
         pizza = pizza*100;
         puffs = puffs*20;
         coolDrinks =coolDrinks*10;





    }
}
