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
    }
}
