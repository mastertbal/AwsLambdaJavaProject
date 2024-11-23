package com.mastertbal;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Utility implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String s, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("JDK VERSION: " + System.getProperty("java.version"));
        byte[] nums = s.getBytes();
        String binaryString = "";
        for(int i = 0; i < nums.length; i++) {
            binaryString += Integer.toBinaryString(nums[i]) + " ";
        }
        return binaryString;
    }
}
