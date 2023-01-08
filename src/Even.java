public class Even {
    public void init(){
        int[] arr = {1, 4, 1331, 65, 374, 223322, 43, 14, -54, 536};

        for (int even: arr) {
            if (even%2==0) {
                System.out.println(even);
            }
        }
    }
}
