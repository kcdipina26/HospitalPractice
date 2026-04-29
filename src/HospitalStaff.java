public class HospitalStaff {



        private final double OVERTIME_RATE = 1.5;
        private final int REGULAR_HOURS = 8;
        private final double TAX_RATE = 0.25;

        /*
        Return true if nurse worked overtime.
        Overtime is anything above 8 hours.
        Examples:
        isOvertime(10) → true
        isOvertime(8) → false
        isOvertime(6) → false
        */

        //This is method with public access from any class, boolean is the return type (true of false) & isOvertime method name camelCasing with 1 parameter.

        public boolean isOvertime(int hoursWorked) {

         //If condition worked more than 8 hrs, qualify/pay for overtime, return type true if > 8, false if <=8 hrs.
            if (hoursWorked > 8) {
                return true;
            } else {
                return false;
            }
        }

        /*
        Calculate nurse's daily pay.
        Regular hours paid at hourly rate.
        Overtime hours paid at 1.5x hourly rate.
        Examples:
        calculateDailyPay(8, 20.00) → 160.0
        calculateDailyPay(10, 20.00) → 220.0
        */

        //Method: public access for any class, double return type (better for money),
        // method name calculateDailyPay camel casing: This method calculates daily pay by tracking hours.

        public double calculateDailyPay(int hoursWorked, double hourlyRate) {

         //Calculates overtime pay (hours an a half pay times regular pay for overtime employees.
            double regularPay = (hoursWorked * hourlyRate);
            double overTimePay = (regularPay) + (hoursWorked * 1.5);
        //If else condition, if worked more than 8 hrs pay overtime.

            if (hoursWorked > 8) {
                return overTimePay;
        //Else pay regular hourly rate.
            } else {
                return regularPay;
            }
        }

        /*
        Calculate pay after tax deduction of 25%.
        Examples:
        calculatePayAfterTax(160.00) → 120.0
        calculatePayAfterTax(220.00) → 165.0
        */

    //Method with public access to other class, double return data type & calculatePayAfterTax method name camelcasing & net pay after tax calculation.

      public double calculatePayAfterTax(double grossPay) {
      // Calculation on total income with tax = 0.25 * total income
            double totalIncomeWithTaxes = (grossPay * TAX_RATE);
      //Calculation of total income after tax & return its value.
            double totalNetIncome = (grossPay - totalIncomeWithTaxes);
            return totalNetIncome;
      }

        /*
        Return true if staff member is eligible for bonus.
        Eligible if worked more than 5 days AND hoursWorked above 40 this week.
        Examples:
        isEligibleForBonus(6, 45) → true
        isEligibleForBonus(4, 45) → false
        isEligibleForBonus(6, 38) → false
        */

        public boolean isEligibleForBonus(int daysWorked, int weeklyHours) {
            if (daysWorked > 5 && weeklyHours > 40) {
                return true;
            } else {
                return false;
            }
        }

        /*
        Calculate weekly bonus amount.
        If eligible, bonus is 10% of weekly pay.
        If not eligible, return 0.
        Examples:
        calculateBonus(true, 800.00) → 80.0
        calculateBonus(false, 800.00) → 0.0
        */

  //Method with public class from other class, double return type & calculateWeeklyBonus is method name with camel casing,
  // Two parameters in use boolean (datatype) for is eligible & double (data type) for weeklypay variables.
      public double calculateWeeklyBonus(boolean isEligible, double weeklyPay) {

  //Calculation for weekly bonus is 10 % * weekly pay
          double weeklyBonus = (0.10 * weeklyPay);
  // If/else condition if qualify give weekly bonus, else return nothing.
            if (isEligible) {
                return weeklyBonus;
            } else {
                return 0;
            }
        }

        /*
        Return staff level as a String based on years of experience.
        0-1 years → "Trainee"
        2-4 years → "Junior"
        5-9 years → "Mid Level"
        10+ years → "Senior"
        Examples:
        getStaffLevel(0) → "Trainee"
        getStaffLevel(3) → "Junior"
        getStaffLevel(7) → "Mid Level"
        getStaffLevel(12) → "Senior"
        */

 //This method is public can be access by other class, String is return type eg: "Mid level experience",
 // getStaffLevel is method name for see what range staff lies in (Mid, Entry, senior) & parameter is in int data type and yearsExperience variable name.
        public String getStaffLevel(int yearsExperience) {

  //If condition has 0-1 yrs print/returns string value Trainee.
            if (yearsExperience <=1) {
                return("Trainee");
  //Else if condition  has 2-4 yrs experience, return/print string value Junior
            } else if (yearsExperience >=2 && yearsExperience <= 4 ) {
                return("Junior");
//Else if condition has 5-9 yrs experience, return/print string value Mid-level
            } else if (yearsExperience >=5 && yearsExperience <= 9){
                return("Mid Level");
//Else return senior 10 + experience
            } else {
                return("Senior");
            }


        }

        public static void main(String[] args) {
            HospitalStaff staff = new HospitalStaff();
            // test all  methods here
            System.out.println(staff.isOvertime(11));
            System.out.println(staff.calculateDailyPay(10, 20.00));
            System.out.println(staff.calculatePayAfterTax(98000.00));
            System.out.println(staff.isEligibleForBonus(6,50));
            System.out.println(staff.calculateWeeklyBonus(true, 800.00));
            System.out.println(staff.getStaffLevel(4));
            System.out.println(staff.calculatePayAfterTax(220.00));

        }

    }
















