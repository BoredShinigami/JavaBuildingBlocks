class SafeInstance
{
    public static void main(String[] args)
    {
        CarII Porsche = new CarII();
        Porsche.setCarII("Porsche","Green","Coupe");
        Porsche.getCarII();
        
        CarII Bentley = new CarII();
        Bentley.setCarII("Bentley","Green","Saloon");
        Bentley.getCarII();
    }
}
class CarII
{
    private String maker;
    private String colour;
    private String bodyType;
    
    private String accelerates()
    {
        String motion = "Accelerating...";
        return motion;
    }
    
    public void setCarII(String brand, String paint, String style)
    {
        maker = brand;
        colour = paint;
        bodyType = style;
    }
    
    public void getCarII()
    {
        System.out.println(maker + " paint is " + colour);
        System.out.println(maker + " style is " + bodyType);
        System.out.println(maker + " is " + accelerates() + "\n");
    }
}

