
public class Rectangle {
	double height;
	double weidth;

	public Rectangle() {
		this.height = 1;
		this.weidth = 1;
	}

	public Rectangle(double x, double y) {
		this.height = x;
		this.weidth = y;
	}
	public double getArea(){
		return this.height*this.weidth;
	}
	public double getPerimeter(){
		return this.height+this.weidth;
	}
}
