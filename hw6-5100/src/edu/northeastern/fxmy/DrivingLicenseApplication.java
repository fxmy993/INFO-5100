package edu.northeastern.fxmy;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DrivingLicenseApplication {

    public static void main(String[] args) {
        getDateOfBirthFromUser();
    }

    private static void getDateOfBirthFromUser() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Drivers Birth Year");
        String strYear = myObj.nextLine();
        int year = Integer.parseInt(strYear);
        System.out.println("Enter Drivers Birth Month");

        String strMonth = myObj.nextLine();
        int month = Integer.parseInt(strMonth);

        System.out.println("Enter Drivers Birth Date");

        String strDate = myObj.nextLine();
        int day = Integer.parseInt(strDate);

        Date dateNow = new Date();

        Date date = new GregorianCalendar(year, month -1, day).getTime();

        int difference = (int) ChronoUnit.DAYS.between( date.toInstant(), dateNow.toInstant());
        if(365* 16 > difference){
            System.out.println("The age of the applicant is 14 which is too early to apply for a driving license");
        }

    }
}
