import java.util.*;
class A{
    public static void main(String []ars){
        ArrayList<String> list=new ArrayList<String>();
        list.add("mango");
        list.add("bamanana");
        list.add("vb");
        Iterator itr=list.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();
        for(String s:list){
            System.out.print(s+" ");
        
        }
    }
}