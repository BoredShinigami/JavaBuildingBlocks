class FirstInstance
{
    public static void main(String[] args)
    {
        System.out.println("Car paint is " + Car.colour);
        System.out.println("Car style is " + Car.bodyType);
        System.out.println(Car.accelerate());
        Car Porsche = new Car();
        System.out.println("----------------------");
        System.out.println("Porsche paint is " + Porsche.colour);
        System.out.println("Porsche style is " + Porsche.bodyType);
        System.out.println(Porsche.accelerate());
        
    }
}