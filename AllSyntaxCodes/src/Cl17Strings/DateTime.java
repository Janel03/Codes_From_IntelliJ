package Cl17Strings;

import java.util.Date;

public class DateTime {
    public static void main(String[] args) throws InterruptedException {

    //Date today = new Date();
        //System.out.println(today);

        Date today = new Date();
        Thread.sleep(3000);
        Date newTime =  new Date();
        long finalDelay = newTime.getTime()-today.getTime();
        System.out.println("Difference in time is " + finalDelay +" milliseconds" );
    }}