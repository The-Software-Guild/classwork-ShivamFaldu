package Shapes;

public class Circle extends Shape {
    int radius;
    public Circle (int l,int h){
        this.length=l;
        this.radius=h;
    }
    @Override
    public int getArea() {
        return (int)(3.14*radius);
    }

    @Override
    public int getPermimeter() {
        return (int)(2*(3.14*radius));
    }
}
