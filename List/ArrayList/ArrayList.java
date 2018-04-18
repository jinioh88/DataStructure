package ArrayList;



public class ArrayList implements ArrayListable{

  private Object data[] = new Object[100];
  private int size = 0;
  
  @Override
  public boolean add_last(Object o) {
    data[size] =  o;
    size++;
    
    return true;
  }
  @Override
  public boolean add_first(Object o) {
    return add(0,o);
  }
  @Override
  public boolean add(int index, Object e) {
    for(int i=size-1;i>=index;i--) {
      data[i+1] = data[i];
    }
    data[index] = e;
    size++;
    
    return true;
  }
  @Override
  public boolean remove(int index) {
    for(int i=index+1;i<size-1;i++) {
      data[i-1] = data[i];
    }
    size--;
    data[size] = null;
    
    return true;
  }
  @Override
  public boolean remove_last() {
    return remove(size-1);
  }
  @Override
  public boolean remove_first() {
    return remove(0);
  }
  @Override
  public Object get(int index) {
    return data[index];
  }
  @Override
  public int size() {
    return size;
  }
  @Override
  public int indexOf(Object e) {
    for(int i=0; i<size;i++) {
      if(e.equals(data[i])) {
        System.out.println("데이터 일치");
        return i;
      }
    }
    return -1;
  }
  
  @Override
  public String toString() {
    String text = "[";
    for (int i = 0; i < size; i++) {
      text += data[i];
      if(i< size-1)
        text += ",";
    }
    return text + "]";
  }
  
  private void resize(int newSize) {
    Object[] t = new Object[newSize];  // 동적으로 배열 t생성
    for(int i=0;i<size;i++) {
      t[i] = a[i];
    }
    a = (E[])t;
  }
  
}
