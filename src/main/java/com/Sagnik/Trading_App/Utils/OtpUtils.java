package com.Sagnik.Trading_App.Utils;

import java.util.Random;

public class OtpUtils {
    public static String generatedOTP(){
        int otplength = 6;
        Random rand = new Random();
        StringBuilder otp = new StringBuilder(otplength);

        for(int i=0;i<otplength;i++){
            otp.append(rand.nextInt(10));
        }
        return otp.toString();
    }
}
