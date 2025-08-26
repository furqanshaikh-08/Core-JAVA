class myexp extends Exception
{
  myexp(String arg)
{ 
  super(arg);
}
}
class main
{
  public void checkage(int age) throws myexp
{
  if(age<18)
{
  throw new myexp("Invalid age");
}
else
{
  System.out.print("Valid age");
}
}
public static void main(String arg[])
{ 
  try
{
  main m=new main();
  m.checkage(13);
}
catch(myexp e)
{
  System.out.print(e);
}
}
}