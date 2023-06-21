
/** Required package class namespace */
package petsimulator;

/**
 * Dog.java - represents a dog by implementing the pet interface. Has a name and
 * with modifier and accessor methods. Methods to sell the dog and track its
 * sale.
 * 
 * @author Wen Pei (Michael) Yan
 * @since May 2023
 */
public class Dog implements Pet{
    
    private String name;            // Encapsulated name propety

    private Sale sale;              // Encapsulated Sale propety
    
    /**
     * Mutator method allowing the user to set the name of the dog
     * 
     * @param name the name of the dog
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Accessor method allowing the user to retrive the dogs name
     * 
     * @return the name of the dog
     */
    @Override
    public String getName() {
        return name;
    }
    
    /**
     * Allows for the sale of a dog, with the price and order number parameters.
     * Instantiates a new sale class with the price and order number. Sets the
     * price of the dog.
     * 
     * @param price
     * @param orderNumber 
     */
    public void sell(double price, int orderNumber) {
        sale = new Sale(this, orderNumber);
        sale.setPrice(price);
    }

    /**
     * Generates text for when the dog is sold with information about the sale
     * and the dog.
     * 
     * @return the sale information
     */
    @Override
    public String sold() {
        return "Order Number: " + sale.getOrderNumber() 
                + "\tName: " + name + "\tPrice: " + sale.getPrice();
    }
    
}
