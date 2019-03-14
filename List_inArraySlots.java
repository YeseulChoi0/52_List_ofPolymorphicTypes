public class List_inArraySlots{
  private Object[] array;
  private int filledElements;
  private static final int INITIAL_CAPACITY = 10;

  public List_inArraySlots(){
    array = new Object[INITIAL_CAPACITY];
  }

  public int size() {
    return filledElements;
  }

  public String toString(){
    String s = "[";
    for (int i = 0; i < filledElements; i++){
      s += array[i];
    }
    return s + "]";
  }

  public boolean add(Object value){
    if (filledElements == array.length) expand();
    array[filledElements] = value;
    filledElements++;
    return true;
  }

  private void expand(){
    Object[] newArray = new Object[filledElements*2];
    for (int i = 0; i < filledElements; i++){
      newArray[i] = array[i];
    }
    array = newArray;
  }

  public Object get(int index){

  }

  public void set(int index, int value){

  }

  public int remove(int index){

  }
}
