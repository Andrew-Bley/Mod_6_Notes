public class Formattedprinting
{
    public static void main(String[] args)
    {
      double salary = 455678.12345;
      int age= 64;
      String name = "Andrew";
      for (int x = 0; x < 15; x++)
        System.out.printf("\n%-20s%5d%12.2f", name, age , salary);







    }
}
