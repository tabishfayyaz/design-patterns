public class TestAdapter
{
    public static void main(String[] args)
    {
        Phone phone = new Phone();  //implements the expected client interface perfectly
        iPhone iphone = new iPhone();   //adaptee object, you could have any number and type of adaptee objects 
        iPhoneAdapter iphoneAdapter = new iPhoneAdapter(iphone);   //it wraps around the adaptee object to provide a consistent interface that client expects

        System.out.println("\nFirst lets call methods on iPhone directly:");
        iphone.sendiMessage("Hello Candy");
        iphone.useFacetime("202-555-0178");
        iphone.loadURL("www.google.com");

        System.out.println("\nSecond lets call methods on a Phone:");
        phone.sendMessage("Hello Custard");
        phone.callNumber("202-555-0100");
        phone.openURL("www.yahoo.com");

        System.out.println("\nNow lets communicate with iPhone using an adapter object:");
        iphoneAdapter.sendMessage("Hello Candy");
        iphoneAdapter.callNumber("202-555-0178");
        iphoneAdapter.openURL("www.google.com");

    }
}
