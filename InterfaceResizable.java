interface Resizable{
    public void setLength(int l);
    public void setBreadth(int b);
}
class Rectangle implements Resizable{
    int length;
    int breadth;
    public void getlb(){
        System.out.println("Width= "+breadth);
        System.out.println("Length= "+length);
    }
    public void setLength(int l){
        this.length=l;
    }
    public void setBreadth(int b){
        this.breadth=b;
    }
}
public class InterfaceResizable {
    public static void main(String args[]){
        Rectangle obj=new Rectangle();
        obj.length=10;
        obj.breadth=10;
        obj.getlb();
        obj.setBreadth(20);
        obj.setLength(20);
        obj.getlb();
    }
}
