package lab42;

public class Circle {
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double r){
        radius = r;
    }

    public double getRadius(){
        return radius;
    }

//    public void setRadius(double newradius){
//        radius = newradius ;
//    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return radius*2*Math.PI;
    }

//    public String toString(double radius){
//        return "Circle[radius ="+radius ;
//    }


    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The radius is :"+c1.getRadius());
        System.out.println("The area is :"+c1.getArea());
        System.out.println("The Circumference is :"+c1.getCircumference());

        Circle c2 = new Circle(3.0);
        System.out.println("The radius is :"+c2.getRadius());
        System.out.println("The area is :"+c2.getArea());
        System.out.println("The Circumference is :"+c2.getCircumference());
    }
}
