
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
