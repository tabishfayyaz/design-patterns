import java.util.Random;

public class TestFactory
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int phoneType = rand.nextInt(75);      
        
        //Create the factory object
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone phone = phoneFactory.makePhone(phoneType);

        /* a BAD way would would be to write the logic of object
         * creation here and not abstract it away into other class
         */

        System.out.println("Phone type number was: " + phoneType + " so factory created " + phone.getName());
        // now you can do further stuff with your phone object
    }
}
