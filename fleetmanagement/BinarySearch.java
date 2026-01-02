package fleetmanagement;
import java.util.ArrayList;

public class BinarySearch {
    public static Jet find(ArrayList<Jet> sortedJets, String jetName) {
        int left = 0, right = sortedJets.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = sortedJets.get(mid).getJetName().compareToIgnoreCase(jetName);
            if (cmp == 0) return sortedJets.get(mid);
            if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
