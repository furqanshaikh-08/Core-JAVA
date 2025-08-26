class practical2
{
   int a=0;
   practical2(int x)
{
   a=x;
 System.out.println("value of a in con1:"+a);
  }
practical2(practical2 pc)
{
  a=pc.a;
  System.out.print("Value of a in con2:"+a);
}
public static void main(String cp[])
{
  practical2 p1=new practical2(20);
  practical2 p2=new practical2(p1);
}
}