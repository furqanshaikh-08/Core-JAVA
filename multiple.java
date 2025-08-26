interface intf
{
 public void show();
}
class demo implements intf
{
 public void show()
{
  System.out.println("In Interface");
}
void display()
{
  System.out.print("In class");
}
}
class multiple
{
  public static void main(String arg[])
{
   demo d=new demo();
   d.show();
  d.display();
}
}