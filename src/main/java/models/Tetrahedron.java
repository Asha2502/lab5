package models;

public class Tetrahedron implements Shape {
    private final double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(edge, 3) / (6 * Math.sqrt(2));
    }
}
