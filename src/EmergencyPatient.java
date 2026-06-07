//In this file we are going to be practicing OOP principle for inheritance, where we have superclass (parent) and subclass (child)


public class EmergencyPatient extends Patient {            //Emergency Patient Inherits everything from Patient automatically.
    //Therefore name, age, Bloodtype, hasInsurance, totalBill all exist already no need to write them as OOP principle is reusability
    private String emergencyLevel;
    private double ptBodyTemp;
    private String ptBloodPressure;
    private double ptLabResults;


    //Build the constructor for the emergency patient and also add patient class parameters so super can use it
    public EmergencyPatient(String name, int age, String bloodType, boolean hasInsurance, double totalBill, String emergencyLevel, double ptBodyTemp, String ptBloodPressure, double ptLabResults) {

        //Calling the super from parent class,
        super(name, age, bloodType, hasInsurance, totalBill);

        //Defining the constructor the Emergency patient
        this.emergencyLevel = emergencyLevel;
        this.ptBodyTemp = ptBodyTemp;
        this.ptBloodPressure = ptBloodPressure;
        this.ptLabResults = ptLabResults;

    }


    //Setting up getters & setters for the emergency patient class child of Patient its parent class

    //Getters to view the information on emergency patient in main method this is why its public (Visibility)

    public String getEmergencyLevel() {
        return emergencyLevel;
    }


    public double getPtBodyTemp() {
        return ptBodyTemp;
    }

    public String getPtBloodPressure() {
        return ptBloodPressure;
    }

    public double getPtLabResults() {
        return ptLabResults;

    }

    //Setters for the patient and making sure the values are correct and not just any values taken into application / to update.

    public void setEmergencyLevel(String emergencyLevel) {
        //In a real hospital setting a patient critical category can be defined as High, Medium, Low based on this care team decides patient health care plan
        //Use an array to only have these category in place
        String[] criticalCategory = new String[]{"High", "Medium", "Low"};
        //Use for loop to go over the length of array and only give option to choose over 3 category
        for (int i = 0; i < criticalCategory.length; i++) {
            //Use .equalsString[] to give final value to ptCriticalCategory to choose from for patient care decision
            if (criticalCategory[i].equals(emergencyLevel)) {
                this.emergencyLevel = emergencyLevel;
                return;
            }
        }
    }

    public void setPtBodyTem(double ptBodyTemp) {
        if (ptBodyTemp > 103) {
            this.ptBodyTemp = ptBodyTemp;

        } else if (ptBodyTemp > 99 && ptBodyTemp <= 103) {
            this.ptBodyTemp = ptBodyTemp;
        } else if (ptBodyTemp < 96) {
            this.ptBodyTemp = ptBodyTemp;
        } else if (ptBodyTemp >= 96 && ptBodyTemp <= 99) {
            this.ptBodyTemp = ptBodyTemp;

        } else {

        }
    }

    public void setPtBloodPressure(String ptBloodPressure) {
        {
            this.ptBloodPressure = ptBloodPressure;
        }
    }

    public void setPtLabResults(double ptLabResults) {
        if (ptLabResults > 0.00) {
            this.ptLabResults = ptLabResults;
        }
    }

    //Adding override annotation to override patient class /parent fields.
    ///We are using getName(), getAge(), getBloodType(), getHasInsurance(), getTotalBill() getter from the parent class patient as the fields in the parent class
    // (name, age, bloodtype, hasinsurance, totalbill) are private but the method is public for this very reason so inheritance can utilize it.
   @Override
    public String toString(){
        return this.getName() + " " + this.getAge() + " " + this.getBloodType() + " " + this.getHasInsurance() + " " + this.getTotalBill() + " " + this.emergencyLevel + " " + this.ptBodyTemp + " " + this.ptBloodPressure + " " + this.ptLabResults;
    }

}






