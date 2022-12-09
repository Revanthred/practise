import java.util.*;
class A{
    public static void main(String []ars){
        LinkedList<String> list=new LinkedList<String>();
        list.addFirst("ga");
        list.addFirst("waste ");
        list.addFirst("rey");
        list.addFirst(" rahul ");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(3);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        
        
        
    }
}