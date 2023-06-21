
/** Required package class namespace */
package petsimulator;

/**
 * Sale class where transaction of pet occurs, extends the Order class.
 * 
 * @author Wen Pei (Michael) Yan
 * @since May 2023
 */
public class Sale <T> extends Order{
    
    private T saleItem;     // Encapsulated generic property
    
    private double price;   // Encapsulated double property
    
    /**
     * Constructor method allowing the user to begin a sale by setting the order
     * number.
     * 
     * @param saleItem the item type being sold
     * @param orderNumber the order number
     */
    public Sale(T saleItem, int orderNumber) {
        super.orderNumber = orderNumber;
    }

    /**
     * Mutator method allowing the user to set the price of the order.
     * 
     * @param price the price of the dog
     */
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Accessor method allowing the user to see the price of the order
     * 
     * @return the price of the order
     */
    @Override
    public double getPrice() {
        return price;
    }
    
    /**
     * Accessor method allowing the user to see the order number
     * 
     * @return the order number
     */
    public int getOrderNumber() {
        return orderNumber;
    }
}
