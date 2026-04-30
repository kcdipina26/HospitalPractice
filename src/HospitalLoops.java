public class HospitalLoops {

//This file is to learn and practice loops in the hospital billing system application in java
/*
Question 1: for loops, Print a bill reminder for 50 patients using a for loop. Output should be:
Print a bill reminder for 500 patient using a for loop. Output should be:
-Reminder: Bill due for patient 1
-Reminder: Bill due for patient 2
-Reminder: Bill due for patient 3
-Reminder: Bill due for patient 4
-Reminder: Bill due for patient 5
 */

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i = i + 1) {
            System.out.println("Reminder: Bill due for patient "+ i);
        }
    }
}







