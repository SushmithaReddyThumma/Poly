
public class Test {

	public static void main(String[] args)
	{
		
		Circle C1=new Circle();
		C1.radius=1.0;
	      System.out.println("The circle has radius of "+ C1.getRadius() + ",diameter of " +C1.getDiameter()+ ", area of " + C1.getArea()+ "  and circumference of " +C1.getCircumference());
		Circle C2=new Circle();
		C2.radius=2.0;
	      System.out.println("The circle has radius of "+ C2.getRadius() + ",diameter of " +C2.getDiameter()+ ", area of " + C2.getArea()+ "  and circumference of " +C2.getCircumference());
		
	      Circle C3= new Circle(5.0,10.0,78.5,31.4);
	      
	     System.out.println("The circle has radius of " +C3.radius+ ",diameter of " +C3.diameter+ ",Circumference of"+C3.circumference+ " and area of " +C3.area);
	}
}
