public class Min {
    public void init(){
        int[] arr = {1, 4, 1331, 65, 374, 223322, 43, 14, -54, 536};

        int min = arr[0];

        for (int i: arr) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
