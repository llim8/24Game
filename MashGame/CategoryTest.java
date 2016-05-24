

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Creates a category with options and tests it by removing and getting options
 */
public class CategoryTest
{
    private Category t1, t2, t3, t4;   
    private Option Shoe, Share, Shirt, Shart;
    private Option Aile, Ailee, Aim, Aye;
    private Option Amaze, Ammeter, Amp, Amputate;
    private Option Lid, Liar, Liedown, Lip;
    
    /**
     * Default constructor for test class CategoryTest
     * Creates new categories and options
     */
    public CategoryTest()
    {
        t1 = new Category("SHIRLEY");
        Shoe = new Option("shoe");
        Share = new Option("share");
        Shirt = new Option("shirt");
        Shart = new Option("shart");
        
        t2 = new Category("AILEEN");
        Aile = new Option("aile");
        Ailee = new Option("ailee");
        Aim = new Option("aim");
        Aye = new Option("aye");
        
        t3 = new Category("AMARA");
        Amaze = new Option("amaze");
        Ammeter = new Option("ammeter");
        Amp = new Option("amp");
        Amputate = new Option("amputate");
        
        t4 = new Category("LYDIA");
        Lid = new Option("lid");
        Liar = new Option("liar");
        Liedown = new Option("liedown");
        Lip = new Option("lip");
        
        t1.addOptions(Shoe, Share, Shirt, Shart);
        t2.addOptions(Aile, Ailee, Aim, Aye);
        t3.addOptions(Amaze, Ammeter, Amp, Amputate);
        t4.addOptions(Lid, Liar, Liedown, Lip);
    }
    
    public void setUp()
    {
    }

    /**
     * 
     */
    @After
    public void tearDown()
    {        
    }
    
    @Test
    public void TestGetOption() //tests the getOption method from category class
    {
        assertEquals(Shart, t1.getOption(3)); 
        assertEquals(Aim, t2.getOption(2));
        assertEquals(Ammeter, t3.getOption(1));
        assertEquals(Lid, t4.getOption(0));
    }
    
    @Test
    public void TestRemoveOption() //tetst the removeOptions method from category class
    {
        assertEquals(Shart, t1.removeOptions(3)); 
        assertEquals(Aim, t2.removeOptions(2));
        assertEquals(Ammeter, t3.removeOptions(1));
        assertEquals(Lid, t4.removeOptions(0));
    }
}



