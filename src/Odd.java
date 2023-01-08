public class Odd {
    public void init(){
        int[] arr = {1, 4, 1331, 65, 374, 223322, 43, 14, -54, 536};

        for (int odd: arr) {
            if (odd%2!=0) {
                System.out.println(odd);
            }
        }
    }
}
