package Triangle;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(3,5,7);
        triangle.setColor("blue");
        System.out.println(triangle);
    }
}
