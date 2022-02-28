
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    private String shape;
    private int number; //For simplicity the number 1 will represent the Ace, 13 the king, 12 the queen, and 11 the jack
    public Card()
    {
        //Set shape to "Hearts"
        //Set number to 9
        shape = "Hearts";
        number = 9;
    }
    public Card(String newShape, int newNumber)
    {
        //Set shape and number to newShape and newNumber
        shape = newShape;
        number = newNumber;
    }
    
    public void setShape(String newShape)
    {
        //Set shape to newShape
        shape = newShape;
        number = 0;
    }
    
    public void setNumber(int newNumber)
    {
        //Set number to newNumber
        number = newNumber;
    }
    
    public String getShape()
    {
        //return the shape variable
        return shape;
    }
    
    public int getNumber()
    {
        //return the number variable
        return number;
    }
    
    public String toString(){
        return (getNumber() + " of " + getShape());
    }
}
