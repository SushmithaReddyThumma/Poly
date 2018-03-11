
public class Circle {
	
	double radius;
	double diameter;
	double circumference;
	double area;
	
	public Circle() {
   
    }
	public Circle(double r,double d,double c,double a)
	{
		
		radius=r;
		diameter=d;
		circumference=c;
		area=a;
	}
	
	 public double getRadius() {
	     return radius; 
	   }
	 public double getDiameter() {
	     return 2*radius; 
	   }
	 public double getCircumference() {
	     return 2*radius*Math.PI; 
	   }
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
}
