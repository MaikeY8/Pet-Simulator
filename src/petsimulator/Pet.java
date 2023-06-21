
/** Required package class namespace */
package petsimulator;

/**
 * The pet interface laying out methods required for all pets.
 * 
 * @author Wen Pei (Michael) Yan
 * @since May 2023
 */
public interface Pet {
    
    /**
     * Mutator method allowing the user to set the name of the dog
     * 
     * @param name the name of the dog
     */
    void setName(String name);
    
    /**
     * Accessor method allowing the user to retrive the dogs name
     * 
     * @return the name of the dog
     */
    String getName();
    
    /**
     * Generates text for when the dog is sold with information about the sale
     * and the dog.
     * 
     * @return the sale information
     */
    String sold();
}
