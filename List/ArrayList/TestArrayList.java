package ArrayList;

public class TestArrayList {

  public static void main(String[] args) {
   ArrayList list = new ArrayList();
   
   list.add_last(10);
   list.add_last(20);
   list.add_last(30);
   list.add(2, 50);
   list.add_first(1);
   System.out.println(list);
  }

}
