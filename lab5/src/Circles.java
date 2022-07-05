import java.util.Arrays;

public class Circles {
    public Circle[] getCircles() {
        return circles;
    }
    public void setCircleAt(int index, Circle circle){
        circles[index] = circle;
    }
    public void resize(int newLength){
        Circle [] tempCircles = new Circle[newLength];
        if (circles.length < newLength){
            tempCircles = Arrays.copyOf(circles, newLength);
        }
        circles = tempCircles;
    }

    public Circles() {
        circles = new Circle[ 0 ];
    }

    public Circles(int length) {
        this.circles = new Circle[length];
    }


    private Circle[] circles;
}
