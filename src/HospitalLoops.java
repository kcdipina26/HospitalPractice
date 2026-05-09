// import HospitalPractice.java;    //note: no need to import as java does this automatically

// import HospitalStaff.java;

public class HospitalLoops {

    //This file is to learn and practice loops in the hospital billing system application in java
/*
Question 1: for loops, Print a bill reminder for 500 patients using a for loop. Output should be:
Print a bill reminder for 500 patient using a for loop. Output should be:
-Reminder: Bill due for patient 1
-Reminder: Bill due for patient 2
-Reminder: Bill due for patient 3
-Reminder: Bill due for patient 4
-Reminder: Bill due for patient 5
Solution: Question 1

    public static void main(String[] args) {
        for (int i = 1; i <= 500; i = i + 1) {
            System.out.println("Reminder: Bill due for patient "+ i);
        }
    }
}

Q2 — Basic:
A hospital has 3 floors. Print each floor:
Checking floor 1
Checking floor 2
Checking floor 3

Solution: Question 2


    public static void main(String[] args) {
        for (int i = 1; i <= 3; i ++)  {

            System.out.println("Checking floor "+ i);

        }

    }
}

*/


/* Q3 — Math inside loop:

A nurse earns $20/hour. Print her earnings for each hour from 1 to 8:
Hour 1: $20.0
Hour 2: $40.0
...
Hour 8: $160.0

Solution: Question 3

    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            double nurseEarning = 20.00;
            System.out.println("Nurse earns " + nurseEarning * i);
        }
    }
}

/*
Q4 — Countdown:
Hospital is closing. Count down from 5 to 1 then print "Hospital doors locked":
Closing in 5
Closing in 4
...
Closing in 1
Hospital doors locked




public static void main(String[] args) {
    for(int i = 5; i >= 1; i--){
        System.out.println("Hospital is closing in..." + i);
    }
    System.out.println("Hospital doors locked");
   }
 }





/*
Q5 — Loop with condition:
Print only even patient numbers from 1 to 10:
Even patient number: 2
Even patient number: 4
...
Hint: use modulus %

Solution: Question 5


Q6 — Running total:
A hospital has 5 departments. Each department costs $1000. Calculate and print running total after each department:
After department 1 total cost: $1000.0
After department 2 total cost: $2000.0
...

Solution: Question 6

    public static void main(String[] args) {                    //This is a method main
        double departmentCost = 1000.00;                       //Assigning a department cost starting point
    for(int i = 1; i <=5; i++){                                //For loop and initializing i and its condition with incrementation till 5
      double  departmentTotalCost = (i * departmentCost);      //Calculation for the running total for each department
        System.out.println("After department " + i + " total cost: " + departmentTotalCost );    //Print statement of the department
        }

     }


 /*
Q7 — Loop with String:
Print each shift 3 times — Morning, Evening, Night:
Shift 1: Morning
Shift 2: Evening
Shift 3: Night

Solution: Question 7

 /*
   public static void main(String[] args){
    for(int i = 1; i <= 3; i++){
        System.out.println("Shift " + i + " : Morning");
//        System.out.println("Shift " + i + " : Evening");
//        System.out.println("Shift " + i + " : Night");
     }

    }
  }
/*

 /*
Q8 — Nested loop basics:
A hospital has 3 floors, each floor has 4 rooms. Print every room:
Floor 1 Room 1
Floor 1 Room 2
...
Floor 3 Room 4

Solution: Question 8

 */


    //    public static void main(String[] args){
//        for (int i =1; i <=3; i++){
//            for(int j = 1; j <=4; j++){
//                System.out.println("Floor  " + i  + " Room " + j);
//            }
//        }
//
//    }
//}

 /*

Q9 — Loop with method:
Use your isOvertime method from HospitalStaff. Loop through hours 6, 8, 10, 12 and print whether each is overtime or not:
Hours 6 - Overtime: false
Hours 8 - Overtime: false
Hours 10 - Overtime: true
Hours 12 - Overtime: true
*/

//    public static void main(String[] args){
////    public boolean isOvertime(int hasWorked) {     //no need to write this also how to connect to existing method?
//        for (int i = 6; i <= 12; i = i + 2) {       //starting point was 6 hrs, condition up to 12, increment by 2 ( for output 6,8,10,12)
//
//            if (i > 8) {                             //if condition and print output
//                System.out.println("Hours " + i + " Overtime:  true");
//            } else {                                // else condition print output
//                System.out.println("Hours " + i + " Overtime:  false");
//            }
//
//        }
//
//    }
//
//}

//    public static void main(String[] args){
//        HospitalStaff staff = new HospitalStaff();
//            for(int i = 6; i <=12; i = i + 2){
//                System.out.println("Hours " + i + " Overtime " + staff.isOvertime(i));
//            }
//        }
//    }

/*
Q10 — Real world:
A hospital collected payments from 5 patients: $200, $450, $300, $150, $500. Loop through and calculate total. Print total at the end:
Total collected: $1600.0
Patient 1: Payment is 200.00
Patient 2: Payment received 450
.......
Total collected (sum all )
 /*





    public static void main(String[] args) {

        int[] totalCollection = new int[] { 200, 450, 300, 150, 500 };   //list of arrays and its known values

        int sum = 0;                                                   //declare sum variable to calculate within loop

        for (int i = 0; i < totalCollection.length; i++) {               //loops through array elements
            sum = sum + totalCollection[i];                             //sum of total patient payment that hospital collected
            System.out.println("Patient " + (1+i)  + " Payment received is " + totalCollection[i]);   //print statement i+1 for real patient no.
        }
        System.out.println("Total Collected " + sum);                       //print sum in seperate line
        return;
    }

}
*/

/*
Question 11- For loop and array question: A hospital has 5 nurses with these salaries: $45000, $52000, $38000, $61000, $49000.
Loop through and print each nurse's salary. Then print the highest paid nurse's salary at the end.
 */


//    public static void main(String[] args) {
//        int[] nursesSalaries = new int[] {45000, 52000, 38000, 61000, 49000};
//        int highestPaidNurse = 0;
//
//        //1st loop to go through the arrays indexes and print out the elements
//        for (int i = 0; i < nursesSalaries.length; i++) {                                 // for loop with an array, gives all the salaries in array and prints them
//
//            System.out.println("Nurse salary: " + (1 + i) + " is " + nursesSalaries[i]);          //print statement do not forget i in the nursesSalaries array as this variable is at work
//
//        }
//        //2nd Loop through and print the highest paid nurse's salary at the end and this is a primitive array type.
//        for (int i = 0; i < nursesSalaries.length; i++) {
//            if (highestPaidNurse < nursesSalaries[i]) {
//                highestPaidNurse = nursesSalaries[i];
//            }
//
//        }
//        System.out.println("The highest nurse salary in this department is " + highestPaidNurse);
//    }
//}
    //Second approach with for loop practice

//    static int findSalary(int [] arr) {
//        int maximum = arr[0];
//        for (int value : arr) {
//            if (value > maximum) {
//                maximum = value;
//            }
//        }
//        System.out.print("The highest nurse salary in this department is ");
//        return  maximum;
//
//    }
//
//}

/*
While Loop — Basic:
A hospital has 10 ICU beds. Patients keep getting admitted one at a time. Use a while loop to admit patients until ICU is full. Print "Patient admitted, beds remaining: X" each time.
*/

//    public static void main(String[] args){
//        int i = 1;                      //initialize the variable i first
//       while(i <= 10){                 //the condition for the program
//            System.out.println(" Patient admitted, beds remaining " + i);         //print the patient admitted and beds remaining
//           i = i + 1;                                // increment i could write in print line but this is best practice?
//        }
//
//    }
//}

/*
Do-While — Basic:
A patient must fill out an intake form at least once. Use do-while to print "Please complete intake form" and keep asking until formCompleted is true. Set it to true after first run so it stops.

 */

//    public static void main(String[] args){
//        boolean isFormCompleted = false;
//    do {
//        System.out.println("Please complete intake form");
//
//    }while(isFormCompleted == true);
//        System.out.println("Intake form has been completed");
//    }
//
//}

    /* These are practice questions for arrays
    Q1. A hospital has 6 patient ages: {34, 67, 23, 89, 45, 12}. Print all ages and find the youngest patient.
    */
//    public static void main(String[] args) {
//        int[] NoOfPatientInHospital = new int[]{34, 67, 23, 89, 45, 12};            //declare & initialize array NoOfPatientInHospital
//        int youngestPatientInHospital = 15;         //have assinged a value to compare
//
//        for (int i = 0; i < NoOfPatientInHospital.length; i++) {            //loops through an array & prints through all patient ages.
//            System.out.println("Age of patient " + (1 + i) + " is " + NoOfPatientInHospital[i]);
//        }
//        for (int i = 0; i < NoOfPatientInHospital.length; i++) {                    //nested loop to compare through array & print out youngest patient.
//            if (youngestPatientInHospital > NoOfPatientInHospital[i]) {
//                youngestPatientInHospital = NoOfPatientInHospital[i];
//            }
//        }
//        System.out.println("Youngest patient in the hospital is " + youngestPatientInHospital);
//
//    }
//}
/*
Q2. A lab has test results for 5 patients: {98.6, 101.2, 99.1, 103.5, 97.8}. Print all results and count how many patients have fever (above 99.5).
 */
    public static void main(String[] args) {
        double[] patientBodyTemperature = new double[] {98.6, 101.2, 99.1, 103.5, 97.8};     //declare & initialize array
        double patientWithFeverTemp = 99.5;                                                 //declare patient with fever variable & value.

        for (int i = 0; i < patientBodyTemperature.length; i++) {                           //for loop to go through and print all patient body temperature arrays.

            System.out.println(" Patient " + (1 + i) + " : " + " lab test results body temperature " + patientBodyTemperature[i]);           //print statement

        }
        for (int i = 0; i < patientBodyTemperature.length; i++) {                              //nested loop to compare & print out all the temperature that is greater than 99.5
            if (patientBodyTemperature[i] > patientWithFeverTemp) {
                patientWithFeverTemp = patientBodyTemperature[i];

                System.out.println(" Patient " + (1+i) + " with fever temperature :  "  + patientWithFeverTemp);       //print statement for the patient no that has high fever and its temp
            }
            }


        }

    }

