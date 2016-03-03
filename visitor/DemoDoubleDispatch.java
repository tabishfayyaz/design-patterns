class Animal
{
    public String eat(Food food)
    {
        return "Don't just give me anything. I eat specific type of food";
    }

    public String eat(Fish fish)
    {
        return "Who eats fish?";
    }
}

class Cat extends Animal
{
    public String eat(Food food)
    {
        return "Cat says: " + super.eat(food);
    }

    public String eat(Fish fish)
    {
        return "Cat says: " + "Yeah I love fish, that's my kind of food";
    }
}

class Food
{

}

class Fish extends Food
{

}

public class DemoDoubleDispatch
{
    public static void main(String args[])
    {
        //Lets first see what is Double Dispatch Problem
        Animal animal = new Cat();  //a superclass Animal referring to a subclass Cat 
        Food food = new Fish();     //a superclass Food referring to a subclass Fish

        //as the type of food is Fish and type of animal is Cat you would expect the following line to make a call to cat.eat(Fish fish) 
        //but it actually calls cat.eat(Food food)
        System.out.println(animal.eat(food));

        //You fix the above problem by implementing Visitor pattern, see TestVisitor.java
    }
}
