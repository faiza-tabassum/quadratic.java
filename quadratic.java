import java.util.*;
class quadratic
{
public static void main(String[]args)
 {
 int a;
 int b;
 int c;
 int d;
 double root1;
 double root2;
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the values of a b c");
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 root1= ((-b)+ Math.sqrt(b*b)-(4*a*c))/2*a;
 root2= ((-b)- Math.sqrt(b*b)-(4*a*c))/2*a;
 System.out.println("the roots of the given equation are: " +root1 +"and"+ root2);
  d=(b*b)-(4*a*c);
 
 if (d>0)
 System.out.println("the roots are real and distinct");
 else if (d<0)
 System.out.println("the roots are complex and distinct");
 else
 System.out.println("the roots are real and equal");
 } 
}
