public class Galaxy extends Phone
{
    public Galaxy()
    {
        super();
    
        //set the default behavior as camera accessible
        capability = new CameraAccessible();
    }

}
