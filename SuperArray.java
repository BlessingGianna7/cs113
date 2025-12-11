public interface SuperArray {

  // Returns the number of elements in the collection
  public int size();

  // Returns true if the collection contains no elements
  public boolean isEmpty();

  // Adds an element to the collection
  public void add(String element);

  // Removes an element from the collection
  public boolean remove(String element);

  // Removes all elements from the collection
  public void clear();

  // Returns true if the collection contains the specified element
  public boolean contains(String element);

  // Create a string representation
  public String toString();
}
