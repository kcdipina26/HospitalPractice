//This is my testing class, every application has a main java program where main method lives to run the program. Compiler first looks
//reads the class then looks for main method to run the application or start the application.



public class Main {
    public static void main(String[] args) {
        //Call the patient class object to test its method
        EmergencyPatient criticalPatient = new EmergencyPatient("John", 45, "A+", true, 245.6, "Critical", 103.10, "120 / 130", 5.60);

    }
}
