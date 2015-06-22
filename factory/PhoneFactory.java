
/* This is the factory whose job is to create phones and
 * allows us a single place to modify object creation code
 */

public class PhoneFactory
{
    public Phone makePhone(int phoneType)
    {
        if (phoneType < 25)
            return new iPhone();
        else if (phoneType < 50)
            return new Galaxy();
        else if (phoneType < 75)
            return new MotoE();

        //shouldn't come here
        return null;

    }


}
