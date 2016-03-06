
import java.util.ArrayList;

/*
 *  A mediator object controls the state of three collaborating doors. All communication is handled by mediator and the doors don't know anything about each other.
 *  This reduces the dependencies between communicating objects and lowers coupling.
 */

//abstract colleague
interface Colleague
{
    public void toggle();
}

//abstract mediator
interface Mediator
{
    public void updateStatus(Door openedDoor);
    public void register(Door door);
}

//concrete colleague
class Door implements Colleague
{
    private Mediator mediator;
    private String doorName;

    public Door(String doorName, Mediator mediator)
    {
        this.doorName = doorName;
        this.mediator = mediator;

        mediator.register(this);
    }

    public void toggle()
    {
        mediator.updateStatus(this);
    }

    public void open()
    {
        System.out.println("Opened: " + doorName);
    }

    public void close()
    {
        System.out.println("Closed: " + doorName);
    }
}

//concrete mediator
class DoorMediator implements Mediator
{
    private ArrayList<Door> doorList = new ArrayList<Door>();
    
    public void register(Door door)
    {
        doorList.add(door);
    }

    public void updateStatus(Door openedDoor)
    {
        //open 1 door and close all the others
        for (Door door : doorList)
        {
            if (door == openedDoor)
                door.open();
            else
                door.close();
        }
    }
}

public class TestMediator
{
    public static void main(String args[])
    {
        DoorMediator mediator = new DoorMediator();

        //imagine a room where only one door can be open at a time
        //when one door opens, the others have to be closed
        Door frontDoor = new Door("front-door", mediator);
        Door backDoor = new Door("back-door", mediator);
        Door sideDoor = new Door("side-door", mediator);

        frontDoor.toggle();
        System.out.println("");
        backDoor.toggle();
        System.out.println("");
        sideDoor.toggle();
    }
}
