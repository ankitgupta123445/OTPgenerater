import java.util.Random;

public class OtpGenerater {
    public static char[] otp(){
        Random random = new Random();
        String x = "ABCEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "123456789";
        char[] otp = new char[6];
        for (int i = 0; i < otp.length; i++) {
            otp[i]=x.charAt(random.nextInt(x.length()));
        }
        return otp;
    }

    public static void main(String[] args) {
        System.out.println(otp());
    }





}
