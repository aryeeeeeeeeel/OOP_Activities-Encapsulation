class Circle_1 {
    
    double radius = 1;
    
    Circle_1(){
    }
    
    Circle_1(double newRadius) {
        radius = newRadius;
    }
    
    double getArea() {
        return radius * radius * Math.PI;
    }
    
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    
    public static void main(String[] args) {
        Circle_1 circle1 = new Circle_1(1);
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        
        Circle_1 circle2 = new Circle_1(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        Circle_1 circle3 = new Circle_1(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
    }
}
