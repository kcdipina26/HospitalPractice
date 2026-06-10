/*
This java file consist of learning the 1st principles of OOPS.
 Create a new file called Patient.java with these fields
- name (String), age(int), bloodType(String), hasInsurance(boolean), totalBill(double)
Then in main create 2 patient objects with different values and print all their details.
 */

public abstract class Patient {                         //create patient class

    private String name;                        //encapsulated the fields & added fields or attributes to the blueprint of patient class
    private int age;
    private String bloodType;
    private boolean hasInsurance;
    private double totalBill;

//    public Patient() {                 //This is first empty constructor for 3 hand-written patient objects
//
//
//    }

    //This is the constructor for new objects to be built and avoid hand typing for individual patient
    public Patient(String name, int age, String bloodType, boolean hasInsurance, double totalBill) {
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
        this.hasInsurance = hasInsurance;
        this.totalBill = totalBill;

    }

    //Writing getters for each fields same with get in front as method names:  name, age, bloodType, hasInsurance, totalbill
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public boolean getHasInsurance() {
        return hasInsurance;
    }

    public double getTotalBill() {
        return totalBill;
    }

    //Setters for the patient so no one can change it into wrong data type & values.

    public void setName(String name) {
        //Setting a logical branching so its strictly name and not characters or numbers
        this.name = name;

    }

    public void setAge(int age) {
        //Setting a logical branching for age to avoid negative or unrealistic values
        if (age > 0 && age < 130) {
            this.age = age;
        }
    }

    public void setBloodType(String bloodType) {
        //set bloodtype as a collection of array it can only be those variables.
        //check if blood type exist in the valid arrays
        String[] bloodGroup = new String[]{"A+", "A-", "AB+", "AB-", "O-", "O+"}; //bloodGroup is a collection of string of arrays, as blood group can only be these 5
        for (int i = 0; i < bloodGroup.length; i++) {                             //for loop to only give possible 5 blood groups
            if (bloodGroup[i].equals(bloodType)) {                               //equal the string [] with string bloodType parameter
                this.bloodType = bloodType;                                      //therefore if bloodGroup = bloodtype then temporary blootype on the right = bloodtype permanent on the left
                return;
            }
        }
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }

    public void setTotalBill(double totalBill) {
        if (totalBill > 0.00) {
            this.totalBill = totalBill;
        }
    }

    //To string method to display the text itself.

    public String toString() {
        return this.name + " " + this.age + " " + this.bloodType + " " + this.hasInsurance + " " + this.totalBill;

    }

    //This is a real method of calculating bill of regular patient
    //Todo need to add more conditions for patient with insurance and meaningful message
    public double generateBill(double patientBill, boolean hasInsurance) {
        //Calculate the total bill of regular patient check if they have insurance and if there do then use it
        final double INSURANCE_RATE = 0.40;
        if(hasInsurance == false){
            patientBill = totalBill;
            System.out.println("Patient total bill: " + patientBill);
        }else if (hasInsurance == true) {
            patientBill = INSURANCE_RATE * totalBill;
            System.out.println("Patient total bill: " + totalBill);
        } else {

        }
        return patientBill;

    }

    public abstract double generateEmergencyPtBill(double patientBill, boolean hasInsurance, double emergencyBill);
}







