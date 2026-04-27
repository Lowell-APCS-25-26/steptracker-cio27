package org.APCSLowell;

public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int totalDays;
    private int activeDays;

    public StepTracker(int activityThreshold) {
        minSteps = activityThreshold;
        totalSteps = 0;
        totalDays = 0;
        activeDays = 0;
    }

    public void addDailySteps(int stepCount) {
        totalSteps += stepCount;
        totalDays++;
        if (stepCount >= minSteps) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (totalDays == 0) {
            return 0.0;
        }
        return (double) totalSteps / totalDays;
    }
}
