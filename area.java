class shape
{
    int length, breadth; 
    int radius;
    int perpendicular, base, hypotenuse, semiperimeter;
    double area;    
    double Pi = 3.14;

//For the area of the Rectangle.
    shape(int l, int b){
        length = l;
        breadth = b;
        area = 2 * (length + breadth);
        System.out.println("The area of the rectangle is "+area+" sq. units.");
    }

//For the area of the Circle.
    shape(int r){
        radius = r;
        area = Pi*r*r;
        System.out.println("The area of the circle is "+area+" sq. units.");

    }

//For the area of the Triangle.
    shape(int p, int b, int h){
        perpendicular = p;
        base = b;
        hypotenuse = h;
        semiperimeter = (perpendicular+base+hypotenuse)/2;
        area = Math.sqrt(semiperimeter*(semiperimeter-perpendicular)*(semiperimeter-base)*(semiperimeter-hypotenuse));
        System.out.println("Area of the triangle is "+area+" sq. units.");


    }
    
}
public class area{
    public static void main(String[] args) {
        
        shape obj = new shape(5,6);
        shape obj2 = new shape(4);
        shape obj3 = new shape(122,120,22);
    }
}