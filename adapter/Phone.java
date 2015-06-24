/*
 * Phone implements the Communicator interface completely as expected by client
 */
public class Phone implements Communicator
{
    public void sendMessage(String msg)
    {
        System.out.println("Sending normal message: " + msg);
    }

    public void callNumber(String phoneNumber)
    {
        System.out.println("Dialing phone number: " + phoneNumber);
    }

    public void openURL(String url)
    {
        System.out.println("Opening URL: " + url);
    }
}
