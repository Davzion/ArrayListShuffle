import java.util.ArrayList;
import java.util.Collections;

public class ListMainClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListOfIntegers = new ArrayList();
        arrayListOfIntegers.add(1);
        arrayListOfIntegers.add(2);
        arrayListOfIntegers.add(3);
        arrayListOfIntegers.add(4);

        System.out.println(arrayListOfIntegers);
        Collections.shuffle(arrayListOfIntegers);
        System.out.println(arrayListOfIntegers);
    }
}
