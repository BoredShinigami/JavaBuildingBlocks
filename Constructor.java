public class Constructor
{
   public static void main(String[] args)
   {
       CarIII Porsche = new CarIII();
       Porsche.getCarIII();
       
       CarIII Ferrari = new CarIII();
       Ferrari.setCarIII("Ferrari","Red","Sport");
       Ferrari.getCarIII();
   }
}

class CarIII
{
    private String maker;
    private String colour;
    private String bodyType;
    
    public CarIII()
    {
        maker = "Porsche";
        colour = "Silver";
        bodyType = "Coupe";
    }
    
    private String accelerate()
    {
        String motion = "Accelerating...";
        return motion;
    }
    
    public void setCarIII(String brand, String paint, String style)
    {
        maker = brand;
        colour = paint;
        bodyType = style;
    }
    
    public void getCarIII()
    {
        System.out.println(maker + " paint is " + colour);
        System.out.println(maker + " style is " + bodyType);
        System.out.println(maker + " is " + accelerate() + "\n");
    }
}

