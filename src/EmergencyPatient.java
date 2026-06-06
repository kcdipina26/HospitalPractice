//In this file we are going to be practicing OOP principle for inheritance, where we have superclass (parent) and subclass (child)


public class EmergencyPatient extends Patient {            //Emergency Patient Inherits everything from Patient automatically.
    //Therefore name, age, Bloodtype, hasInsurance, totalBill all exist already no need to write them as OOP principle is reusability
     String emergencyLevel;
     double ptBodyTemp;
     int ptBloodPressure;
     double ptLabResults;


    //Use super to call the parent class patient constructor
    public EmergencyPatient(String emergencyLevel, double ptBodyTemp, int ptBloodPressure, double ptLabResults) {
        //Calling the super from parent class, getting error because no arg constructor but i have that in parent class? how to fix it call different parent class constructor need to understand
        super();
        //Defining the constructor the Emergency patient
        this.emergencyLevel = emergencyLevel;
        this.ptBodyTemp = ptBodyTemp;
        this.ptBloodPressure = ptBloodPressure;
        this.ptLabResults = ptLabResults;

    }


    //There has to be override methods specific to the patient but right now i do not have them not sure what to override?
//    @Override
//
//    public void ptCritical() {
//        super.getHasInsurance();
//        System.out.println("Regardless of insurance admit patient immediately");



    }






