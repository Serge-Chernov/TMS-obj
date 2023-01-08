public class Traingle {
    public void init() {
        int[][] array2 = new int[5][5];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (j <= i) {
                    array2[i][j] = 1;
                    System.out.print(array2[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
