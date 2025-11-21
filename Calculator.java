class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("Addition of two integers: " + Calculator.add(15, 40));
        System.out.println("Addition of two doubles: " + Calculator.add(99.9, 10.9));
        System.out.println("Addition of three integers: " + Calculator.add(55, 85, 30));
    }
}
