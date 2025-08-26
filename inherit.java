class A 
{
   public void show()
{
   System.out.println("Base class");
}
}
class B extends A
{
  public void display()
{
  System.out.print("Derived class");
}
}
class inherit
{
  public static void main(String arg[])
{
   B b=new B();
   b.show();
   b.display();
}
}