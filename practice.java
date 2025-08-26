class mye extends Exception
{
  mye(String s)
{
  super(s);
}
}
class practice 
{
  public static void main(String arg[])throws mye
{
  try
{
  int a=10;
  int b=0;
  int c;
  c=a/b;
  System.out.print("Division:"+c);
}
catch(Exception e)
{
  System.out.print(e);
}
} 
}