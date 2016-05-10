import java.util.*;
public class Category
{
    private String name;
    private List<Option> boi = new ArrayList<Option>();
    public Category(String noo)
    {
        name = noo;
    }
    public String getCategory()
    {
        return name;
    }
    public void setCategory(String s)
    {
        name=s;
    }
}