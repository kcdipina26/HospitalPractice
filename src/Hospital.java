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
        boolean isIcuRoomFull = true;            //declared & assigned ICU room is available or not condition for boolean
        double ptBloodO2LevelPercentage = 100;  //declared & assigned patient blood oxygen percentage, double for precision
        int maxNoOfSurgeriesPerDay = 26;          //declared & assigned max no of surgeries allowed per day whole no for int

    /*
    Data Types and Variable Practice


     */
/*
Lesson 2 Simple If/Else for Hospital Billing System
Question 1: If a patient's age is over 65 print "Qualifies for senior discount" otherwise "Full payment required"
 */
        int ptAge = 67;       //assigned & declared a variable as ptAge entry into the hospital system

        if (ptAge > 65) {         //if patient age is over 65 it meets patient senior discount condition
         System.out.println("Patient Qualifies For Senior Discount");       //output for if condition is met
             } else {                                 //if the condition is different then
            System.out.println("Patient Full Payment Required");      // output for else condition is met
             }
/*
Question 2: If hospital bill is greater than 15000 print "Payment plan available" otherwise "Full payment due today"
 */
        double ptHospitalBill = 20000;              //declared & assigned a value to ptHospital variable, double for money & precision

        if (ptHospitalBill > 15000) {           //  if condition and check value
            System.out.println("Payment Plan Available");      //output of if condition is met
        } else {
            System.out.println("Full Payment due Today");         // output of else condition is met
        }

/*
Question 3: If a nurse's hourly wage is above 45 print "Senior nurse rate" otherwise "Junior nurse rate"

 */
        double nurseHourlyWage = 56.8;     //declared & assigned a value to nurseHourlyWage variable, for money double is precise data type

        if(nurseHourlyWage > 45) {       //condition for the wage to separate senior vs junior nursing staff hourly rate
            System.out.println("Senior nurse rate");             //output of  if condition is met
        } else {                                                 //else condition
            System.out.println("Junior nurse rate");            //output of else condition is met
        }
/*
Question 4: If ICU is full print "Redirecting patient to nearest hospital" otherwise "ICU bed assigned"
 */
        boolean isIcuFull = false;    //declare & assigned a value to noOfIcuBeds variable boolean for either or condition

        if(isIcuFull) {                // if condition statement
            System.out.println("Redirecting patient to a nearest hospital"); //output of if condition is met
        } else {
            System.out.println("ICU bed assigned to the patient");      // output of else condition is met

        }
/*
Question 5: If patient blood oxygen is below 95 print "Oxygen support needed immediately" otherwise "Oxygen levels normal"
 */
        double ptBloodO2Level = 90;           //double data type and declares & assigned value to  ptBloodO2Level variable for precision

        if (ptBloodO2Level < 95) {            //if condition statement
            System.out.println("Oxygen support needed immediately");      //output if the if condition is met
        } else {
            System.out.println("Oxygen levels normal");              //output if the else statement is met
        }

/*
Question 6: If total surgeries today exceeded 20 print "No more surgeries scheduled today" otherwise "Surgery can be scheduled"
 */
        int maxsurgeriesPerDay = 20;         // declared and assigned value to surgeriesPerDay variable

        if(maxsurgeriesPerDay > 20) {        //condition set for if statement max surgeries allowed
            System.out.println("Maximum allowed surgeries per day limit crossed, please choose another day");  //output for if condition is met
        } else {
            System.out.println("Available surgery slots for today");  //output for else condition is met

        }
    }
}