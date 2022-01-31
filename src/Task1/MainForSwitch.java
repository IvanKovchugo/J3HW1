package Task1;

import java.util.Arrays;

public class MainForSwitch {

    public static void main(String[] args) {
        Integer[] arr = {1,5,7,6, 5123,125};
            swap(arr, 2, 5);
        System.out.println(Arrays.toString(arr));
    }

    public static <T> void  swap(T[] arr, int index1, int index2) {
        T o = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = o;

    }
}
