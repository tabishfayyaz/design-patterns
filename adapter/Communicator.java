/*
 * Communicator is the interface client expects to work with when. The job of an adapter object
 * is to wrap new classes in a way that they expose same methods as this interface
 */
public interface Communicator
{
    public void sendMessage(String msg);
    public void callNumber(String phoneNumber);
    public void openURL(String url);
}
