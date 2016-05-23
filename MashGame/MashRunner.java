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
    private static Option final1, final2, final3, final4;
    private static MASH mash = new MASH();
    private static int num;
    private static int[] fate;
    private static int lon;
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
        System.out.println("Enter the fourth option for " + category3.getCategory());
        c3o4 = new Option(scan.nextLine());
        category3.addOptions(c3o1, c3o2, c3o3, c3o4);
        lon = category3.getLong();        

        System.out.println("Cool. This is your MASH Table");
        //initiates table
        Table table = new Table (category1, category2, category3);
        for (int i=0; i<lon; i++)
            System.out.print(" ");
        System.out.println("__M.A.S.H__");
        for (int i=0; i<lon - category3.getCategory().length(); i++)
            System.out.print(" ");
        System.out.println(category3.getCategory() + "|                    |" + category1.getCategory());
        for (int i=0;i<lon-c3o1.getOption().length();i++)
            System.out.print(" ");
        for (int i=0;i<lon-c3o2.getOption().length();i++)
            System.out.print(" ");
        for (int i=0;i<lon-c3o3.getOption().length();i++)
            System.out.print(" ");
        for (int i=0;i<lon-c3o4.getOption().length();i++)
            System.out.print(" ");

        //generates a random number with die
        Dice d = new Dice();
        num = d.Generate();
        System.out.println("Your random number is "+ num);        

        //Updates the table with the calculated fate
        fate = table.Algorithm(num);
        MashRunner.Result(fate[0],fate[1],fate[2],fate[3]);

        //Prints out result and stores it into arraylist
        System.out.println(MashRunner.Result(fate[0],fate[1],fate[2],fate[3]));
    }

    public static String Result(int ind0, int ind1, int ind2, int ind3)
    {
        ArrayList<String> results = new ArrayList<String>();
        final1 = mash.getOption(ind0);
        final2 = category1.getOption(ind1);
        final3 = category2.getOption(ind2);
        final4 = category3.getOption(ind3);
        results.add(final1.getOption());
        results.add(final2.getOption());
        results.add(final3.getOption());
        results.add(final4.getOption());
        String s = "\n Thank you for playing MASH! Here is your fate: \n";
        s=s+ "You will live in a " + results.get(0) + "\n";
        s=s+ "Future " + category1.getCategory() + ": " + results.get(1) + "\n";
        s=s+ "Future " + category2.getCategory() + ": " + results.get(2) + "\n";
        s=s+ "Future " + category3.getCategory() + ": " + results.get(3) + "\n";
        return s;
    }
}



