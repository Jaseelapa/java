class product
{
int p_code;
String p_name;
int p_price;
product(int code,String name,int price)
{
p_code=code;
p_name=name;
p_price=price;
}
void display()
{
System.out.println("product code:"+p_code);
System.out.println("product code:"+p_name);
System.out.println("product price:"+p_price);
}
}
class product1
{
public static void main(String[]args)
{
product ob1= new product(123,"Pen",10);
product ob2=new product(423,"Pencil",5);
product ob3=new product(233,"Book",30);
System.out.println("\n product with lowest price");
if(ob1.p_price<ob2.p_price)
if(ob1.p_price<ob3.p_price)ob1.display();
else
ob3.display();
else if(ob3.p_price<ob2.p_price)
ob3.display();
else
ob2.display();
}
}

