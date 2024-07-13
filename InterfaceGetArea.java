interface Circle{
    void getCircleArea(int r);
}
interface Rectangle{
    void getRectangleArea(int l,int b);
}
interface Square{
    void getSquareArea(int l);
}
public class InterfaceGetArea implements Circle,Rectangle,Square {
    public void getCircleArea(int r){
        System.out.println("Area of Circle= "+2*3.14*r);
    }
    public void getRectangleArea(int l, int b){
        System.out.println("Area of Rectangle ="+l*b);
    }
    public void getSquareArea(int l){
        System.out.println("Area of Square ="+l*l);
    }
    public static void main(String[] args) {
        InterfaceGetArea obj=new InterfaceGetArea();
        System.out.println();
        obj.getCircleArea(10);
        obj.getRectangleArea(20,10);
        obj.getSquareArea(15);
    }
}
