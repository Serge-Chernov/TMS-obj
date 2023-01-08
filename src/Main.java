import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Matrix matrix = new Matrix();
        Traingle traingle = new Traingle();
        Min min = new Min();
        Max max = new Max();
        Odd odd = new Odd();
        Even even = new Even();
        Palindromes palindromes = new Palindromes();
        Sort sort = new Sort();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select an operation ('cal' - open calculator, 'mat' - initialize array from 1 to 100,\n" +
                " 'tr' - build a triangle,'min' - get the minimum value of an array, 'max' - get the maximum value of an array,\n" +
                "'odd' - get odd array elements, 'even' - get even array elements, 'pal' - get array palindrome numbers,\n" +
                "'sort' - array sorting.\n Given array - {1, 4, 1331, 65, 374, 223322, 43, 14, -54, 536}");
        String type = scanner.next();

        switch (type){
            case "cal":
                calculator.Calculate();
                break;
            case "mat":
                matrix.init();
                break;
            case "tr":
                traingle.init();
                break;
            case "min":
                min.init();
                break;
            case "max":
                max.init();
                break;
            case "odd":
                odd.init();
                break;
            case "even":
                even.init();
                break;
            case "pal":
                palindromes.init();
                break;
            case "sort":
                sort.init();
                break;

            default:
                System.out.println("Please, try again");
                return;
        }


    }
}