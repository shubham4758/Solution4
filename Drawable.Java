4.// Solution

// Drawable interface
interface Drawable {
    void draw();
}

// Circle class implementing the Drawable interface
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Rectangle class implementing the Drawable interface
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main class to create objects and call the draw() method
public class DrawableTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();  // Output: Drawing a circle

        Rectangle rectangle = new Rectangle();
        rectangle.draw();  // Output: Drawing a rectangle
    }
}
