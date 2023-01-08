public class Max {
    public void init(){
        int[] arr = {1, 4, 1331, 65, 374, 223322, 43, 14, -54, 536};

        int max = arr[0];

        for (int i: arr) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
