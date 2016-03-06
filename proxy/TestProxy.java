
//the interface against which the proxy and real classes are created
interface Image
{
    public void displayImage();
}

//running on another system A
class RealImage implements Image
{
    private String filename = null;
    public RealImage(String filename)
    {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk()
    {
        System.out.println("Loading " + filename);
    }

    public void displayImage()
    {
        System.out.println("Displaying " + filename);
    }
}

//proxy is a wrapper or agent object around the real object e.g. proxy running on another system B and can represent the real image over here for system B
//a proxy could interface to anything: a network connection, a large object in memory or some other expensive resource
class ProxyImage implements Image
{
    private RealImage image = null;
    private String filename = null;

    public ProxyImage(String filename)
    {
        this.filename = filename;
    }

    //in the proxy extra functionality can be provided e.g. caching, checking preconditions before operations on the real object etc.
    //laxy loading is not part of Proxy pattern but just for demonstration purposes
    public void displayImage()
    {
        if (image == null)
        {
            image = new RealImage(filename);
        }
        image.displayImage();
    }
}

public class TestProxy
{
    public static void main(String args[])
    {
        Image img1 = new ProxyImage("10MB_Photo1");
        Image img2 = new ProxyImage("10MB_Photo2");

        img1.displayImage();    //loading necessary
        img1.displayImage();    //loading unnecessary
        img2.displayImage();    //loading necessary
        img2.displayImage();    //loading unnecessary
    }
}
