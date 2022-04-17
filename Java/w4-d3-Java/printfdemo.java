import java.util.Locale;
class PrintfDemo
{
    public static void main(String []args)
    {
        System.out.println("hello world");
        System.out.printf("'%S' %n","hello world");
        System.out.printf("'%10s' %n","world");
        System.out.printf("'%-10s' %n","world");
        System.out.printf(Locale.US,"%,d %n",12300);
        System.out.printf(Locale.ITALY,"%,d %n",12300);
        System.out.printf("%f%n",3.1423);
        System.out.printf("%3.2f%n",3.1423);
    }
}