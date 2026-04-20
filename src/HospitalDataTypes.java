public class HospitalDataTypes {
    public static void main(String[] args) {

/*
Exercises Data Types & Variable
 */
        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
        // ### EXAMPLE:
        int birdsOnABranch = 4;
        int birdsThatFlyAway = 1;
        int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. A hospital has 450 total beds. 289 are occupied. Declare both numbers and calculate how many beds
        are available? Print the result.
        */
        int totalBedsInHospital = 450;
        int occupiedBedsInHospital = 289;
        int leftOverBedsInHospital = totalBedsInHospital - occupiedBedsInHospital;
        System.out.println("leftOverBedsInHospital " + leftOverBedsInHospital);

        /*
        Exercise 3
        3. A nurse worked 8.5 hours a day at $52.75 per hour. Declare both and calculate her daily earnings.
        Print it.
         */
         double totalWorkedHrsPerDay = 8.50;
         double nurseRatePerHour = 52.75;
         double incomePerDay = totalWorkedHrsPerDay * nurseRatePerHour;
         System.out.println("Nurse Anna earned per day " + incomePerDay);

         /*
         Exercise 4
         4. Three departments reported supply costs this month - ICU: $ 12450,
         Emergency: $8320, Surgery: $15780. Declare all three and calculate total Print it
          */
        double icuDptTotalExpense = 12450.00;  // correction missed a 5 digit.
        double emergencyDeptTotalExpense = 8320.00;
        double surgeryDeptTotalExpense = 15780.00;
        double threeDeptSupplyCostPerMonth = icuDptTotalExpense + emergencyDeptTotalExpense + surgeryDeptTotalExpense;
        System.out.println("Total cost of ICU, Emergency and Surgery Department per month is " + threeDeptSupplyCostPerMonth);

        /*
        Exercise 5
        5.A patient's bill is $ 24680. Insurance covers 80% of it. Declare the bill, calculate the insurance amount
        and what the patient owes. Print both
         */
        double ptTotalBill = 24680.00;
        double insuranceCoverTotalBill = 80.00 / 100.00;
        double ptInsuranceCoverage = ptTotalBill * insuranceCoverTotalBill;
        double ptRemainingBill =  ptTotalBill - ptInsuranceCoverage;
        System.out.println("Patient  insurance covered balance for $" + ptInsuranceCoverage + " Patient actual balance after insurance is  $" + ptRemainingBill);

        /*
        Exercise 6
        6. A hospital has 3 shifts per day. Morning, Evening, Nights, 7 days a week. Each shift needs 45 nurses.
        Declare all values and calculate total nurses shifts needed per week. Print it.
         */
        int nursesNeedPerShift = 45;
        int totalShiftPerDay = 3;
        int totalDaysInWeek = 7;
        int totalNurseShiftsPerWeek = (totalDaysInWeek * totalShiftPerDay) * nursesNeedPerShift;
        System.out.println("The total nurse shifts needed per week is " + totalNurseShiftsPerWeek);
























    }
}