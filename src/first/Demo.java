package first;
public class Demo
{
  int x = 10;
  public void display()
  {
    System.out.println("Hello 1");
  }
  public static void main(String args[])
  {
    System.out.println(new Demo().x);
    System.out.println(new Demo().x);
    System.out.println(new Demo().x);
    new Demo().display();
    new Demo().display();
  }
}