public class Circle_2 {
 public static float r;
 public float getRadius(){
     return r;
 }
public void setRadius(float newRadius){
r = newRadius;
}
static void area(float Radius){
System.out.println(Math.PI*(r*r));
}
static void radius(float Radius){
System.out.println(r);
}
public static void main(String[] args){
    Circle_2 circle1=new Circle_2();
    circle1.setRadius((float) 5.03);
    System.out.print("Radius 1: ");
    radius(circle1.getRadius());
    System.out.print("Area of Radius 1: ");
    area(circle1.getRadius());
    Circle_2 circle2=new Circle_2();
    circle1.setRadius((float) 3.2);
    System.out.print("Radius 2: ");
    radius(circle2.getRadius());
    System.out.print("Area of Radius 2: ");
    area(circle2.getRadius());   
    }
}