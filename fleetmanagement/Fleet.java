package fleetmanagement;

import java.util.ArrayList;
import java.util.Iterator;

public class Fleet {
    private ArrayList<Jet> jets;

    public Fleet() {
        jets = new ArrayList<>();
    }

    // This is adding a jet to the list
    public void addJet(Jet jet) {
        jets.add(jet);
    }

    // This deletes a jet. It returns true if a jet is found and false if not found.
    public boolean deleteJet(String jetName) {
        Iterator<Jet> iterator = jets.iterator();
        while (iterator.hasNext()) {
            Jet jet = iterator.next();
            if (jet.getJetName().equalsIgnoreCase(jetName)) {
                iterator.remove();
                return true;
            }
        }
        return false; // When jet is not found
    }

    // This returns a copy of the fleet.
    public ArrayList<Jet> getJets() {
        return new ArrayList<>(jets);
    }

    // This displays all the jets in the fleet using toString
    public void displayJets() {
        if (jets.isEmpty()) {
            System.out.println("No jets in the fleet.");
        } else {
            for (Jet jet : jets) {
                System.out.println(jet.toString());
            }
        }
    }
}
