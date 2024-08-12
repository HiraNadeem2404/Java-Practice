public class calUse {
    public static void main(String[] args) {
        cal c = new cal();

        double num1 = 12.5;
        double num2 = 3.5;

        System.out.println("Addition: " + num1 + " + " + num2 + " = " + c.add(num1,num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + c.subtract(num1,num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + c.multiply(num1,num2));
        System.out.println("Division: " + num1 + " / " + num2 + " = " + c.divide(num1,num2));
    }
}