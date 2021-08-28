import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	 
	 Scanner sc=new Scanner(System . in);
	 int a=sc.nextInt();
	 if(a<=0)
	 {
	     System.out.println("Number cannot be zero or negative");
	 }
	 if(a>32767)
	 {
	     System.out.println("number exceeded the limit");
	 }
	 int b=a;
	 int rem,count=0,even=0;
	 int [] val=new int[20];
	 for(int i=0;b>0;i++)
	 {
	 val[i]=b%10;
	 b=b/10;
	 count++;
	 if(val[i]%2==0)
	 {
	     even++;
	 }
	 }
	 int sum=0,sqr;
	 if(a!=0 && even == 0)
	 {
	    System.out.println("Even digit not found"); 
	 }
	 else if(even > 0 )
	 {
	 for(int i=0;i<count;i++)
	 {
	     if(val[i]%2==0)
	     {
	         sqr=val[i]*val[i];
	         sum=sum+sqr;
	     }
	 }
	 System.out.println(sum);
	 
	}
}
}
