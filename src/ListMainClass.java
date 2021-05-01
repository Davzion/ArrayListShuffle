import java.util.ArrayList;
import java.util.Collections;

public class ListMainClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListOfIntegers = new ArrayList();
        arrayListOfIntegers.set(1,1);
        arrayListOfIntegers.set(2,2);
        arrayListOfIntegers.set(3,3);
        arrayListOfIntegers.add(5);

        arrayListOfIntegers.contains(2);
        arrayListOfIntegers.set(5,6);
        arrayListOfIntegers.retainAll(arrayListOfIntegers);
        arrayListOfIntegers.remove(5);


        System.out.println(arrayListOfIntegers);
        Collections.shuffle(arrayListOfIntegers);
        System.out.println(arrayListOfIntegers);
    }
}
