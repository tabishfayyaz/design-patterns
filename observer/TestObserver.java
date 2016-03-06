import java.util.ArrayList;

/*
 *  The product is a publisher that publishes price changes to all interested buyers
 */

//publisher
interface Subject
{
    public void register(Observer o);
    public void unRegister(Observer o);
    public void notifyObserver();
}

//subscriber
interface Observer
{
    public void update(Subject s);
}

//buyer of a product
class Buyer implements Observer
{
    private String name;
    public Buyer(String name, Subject s)
    {
        this.name = name;
        s.register(this);
    }

    public void update(Subject s)
    {
        Product p = (Product)s; 
        System.out.println("Notifying " + name + " about " + p.name + " new price: " + p.price);
    }
}

//product could be anything e.g. book, electronic etc.
class Product implements Subject
{
    private ArrayList<Observer> observers = new ArrayList<Observer>();  //list of observers to be notified of price change in product
    public String name;
    public int price;

    public Product(String name)
    {
        this.name = name;
    }

    public void priceChanged(int newPrice)
    {
        price = newPrice;
        notifyObserver();
    }

    public void register(Observer o)
    {
        observers.add(o);   //add a new observer to array list
    }

    public void unRegister(Observer o)
    {
        observers.remove(o); //remove observer from array list
    }

    public void notifyObserver()
    {
        for(Observer observer : observers)
        {
            observer.update(this);
        }
    }
}

public class TestObserver
{
    public static void main(String args[])
    {
        Product product = new Product("Lion King");

        //potential buyers who want to be notified when price of a product changes
        Buyer buyer1 = new Buyer("Buyer 1", product);
        Buyer buyer2 = new Buyer("Buyer 2", product);

        product.priceChanged(2);
        product.priceChanged(5);
    }

}
