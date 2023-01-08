import java.util.Arrays;

public class Matrix {
    public void init(){
        int array[][] = new int[20][5];
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = num++;
            }
        }
        System.out.println(Arrays.deepToString(array));    }
}
