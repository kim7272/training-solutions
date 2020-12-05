package methodvarargs.examstats;

public class ExamStats {

    private int maxScore;

    public ExamStats(int maxScore) {
        this.maxScore = maxScore;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int numberOfTopGrades = 0;
        for (int singleResult : results) {
            if (singleResult > limitInPercent) {
                numberOfTopGrades++;
            }
        }
        return numberOfTopGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
            boolean b = false;
            for (int singleResult : results) {
                if (singleResult < limitInPercent) {
                    b = true;
                }
            }
        return b;
    }
}