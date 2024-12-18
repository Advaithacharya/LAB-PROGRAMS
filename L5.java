package J1;

class Shape {
    // Base method for drawing a shape
    public void draw() {
        System.out.println("Drawing a shape");
    }

    // Base method for erasing a shape
    public void erase() {
        System.out.println("Erasing a shape");
    }
}

// Circle class extending Shape
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a circle");
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a triangle");
    }
}

// Square class extending Shape
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a square");
    }
}

public class L5 {
    public static void main(String[] args) {
        System.out.println("Test Shape Program");

        // Creating an array of Shape references
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Square();

        // Demonstrating polymorphism
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
            shapes[i].erase();
            System.out.println("-----------------");
        }
    }
}