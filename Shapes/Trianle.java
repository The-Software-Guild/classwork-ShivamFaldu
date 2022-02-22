package Shapes;

public class Trianle extends Shape {
    public Trianle(int a ,int v){
        this.height=v;
        this.length=a;
    }
    @Override
    public int getArea() {
        return (int)(0.5*(height*length));
    }

    @Override
    public int getPermimeter() {
        return 0;
    }

    // @Override
    public String getPermimeteR() {

        return ("Sorry the programmer hasnt coded this very well because he's lazy");
    }
}
