import java.util.*;
class factorial{
public static void main(String args[])
{
Scanner numobj=new Scanner(System.in);
int i,n=10,fact=1;
System.out.println("Enter a no:");
n=numobj.nextInt();
for(i=1;i<=n;i++){
fact=fact*i;
}
System.out.println(fact);
}
}


