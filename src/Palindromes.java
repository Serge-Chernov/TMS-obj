public class Palindromes {
    public void init(){
        int[] arr = {1, 4, 1331, 65, 374, 223322, 43, 14, -54, 536};

        String[] strarr = new String[arr.length];
        System.out.print("Palindrome: ");
        for (int i = 0; i < arr.length; i++) {

            strarr[i] = String.valueOf(arr[i]);
            StringBuffer buffer = new StringBuffer(strarr[i]);
            buffer.reverse();
            String rev = buffer.toString();

            if (strarr[i].equals(rev)) {
                System.out.print(strarr[i] + " ");
            }
        }
        System.out.println(" ");
    }
}
