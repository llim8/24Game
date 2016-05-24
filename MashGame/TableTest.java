import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TableTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TableTest
{
    /**
     * Default constructor for test class TableTest
     */
    public TableTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    //This is testing whether or not the table Algorithm() method works as intended
    //A scenario was created with generic names and outcomes for any random number should be tested
    @Test
    public void testTable1()
    {
        Option c1o1, c1o2, c1o3, c1o4, c2o1, c2o2, c2o3, c2o4, c3o1, c3o2, c3o3, c3o4;
        Category category1, category2, category3;

        Option final1, final2, final3, final4;
        MASH mash = new MASH();
        category1 = new Category("category1");
        category2 = new Category("category2");
        category3 = new Category("category3");
        c1o1= new Option("c1o1");
        c1o2= new Option("c1o2");
        c1o3= new Option("c1o3");
        c1o4= new Option("c1o4");
        c2o1= new Option("c2o1");
        c2o1= new Option("c2o2");
        c2o1= new Option("c2o3");
        c2o1= new Option("c2o4");
        c3o1= new Option("c3o1");
        c3o1= new Option("c3o2");
        c3o1= new Option("c3o3");
        c3o1= new Option("c3o4");
        Dice d = new Dice();
        int num = d.Generate();
        Table t = new Table(category1, category2, category3);
        int[] fate = t.Algorithm(num); //the outcome table generates
        int[] trueFate= new int[4]; //the true outcome
        
        if (num==2)

        {
            trueFate[0]=0;
            trueFate[1]=0;
            trueFate[2]=0;
            trueFate[3]=0;
            assertArrayEquals(trueFate,fate);

        }
        else if (num==3)
        {
            trueFate[0]=3;
            trueFate[1]=3;
            trueFate[2]=1;
            trueFate[3]=0;
            assertArrayEquals(trueFate,fate);
            
        }
        else if (num==4)
        {
            trueFate[0]=1;
            trueFate[1]=2;
            trueFate[2]=2;
            trueFate[3]=0;
            assertArrayEquals(trueFate,fate);
            
        }
        else if (num==5)
        {
            trueFate[0]=2;
            trueFate[1]=2;
            trueFate[2]=3;
            trueFate[3]=1;
            assertArrayEquals(trueFate,fate);
            
        }
        else if (num==6)
        {
            trueFate[0]=2;
            trueFate[1]=2;
            trueFate[2]=1;
            trueFate[3]=1;
            assertArrayEquals(trueFate,fate);
            
        }
        else if (num==7)
        {
            trueFate[0]=3;
            trueFate[1]=3;
            trueFate[2]=2;
            trueFate[3]=2;
            assertArrayEquals(trueFate,fate);
            
        }
        else if (num==8)
        {
            trueFate[0]=0;
            trueFate[1]=0;
            trueFate[2]=1;
            trueFate[3]=0;
            assertArrayEquals(trueFate,fate);
            
        }
        else if (num==9)
        {
            trueFate[0]=3;
            trueFate[1]=0;
            trueFate[2]=1;
            trueFate[3]=2;
            assertArrayEquals(trueFate,fate);
            
        }
        else if (num==10)
        {
            trueFate[0]=0;
            trueFate[1]=3;
            trueFate[2]=0;
            trueFate[3]=1;
            assertArrayEquals(trueFate,fate);
            
        }
        else if (num==11)
        {
            trueFate[0]=2;
            trueFate[1]=0;
            trueFate[2]=1;
            trueFate[3]=3;
            assertArrayEquals(trueFate,fate);
            
        }
        else
        {
            trueFate[0]=0;
            trueFate[1]=1;
            trueFate[2]=2;
            trueFate[3]=3;
            assertArrayEquals(trueFate,fate);
            
        }
    }
}


