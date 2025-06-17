package p;
interface Arithematic1
{
int add(int a,int b);
int sub(int a,int b);
int mul(int a,int b);
double div(double a,double b);
int mod(int a,int b);
public void display()
{
System.out.println("Defautlt method in interface");
}
}
class ArithematicOperations1 implements Arithematic1
{
public int add(int a,int b)
{
return(a+b);
}
public int sub(int a,int b)
{
return(a-b);
}
public int mul(int a,int b)
{
return(a*b);
}
public double div(double a,double b)
{
return(a/b);
}
public int rem(int a,int b)
{
return(a%b);
}
}