class Circle implements  Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// do not change the interface
interface Measurable {
    double area();
}

/*
public  class Main {
    public static void main(String[] args) {
        Measurable circle = new Circle(1);
        double area = circle.area();
        System.out.printf("%.2f",area);
    }
}*/
