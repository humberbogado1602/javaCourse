package chapter12;

import java.util.HashMap;
import java.util.Map;

public class NewTestResults {

    public static void main(String[] args) {
        //TestResults results = new TestResults();
        var originalResults = TestResults.getOriginalGrades();

        var newlyResults = TestResults.getMakeUpGrades();

        var finalResults = generateFinalResults(originalResults, newlyResults);

        showResults(finalResults);
    }

    private static void showResults(Map finalResults) {
        finalResults.forEach((k,v) ->
                System.out.println("Student " + k + ", score: " + v));

    }

    private static Map generateFinalResults(Map<String,Integer> originalResults, Map<String,Integer> newlyResults) {
        Map finalResults = new HashMap();
        //Make loop and evaluate the results, then build the new map of final results
        originalResults.forEach((k,v) -> {
            if (v >= newlyResults.get(k)) {
                finalResults.put(k,v);
            }else{
                finalResults.put(k,newlyResults.get(k));
            }
        });
        return finalResults;
    }

}
