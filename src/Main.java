import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        System.out.println("Please choose your party affiliation [D, R or I]");
        menuChoice = in.nextLine();
        if (menuChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if (menuChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (menuChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Man");
        }
        else
            System.out.println("You chose Other");
    }
}