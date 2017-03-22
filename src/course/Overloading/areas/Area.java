package course.Overloading.areas;

public class Area {

	
	// Declaring  variables
	private int side; 
	private int base;
	private int height;
	
	// default constructor
	Area(){
	
      }
	
	// constructor with 2 parameters
  Area( int breadth, int height) {
		super();
		this.base = breadth;
		this.height = height;
	}

// constructor with single(1) parameter
Area(int side) {
	this.side = side;
}


 
// setters and getters methods 

//gets side value
public int getSide() {
	return side;
}
//to set value into side variable
public void setSide(int side) {
	this.side = side;
}

//gets breadth value
public int getBase() {
	return base;
}
//to set value into side variable
public void seth(int base) {
	this.base = base;
}
// gets height value
public int getHeight() {
	return height;
}
//to set value into side variable
public void setHeight(int height) {
	this.height = height;
}

// declaring method to get area of square
public int areaofSquare(){
	return side*side;
}

// Declaring method to get area of Rectangle
public int areaofRectangle(){
	return base*height;
}
//Declaring method to get area of Triangle
public double areaofTriangle(){
	return (double)base*height/2;
}

}