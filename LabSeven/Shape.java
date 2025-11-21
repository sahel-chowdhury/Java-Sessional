class Shape {

    static double area(double length, double width) {
        return length * width;  
    }

    static double area(double radius) {
        return 3.1416 * radius * radius;  
    }

    public static void main(String[] args) {

        System.out.println("Area of Rectangle: " + Shape.area(20, 3));
        System.out.println("Area of Circle: " + Shape.area(10));
    }
}

