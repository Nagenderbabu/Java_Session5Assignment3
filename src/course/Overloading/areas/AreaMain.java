package course.Overloading.areas;

public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Constructor Overloading
		
		// Initializing area class variables through constructors
		// (2) three  parameter constructor 	
	Area r1=new Area(3,5);
	// (2) two parameter constructor
	Area s1=new Area(5);
	// displays area of rectangle 
    System.out.println("Area of Rectangle is :"+" "+r1.areaofRectangle());
	// displays area of Square 
    System.out.println("Area of Square is :"+" "+s1.areaofSquare());
	// displays area of  Triangle
    System.out.println("Area of Triangle is :"+" "+r1.areaofTriangle());
	
	}

}
