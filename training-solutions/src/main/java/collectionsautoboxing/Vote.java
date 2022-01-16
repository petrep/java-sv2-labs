package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> results) {
        Map<VoteResult, Integer> finalResults = new HashMap<>();
        for (VoteResult vr : results.values()) {
            if (!finalResults.containsKey(vr)) {
                finalResults.put(vr, 0);
            }
            finalResults.put(vr, finalResults.get(vr) + 1);
        }
        return finalResults;
    }
}
