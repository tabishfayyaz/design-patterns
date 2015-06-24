/*
 * iPhoneAdapter implements the Communicator interface to provide the methods client is expecting and also
 * contains an adaptee object (iPhone in this case) to forward all method cals for Communicator to iPhone
 * The user does not have to worry about the internal details of adaptee objects and always get to work with a 
 * familiar consistent interface
 */
public class iPhoneAdapter implements Communicator
{
    private iPhone iphone;

    public iPhoneAdapter(iPhone newiPhone)
    {
        iphone = newiPhone;
    }

    public void sendMessage(String msg)
    {
        iphone.sendiMessage(msg);
    }

    public void callNumber(String phoneNumber)
    {
        iphone.useFacetime(phoneNumber);
    }

    public void openURL(String url)
    {
        iphone.loadURL(url);
    }
}
