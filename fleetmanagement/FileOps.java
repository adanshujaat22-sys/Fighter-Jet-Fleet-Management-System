package fleetmanagement;

import java.io.*;
import java.util.ArrayList;

public class FileOps {

    // Creates a new empty file, returns true if successful, false if error or file exists
    public boolean createFile(String fileName) {
        File file = new File(fileName);
        try {
            if (file.exists()) {
                System.out.println("File already exists.");
                return false;
            }
            return file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
            return false;
        }
    }

    // Deletes a file, returns true if successful, false otherwise
    public boolean deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            return file.delete();
        } else {
            System.out.println("File does not exist.");
            return false;
        }
    }

    // Saves jets to a file in multi-line format
    public boolean saveJetsToFile(String fileName, ArrayList<Jet> jets) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            if (jets.isEmpty()) {
                writer.write("No jets to save.\n");
            } else {
                for (Jet jet : jets) {
                    writer.write(jet.toString());
                    writer.write("\n");
                }
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
            return false;
        }
    }

    // Loads jets from a file; returns ArrayList of Jet
    // Assumes file format identical to saveJetsToFile output
    public ArrayList<Jet> loadJetsFromFile(String fileName) {
        ArrayList<Jet> loadedJets = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String jetName = null, country = null, company = null, jetType = null, generation = null;

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.startsWith("Jet Name: ")) {
                    jetName = line.substring("Jet Name: ".length());
                } else if (line.startsWith("Country: ")) {
                    country = line.substring("Country: ".length());
                } else if (line.startsWith("Company: ")) {
                    company = line.substring("Company: ".length());
                } else if (line.startsWith("Type: ")) {
                    jetType = line.substring("Type: ".length());
                } else if (line.startsWith("Generation: ")) {
                    generation = line.substring("Generation: ".length());
                } else if (line.startsWith("-----------------------")) {
                    // When the separator line is reached, create the jet if all attributes present
                    if (jetName != null && country != null && company != null && jetType != null && generation != null) {
                        Jet jet = new Jet(jetName, country, company, jetType, generation);
                        loadedJets.add(jet);
                    }
                    // Reset for next jet
                    jetName = null;
                    country = null;
                    company = null;
                    jetType = null;
                    generation = null;
                }
            }
            // For last jet if file does not end with separator
            if (jetName != null && country != null && company != null && jetType != null && generation != null) {
                Jet jet = new Jet(jetName, country, company, jetType, generation);
                loadedJets.add(jet);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return loadedJets;
    }
}
