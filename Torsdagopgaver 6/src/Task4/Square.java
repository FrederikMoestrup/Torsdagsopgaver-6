package Task4;

public class Square implements Shape{

    double l;

    Square(double l){
        this.l=l;
    }

    @Override
    public double getArea() {
        return l*l;
    }
}
