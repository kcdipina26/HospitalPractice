/*
This java file consist of learning the 1st principles of OOPS. Create a new file called Patient.java with these fields
- name (String), age(int), bloodType(String), hasInsurance(boolean), totalBill(double)
Then in main create 2 patient objects with different values and print all their details.
 */

public  class Patient {                         //create patient class

    public String name;                        //encapsulated the fields & added fields or attributes to the blueprint of patient class
    public int age;
    public String bloodType;
    public boolean hasInsurance;
    public double totalBill;

    public Patient() {                 //This is first constructor for 3 hand-written patient objects


    }

    //This is the constructor for new objects to be built and avoid hand typing for individual patient
    public Patient(String name, int age, String bloodType, boolean hasInsurance, double totalBill) {
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
        this.hasInsurance = hasInsurance;
        this.totalBill = totalBill;

    }

    //Writing getters for each fields same with UpperCamelCasing:  name, age, bloodType, hasInsurance, totalbill
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

    //Main method
    public static void main(String[] args) {
        Patient patient1 = new Patient();              //created an object called patient1
        patient1.setName("Deepika");                    //filled out all the necessary fields for patient1 object
        patient1.setAge(30);
        patient1.setBloodType("A+");
        patient1.setHasInsurance(true);
        patient1.setTotalBill(230.98);
        System.out.println("Patient 1 " + " Name " + patient1.getName() + " Age " + patient1.getAge() + " Patient Blood type: " + patient1.getBloodType() + " Has Insurance: " + patient1.getHasInsurance() + " Total Bill : $" + patient1.getTotalBill());

    /*
    Patient patient2 = new Patient();                  created second object called patient 2 without using getters and setters , constructor to see the difference
     patient2.name = "Dipina";                         filled out all the necessary fields for patient 2 and printed it
     patient2.age = 56;
     patient2.bloodType = "B+";
     patient2.hasInsurance = false;
     patient2.totalBill = 56.34;
     System.out.println("Patient 2 " + " Name " +patient2.name + " Age " + patient2.age + " BloodType: " + patient2.bloodType + " Has Insurance: " + patient2.hasInsurance + " Total Bill : $"+ patient2.totalBill);


     Patient patient3 = new Patient();  //created third patient object without getters, setters and constructors to see the difference with & without
     patient3.name = "John";
     patient3.age = 46;
     patient3.bloodType = "B+";
     patient3.hasInsurance = true;
     patient3.totalBill = 220.00;
     System.out.println("Patient 3 " + " Name " + patient3.name + " Age " + patient3.age + " Patient Blood type " + patient3.bloodType + " Has Insurance: " + patient3.hasInsurance + " Total Bill : $" + patient3.totalBill);
*/

//Redoing patient 2 and patient 3 with utilization of getters and setters.
//     Patient patient2 = new Patient();
//     patient2.setName("Dipina");
//     patient2.setAge(30);
//     patient2.setBloodType("C+");                          //testing blood group so see if it returns null.
//     patient2.setHasInsurance(false);
//     patient2.setTotalBill(235.86);
//     System.out.println("Patient 2" + " Name " + patient2.getName() + " Age "+ patient2.getAge()+ " Patient Blood Type " + patient2.getBloodType()+ " Has Insurance: " + patient2.getHasInsurance() + " Total Bill: $" + patient2.getTotalBill());
//
//     Patient patient3 = new Patient();
//     patient3.setName("Dil");
//     patient3.setAge(56);
//     patient3.setBloodType("A+");
//     patient3.setHasInsurance(false);
//     patient3.setTotalBill(456.66);
//     System.out.println("Patient 3" + " Name " + patient3.getName() + " Age " + patient3.getAge() + " Patient Blood Type " + patient3.getBloodType() + " Has Insurance: " + patient3.getHasInsurance() + " Total Bill: $ " + patient3.getTotalBill());
////Creating object constructor in use helps create object faster in a real application scenario
////Setter and Getter
        Patient patient4 = new Patient("Diva", 19, "A+", true, 120.67); //patient 4
        Patient patient5 = new Patient("Ramesh", 38, "B+", false, 390.77); //patient 5
        Patient patient6 = new Patient("Dil", 48, "A+", true, 778.90);  //patient 6
        Patient patient7 = new Patient("Debaki", 67, "A+", false, 450.66); //patient 7
        System.out.println("Patient 4 " + " Name " + patient4.getName() + " Age " + patient4.getAge() + " Patient Blood type " + patient4.getBloodType() + " Has Insurance: " + patient4.getHasInsurance() + " Total Bill : $" + patient4.getTotalBill());
        System.out.println("Patient 5 " + " Name " + patient5.getName() + " Age " + patient5.getAge() + " Patient Blood type " + patient5.getBloodType() + " Has Insurance: " + patient5.getHasInsurance() + " Total Bill : $" + patient5.getTotalBill());
        System.out.println("Patient 6 " + " Name " + patient6.getName() + " Age " + patient6.getAge() + " Patient Blood type " + patient6.getBloodType() + " Has Insurance: " + patient6.getHasInsurance() + " Total Bill : $" + patient6.getTotalBill());
        System.out.println("Patient 7 " + " Name " + patient7.getName() + " Age " + patient7.getAge() + " Patient Blood type " + patient7.getBloodType() + " Has Insurance: " + patient7.getHasInsurance() + " Total Bill : $" + patient7.getTotalBill());


    }


}


