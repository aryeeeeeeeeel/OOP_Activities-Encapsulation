public class BasicArithmetic { 
public static double x;
public static double y;

public double getX(){
 return x;
}

public void setX(double newX) { 
x = newX;
}

public double getY() {

return y;
}

public void setY(double newY) { 
y= newY;
}

static void addition(double x, double y) { 
System.out.println(x + y);
}

static void difference(double x, double y) { 
System.out.println(x-y);
}

static void product(double x, double y) { 
System.out.println(x*y);
}

static void quotient(double x, double y) { 
System.out.println(x/y);
}

public static void main(String[] args) { 
BasicArithmetic myObj = new BasicArithmetic(); 
myObj.setX(1); 
myObj.setY(2);

addition(myObj.getX(), myObj.getY()); 
difference(myObj.getX(), myObj.getY()); 
product(myObj.getX(), myObj.getY());
quotient(myObj.getX(), myObj.getY());
}
}