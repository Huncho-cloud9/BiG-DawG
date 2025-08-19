import java.util.Scanner;
public class simplecalc{
    //two variable
    //output: sum, difference, product, quotient

    public static void main(String[] args) {
        float num1, num2;
    float sum = num1 + num2;
    float difference = num1 - num2;
    float product = num1 * num2;
    float quotient = num1 / num2;

        simplecalc calc = new simplecalc();
        calc.num1 = 10;
        calc.num2 = 5;
        System.out.println("Sum: " + calc.sum);
        System.out.println("Difference: " + calc.difference);
        System.out.println("Product: " + calc.product);
        System.out.println("Quotient: " + calc.quotient);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        calc.num1 = scanner.nextFloat();
        System.out.print("Enter second number: ");
        calc.num2 = scanner.nextFloat();
        System.out.println("Sum: " + calc.sum);
        System.out.println("Difference: " + calc.difference);
        System.out.println("Product: " + calc.product);
        System.out.println("Quotient: " + calc.quotient);
    }
}