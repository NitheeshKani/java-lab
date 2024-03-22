package Unit3;

class Shape {
    int width;
    int height;

    Shape(int w, int h) {
        width = w;
        height = h;
    }

    Shape(int w) {
        width = w;
    }
    void calculate(){
        System.out.println(width*height);
    }
}

class Box extends Shape {
    Box(int w) {
        super(w);
    }
    void calculate(){
        System.out.println(Math.pow(width, 2));
    }
}

public class ShapeClassEx6 {
    public static void main(String[] args) {
        Box b = new Box(10);
        b.calculate();
        Shape s = new Shape(10,15);
        s.calculate();
    }
}
