import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class App {


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        RecordPlayer recordPlayer = new RecordPlayer();
        RecordAdapter recordAdapter = new RecordAdapter(recordPlayer);

        play(recordAdapter);

        List<String> stringList = new ArrayList<>();
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");

        Enumeration<String> enumerator = Collections.enumeration(stringList);
        Iterator<String> iterator = new IteratorAdapter<>(enumerator);

        doSomething(iterator);
    }

    public static void play(CDPlayer cdPlayer) {
        cdPlayer.playCD();
    }

    public static void doSomething(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
