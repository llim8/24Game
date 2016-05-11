import java.util.*;
/**
 * MASH CLASS is a child of Category class, because MASH itself is a category and has options under it
 * Creates a MASH category and adds options
 * 
 */
public class MASH extends Category
{
    // instance variables - replace the example below with your own
    private List<Option> boi = new ArrayList<Option>();
    
    /**
     * Constructor of MASH
     */
    public MASH()
    {
        super("M.A.S.H");
        boi.add(new Option("Mansion"));
        boi.add(new Option("Apartment"));
        boi.add(new Option("Shack"));
        boi.add(new Option("House"));
    }

    /**
     * RETURNS CATEGORY 
     */
    public String getCategory()
    {
        return "M.A.S.H";
    }
}
