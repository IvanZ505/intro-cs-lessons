/**
 * 
 * HeartTransplant class
 * 
 * @author Ana Paula Centeno
 * @author Haolin (Daniel) Jin
 */
public class HeartTransplant {

    // patient array, each Patient is read from the data file
    private Patient[] patients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;

    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null. 
     */
    public HeartTransplant() {

        patients = null;
        survivabilityByAge = null;
        survivabilityByCause = null;
    }

    /*
     * Returns patients
     */
    public Patient[] getPatients() {

        return patients;

     } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() {
        // WRITE YOUR CODE HERE
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() {
        // WRITE YOUR CODE HERE
        return survivabilityByCause;
    }

    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format: 
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     * 
     *    Each line refers to one Patient, all values are integers.
     * 
     */
    public void readPatients (int numberOfLines) {
        // WRITE YOUR CODE HERE
        patients = new Patient[numberOfLines];
        for(int i = 0; i < numberOfLines; i++) {
            int id = StdIn.readInt();
            int eth = StdIn.readInt();
            int gender = StdIn.readInt();
            int age = StdIn.readInt();
            int cause = StdIn.readInt();
            int urgency = StdIn.readInt();
            int stateofhealth = StdIn.readInt();
            Patient p_in = new Patient(id, eth, gender, age, cause, urgency, stateofhealth);
            patients[i] = p_in;
        }
    }

    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     * 
     * 2) Reads from the command line file to populate the object. 
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     */
    public void readSurvivabilityByAge (int numberOfLines) {
        // WRITE YOUR CODE HERE
        survivabilityByAge = new SurvivabilityByAge();
        for(int i = 0; i < numberOfLines; i++) {
            int age = StdIn.readInt();
            int years = StdIn.readInt();
            double rate = StdIn.readDouble();
            survivabilityByAge.addData(age, years, rate);
        }
    }

    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     * 
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an 
     *    integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     */
    public void readSurvivabilityByCause (int numberOfLines) {
        // WRITE YOUR CODE HERE
        survivabilityByCause = new SurvivabilityByCause();
        for(int i = 0; i < numberOfLines; i++) {
            int cause = StdIn.readInt();
            int years = StdIn.readInt();
            double rate = StdIn.readDouble();
            survivabilityByCause.addData(cause, years, rate);
        }
    }
    
    /*
     * Returns a Patient array containing the patients, 
     * from the patients array, that have age above the parameter age.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     * 
     * Return null if there is no Patient with age above the 
     * parameter age.
     */ 
    public Patient[] getPatientsWithAgeAbove(int age) {
        // WRITE YOUR CODE HERE
        int x = 0;
        for (Patient patient : patients) {
            if (patient.getAge() > age) {
                x++;
            }
        }
        Patient[] aboveAge = new Patient[x];
        int j = 0;
        for (int i = 0;i <patients.length; i++) {
            if (patients[i].getAge() > age) {
                aboveAge[j] = patients[i];
                j++;
            }
        }
        if(x == 0) {
            return null;
        }
        return aboveAge;
    }

    /*
     * Returns a Patient array containing the patients, from the patients array, 
     * that have the heart condition cause equal to the parameter cause.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Patient with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Patient[] getPatientsByHeartConditionCause(int cause) {

        // WRITE YOUR CODE HERE
        int x = 0;
        for (Patient patient : patients) {
            if (patient.getCause() == cause) {
                x++;
            }
        }
        if(x == 0) {
            return null;
        }
        Patient[] specificCauses = new Patient[x];
        int j = 0;
        for (int i = 0;i <patients.length; i++) {
            if (patients[i].getCause() == cause) {
                specificCauses[j] = patients[i];
                j++;
            }
        }
        return specificCauses;
    }

    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     * 
     * Return null if there is no Patient with the state of health 
     * equal to the parameter state.
     */ 
    public Patient[] getPatientsByUrgency(int urgency) {

        // WRITE YOUR CODE HERE
        Patient[] requestedUrgency = new Patient[50];
        int x = 0;
        for (Patient patient : patients) {
            if (patient.getUrgency() == urgency) {
                requestedUrgency[x] = patient;
                x++;
            }
        }

        Patient[] newRequestedUrgency = new Patient[x];

        for(int i = 0; i < requestedUrgency.length; i++) {
            if(requestedUrgency[i] != null) {
                newRequestedUrgency[i] = requestedUrgency[i];
            }
        }
        if(x == 0) {
            return null;
        }
        return newRequestedUrgency;
    }

    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     * 
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     * 
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     * 
     * There is no correct solution, you may come up with any 
     * function to find the patient with the highest potential 
     * for survivability after the transplant.
     */ 
    public Patient getPatientForTransplant () {

	// WRITE YOUR CODE HERE
        double highest_chance = 0;
        int patient_highest_index = 0;
        int patient_index = 0;
        double urgency_avg = 0;

        for(Patient patient : patients) {
            urgency_avg += patient.getUrgency();
        }

        urgency_avg /= patients.length;

        while(patient_index < patients.length) {
            if(patients[patient_index].getNeedHeart()) {
                if (patients[patient_index].getUrgency() >= urgency_avg) {
                    double avg = (survivabilityByAge.getRate(patients[patient_index].getAge(), 5) + survivabilityByCause.getRate(patients[patient_index].getCause(), 5)) / 2;
                    if (avg > highest_chance) {
                        highest_chance = avg;
                        patient_highest_index = patient_index;
                        // StdOut.println(highest_chance);
                    }
                }
            }
            patient_index++;
        }
        patients[patient_highest_index].setNeedHeart(false);
	    return patients[patient_highest_index];
    }
}
