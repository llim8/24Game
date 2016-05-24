import java.util.*;
/**
 * Table class creates a table of 4 different categories that is to be displayed in MashRunner class
 *  
 */
public class Table
{
    // instance variables - replace the example below with your own
    private Category[] Categories = new Category[4];
    int[] res = new int[4];
    public Table(Category a, Category b, Category c) // constructor for Table class
    {
        Categories[0]=new MASH();
        Categories[1]=a;
        Categories[2]=b;
        Categories[3]=c;
    }

    public int[] Algorithm(int numb) //Returns the indices depending on the random number generated
    {
        
        if (numb==2)
            
        {
            int[] res = {0,0,0,0}; // format {index for category 0, category 1, category 2, category 3}
            return res;
        }
        else if (numb==3)
        {
            int[] res = {3,3,1,0};
            return res;
        }
        else if (numb==4)
        {
            int[] res = {1,2,2,0};
            return res;
        }
        else if (numb==5)
        {
            int[] res = {2,2,3,1};
            return res;
        }
        else if (numb==6)
        {
            int[] res = {2,2,1,1};
            return res;
        }
        else if (numb==7)
        {
            int[] res = {3,3,2,2};
            return res;
        }
        else if (numb==8)
        {
            int[] res = {0,0,1,0};
            return res;
        }
        else if (numb==9)
        {
            int[] res = {3,0,1,2};
            return res;
        }
        else if (numb==10)
        {
            int[] res = {0,3,0,1};
            return res;
        }
        else if (numb==11)
        {
            int[] res = {2,0,1,3};
            return res;
        }
        else
        {
            int[] res = {0,1,2,3};
            return res;
        }
        
    }

}






