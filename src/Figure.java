import java.util.ArrayList;

abstract class Figure {
    public abstract double getVolume();
}

abstract class SolidOfRevolution extends Figure {
    protected double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Ball extends SolidOfRevolution {
    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }

    public Ball(double radius) {
        super(radius);
    }
}

class Cilinder extends SolidOfRevolution {
    private double height;

    public Cilinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

class Pyramid extends Figure {
    private double height;
    private double s;

    public Pyramid(double height, double s) {
        this.height = height;
        this.s = s;
    }

    @Override
    public double getVolume() {
        return height * s * 4 / 3;
    }
}


class Box extends Figure {
    private ArrayList<Figure> shapes = new ArrayList<>();
    private double available;
    private double volume;

    public Box(double available) {
        this.available = available;
        this.volume = available;
    }

    public boolean add(Figure figure) {
        if (available >= figure.getVolume()) {
            shapes.add(figure);
            available -= figure.getVolume();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getVolume() {
        return volume;
    }
}

