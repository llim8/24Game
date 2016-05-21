/**
 * Category class creates a category and is able to add options under each category (options are instance variables)
 * 
 */

public class Category
{
    private String name = "";
    private int i = 0;
    private Option[] options = new Option[4];
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

    public void addOptions(Option kitten, Option dog, Option turtle, Option giraffe)
    {      
        options[0] = kitten;    
        options[1] = dog;
        options[2] = turtle;
        options[3] = giraffe;
    }

    public Option removeOptions(int index)
    {
        if (index < 4)
        {
            Option x = options[index];
            options[index] = null;
            return x;
        }
        return null;
    }

    public Option getOption(int index)
    {
        return options[index];
    }

    public int getLong()
    {
        int lo = 0;
        for (int i = 0; i<4; i++)
        {
            if (options[i].getOption().length() > lo)
                lo = options[i].getOption().length();
        }
        if (name.length() > lo)
            lo = name.length();
        return lo;
    }

}



