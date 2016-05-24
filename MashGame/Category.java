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

    public String getCategory() //returns Category name as a String
    {
        return name;
    }

    public void setCategory(String s) //sets the category name
    {
        name=s;
    }

    public void addOptions(Option kitten, Option dog, Option turtle, Option giraffe) //adds options under category
    {      
        options[0] = kitten;    
        options[1] = dog;
        options[2] = turtle;
        options[3] = giraffe;
    }

    public Option removeOptions(int index) //removes options under category with given index
    {
        if (index < 4)
        {
            Option x = options[index];
            options[index] = null;
            return x;
        }
        return null;
    }

    public Option getOption(int index) //returns option under category with given index
    {
        return options[index];
    }

    public int getLong() //returns the length of the longest option name
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





