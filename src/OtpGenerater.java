import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class OtpGenerater {
    public static char[] otp(int len){
        Random random = new Random();
        String x = "ABCEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "123456789"+"@#$%&";
        char[] otp = new char[len];
        for (int i = 0; i < otp.length; i++) {
            otp[i]=x.charAt(random.nextInt(x.length()));
        }
        return otp;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of otp");
            int len = sc.nextInt();
            System.out.println(otp(len));
        } catch (InputMismatchException e) {
            System.out.println("enter valid input");

        }


    }


}
