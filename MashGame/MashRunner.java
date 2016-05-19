import java.util.*;
/**
 * Write a description of class MashRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MashRunner
{
    private static Option c1o1, c1o2, c1o3, c1o4, c2o1, c2o2, c2o3, c2o4, c3o1, c3o2, c3o3, c3o4;
    private static Category category1, category2, category3;
    private static String hello = "";
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        //First category input
        System.out.println("Welcome to M.A.S.H");
        System.out.println("Please enter in a category");
        category1 = new Category(scan.nextLine());
        System.out.println("Enter the first option for " + category1.getCategory());
        c1o1 = new Option(scan.nextLine());
        System.out.println("Enter the second option for " + category1.getCategory());
        c1o2 = new Option(scan.nextLine());
        System.out.println("Enter the third option for " + category1.getCategory());
        c1o3 = new Option(scan.nextLine());
        System.out.println("Enter the fourth option for " + category1.getCategory());
        c1o4 = new Option(scan.nextLine());
        category1.addOptions(c1o1, c1o2, c1o3, c1o4);

        //Second category input
        System.out.println("Please enter in a second category");
        category2 = new Category(scan.nextLine());
        System.out.println("Enter the first option for " + category2.getCategory());
        c2o1 = new Option(scan.nextLine());
        System.out.println("Enter the second option for " + category2.getCategory());
        c2o2 = new Option(scan.nextLine());
        System.out.println("Enter the third option for " + category2.getCategory());
        c2o3 = new Option(scan.nextLine());
        System.out.println("Enter the fourth option for " + category2.getCategory());
        c2o4 = new Option(scan.nextLine());
        category2.addOptions(c2o1, c2o2, c2o3, c2o4);

        //Third category input
        System.out.println("Please enter in a third category");
        category3 = new Category(scan.nextLine());
        System.out.println("Enter the first option for " + category3.getCategory());
        c3o1 = new Option(scan.nextLine());
        System.out.println("Enter the second option for " + category3.getCategory());
        c3o2 = new Option(scan.nextLine());
        System.out.println("Enter the third option for " + category3.getCategory());
        c3o3 = new Option(scan.nextLine());
        System.out.println("Enter the fourth option for " + category3.getCategoy());
        c3o4 = new Option(scan.nextLine());
        category3.addOptions(c3o1, c3o2, c3o3, c3o4);

        System.out.println("Cool. This is your MASH Table");
        //initiates table
        Table table = new Table (category1, category2, category3);

        System.out.print(" ");
        System.out.println("__M.A.S.H__");
        for (

        //generates a random number with die
        Dice d = new Dice();
        private int num = d.Generate();
        System.out.println("Your random number is "+ num);        

        //Updates the table with the calculated fate
        private int[] fate = table.Algorithm(num);

        
        //Prints out result and stores it into arraylist

        System.out.println(MashRunner.Result());
    }

    public static String Result(int ind0, int ind1, int ind2, int ind3)
    {
        ArrayList<String> results = new ArrayList<String>();

    }
}


