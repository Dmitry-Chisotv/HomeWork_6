import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class main {

    //Разработать программу, имитирующую поведение коллекции HashSet.
    // В программе содать метод add добавляющий элемент, и метод позволяющий выводить эллементы коллекции в консоль.
    // Формат данных Integer.

    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJ = new Object();

    public static void main(String[] args) {
        add(13);
        add(31);
        add(45);
        add(34);
        add(9);
        add(54);
        add(13);
        add(7);
        remove(34);

        System.out.println(hMap);
        System.out.println(hMap.keySet());
    }

    public static void add (Integer numbers) {
        hMap.put(numbers, OBJ);
    }

    public static void remove (Integer numbers) {
        hMap.remove(numbers);
    }
}
