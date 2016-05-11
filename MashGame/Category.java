/**
 * Category class creates a category and is able to add options under each category (options are instance variables)
 * 
 */

public class Category
{
    private String name = "";
    int i = 0;
    private String[] options = new String[4];
    public Category(String cat)
    {
        name = cat;
    }
    public String getCategory()
    {
        return name;
    }
    public void setCategory(String s)
    {
        name=s;
    }
    public void addOptions(String kitten)
    {
        while (i<5)
        {
            options[i] = kitten;
            i++;
        }
    }
    public void removeOptions(int index)
    {
        while (index < 5)
        {
            options[index] = null;
        }
    }
}