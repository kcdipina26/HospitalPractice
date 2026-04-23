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

        } else if (ptHeartRate > 100 && ptHeartRate <= 120) {
            System.out.println("High priority patient to be seen within 30 minutes of arrival");

        } else if (ptHeartRate >= 60 && ptHeartRate <= 99) {
            System.out.println("Normal routine checkup");

        } else if (ptHeartRate < 60) {
            System.out.println("Low possible bradycardia doctor review needed");
        } else {
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

        } else if (ptBodyTemp > 99 && ptBodyTemp <= 103) {
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
        int nurseExperienceInYrs = 8;
        // Inputting guard clause

        if (nurseExperienceInYrs < 0) {
            System.out.println("Invalid number please input positive number");
        } else if (nurseExperienceInYrs > 10) {
            System.out.println("Nurse is a senior by experience");

        } else if (nurseExperienceInYrs >= 5 && nurseExperienceInYrs <= 10) {
            System.out.println("Nurse is a mid-level by experience");
        } else if (nurseExperienceInYrs >= 1 && nurseExperienceInYrs <= 4) {
            System.out.println("Nurse is junior by experience");
        } else if (nurseExperienceInYrs < 1) {
            System.out.println("Nurse is in training due to no prior experience");

        } else {
            System.out.println("Please only input postivie value if input negative value fill out the form");
        }

     /*
     Question 3: Patient wait time in minutes: above 120 → "Critical wait time, escalate", 60-120 → "Long wait, notify supervisor",
      30-59 → "Moderate wait", below 30 → "Acceptable wait time"
      */

        int ptWaitTimeBymin = 30;
        if (ptWaitTimeBymin > 120) {
            System.out.println("Critical wait time, please escalate");
        } else if (ptWaitTimeBymin >= 60 && ptWaitTimeBymin <= 120) {
            System.out.println("Long wait time, notify attending supervisor");
        } else if (ptWaitTimeBymin >= 30 && ptWaitTimeBymin <= 59) {
            System.out.println("Moderate wait time");
        } else if (ptWaitTimeBymin < 30) {
            System.out.println("Acceptable wait time");
        } else {
            System.out.println("Please put in acceptable wait time in minutes");
        }

    /*
    Question 4: A patient's BMI: below 18.5 → "Underweight", 18.5-24.9 → "Normal", 25-29.9 → "Overweight", above 30 → "Obese"
     */
        //Assigned a double value to ptBMI variable name

        double ptBMI = 36.00;

        //If condition for obese BMI
        if (ptBMI >= 30.00) {
            System.out.println("Patient is Obese");

            // If-else condition for underweight BMI
        } else if (ptBMI < 18.5) {
            System.out.println("Patient is Underweight");

            // If-else condition for normal BMI
        } else if (ptBMI >= 18.5 && ptBMI <= 24.9) {
            System.out.println("Patient is within normal BMI");

            // If-else condition for the Overweight BMI
        } else if (ptBMI <= 29.9 && ptBMI >= 25) {
            System.out.println("Patient is Overweight");

            // else condition if double values do not align with the given range

        } else {
            System.out.println("Please check the patient BMI and input the value");
        }

  /*
  Question 5: Insurance claim amount: above 100_00_0 → "Requires executive approval",
  500_00-100_0_00 → "Requires manager approval", 100_00-49_99_9 → "Standard approval", below 100_00 → "Auto approved"
     */

        //Assign double value to the InsuranceClaim variable, since it is about money its always better to pick a double data type.

        double insuranceClaimInDollar = 100_0.00;

        //Inputting guard clause

        if (insuranceClaimInDollar < 0.00) {
            System.out.println("Invalid number please check and input valid number");

        // If condition for insurance claim needing executive approval

    } else if (insuranceClaimInDollar > 10_00_0.00) {
       System.out.println("Requires executive approval");

       // Else if condition for manager approval

   } else if (insuranceClaimInDollar <= 100_0_00.00 && insuranceClaimInDollar >= 500_00.00 ) {
       System.out.println("Requires manager approval");

 // Else if condition for insurance claim with standard approval

   } else if (insuranceClaimInDollar <= 49_99_9.00 && insuranceClaimInDollar >= 100_00.00) {
       System.out.println("Standard approval");

       // Else if condition for insurance claim for auto approval

   } else if (insuranceClaimInDollar <= 10000.00) {
       System.out.println("Auto Approved");
// Else condition for any other insurance claim , note right now this program only handles positive values.
   } else {
       System.out.println("Please check with the insurance and input the valid dollar amount");
   }
 /*
   If cat has food in bowl
  If feeder is also on - turn it off, bowl is full enough
  If feeder is off - cat can eat normally
   If cat has no food in bowl
   Turn feeder on
  */
  boolean catHasFood = true;
  boolean catFeeder = false;

  if (catHasFood) {
      if (catFeeder) {
          System.out.println("If feeder is also on- turn it off, bowl is full enough");
      } else {
          System.out.println("If feeder is off- cat can eat normally");
          }
      } else {
        System.out.println("If cat has no food in the bowl turn feeder on");
      }


    }
}
