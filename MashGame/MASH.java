import java.util.*;
/**
 * MASH CLASS
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
        boi.add(Option(Mansion));
        boi.add(Option(Apartment));
        boi.add(Option(Shack));
        boi.add(Option(House));
    }

    /**
     * RETURNS CATEGORY 
     */
    public String getCategory()
    {
        return "M.A.S.H";
    }
}
