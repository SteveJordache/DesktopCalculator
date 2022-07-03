interface Movable {

    void move(float dx, float dy);
}

interface Scalable {

    void scale(float factor);
}

interface MutableShape extends Movable, Scalable {

}

final class Circle implements  MutableShape {
    private float centerX;
    private float centerY;
    private float radius;

    public Circle(float centerX, float centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public void move(float dx, float dy) {
        this.centerX +=  dx;
        this.centerY +=  dy;

    }

    @Override
    public void scale(float factor) {
        radius *= factor;

    }
}

final class Rectangle implements  MutableShape {

    private float x;
    private float y;
    private float width;
    private float height;

    public Rectangle(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;

    }

    @Override
    public void scale(float factor) {
        width *= factor;
        height *= factor;
    }
}

/*class Test {
    public static void main(String[] args) {
        *//*MutableShape circle = new Circle(5.0f, 5.0f, 10.0f);
        circle.move(10.0f, 20.0f);
        circle.scale(2.0f);
        System.out.println(((Circle) circle).getRadius());
        System.out.println(((Circle) circle).getCenterX());
        System.out.println(((Circle) circle).getCenterY());*//*
        MutableShape circle = new Circle(2.0f, 3.5f, 10.1f);
        circle.move(10.1f, 20.2f);
        circle.scale(2.2f);
        ((Circle) circle).getRadius();

    }
}*/
