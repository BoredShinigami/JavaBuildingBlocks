class SubClass extends SuperClass
{
    public static void main(String args[])
    {
        hello();
        SuperClass.hello();
        echo(args[0]);
        
    }
    public static void hello()
    {
        System.out.println("Hello from the Sub Class");
    }
}