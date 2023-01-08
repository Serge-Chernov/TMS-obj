import java.util.Arrays;

public class Sort {
    public void init(){
        int[] arr = {1, 4, 1331, 65, 374, 223322, 43, 14, -54, 536};

        Arrays.sort(arr);

        for (int values : arr) {
            System.out.print(values + " ");
        }
    }
}
