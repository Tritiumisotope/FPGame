package fpgamegithubredux;

public class CharStack{
	private Boolean emptyStack;
    private char[] elements;
    private int size;
 
    public CharStack() {
        size = 0;
        elements = new char[4];
    }
    public void push(char item) {
        emptyStack= false;
	    ensureCapacity(size + 1);
	    elements[size] = item;
	    size++;
	}
	 
	private void ensureCapacity(int newSize) {
	    char newBiggerArray[];
	    if (elements.length < newSize) {
	        newBiggerArray = new char[elements.length * 2];
	        System.arraycopy(elements, 0, newBiggerArray, 0, size);
	        elements = newBiggerArray;
	    }
    }
    public char peek() {
	    if (size == 0) {
	        emptyStack = true;
	    }
	    return elements[size - 1];
	}
	 
	public char pop() {
	    if (size == 0) {
	        emptyStack = true;
	    }
	    return elements[--size];
	}
}
