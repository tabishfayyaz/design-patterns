interface IAnimalVisitable
{
    public String acceptFood(IFoodVisitor food);
}

/*  
 *  Visitor pattern is not good for situation where "visited" classes are not stable. Every time a new derived class is added e.g.
 *  a new type of animal then every class implementing IFoodVisitor interface would have to provide implementation for the new type of animal
*/

interface IFoodVisitor
{
    public String visitBy(Dog dog);
    public String visitBy(Chicken chicken);
    public String visitBy(Parrot parrot);
}

class Dog implements IAnimalVisitable
{
    public String acceptFood(IFoodVisitor ifood)
    {
        return "Dog says: " + ifood.visitBy(this);
    }
}

class Chicken implements IAnimalVisitable
{
    public String acceptFood(IFoodVisitor ifood)
    {
        return "Chicken says: " + ifood.visitBy(this);
    }
}

class Parrot implements IAnimalVisitable
{
    public String acceptFood(IFoodVisitor ifood)
    {
        return "Parrot says: " + ifood.visitBy(this);
    }
}

class Nuts implements IFoodVisitor
{
    public String visitBy(Dog dog)
    {
        return "No nuts for me";
    }
    
    public String visitBy(Chicken chicken)
    {
        return "I do grains not nuts";
    }

    public String visitBy(Parrot parrot)
    {
        return "Do you have more nuts too?";
    }
}

class Meat implements IFoodVisitor
{
    public String visitBy(Dog dog)
    {
        return "I love meat";
    }

    public String visitBy(Chicken chicken)
    {
        return "I don't eat meat but people eat me as meat";
    }

    public String visitBy(Parrot parrot)
    {
        return "I am really not a meat type of person";
    }
}

public class TestVisitor
{
    public static void main(String args[])
    {
        //in DemoDoubleDispatch.java you saw what is the problem of Double Dispatch
        //You fix the Double Dispatch problem by implementing a Visitor pattern

        //Dog, Chicken & Parrot implement IAnimalVisitable interface
        IAnimalVisitable dog = new Dog();
        IAnimalVisitable chicken = new Chicken();
        IAnimalVisitable parrot = new Parrot();

        //Meat & Nuts implement IFoodVisitor interface
        IFoodVisitor meat = new Meat();
        IFoodVisitor nuts = new Nuts();

        //Now you can perform the same action i.e. accept food on objects of different types
        System.out.println(dog.acceptFood(meat));
        System.out.println(chicken.acceptFood(meat));
        System.out.println(parrot.acceptFood(nuts)); 
    }
}
