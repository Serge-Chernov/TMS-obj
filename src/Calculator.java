import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Calculator {

    public void Calculate(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        String snum1 = scanner.next();

        System.out.println("Enter the second number");
        String snum2 = scanner.next();

        System.out.println("Enter an arithmetic operation ('sum' for addition, 'sub' for subtraction, 'mul' for multiplication, 'div' for division.");
        String type = scanner.next();

        BigDecimal num1 = new BigDecimal(snum1);
        BigDecimal num2 = new BigDecimal(snum2);
        BigDecimal result;

        switch (type){
            case "sum":
                result = num1.add(num2);
                break;
            case "sub":
                result = num1.subtract(num2);
                break;
            case "mul":
                result = num1.multiply(num2);
                break;
            case "div":
                result = num1.divide(num2, 14, RoundingMode.DOWN);
                break;

            default:
                System.out.println("Please, do something");
                return;
        }
        System.out.println(result);

        }

    }

