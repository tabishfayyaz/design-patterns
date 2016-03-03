/*
 * The class for which we only want single instance for the whole application
 * */
class Profile
{
    public String userId;

    private Profile(){} //make the constructor private so object cannot be directly instantiated from outside

    private static Profile singleInstance = null;   //the instance variable that holds the singleton object
    public static Profile getSharedInstance()
    {
        /*  There is a chance for a type of race condition to happen here called check-then-act:
         *  You observe something to be tree (singleInstance is null) and then take action based on that
         *  observation (create Profile); but in fact the observation could have become invalid between the time
         *  you observed it and the time you acted on it (some other thread created Profile in the mean time), cause a 
         *  problem so to handle that we used synchronized block and make the instantiation process atomic:
         *  */
        synchronized(Profile.class)
        {
            if (singleInstance == null) //this is known as lazy initialization
            {
                singleInstance = new Profile();
            }
        }
        return singleInstance;
    }
}

public class TestSingleton
{
    public static void main(String[] args)
    {
        Profile profile1 = Profile.getSharedInstance();
        profile1.userId = "4321";

        System.out.println("profile1 user id: " + profile1.userId);

        Profile profile2 = Profile.getSharedInstance();
        System.out.println("profile2 user id: " + profile2.userId); //same id is returned as the instance is unique

    }
}
