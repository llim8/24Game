import java.util.*;
/**
 * MASH CLASS is a child of Category class, because MASH itself is a category and has options under it
 * Creates a MASH category and adds options
 * 
 */
public class MASH extends Category
{
    // instance variables - replace the example below with your own
    private final Option[] boi = new Option[4];
    
    /**
     * Constructor of MASH
     */
    public MASH()
    {
        super("M.A.S.H");
        boi[0] = new Option("Mansion");
        boi[1] = new Option("Apartment");
        boi[2] = new Option("Shack");
        boi[3] = new Option("House");
    }
}




