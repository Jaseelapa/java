class Box{
double width;
double height;
double depth;
}
class Volume{
public static void main(String[]args)
{
Box box1obj=new Box();
Box box2obj=new Box();
box1obj.width=10;
box1obj.height=20;
box1obj.depth=15;
box2obj.width=20;
box2obj.height=25;
box2obj.depth=30;
double volume1=box1obj.width*box1obj.height*box1obj.depth;
System.out.println("volume1="+volume1);
double volume2=box2obj.width*box2obj.height*box2obj.depth;
System.out.println("Volume2="+volume2);
}
}
