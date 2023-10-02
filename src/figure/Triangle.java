package figure;

public class Triangle extends Figure{
    private int aSide;
    private int bSide;
    private int cSide;

    public Triangle(int aSide, int bSide, int cSide, String color) {
        super(color);
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    @Override
    public double area() {
        double p = (double) (aSide + bSide + cSide)/2;
        return Math.sqrt(p * (p - aSide) * (p - bSide) * (p - cSide));
    }

    @Override
    public double perimeter() {
        return aSide + bSide + cSide;
    }
}
