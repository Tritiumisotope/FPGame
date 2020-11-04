package fpgamegithubredux;

public class NumStack {
    private Boolean emptyStack;
    private Number[] elements;
    private int size;
    
    public NumStack() {
        size = 0;
        elements = new Number[4];
    }
    public void push(Number item) {
        emptyStack= false;
        ensureCapacity(size + 1);
        elements[size] = item;
        size++;
    }
        
    private void ensureCapacity(int newSize) {
        Number[] newBiggerArray;
        if (elements.length < newSize) {
            newBiggerArray = new Number[elements.length * 2];
            System.arraycopy(elements, 0, newBiggerArray, 0, size);
            elements = newBiggerArray;
        }
    }
    public Number peek() {
        if (size == 0) {
            emptyStack = true;
        }
        return elements[size - 1];
    }
        
    public Number pop() {
        if (size == 0) {
            emptyStack = true;
        }
        return elements[--size];
    }
    public Boolean isEmpty(){
		return emptyStack;
	}
}
