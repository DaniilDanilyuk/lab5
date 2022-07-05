public class Main {

    public static void main(String[] args) {
        Circle circle;

        double side = -1;
        while (Circle.CheckCorrectRadius("" + (side = Math.random() * 11 - 5)) < 0) {
            System.out.println(side);
        }

        circle = new Circle(side);

        Circles circles = new Circles(1);
        circles.setCircleAt(0, circle);
        for (int i = 0; i < circles.getCircles().length; i++) {
            System.out.println(circles.getCircles()[i]);
        }
        System.out.println("\nAfter resize\n" );
        Circle circle2 = new Circle(5);
        circles.resize(2);
        circles.setCircleAt(1, circle2);
        for ( int i = 0; i < circles.getCircles().length;i++){
            System.out.println(circles.getCircles()[i]);
        }
        double max = 0;
        for (int i=0; i<circles.getCircles().length; i++){
            if(circles.getCircles()[i].getSquare() > max){
                max = circles.getCircles()[i].getSquare();
            }
        }
        System.out.println("\nThe max square = " + max );
        Celinder celinder = new Celinder(6, 5);
        Celinder celinder1 = new Celinder(10, 12);
        Celinders celinders = new Celinders();
        celinders.list.add(celinder);
        celinders.list.add(celinder1);
        System.out.println("\nCelinders: \n");
        celinders.list.add(new Celinder(5,12));
        for (int i = 0; i<celinders.list.size(); i++){
            System.out.println(celinders.list.get(i));
        }
        System.out.println("\nCelinders avarage volume = " + celinders.getAvarageVolume());

    }
}