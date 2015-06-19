
/* 
    The interface can be implemented by any number of subclasses allowing for 
    many types of capabilities without impacting Phone or Capability

    Classes that implement new Capability interfaces can allow other
    classes to use that code eliminating code duplication
*/

public interface Capability
{
	String canShootPicture();
}

// class used if camera accessible on phone
class CameraAccessible implements Capability
{
    public String canShootPicture()
    {
        return "Yes";
    }

}

// class use if camera not accessible on phone
class CameraNotAccessible implements Capability
{
    public String canShootPicture()
    {
        return "No";
    }

}
