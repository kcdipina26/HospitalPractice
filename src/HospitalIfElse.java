public class HospitalIfElse {

    public static void main(String[] args) {
        //if/else if statement question practice
 /*
 Question 1: Patient Priority Level
A patient arrives at the hospital. Based on their heart rate, assign a priority level:

Heart rate above 120 → print "Critical - Immediate attention required"
Heart rate between 100 and 120 → print "High priority - seen within 30 minutes"
Heart rate between 60 and 99 → print "Normal - routine checkup"
Below 60 → print "Low - possible bradycardia, doctor review needed"

  */
  int ptHeartRate = 119;
  // Declared & assigned ptHeartRate variable even though BPM is whole no to be cautions gave it a variable
     if (ptHeartRate > 120) {                              //always put some critical case upfront for the program to catch
         System.out.println("Critical Immediate attention required");

     } else if (ptHeartRate > 100 && ptHeartRate <=120 ) {
         System.out.println("High priority patient to be seen within 30 minutes of arrival");

     } else if (ptHeartRate >=60 && ptHeartRate <=99) {
         System.out.println("Normal routine checkup");

        } else if (ptHeartRate < 60) {
         System.out.println("Low possible bradycardia doctor review needed");
        } else  {
         System.out.println("Value needs to be input to evaluate the patient heart rate criteria");

        }



        /*
Question2 — Bill Discount Category
Based on a patient's total hospital bill, apply a discount message:

Bill above 50000 → print "Eligible for 20% financial aid"
Bill between 20000 and 50000 → print "Eligible for 10% payment plan"
Bill between 5000 and 19999 → print "Standard payment due"
Below 5000 → print "Full payment due at checkout"
         */
        int totalBillAmount = 60;

        if (totalBillAmount > 50000) {
            System.out.println("Eligible for 20% financial aid");

        } else if (totalBillAmount <= 50000 && totalBillAmount >= 20000) {
            System.out.println("Eligible for 10% payment plan");
        } else if (totalBillAmount <= 19999 && totalBillAmount >= 5000) {
            System.out.println("Standard payment due");
        } else if (totalBillAmount < 5000) {
            System.out.println("Full payment due at checkout");
        } else {
            System.out.println("Please check with the cashier if you qualify for a discount");
        }

   /*
   More Practice if/else
   Question 1: A patient temp below 96 is hypothermia risk, 96-99 normal and 99-103 is fever and above  103 is critical fever.
    */
        int ptBodyTemp = 99;
        //If and else if condition: Remember what is most critical condition goes first
        if (ptBodyTemp > 103) {
            System.out.println("Patient has critical fever");

        } else if (ptBodyTemp >99 && ptBodyTemp <= 103) {
            System.out.println("Patient has a fever");
        } else if (ptBodyTemp < 96) {
            System.out.println("Patient is hypothermia risk");
        } else if (ptBodyTemp >= 96 && ptBodyTemp <= 99) {
            System.out.println("Patient Body Temperature is Normal");
        } else {
            System.out.println("Please take patient's temperature again");
        }
        /*
        Question 2: A nurse's years of experience: above 10 → "Senior nurse", 5-10 → "Mid level nurse", 1-4 → "Junior nurse", 0 → "In training"
         */
        int nurseExperienceInYrs = 6;

        if (nurseExperienceInYrs > 10) {
            System.out.println("Nurse is a senior by experience");

        } else if (nurseExperienceInYrs >=5 && nurseExperienceInYrs <= 10) {
            System.out.println("Nurse is a mid-level by experience");
        } else if (nurseExperienceInYrs >=1 && nurseExperienceInYrs <= 4) {
            System.out.println("Nurse is junior by experience");
        } else if (nurseExperienceInYrs < 1) {
            System.out.println("Nurse is in training due to no prior experience");
        }
     /*
     Question 3: Patient wait time in minutes: above 120 → "Critical wait time, escalate", 60-120 → "Long wait, notify supervisor",
      30-59 → "Moderate wait", below 30 → "Acceptable wait time"
      */
        int ptWaitTimeBymin = 30;
        if (ptWaitTimeBymin > 120) {
            System.out.println("Critical wait time, please escalate");
        } else if (ptWaitTimeBymin >= 60 &&  ptWaitTimeBymin <= 120) {
            System.out.println("Long wait time, notify attending supervisor");
        } else if (ptWaitTimeBymin >=30 && ptWaitTimeBymin <=59) {
            System.out.println("Moderate wait time");
        } else if (ptWaitTimeBymin < 30) {
            System.out.println("Acceptable wait time");
        } else {
            System.out.println("Please put in acceptable wait time in minutes");
        }
    }
}
