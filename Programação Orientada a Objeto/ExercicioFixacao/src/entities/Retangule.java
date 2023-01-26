package entities;

public class Retangule {

    @Override
    public String toString() {
        return "Area: " + area() +
                "\nPerimeter: " + perimeter() +
                "\nDiagonal: " + String.format("%.2f",diagonal());
    }

    public double width;
    public double height;

    public double area(){

        return width * height;
    }

    public double perimeter(){

        return 2* (width+height);
    }

    public double diagonal(){


        return Math.sqrt(Math.pow(width,2) + Math.pow(height, 2));
    }
}
