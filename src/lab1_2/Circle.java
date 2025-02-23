package lab1_2;
	public class Circle {  
	   public double radius;

	   public Circle() {  
	      radius = 1.0;

	   }
	   
	   public Circle(double r) { 
		   radius = r;
	   }
	   
	   public void setRadius(double radius) {
		this.radius = radius;
	}

	   public double getRadius() {
	     return radius; 
	   }
	   
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	   
	   public double getCircumference() {
		return Math.PI * radius * 2;
	   }
	   public String toString() {
		   return "Circle[radius=" + radius ;
		}
	}


