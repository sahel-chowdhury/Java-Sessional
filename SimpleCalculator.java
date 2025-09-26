import java.util.Scanner; 
public class SimpleCalculator { 
public static void main(String[] args) { 
Scanner input = new Scanner(System.in); 
System.out.print("Enter first number: "); 
double num1 = input.nextDouble(); 
System.out.print("Enter second number: "); 
double num2 = input.nextDouble(); 
System.out.print("Enter operator (+, -, *, /): ");
 char operator = input.next().charAt(0); 
 
        double result; 
 
        if (operator == '+') { 
            result = num1 + num2; 
        } else if (operator == '-') { 
            result = num1 - num2; 
        } else if (operator == '*') { 
            result = num1 * num2; 
        } else if (operator == '/') { 
            if (num2 != 0) { 
                result = num1 / num2; 
            } else { 
                System.out.println("Error: Division by zero is not allowed."); 
                input.close(); 
                return; 
            } 
        } else { 
            System.out.println("Invalid operator!"); 
            input.close(); 
            return; 
        } 
        System.out.println("Result: " + result); 
 
        input.close(); 
    } 
}