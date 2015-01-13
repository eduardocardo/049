
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Metodo que imprime por pantalla todos los multiplos de 5 comprendidos entre 10 y 95
     */
    public void multiplesOfFive()
    {
        int index = 15;
        while(index < 95)
        {
            System.out.println(index);
            index=index +5;
        }
        
    }
}
