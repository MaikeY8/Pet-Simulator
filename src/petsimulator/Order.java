
/** Required package class namespace */
package petsimulator;

/**
 * Abstract class with methods and variables required for a pet order to take
 * place.
 * 
 * @author Wen Pei (Michael) Yan
 * @since May 2023
 */
public abstract class Order {
    
    protected int orderNumber;      // Protected variable
    
    /**
     * Mutator method allowing the user to set the price of the order.
     * 
     * @param Price the price of the dog(s)
     */
    public abstract void setPrice(double Price);
    
    /**
     * Accessor method allowing the user to see the price of the order
     * 
     * @return the price of the order
     */
    public abstract double getPrice();
    
}
