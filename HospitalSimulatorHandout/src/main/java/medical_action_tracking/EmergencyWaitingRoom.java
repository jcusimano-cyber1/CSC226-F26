package medical_action_tracking;

import patient_intake.Patient;

public class EmergencyWaitingRoom {
    private LinkedQueue<Patient> level1;
    private LinkedQueue<Patient> level2;
    private LinkedQueue<Patient> level3;
    private LinkedQueue<Patient> level4;

    public EmergencyWaitingRoom() {
        level1 = new LinkedQueue<Patient>();
        level2 = new LinkedQueue<Patient>();
        level3 = new LinkedQueue<Patient>();
        level4 = new LinkedQueue<Patient>();
        // TODO: Create one empty FIFO queue for each triage level.
    }

    /**
     * Add a patient to the FIFO lane matching their triage level.
     *
     * @return true if added; false for null patients or levels outside 1-4
     */
    public boolean addPatient(Patient patient) {
        if(patient == null){
            return false;
        }
        int level = patient.getTriageLevel();
        if(level == 1){
            level1.enqueue(patient);}
        else if (level == 2){
            level2.enqueue(patient);}
        else if (level == 3){
            level3.enqueue(patient);}
        else if (level == 4){
            level4.enqueue(patient);}
        else{ return false;}
        // TODO: Validate the patient and place them in the matching lane.
        return true;
    }

    /**
     * Remove the next patient, checking triage level 1 before level 2, and so on.
     */
    public Patient nextPatient() {
        if (level1.isEmpty() == false){
            return level1.dequeue();
        } 
        if (level2.isEmpty() == false){
            return level2.dequeue();
        }    
        if (level3.isEmpty() == false){
            return level3.dequeue();
        }
        if (level4.isEmpty() == false){
            return level4.dequeue();
        }
        
        // TODO: Dequeue from the first non-empty lane, or return null if all are empty.
        return null;
    }

    public boolean isEmpty() {
        if ( level1.isEmpty() && level2.isEmpty() && level3.isEmpty() && level4.isEmpty()) {
            return true;

            }    // TODO: Return true only when all four lanes are empty.
        return false; 
        }

    public int size() {
        int total = 0;
        total = total + level1.size();
        total = total + level2.size();
        total = total + level3.size();
        total = total + level4.size();

        // TODO: Return the total number of patients across all four lanes.
        return total;
    }
}
