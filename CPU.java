public class CPU 
{ 
int price;
CPU(int price)
{
this price.price=price;
}
public void display()
{
System.out.println("\nCPU info");
System.out.println("CPU price is "+price);
}
class Processor 
{ int cores;
String producer;
Processor (int cores, String producer)
{
this.cores=cores;
this.producer=producer;
}
void display()
{
System.out.println ("\nProcessor info");
System.out.println ("No. of Cores = "+cores);
System.out.println ("Manufacturer = "+producer+"\n");
}
}
static class RAM 
{
int mem;
String manuf;
RAM (int memory, String producer)
{
this.mem = memory;
this.manuf = producer;
}
void display ( )
{
System.out.println ("\n RAM info");
System.out.println ("Memory = "+mem+" GB");
System.out.println ("Manufacturer = "+manuf+"\n");
}
}
public static void main(String[] args)
{
CPU.RAM obj1= new CPU.RAM (8,"Intel");
CPU obj2 = new CPU ( ); 
CPU.Processor proobj =proobj.new Processor (8,"Samsung");
ramobj. display( );
proobj. display( );
cpu. display( );
}
}
