import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter<T> implements Iterator<T> {

    private Enumeration<T> enumeration;

    public IteratorAdapter(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }
    
    @Override
    public boolean hasNext() {
        return this.enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return this.enumeration.nextElement();
    }
    
}
