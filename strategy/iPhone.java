public class iPhone extends Phone
{
    public iPhone()
    {
        super();

        //set the default behavior as camera accessible
        capability = new CameraAccessible();
    }

    /* a BAD way to do this would be to override this method in every subclass. This
     * would cause a lot of code duplication and not abstract the behavior to different
     * subclasses which is what Strategy pattern enables us to do
    public String isCameraAccessible()
    {
        return "Yes";
    }
    */
}
