/*
 * iPhone is an adaptee object that can be used directly as well as wrapped inside the Adapter object
 * An adapter job is to call the right methods on iPhone
 */
public class iPhone
{
    public void sendiMessage(String msg)
    {
        System.out.println("Sending iMessage: " + msg);
    }

    public void useFacetime(String phoneNumber)
    {
        System.out.println("Calling through Facetime: " + phoneNumber);
    }

    public void loadURL(String url)
    {
        System.out.println("Opening url in safari: " + url);
    }
}
