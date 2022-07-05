public class Circle {

    //метод проверки правильности ввода радиуса
    public static double CheckCorrectRadius(String value) {
        double side = -1;
        try {
            side = Double.parseDouble(value) > 0 ? Double.parseDouble(value) : -1;
        } catch (Exception e) {

        }


        return side;
    }

    //конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    //геттер
    public double getRadius() {
        return radius;
    }


    //метод toString
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", square = "  + getSquare() + " , length = " +getLenght() +
                '}';
    }
    //Методы нахождения длинны и площади
    public double getSquare(){
        return getRadius()*getRadius()*Math.PI;
    }
    public double getLenght(){
        return 2*getRadius()*Math.PI;
    }

    private double radius;
}
