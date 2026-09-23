package triage_efficiency;

import java.util.*;
import patient_intake.Patient;

public class EfficiencyTester {
    

    /**
     * REQUIRED (80%): Implement linear search.
     *
     * Search through the patient array one element at a time until the matching
     * patientID is found. Return the Patient if it exists; otherwise return null.
     *
     * This method must run in O(n) time.
     */
    public static Patient linearSearch(Patient[] patients, String pid) {
        for (int i = 0; i < patients.length; i++) {
            if (pid.equals(patients[i].getPatientID())) {
                return patients[i];
            }
        }
        // TODO REQUIRED: Implement linear search.
        // Search the entire array in order and return the matching Patient.
        return null; // Remove this line and implement the method.
    }

    /**
     * REQUIRED (80%): Implement binary search.
     *
     * This method works only on an array that is sorted by patientID.
     * Repeatedly divide the search range in half until the target is found.
     *
     * This method must run in O(log n) time.
     */
    public static Patient binarySearch(Patient[] patients, String pid) {
        int low = 0;
        int high = patients.length -1;
        int middle = (low + high) / 2;
        while(low <= high){
            //int middle = (low + high) / 2;
            Patient value = patients[middle];
            String patientID = value.getPatientID();
            if (patientID.equals(pid)) {
                return value;
            }
            else if (patientID.compareTo(pid) < 0){
                low = middle + 1;
            } 
            else
            {
                high = middle - 1;
            }
        }
        
        Patient value = patients[middle];
        return  value;
        // TODO REQUIRED: Implement iterative binary search.
        // The array must be sorted by patientID before calling this method.
         // Remove this line and implement the method.
    }

    /**
     * OPTIONAL (+5%): Implement a different O(log n) search algorithm.
     *
     * Pick one of the following approaches and implement it:
     * - Exponential search
     * - Jump search
     * - Ternary search
     *
     * Add a short comment above the method explaining:
     * - which algorithm you chose
     * - where you learned about it
     * - why it works
     */
    public static Patient logNSearch(Patient[] patients, String pid) {
        // TODO OPTIONAL: Research and implement a second O(log n) algorithm.
        // Cite your source and explain the approach in a comment before the logic.
        return null; // Remove this line and implement the method.
    }

    public static void timeDemo() {
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            int x = 5 + 5;
        }
        long endTime = System.nanoTime();

        System.out.println("The example addition took: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            int x = 5 * 5;
        }
        endTime = System.nanoTime();
        System.out.println("The example multiplication took: " + (endTime - startTime) + " ns");
    }
}
