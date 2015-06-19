public class TestStrategy
{
    public static void main(String[] args)
    {
        Phone myPhone = new iPhone();
        Phone yourPhone = new Galaxy();

        System.out.println("iPhone Camera Accessible: " + myPhone.isCameraAccessible());
        System.out.println("Galaxy Camera Accessible: " + yourPhone.isCameraAccessible());

        //dynamically changing the status of camera accessible
        yourPhone.setCapability(new CameraNotAccessible());

        System.out.println("Galaxy Camera Accessible Now: " + yourPhone.isCameraAccessible());
    }
}
