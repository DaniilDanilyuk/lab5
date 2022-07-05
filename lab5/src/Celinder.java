public class Celinder extends Circle {
    private double h;

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Celinder(double radius, double h) {
        super(radius);
        setH(h);
    }
    public double getVolume(){
        return super.getSquare()*getH();
    }

    @Override
    public double getSquare() {
        return super.getSquare() * 2 + super.getLenght()*getH() ;
    }

    @Override
    public String toString() {
        return "Celinder{" + "radius = " + getRadius() + " , square = " + getSquare() + " , volume = " + getVolume() +
                " , h=" + getH() + '}';
    }
}
