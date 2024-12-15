package models;

public class ShapeFactory {
    public static Shape createShape(String shapeType, double... params) {
        switch (shapeType.toLowerCase()) {
            case "cube":
                return new Cube(params[0]);
            case "sphere":
                return new Sphere(params[0]);
            case "tetrahedron":
                return new Tetrahedron(params[0]);
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}
