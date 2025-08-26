class practical1
{
  practical1(int a)
{
  System.out.println("value of a:"+a);
}
practical1(int x,int y)
{
  int z;
  z=x+y;
  System.out.print("addition of x and y:"+z);
}
public static void main(String cp[])
{
  practical1 c1=new practical1(10);
  practical1 c2=new practical1(20,30);
}
}