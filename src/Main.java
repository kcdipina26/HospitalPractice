//This is my testing class, every application has a main java program where main method lives to run the program. Compiler first looks
//reads the class then looks for main method to run the application or start the application.



public class Main {
    public static void main(String[] args) {
        //Call the patient class object to test its method
        Patient patient22 = new Patient("Lumi", 6, "AB+", true, 234.66);
        Patient patient4 = new Patient("Diva", 19, "A+", true, 120.67); //patient 4
        Patient patient5 = new Patient("Ramesh", 38, "B+", false, 390.77); //patient 5
        Patient patient6 = new Patient("Dil", 48, "A+", true, 778.90);  //patient 6
        Patient patient7 = new Patient("Debaki", 67, "A+", false, 450.66); //patient 7
        System.out.println(patient22);
        System.out.println(patient4);
        System.out.println(patient5);
        System.out.println(patient6);
        System.out.println(patient7);


        //Emergency Patient class object
        EmergencyPatient criticalPatient1 = new EmergencyPatient("John", 45, "A+", true, 245.6, "Critical", 103.10, "120 / 130", 5.60);
        //System.out.println(criticalPatient);  //This prints a hash code a unique identifier that java object creates to recognize the object
        EmergencyPatient criticalPatient2 = new EmergencyPatient("Jena", 41, "AB+", false, 235.6, "Low", 96.10, "120 / 130", 3.50);
        System.out.println(criticalPatient1);
        System.out.println(criticalPatient2);
    }
}
