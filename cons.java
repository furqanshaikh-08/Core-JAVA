class cons
{
   int a,b;
  cons(int c)
{
  a=c; 
System.out.println(a);
}
cons(int d,int e)
{
  a=d;
  b=e;
  System.out.print(a+"  "+b); 
}
public static void main(String arg[])
{
  cons c=new cons(10);
  cons cn=new cons(20,40);
}
}