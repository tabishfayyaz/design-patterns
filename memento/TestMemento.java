import java.util.ArrayList;

//  Originator: Some object that has an internal state. Sets and Get values from the currently referenced Memento. Creates new Mementos and assigns values to them.
class Originator
{
    private String document;    //value for current memento
    //The class could also contain additional data that is not part of the values saved in the memento

    public void set(String document)
    {
        System.out.println("Originator: Setting document to " + document);
        this.document = document;
    } 

    public Memento saveMemento()
    {
        System.out.println("Originator: Saving Memento.");
        return new Memento(this.document);
    }

    public void restoreFromMemento(Memento memento)
    {
        this.document = memento.getDocument();
        System.out.println("Originator: State after restoring from Memento: " + document);
    }
}

//  Memento: The basic object that is stored in different states
class Memento
{
    private String document;
    public Memento(String docToSave)
    {
        document = docToSave;
    }
    public String getDocument()
    {
        return document;
    }
}

//  Caretaker: Holds a List that containts all previous versions of the Memento. It can store and retrieve stored Mementos
class Caretaker
{
    //  where all mementos are saved
    ArrayList<Memento> savedDocuments = new ArrayList<Memento>();

    public void addMemento(Memento m)
    {
        savedDocuments.add(m);
    }

    public Memento getMemento(int index)
    {
        return savedDocuments.get(index);
    }
}

public class TestMemento
{
    public static void main(String args[])
    {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.set("Document 1");
        originator.set("Document 2");
        caretaker.addMemento(originator.saveMemento());
        originator.set("Document 3");
        caretaker.addMemento(originator.saveMemento());
        originator.set("Document 4");
    
        //we can choose which memento to roll back to:
        originator.restoreFromMemento(caretaker.getMemento(0));
    }
}

