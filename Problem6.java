import java.util.Scanner;


public class Problem6 {
    public static void main(String[] args) {
        System.out.println("Pick the Number of the Month");
        Scanner sc = new Scanner(System.in);
        int season = sc.nextInt();
        if (season<=0 || season >12){
            System.out.println("Invalid");
        }
        else if (season >= 1 && season <= 3 || season ==12) {
            System.out.println("Winter");
        }
        else if (season >= 6 && season <= 8) {
            System.out.println("Summer");
        }
        else if (season >= 3 && season <= 5) {
            System.out.println("Spring");
        }
        else if (season >=9 && season <= 11) {
            System.out.println("Autumn");
        }

        }
    }

