import java.util.*;
class sorting1
{
   public static void main(String arg[])
{
 int[] a=new int[5];
  a[0]=32;
  a[1]=12;
  a[2]=3;
  a[3]=44;
  a[4]=52;
int n=a.length;
for(int i=0;i<n-1;i++)
{
   for(int j=0;j<n-i-1;j++)
{
  if(a[j]>a[j+1])
{
   int temp=a[j];
   a[j]=a[j+1];
   a[j+1]=temp;
}
}
}
System.out.println("Sorted array");
for(int i=0;i<n;i++)
{
  System.out.println(a[i]);
}
}
}