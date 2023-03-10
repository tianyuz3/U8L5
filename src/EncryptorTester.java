import java.util.Arrays;

public class EncryptorTester
{
    public static void main(String[] args)
    {
        //encrypt message
        Encryptor e = new Encryptor(4,2);
        System.out.println(e.encryptMessage("Hi! sdrawkcab em daeR"));
        //decrypt message
        Encryptor d = new Encryptor(4,2);
        System.out.println(d.decryptMessage("H!sri dawcbeka m aRAdeAA"));
    }
}