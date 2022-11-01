package exam.SYJo_prac;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ShapeTest {
	static List<Shape> findShapesByType(List<Shape> shapes, String type) {
		List<Shape> typeShape = new ArrayList<>();
		for (Shape s : shapes)
			if (s.getType().equals(type))
				typeShape.add(s);
		return typeShape;
	}

	static List<Shape> findShapesByColorNArea(List<Shape> shapes, String color, Double area) {
		List<Shape> colorAreaShape = new ArrayList<>();
		for (Shape s : shapes)
			if (s.getColor().equals(color) && s.getArea() <= area)
				colorAreaShape.add(s);
		return colorAreaShape;
	}

	static List<Shape> findShapes(List<Shape> shapes, String type, String color, Double area) {
		List<Shape> findShape = new ArrayList<>();
		if (color == null && area == null)
			findShape = findShapesByType(shapes, type);
		if (type == null)
			findShape = findShapesByColorNArea(shapes, color, area);
		return findShape;
	}

	static List<Shape> findShapes(List<Shape> shapes, Predicate<Shape> p) {
		List<Shape> findShape = new ArrayList<>();
		for (Shape s : shapes)
			if (p.test(s))
				findShape.add(s);
		return findShape;
	}

	public static void main(String[] args) {
		System.out.println("사각형 : " + findShapesByType(Shape.shapes, "사각형"));
		System.out.println("빨간 도형(면적<=12.0) : " + findShapesByColorNArea(Shape.shapes, "빨간색", 12.0));

		System.out.println("사각형 : " + findShapes(Shape.shapes, "사각형", null, null));
		System.out.println("빨간 도형(면적<=12.0) : " + findShapes(Shape.shapes, null, "빨간색", 12.0));

		System.out.println("사각형 : " + findShapes(Shape.shapes, s -> s.getType().equals("사각형")));
		System.out.println("빨간 도형(면적<=12.0) : "
				+ findShapes(Shape.shapes, s -> s.getColor().equals("빨간색") && s.getArea() <= 12.0));

	}
}
