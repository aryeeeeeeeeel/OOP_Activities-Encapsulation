 public class Circle {
 public static float r;
 
 public float getRadius(){
     return r;
 }
 
 public void setRadius (float newRadius){
     r = newRadius;
 }
 
 static void area(float Radius){
     System.out.println(Math.PI*(r*r));
 }
 
 static void radius(float Radius){
     System.out.println(r);
 }
 
 public static void main(String[] args){
     Circle circle1 = new Circle();
     circle1.setRadius(2);
     
     area(circle1.getRadius());
     radius(circle1.getRadius());
     
     Circle circle2 = new Circle();
     Circle circle3 = new Circle();
     
     circle2.setRadius(15);
     
     area(circle2.getRadius());
     radius(circle2.getRadius());
 }
}