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
        public boolean isSeniorPatient(int age) {              //This is one of the method for this question
            if (age >= 70 || age >= 65) {
                return true;
            }  else if (age == 40) {                 //last else if and else is optional, therefore is not present
                return false;
            }
            return false;

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
            double patientTotalBillOffInsurance = (totalBill / INSURANCE_DISCOUNT);
            return patientTotalBillOffInsurance;
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
            double seniorTotalBillAfterInsurance = (totalBill) * (INSURANCE_DISCOUNT + SENIOR_DISCOUNT);
            double totalBillAfterInsurance = (totalBill) * (INSURANCE_DISCOUNT);
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
            System.out.println(billing.isSeniorPatient(56));
            System.out.println(billing.calculateBillAfterInsurance(1000.00));
            System.out.println(billing.calculateFinalBill(1000.00, true, true));
            return;

        }

    }
