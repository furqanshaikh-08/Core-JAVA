class newexp extends Exception
{
  newexp(String arg)
{
  super(arg);
}
}
class expexam
{
  public void divide(int a,int b)throws newexp
{
  if(b==0)
{
  throw new newexp("divide by zero");
}
else
{
  int c;
  c=a/b;
  System.out.print(c);
}
}
public static void main(String arg[])
{
  try
{
  expexam e=new expexam();
  e.divide(2,2);
}
catch(newexp e)
{
  System.out.print(e);
}
}
}