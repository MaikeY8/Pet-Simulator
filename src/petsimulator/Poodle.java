
/** Required package class namespace */
package petsimulator;

/**
 * Poodle.java - represents a poodle by extending the dog class. Allows for the
 * pet to be sold.
 * 
 * @author Wen Pei (Michael) Yan
 * @since May 2023
 */
public class Poodle extends Dog{
    
    private static int poodlesSold = 0; // Encapsulated static property
    
    /**
     * Constructor method allowing the poodle to be sold with details of the
     * order.
     * 
     * @param name the name of the dog
     * @param orderNumber the order number
     */
    public Poodle(String name, int orderNumber) {
        poodlesSold++;               // Adds to the amount of total poodles sold
        sell(99.99, orderNumber);    // Calls the sell method to sell the dog
        super.setName(name);         // Sets the name of the dog
        System.out.println(sold());  // Displays the information of the sale
    }
    
    /**
     * Displays additional information with the total amount of poodles sold.
     * 
     * @return the sale information
     */
    @Override
    public String sold() {
        return super.sold() + "\tPoodles Sold: " + poodlesSold;
    }
}
