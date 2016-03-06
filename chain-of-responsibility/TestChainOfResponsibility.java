/*
 *  We have 3 different type of fork lifts each having a different capacity of weight it can handle.
 *  Every time a fork lift receives a weight request and if it exceeds its capacity it'll pass the request to 
 *  the successor fork lift
 *   
 * */

interface Chain
{
    public void setSuccessor(Chain successor);  //the next object to receive the request if this object can't process it
    public void processRequest(WeightRequest weightRequest); //either solve the problem or pass it to successor
}

class WeightRequest
{
    public int weight;
    public String purpose;

    public WeightRequest(int weight)
    {
        this.weight = weight;
    }
}

class SmallForkLift implements Chain
{
    private Chain successor;
    private int capacity = 5;

    public void processRequest(WeightRequest weightRequest)
    {
        if (weightRequest.weight <= capacity)
        {
            System.out.println("Small Fork Life can handle your request");
        }
        else
            successor.processRequest(weightRequest);
    }
    public void setSuccessor(Chain successor)
    {
        this.successor = successor;
    }
}


class MediumForkLift implements Chain
{
    private Chain successor;
    private int capacity = 10;

    public void processRequest(WeightRequest weightRequest)
    {
        if (weightRequest.weight <= capacity)
        {
            System.out.println("Medium Fork Life can handle your request");
        }
        else
            successor.processRequest(weightRequest);
    }

    public void setSuccessor(Chain successor)
    {
        this.successor = successor;
    }

}


class LargeForkLift implements Chain
{
    private Chain successor;
    private int capacity = 15;

    public void processRequest(WeightRequest weightRequest)
    {
        if (weightRequest.weight <= capacity)
        {
            System.out.println("Large Fork Life can handle your request");
        }
        else
        {
            System.out.println("No one available to handle your request");
        }
    }
    public void setSuccessor(Chain successor)
    {
        this.successor = successor;
    }

}


public class TestChainOfResponsibility
{
    public static void main(String args[])
    {
        //define all objects in the chain
        Chain smallLift = new SmallForkLift();
        Chain mediumLift = new MediumForkLift();
        Chain largeLift = new LargeForkLift();

        //if smallest fork lift cannot handle the weight, we pass it to medium one and 
        //if medium life cannot handle the weight then it passes it to large life
        smallLift.setSuccessor(mediumLift);
        mediumLift.setSuccessor(largeLift);
        
        WeightRequest request = new WeightRequest(7);
        smallLift.processRequest(request);
    }

}
