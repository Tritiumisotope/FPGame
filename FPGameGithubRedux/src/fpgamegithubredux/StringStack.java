package fpgamegithubredux;

public class StringStack {
    private Boolean emptyStack;
    private String[] elements;
    private int size;
    
    public StringStack() {
        size = 0;
        elements = new String[4];
    }
    public void push(String item) {
        emptyStack= false;
        ensureCapacity(size + 1);
        elements[size] = item;
        size++;
    }
        
    private void ensureCapacity(int newSize) {
        String[] newBiggerArray;
        if (elements.length < newSize) {
            newBiggerArray = new String[elements.length * 2];
            System.arraycopy(elements, 0, newBiggerArray, 0, size);
            elements = newBiggerArray;
        }
    }
    public String peek() {
        if (size == 0) {
            emptyStack = true;
        }
        return elements[size - 1];
    }
        
    public String pop() {
        if (size == 0) {
            emptyStack = true;
        }
        return elements[--size];
    }
    public Boolean isEmpty(){
        return emptyStack;
    }
      
}
