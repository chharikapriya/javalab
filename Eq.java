import java.util.Scanner;
class Eq
{
  public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
System.out.println("enter coff of a:");
double a=sc.nextDouble();
System.out.println("enter coff of b:");
double b=sc.nextDouble();
double d=b*b;
System.out.println("the discriminant(d) is:" +d);
if(d>0)
{
System.out.println("eq has two real and distinct roots");
double root1=0;
double root2=-b/a;
System.out.println("root1:" + root1);
System.out.println("root2:"+ root2);
}
else
if(d==0)
{
System.out.println("eq has one real and repeated root");
double root=0;
System.out.println("root:"+ root);
}
else
{
System.out.println("eq has complex roots, which is not possible for specific eq");
}

}
}
