package collectionstask;

import java.util.Collection;
import sun.java2d.SunGraphicsEnvironment;

/**
 *
 * @author Alex
 */
public class IteratorEachThird<T>{

    private Collection<T> collection;
    private T[] array;
    private int curPosition;

    public IteratorEachThird(Collection<T> collection) {
        this.collection = collection;
        this.array = (T[]) collection.toArray();
        this.curPosition = 0;
    }
    
    public boolean hasNext()
    {
        if (array.length == 0 || array.length - curPosition + 3 < 3)
        {
            return false;
        }
        return true;
    }
    
    public T next()
    {
        T t = array[curPosition];
        curPosition += 3;
        return t;
    }

    public void remove()
    {
        collection.remove(array[curPosition-3]);
    }
}
