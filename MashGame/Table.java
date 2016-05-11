import java.util.*;
public class Table
{
    // instance variables - replace the example below with your own
    private Category[] Categories = new Category[4];

    
    public Table(String a, String b, String c, String d)
    {
        Categories[0]=new Category(a);
        Categories[1]=new Category(b);
        Categories[2]=new Category(c);
        Categories[3]=new Category(d);
    }

    
}
