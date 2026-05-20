/*
This java file consist of learning the 1st principles of OOPS. Create a new file called Patient.java with these fields
- name (String), age(int), bloodType(String), hasInsurance(boolean), totalBill(double)
Then in main create 2 patient objects with different values and print all their details.
 */



public class Patient{                         //create patient class
 String name;                                 //added fields or attributes to the blueprint of patient class
 int age;
 String bloodType;
 boolean hasInsurance;
 double totalBill;

 public static void main(String[] args){             //main method
     Patient patient1 = new Patient();              //created an object called patient1
     patient1.name = "Deepika";                     //filled out all the necessary fields for patient1 object
     patient1.age = 30;
     patient1.bloodType = "A+";
     patient1.hasInsurance = true;
     patient1.totalBill = 210.00;
     System.out.println( "Patient 1 "+" Name " + patient1.name + " Age " + patient1.age + " Patient Blood type: " + patient1.bloodType + " Has Insurance: " + patient1.hasInsurance + " Total Bill : $" + patient1.totalBill);

     Patient patient2 = new Patient();                  //created second object called patient 2
     patient2.name = "Dipina";                         //filled out all the necessary fields for patient 2 and printed it
     patient2.age = 56;
     patient2.bloodType = "B+";
     patient2.hasInsurance = false;
     patient2.totalBill = 56.34;
     System.out.println("Patient 2 " + " Name " +patient2.name + " Age " + patient2.age + " BloodType: " + patient2.bloodType + " Has Insurance: " + patient2.hasInsurance + " Total Bill : $"+ patient2.totalBill);


     Patient patient3 = new Patient();  //created third patient object
     patient3.name = "John";
     patient3.age = 46;
     patient3.bloodType = "B+";
     patient3.hasInsurance = true;
     patient3.totalBill = 220.00;
     System.out.println("Patient 3" + " Name " + patient3.name + " Age " + patient3.age + " Patient Blood type " + patient3.bloodType + " Has Insurance: " + patient3.hasInsurance + " Total Bill : $" + patient3.totalBill);


 }

























}