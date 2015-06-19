public class Phone
{
	private String name;
	private String os;
	private String color;
	private String capacity;
	private double width;
	private double height;
	private double weight;

    //  Phone is not aware of what capabilities a certain model would have
    //  it just knows that the behavior will be available to its subclasses
    //
    //  this allows us to dynamically change the behavior/algorithm of an object at run time
	protected Capability capability;

	public String isCameraAccessible()
	{
		return capability.canShootPicture();
	}

	public void setCapability(Capability newCapability)
	{
		capability = newCapability;
	}
}
