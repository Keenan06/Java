package lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        String[] nums = {"one", " two", "three"};

        List<String> theList = Arrays.asList(nums);
        System.out.println(theList);

        ArrayList<String> arrayList = new ArrayList<>(theList);
//        arrayList.removeIf()

theList.replaceAll(s->s.toUpperCase());
        System.out.println(theList);
        arrayList.replaceAll(s -> s.toUpperCase());
        System.out.println(arrayList);


        theList.replaceAll( s->s.toUpperCase());
        theList.removeIf(s -> s.equals("TWO"));
    }
}
