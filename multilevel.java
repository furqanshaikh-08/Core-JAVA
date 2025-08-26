class first
{
  public void show1()
{
  System.out.println("In First class");
}
}
class second extends first
{
  public void show2()
{
  System.out.println("In second class");
}
}
class third extends second
{
  public void show3()
{
  System.out.print("In third class");
}
}
class multilevel
{
  public static void main(String arg[])
{
  third td=new third();
  td.show1();
  td.show2();
  td.show3();
}
}