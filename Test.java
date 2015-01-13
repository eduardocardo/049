
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
    
    /**
     * Metodo que saca por pantalla la suma de todos los numeros comprendidos entre
     * 0 y 10 ambos incluidos
     */
    public void sumValues()
    {
        int index=0;
        int cont = 0; // variable que acumula la suma de los numeros
        while(index<11)
        {
            cont = cont + index;
            index= index + 1;
        }
        System.out.println(cont);
    }
}
