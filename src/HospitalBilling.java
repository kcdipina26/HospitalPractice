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


        public static void main(String[] args) {
            HospitalBilling billing = new HospitalBilling();      //calling the method
            System.out.println(billing.isSeniorPatient(70));
            System.out.println(billing.isSeniorPatient(65));
            System.out.println(billing.isSeniorPatient(40));
            System.out.println(billing.calculateBillAfterInsurance(500.00));
            System.out.println(billing.calculateFinalBill(1000.00, true, true));
            return;


        }
    }


