package nume;

public class Rectangle {
	double height;
	double width;

	Rectangle()
	{
		height=0;
		width=0;
	}

	Rectangle(double height,double width)
	{
		this.height=height;
		this.width=width;
	}

	double getArea()
	{
		return this.height*this.width;
	}

	double getPerimeter()
	{
		return 2*(this.height+this.width);
	}
}


