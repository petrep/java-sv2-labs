package collectionsmap;

import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int nextPerson = Integer.MAX_VALUE;
        for (Integer i : applicants.keySet()) {
            if (i > lastNumber && i < nextPerson) {
                nextPerson = i;
            }
        }
        return applicants.get(nextPerson);
    }
}
