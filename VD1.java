package lab41;

public class VD1 {
    private double radius;
    private String color;

    public VD1(){
        radius = 1.0;
        color = "red";
    }

    public VD1(double r){
        radius = r;
        color = "red";
    }

    public VD1(double r, String c){
        radius = r;
        color =c;
    }

    public  double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
        return  radius* radius * Math.PI;
    }

    public static void main(String[] args) {
        VD1 c1 = new VD1(2.0,"blue");
        System.out.println("The Radius is :" +c1.getRadius());
        System.out.println("The color is :"+c1.getColor());
        System.out.println("The area is :"+c1.getArea());

        VD1 c2 = new VD1(2.0);
        System.out.println("The Radius is :" +c2.getRadius());
        System.out.println("The color is :"+c2.getColor());
        System.out.println("The area is :"+c2.getArea());

        VD1 c3 = new VD1();
        System.out.println("The Radius is :" +c3.getRadius());
        System.out.println("The color is :"+c3.getColor());
        System.out.println("The area is :"+c3.getArea());
    }



}

