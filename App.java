import java.security.SecureRandom;

public class App {

    private static final String Char_Pool ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{};:'\",./?`~";
    private static final int Default_Length = 8;

    public static void main(String[] args) throws Exception {
        System.out.println(generatePassword(5));
        System.out.println(generatePassword(10));
        System.out.println(generatePassword(15));
    }

    public static String generatePassword(int length)
    {
        if(length < 8)
        {
            length=Default_Length;
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for(int i=0;i<length;i++)
        {
            int index=random.nextInt(Char_Pool.length());
            password.append(Char_Pool.charAt(index));
        }

        return password.toString();
    }
}
