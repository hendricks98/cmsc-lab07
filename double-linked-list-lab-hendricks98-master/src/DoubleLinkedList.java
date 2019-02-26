
public class DoubleLinkedList<T> implements ListInterface<T> {
	private DoubleLinkedNode first;
	private DoubleLinkedNode last;
	private int numElements;

	public DoubleLinkedList() {
		
	}

	/** Adds a new entry to the end of this list.
            Entries currently in the list are unaffected.
            The list's size is increased by 1.
            @param newEntry  The object to be added as a new entry. 
	 */
	@Override
	public void add (T newEntry) {	

	}

	 /** Adds a new entry at a specified position within this list.
       		Entries originally at and above the specified position
       		are at the next higher position within the list.
       		The list's size is increased by 1.
       		@param newPosition  	An integer that specifies the desired
                           		position of the new entry.
       		@param newEntry     	The object to be added as a new entry.
       		@throws  		IndexOutOfBoundsException if either
                			newPosition < 1 or newPosition > getLength() + 1. 
	*/
	@Override
	public void add (int newPosition, T newEntry) {
		
	}

	/** Removes the entry at a given position from this list.
       		Entries originally at positions higher than the given
       		position are at the next lower position within the list,
       		and the list's size is decreased by 1.
       		@param givenPosition  	An integer that indicates the position of
                             		the entry to be removed.
      	 	@return  A reference to the removed entry.
       		@throws  IndexOutOfBoundsException if either 
                		givenPosition < 1 or givenPosition > getLength().
	*/
	@Override
	public T remove (int givenPosition) {
		return null;
		}


	/** Removes all entries from this list. 
	*/
	@Override
	public void clear () {

	}

	/** Replaces the entry at a given position in this list.
    		@param givenPosition  	An integer that indicates the position of
                          		the entry to be replaced.
    		@param newEntry  	The object that will replace the entry at the
                     			position givenPosition.
    		@return  The original entry that was replaced.
    		@throws  IndexOutOfBoundsException if either
             		givenPosition < 1 or givenPosition > getLength(). 
     	*/
	@Override
	public T replace (int givenPosition, T newEntry) {
		return null;
	}

	/** Retrieves the entry at a given position in this list.
       		@param givenPosition  An integer that indicates the position of
                             the desired entry.
       		@return  A reference to the indicated entry.
       		@throws  IndexOutOfBoundsException if either
                givenPosition < 1 or givenPosition > getLength(). 
	*/
	@Override
	public T getEntry (int givenPosition) {
		if ((givenPosition >= 1) && (givenPosition <= numElements))	{
			assert !isEmpty();
			return getNodeAt(givenPosition).getData();
		}
		else
			throw new IndexOutOfBoundsException("Illegal position given to getEntry operation.");
	}

	/** Retrieves all entries that are in this list in the order in which
       		they occur in the list.
       		@return  A newly allocated array of all the entries in the list.
                If the list is empty, the returned array is empty. 
	*/
	@Override
	public T[] toArray() {
		return null;
	}

	/** Sees whether this list contains a given entry.
       		@param anEntry  The object that is the desired entry.
       		@return  True if the list contains anEntry, or false if not. 
	*/
	@Override
	public boolean contains (T anEntry) {
		return false;
	}

	/** Gets the length of this list.
    		@return  The integer number of entries currently in the list. 
	 */
	@Override
	public int getLength() {
		return -1;
	}

	/** Sees whether this list is empty.
       		@return  True if the list is empty, or false if not. 
	*/
	@Override
	public boolean isEmpty() {
		return false;
	}

	// Initializes the class's data fields to indicate an empty list.
	private void initializeDataFields()  {
		first = null;
		last = null;
		numElements = 0;
	} 

	public DoubleLinkedNode getFirst() {
		return first;
	}

	public DoubleLinkedNode getLast() {
		return last;
	}

	// Returns a reference to the node at a given position.
	// Precondition: The chain is not empty;
	//               1 <= givenPosition <= numberOfEntries.	
	 DoubleLinkedNode getNodeAt(int givenPosition)	{
		assert !isEmpty() && (1 <= givenPosition) && (givenPosition <= numElements);
		DoubleLinkedNode currentNode = first;

		// Traverse the chain to locate the desired node
		// (skipped if givenPosition is 1)
		for (int counter = 1; counter < givenPosition; counter++)
			currentNode = currentNode.getNextNode();

		assert currentNode != null;

		return currentNode;
	} 

	
	 class DoubleLinkedNode{
		private T data;  	 
		private DoubleLinkedNode next;  	 // Link to next node
		private DoubleLinkedNode previous;       // Link to previous node

		private DoubleLinkedNode(T dataPortion){
			data = dataPortion;
			next = null;	
			previous = null;	
		}
		private DoubleLinkedNode(T dataPortion, DoubleLinkedNode nextNode, DoubleLinkedNode previousNode){
			data = dataPortion;
			next = nextNode;	
			previous = previousNode;
		} 

		 T getData(){
			return data;
		} 

		private void setData(T newData){
			data = newData;
		} 

		 DoubleLinkedNode getNextNode(){
			return next;
		} 

		private void setNextNode(DoubleLinkedNode nextNode){
			next = nextNode;
		} 

		 DoubleLinkedNode getPreviousNode(){
			return previous;
		}

		private void setPreviousNode(DoubleLinkedNode previousNode){
			previous = previousNode;
		}
	}
}
