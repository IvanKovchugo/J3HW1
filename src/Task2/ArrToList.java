package Task2;

import java.util.Arrays;
import java.util.List;

public class ArrToList {
    public static void main(String[] args) {
        Integer[] arr = {214, 623, 753, 84};
        List<Integer> list = convertToList(arr);
        System.out.println(list.getClass() + " " + list);
    }

    public static <T> List<T> convertToList(T[] arr) {
        return Arrays.asList(arr);
    }
}
