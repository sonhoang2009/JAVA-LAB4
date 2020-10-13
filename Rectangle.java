package lab42;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(){
        length =1.0f;
        width = 1.0f;
    }
//    public Rectangle(float length, float width){
//        width = 1.0f;
//        length = 1.0f;
//    }

    public float getLength(float length){
        return length;
    }

    public void setLength(float newlength){
        length = newlength;
    }

    public float getWidth(float width){
        return width;
    }

    public void setWidth(float newWidth){
        width = newWidth;
    }

    public double getArea(){
        return  width*length ;
    }

    public double getPerimeter(){
        return (width+length)*2 ;
    }

    public String toString(){
        return "Rectangle[ length ="+ length + "width ="+width+"]";
    }

    public static void main(String[] args) {
        Rectangle s1 = new Rectangle();

        System.out.println(s1);
        System.out.println("The area is "+ s1.getArea());
        System.out.println("The perimeter is "+s1.getPerimeter());


//        Rectangle s2 = new Rectangle(5.0f,6.0f);
//
//        System.out.println(s2);
//        System.out.println("The area is "+ s2.getArea());
//        System.out.println("The perimeter is "+s2.getPerimeter());


    }


}
