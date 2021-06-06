package com.roofStacks.utilities;


public class BrowserUtils {

    /**
     * static wait with seconds
     * @param seconds
     */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}