public class prime number{
  public static void main(string args[])
  {
    system.out.println("prime number between 1 to 100 are");
    for(int num=2;num<=100;num++)
      {
        if(is prime(num){
          system.out.println(num+" ");
        }
      }
  }
  public static boolean is prime(int number)
  {
    if(number<=1){
      return false;
    }
    for(int i=2;i<=math.sqrt(number);i++)
      {
        if(number%i==0)
        {
          return false;
        }
      }
    return true;
  }