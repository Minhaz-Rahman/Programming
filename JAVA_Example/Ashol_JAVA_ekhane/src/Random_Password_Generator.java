
import java.sql.SQLOutput;
import java.util.*;

class Password {
    private int lengthOfPassword;
    char[] chars = new char[92];
    private StringBuilder randomPassword = new StringBuilder();


    public Password(int lengthOfPassword, char[] chars) {
        this.lengthOfPassword = lengthOfPassword;
        this.chars = chars;
        Random random = new Random();
        for (int i = 0; i < lengthOfPassword; i++) {
            randomPassword.append(chars[random.nextInt(chars.length)]);
        }
        System.out.println("And Your Random Password Is  " + randomPassword);

    }


}

public class Random_Password_Generator {
    public static void main(String[] args) {
        char[] chars = new char[92];
        int x = 33;
        for (int i = 0; i < 92; i++) {
            chars[i] = (char) (x + i);
        }
        System.out.println("Your Random Password Will be from 8-16 characters: ");
        Random random = new Random();
        int lengthOfPassword = random.nextInt(9) + 8;
        Password password = new Password(lengthOfPassword, chars);
    }
}

