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
/*Q3 — Math inside loop:

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

 */
   public static void main(String[] args){
    for(int i = 1; i <= 3; i++){
        System.out.println("Shift " + i + " : Morning");
//        System.out.println("Shift " + i + " : Evening");
//        System.out.println("Shift " + i + " : Night");
    }

   }
}


 /*
Q8 — Nested loop basics:
A hospital has 3 floors, each floor has 4 rooms. Print every room:
Floor 1 Room 1
Floor 1 Room 2
...
Floor 3 Room 4
Q9 — Loop with method:
Use your isOvertime method from HospitalStaff. Loop through hours 6, 8, 10, 12 and print whether each is overtime or not:
Hours 6 - Overtime: false
Hours 8 - Overtime: false
Hours 10 - Overtime: true
Hours 12 - Overtime: true
Q10 — Real world:
A hospital collected payments from 5 patients: $200, $450, $300, $150, $500. Loop through and calculate total. Print total at the end:
Total collected: $1600.0
 */



