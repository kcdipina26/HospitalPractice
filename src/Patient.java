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

 public Patient(){                 //This is first constructor for 3 hand-written patient objects


 }

 //This is the constructor for new objects to be built and avoid hand typing for individual patient
public Patient(String name, int age, String bloodType, boolean hasInsurance, double totalBill) {
    this.name = name;
    this.age = age;
    this.bloodType = bloodType;
    this.hasInsurance = hasInsurance;
    this.totalBill = totalBill;

}


//Main method
 public static void main(String[] args){
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
     System.out.println("Patient 3 " + " Name " + patient3.name + " Age " + patient3.age + " Patient Blood type " + patient3.bloodType + " Has Insurance: " + patient3.hasInsurance + " Total Bill : $" + patient3.totalBill);

//Creating object constructor in use helps create object faster in a real application scenario
     Patient patient4 = new Patient("Diva", 19, "A+", true, 120.67); //patient 4
     Patient patient5 = new Patient("Ramesh", 38, "B+", false, 390.77); //patient 5
     Patient patient6 = new Patient("Dil", 48, "A+", true, 778.90);  //patient 6
     Patient patient7 = new Patient("Debaki", 67, "A+", false, 450.66); //patient 7
     System.out.println("Patient 4 " + " Name " + patient4.name + " Age " + patient4.age + " Patient Blood type " + patient4.bloodType + " Has Insurance: " + patient4.hasInsurance + " Total Bill : $" + patient4.totalBill);
     System.out.println("Patient 5 " + " Name " + patient5.name + " Age " + patient5.age + " Patient Blood type " + patient5.bloodType + " Has Insurance: " + patient5.hasInsurance + " Total Bill : $" + patient5.totalBill);
     System.out.println("Patient 6 " + " Name " + patient6.name + " Age " + patient6.age + " Patient Blood type " + patient6.bloodType + " Has Insurance: " + patient6.hasInsurance + " Total Bill : $" + patient6.totalBill);
     System.out.println("Patient 7 " + " Name " + patient7.name + " Age " + patient7.age + " Patient Blood type " + patient7.bloodType + " Has Insurance: " + patient7.hasInsurance + " Total Bill : $" + patient7.totalBill);


 }


























}