package collectionstask;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);       
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2234);
        list.add(234);
        list.add(212);
        list.add(21);
        list.add(23);
        list.add(24);
        IteratorEachThird<Integer> iter = new IteratorEachThird<Integer>(list);
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
