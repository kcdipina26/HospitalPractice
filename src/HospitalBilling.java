//This java file consists of logical branching and writing the methods. 4/22/2026 - 4/28/2026

/*
Sample of method creation and example
    // int age = 87;  This line is wrong

    public boolean isPatientEligible(int age) {
        if (age > 65) {
            return true;
        } else {
        return false;
    }
}
 */

    public class HospitalBilling {


        private final double INSURANCE_DISCOUNT = 0.20;
        private final double SENIOR_DISCOUNT = 0.15;
        private final int SENIOR_AGE = 65;

        /*
        Calculate if patient qualifies for senior discount.
       Return true if age is 65 or older, false otherwise.

        Examples:
        isSeniorPatient(70) → true
       isSeniorPatient(65) → true
       isSeniorPatient(40) → false
        */
        public boolean isSeniorPatient(int age) {
            //If else condition if is senior = or > 65 return true else false
            if (age >= 65) {
                return true;
            } else {
                return false;
            }
        }

        /*
         Calculate the patient's final bill after insurance discount.
       Insurance always covers 20% of the bill.
        Return the amount patient owes.

        Examples:
        calculateBillAfterInsurance(1000.00) → 800.0
        calculateBillAfterInsurance(500.00) → 400.0
         */
        public double calculateBillAfterInsurance(double totalBill) {
            double patientTotalBillWithInsurance = (totalBill * INSURANCE_DISCOUNT);
            //calculate patient total bill after insurance total bill - insurance * total bill (measure discount)
            double patientTotalBillAfterInsurance = (totalBill - patientTotalBillWithInsurance);
            //return patient total bill after insurance applied and data type is double per method.
            return patientTotalBillAfterInsurance;
        }

        /*
        If patient is a senior AND has insurance,
        apply BOTH senior discount and insurance discount.
        If only has insurance, apply insurance discount only.
        If neither, return full bill.

        Examples:
        calculateFinalBill(1000.00, true, true) → 650.0
        calculateFinalBill(1000.00, false, true) → 800.0
        calculateFinalBill(1000.00, false, false) → 1000.0
        */
        public double calculateFinalBill(double totalBill, boolean isSenior, boolean hasInsurance) {
            //calculate the senior total bill with insurance
            double seniorTotalBillWithInsurance = (INSURANCE_DISCOUNT * totalBill) + (SENIOR_DISCOUNT * totalBill);
            double seniorTotalBillAfterInsurance = totalBill - seniorTotalBillWithInsurance;
            double totalBillOffInsurance = (totalBill) * (INSURANCE_DISCOUNT);
            double totalBillAfterInsurance = totalBill - totalBillOffInsurance;
            double totalBillWithoutInsurance = totalBill;
            if (isSenior) {
                if (hasInsurance) {
                    return seniorTotalBillAfterInsurance;
                }
            } else if (hasInsurance) {
                return totalBillAfterInsurance;

            }
            return totalBillWithoutInsurance;
        }

/*
  A hospital collected payments from 5 patients: $200, $450, $300, $150, $500. Print total at the end:
  Total collected: $1600.0
   Patient 1: Payment is 200.00
  Patient 2: Payment received 450
   .......
  Total collected (sum all )
 */

        public int patientTotalCollection(int[] totalPatientCollection) {
            int[] totalCollection = new int[]{200, 450, 300, 150, 500};

            for (int i = 1; i <= 5; i++) {
                System.out.println("Patient " + i + " Payment received is " + totalCollection);
            }
            int sum = 0;
            for (int i = 0; i < totalCollection.length; i++) {
                sum = sum + totalCollection[i];
                System.out.println("Total collected is " + totalCollection);
            }
            return sum;
        }

        /*
       Q12. Write a method calculateInsuranceCoverage(double bill, double coveragePercent) that returns how much insurance pays.

       */
        public double calculateInsuranceCoverage(double bill, double coveragePercent) {
            double insurancePays = bill * coveragePercent;
            double totalBill = bill - insurancePays;
            System.out.println("Check if you qualify for insurance ");
            System.out.print("Insurance covered $ " + insurancePays + " Off total balance $ ");
            return totalBill;
        }

        /*
         Q13. Write a method isEligibleForDiscount(int age, boolean hasInsurance) that returns true
         only if patient is over 60 AND has insurance.
         */
        public boolean isEligibleForDiscount(int age, boolean hasInsurance) {     //public:anyone can access it, boolean: method return type, is eligible for discount: method name, parameters age & has insurance

            if(age > 60 && hasInsurance == true){                               // FIXED: if conditional  statement to check age over 60 and has insurance only then qualify for senior discount

                return true;                                                  // return true if condition met

            } else {                                                      //return false if condition on age & insurance is not met

                return false;                                            
            }

            }
        /*
         Q14. Write a method getDepartmentStatus(int staffCount) that returns
        "Understaffed" if below 30, "Adequate" if 30-50, "Fully staffed" if above 50.
         */
        public String getDepartmentStatus(int staffCount) {       //public:anyone can access, String: return type, parameter integer with staffcount variable
            if (staffCount < 30) {                               //if statement less than 30, print under staff
                return "Understaffed";
            } else if (staffCount <= 50) {                      // if statement less or equal to 50, print adequate
              return "Adequate";

            }else {                                           // else statement if its over 50, print fully staffed.
                return "Fully Staffed";
            }

        }                                                   //closing braces of method
        /*
         Q15. Write a method calculateOvertimePay(int hoursWorked, double hourlyRate) that
         calculates total pay including overtime for hours above 8.
         */
        public double calculateOvertimePay(int hoursWorked, double hourlyRate){      // public method: anyone can access it, method retrun type: double, method name: calculate over time pay, parameters int hrs worked & double hourly rate

            final double OVER_TIME_RATE = 1.5;                                       //constant variable over time date: 1.5 rate

            final int REGULAR_HRS = 8;                                               //constant variable integer regular hours = 8.

            double overTimeHrs = hoursWorked - REGULAR_HRS;                          //calculation  for over time hrs

            double totalRegularPay = (REGULAR_HRS * hourlyRate);                    //calculation for total regular hrs worked pay

            double overTimePay = totalRegularPay + (overTimeHrs * hourlyRate * OVER_TIME_RATE); //calculation for total pay if worked overtime

                if(hoursWorked > REGULAR_HRS){                                      //if statement to check if worked overtime?

                    return overTimePay;                                            // if worked over time calculate and print dollar amount

                }else{                                                             // else no worked overtime, regular hours

                    return totalRegularPay;                                      //print pay if worked regular hrs.

                }
        }


        /*
         Q16. Write a method getPatientPriority(int heartRate, double temperature) that
        takes both vitals and returns "Critical", "High", "Normal" based on both conditions combined.
         */
        public String getPatientPriority(int heartRate, double temperature){          //public: anyone can access it, return type: String, method name: get patient priority, parameter: int heart rate & double temperature

            if(heartRate > 120 && temperature > 99.8){                                //if statement heart rate > 120 and temperature is greater than 99.8

                return "Critical";                                                    //print critical if it meets condition.


            } else if(heartRate>= 100 && heartRate<= 120 && temperature > 99.8) {    //FIXED: else if condition equals to or greater than 100, heart rate greater than 120, temperature greater than 99.8

                return "High";                                                       // print priority high

            } else {                                                                 // if heart rate is less than 100 and temperature less than 99.8

                return  "Normal";                                                   // print priority normal
            }

        }
        
        public static void main(String[] args) {
            HospitalBilling billing = new HospitalBilling();      //calling the method
//            System.out.println(billing.isSeniorPatient(70));
//            System.out.println(billing.isSeniorPatient(65));
//            System.out.println(billing.isSeniorPatient(40));
//            System.out.println(billing.calculateBillAfterInsurance(500.00));
//            System.out.println(billing.calculateFinalBill(1000.00, true, true));
//            //System.out.println(billing.patientTotalCollection(200));
           // System.out.println(billing.calculateInsuranceCoverage(300.00, 0.20));
            System.out.println(billing.isEligibleForDiscount(40,true));
            //System.out.println(billing.getDepartmentStatus(60));
           // System.out.println(billing.calculateOvertimePay(9, 37.5));
           System.out.println(billing.getPatientPriority(100,99.9));
        }

    }

