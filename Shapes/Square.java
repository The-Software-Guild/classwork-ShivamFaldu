package Shapes;

public class Square extends Shape {
    public Square(int a, int p){
        this.length=a;
        this.height=p;
    }

    @Override
    public int getArea() {
        return (length*length);
    }

    @Override
    public int getPermimeter() {
        return (length+length+length+length);
    }
}
