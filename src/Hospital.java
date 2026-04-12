/*This file is a beginning of a Hospital Billing Program
DATA TYPES & VARIABLES
Hospital Billing System — Data Types & Variables — 10 Questions:

Declare the total number of patient beds in the hospital
Declare the exact cost of an MRI scan including cents
Declare whether a patient has been discharged or not
Declare a patient's heart rate in beats per minute
Declare the hospital's total annual revenue as a very large precise number
Declare a single character representing a patient's gender
Declare a nurse's exact hourly wage
Declare whether the ICU is currently full
Declare a patient's exact blood oxygen level as a percentage like 98.6
Declare the maximum number of surgeries allowed per day

 */

public class Hospital {
    public static void main(String[] args) {
        int totalNoBeds = 300;             //declared & assigned totalNoOfHospitalBeds in the hospital,int is better due to whole no
        double costOfMRIScan = 400.68;         //declared the exact cost of an MRI scan including cents double better for money
        boolean hasPtDischarged = false;    //declared & assigned a value of patient discharge status boolean for condition
        short ptHeartBeatsPerMin = 120;     //declared & assigned heart beat per minutes in short integers due to limitation in no
        double hospitalTotalYearlyRevenue = 4000000.89;  //declared & assigned hospital total annual revenue no double for large precision
        char ptGender = 'F';                    //declared & assigned patient gender char m for male and f for female. One character so char
        double nurseHourlyWage = 50.67;              //declared & assigned nurse hourly wage can be decimal for some nurses so double
        boolean isIcuRoomFull = true;            //declared & assigned ICU room is available or not condition for boolean
        double ptBloodO2LevelPercentage = 100;  //declared & assigned patient blood oxygen percentage, double for precision
        int maxNoOfSurgeriesPerDay = 26;          //declared & assigned max no of surgeries allowed per day whole no for int

    }
}