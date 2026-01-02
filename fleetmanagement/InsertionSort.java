package fleetmanagement;
import java.util.ArrayList;
import java.util.Comparator;

public class InsertionSort {
    public static void sort(ArrayList<Jet> jets) {
        for (int i = 1; i < jets.size(); i++) {
            Jet key = jets.get(i);
            int j = i - 1;
            while (j >= 0 && jets.get(j).getJetName().length() > key.getJetName().length()){
                jets.set(j + 1, jets.get(j));
                j--;
            }
            jets.set(j + 1, key);
        }
    }
}
