import java.util.Scanner;
class matrix
{
int m,n,i,j;
int[][] a=new int[5][5];
int[][] b=new int[5][5];
int[][] c=new int[5][5];
Scanner sc=new Scanner(System.in);
void get()
{ System.outprint("Enter the no:ofrows:");
m=sc.nextInt();
System.out.println("Enter elements of matrix A");
for(i=0;i<m;i++)
a[i][j]=sc.nextInt();
System.out.println("Enter elements of matrix B");
for (i=0;i<m;i++)
for(j=0;j<n;j++)
b[i][j]=sc.nextInt();
void add()
{
for(i=0;i<m;i++)
c[i][j]=a[i][j]+b[i][j];
}
void display()
{
System.out.println("Matrix A");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");}
System.out.println("Matrix B");
for(i=0;j<m;j++)
{
System.out.print(b[i][j]+" ");}
System.out.println();
}
System.out.println("Matrix C");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}
public class matrix1
{
public static void main(String[]args)
{
matrix ob= new matrix();
ob.get();
ob.add();
ob.display();
}
}
