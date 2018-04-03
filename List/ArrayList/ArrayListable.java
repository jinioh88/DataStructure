
import java.util.Iterator;

public interface ArrayListable {
  public boolean add_last(Object o);
  public boolean add_first(Object o);
  public boolean add(int index, Object e);
  public String toString();
  public boolean remove(int index);
  public boolean remove_last();
  public boolean remove_first();
  public Object get(int index); 
  public int size();
  public int indexOf(Object e);
  
}
