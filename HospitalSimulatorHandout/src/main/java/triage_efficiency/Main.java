package triage_efficiency;

import patient_intake.Patient;

public class Main {
    public static void main(String[] args) {
        Patient[] patients = generatePatients(3);

        // TODO REQUIRED: Generate the patient data.
        // TODO REQUIRED: Sort the data by patientID when needed.
        sortByPatientId(patients);

        // TODO REQUIRED: Run each search method and print a found and not-found example.
        Patient linearSearchResult = EfficiencyTester.linearSearch(patients, "P001");
        Patient binarySearchResult = EfficiencyTester.binarySearch(patients, "P001");
        System.out.println("Linear Search Result: " + linearSearchResult);
        System.out.println("Binary Search Result: " + binarySearchResult);

        // TODO OPTIONAL: Call timeDemo() to compare algorithm runtimes.
        EfficiencyTester.timeDemo();

    }

    /**
     * REQUIRED (80%): Generate sample patient data for testing.
     *
     * Build an array of Patient objects with realistic IDs, names, complaints,
     * and triage information so you can test each search method.
     */
    public static Patient[] generatePatients(int count) {
        Patient[] patients = new Patient[count];
        Patient[] samplePatients = {
            new Patient("P001", "John Doe", "Chest Pain", 3),
            new Patient("P002", "Jane Smith", "Fever", 2),
            new Patient("P003", "Bob Johnson", "Broken Leg", 4)
        };
        for (int i = 0; i < count && i < samplePatients.length; i++) {
            patients[i] = samplePatients[i];
        }
        return patients; // Replace this with your implementation.
    }

    /**
     * REQUIRED (80%): Sort patients by patientID before binary search.
     *
     * The binary-search version only works on an array sorted by patientID.
     */
    public static Patient[] sortByPatientId(Patient[] patients) {
        for (int i = 0; i < patients.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < patients.length; j++) {
                if (patients[j].getPatientID()
                        .compareTo(patients[smallest].getPatientID()) < 0) {
                    smallest = j;
                }
            }
            Patient temp = patients[i];
            patients[i] = patients[smallest];
            patients[smallest] = temp;
        }
        return patients; // Replace this with your implementation.
    }
}
