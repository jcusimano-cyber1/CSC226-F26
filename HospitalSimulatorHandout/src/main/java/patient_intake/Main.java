package patient_intake;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      String filePath = "src/main/java/patient_intake/patients.csv";
      PatientRegistry patients = new PatientRegistry();

      try (Scanner fileReader = new Scanner(new File(filePath))) {
         if (fileReader.hasNextLine()) {
            fileReader.nextLine(); // Skip the CSV header.
         }

         while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] parts = line.split(",");
            String fullname = parts[0];
            String nameParts [] = fullname.split(" ");
            String firstName = nameParts[0];
            String lastName = nameParts[1];
            int Age = Integer.parseInt(parts[1]);
           String gender = parts[2];
            String phoneNum = parts[3];

            Patient []patient = new Patient[1];
            patient[0] = new Patient(parts[4], firstName, lastName, Age);
            patients.addPatient(patient[0]);

            // TODO REQUIRED: Parse the fields from parts.
            // TODO REQUIRED: Split the full name into firstName and lastName.
            // TODO REQUIRED: Create a Patient and add it to patients.
         }
         System.out.println(patients);
         // TODO REQUIRED: Display the completed registry.
      } catch (FileNotFoundException exception) {
         System.out.println("Files not found: " + filePath );
         // TODO REQUIRED: Report a missing input file.
      }
   }
}