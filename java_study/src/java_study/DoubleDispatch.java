package java_study;


import java.util.*;

public class DoubleDispatch {

	public static void main(String[] args) {
		
		Painter redPainter = new RedPainter();
		List<Shape> shapes = Arrays.asList(new Triangle(), new Square());
		
		for(Shape shape : shapes) {
			shape.paintBy(redPainter);
		}
		
	}
}
	
interface Painter{
	void paintOn(Triangle triangle);
	void paintOn(Square sqaure);
}
	
class RedPainter implements Painter{
	@Override
	public void paintOn(Triangle triangle) {
		System.out.println("RedPainter paint triangle");
	}

	@Override
	public void paintOn(Square square) {
		System.out.println("RedPainter paint square");
		
	}
}
	
class GreenPainter implements Painter{
	@Override
	public void paintOn(Triangle triangle) {
		System.out.println("GreenPainter paint triangle");
	}

	@Override
	public void paintOn(Square squre) {
		System.out.println("GreenPainter paint square");	
	}
}
	
interface Shape{
	public void paintBy(Painter painter);
}
	
class Triangle implements Shape{
	@Override
	public void paintBy(Painter painter) {
		painter.paintOn(this);
	}
	}
	
class Square implements Shape{
	@Override
	public void paintBy(Painter painter){
		painter.paintOn(this);
	}
}
