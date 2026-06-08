package com.indivaragroup.exam.spring.challenge.addition;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BallService {

    private final BallBox ballBox;

    public int calculateBallsToRemove(double targetPercentage) {
        double total = ballBox.getTotalBalls();
        double blue = ballBox.getBlueBalls();

        double x = (blue - (targetPercentage * total)) / (1.0 - targetPercentage);
        return (int) Math.round(x);
    }

    public void runSimulation(double targetPercentage) {
        int initialTotal = ballBox.getTotalBalls();
        int initialBlue = ballBox.getBlueBalls();
        int nonBlue = ballBox.getNonBlueBalls();

        System.out.println("--- JDT-17 Ball Challenge Simulation ---");
        System.out.println("Initial State:");
        System.out.printf("  - Total balls: %d\n", initialTotal);
        System.out.printf("  - Blue balls: %d (%.1f%%)\n", initialBlue, ((double) initialBlue / initialTotal) * 100);
        System.out.printf("  - Non-blue balls: %d (%.1f%%)\n", nonBlue, ((double) nonBlue / initialTotal) * 100);
        System.out.println();
        System.out.printf("Target Blue Percentage: %.1f%%\n", targetPercentage * 100);
        System.out.println("Simulating removal of blue balls step-by-step...");

        int currentTotal = initialTotal;
        int currentBlue = initialBlue;
        int removedCount = 0;

        while (currentTotal > 0) {
            double currentPercentage = (double) currentBlue / currentTotal;
            if (Math.abs(currentPercentage - targetPercentage) < 0.00001) {
                break;
            }
            currentBlue--;
            currentTotal--;
            removedCount++;

            if (removedCount % 10 == 0) {
                System.out.printf("  - Removed %d balls: Remaining Total = %d, Blue = %d (%.1f%%), Non-blue = %d (%.1f%%)\n",
                        removedCount, currentTotal, currentBlue, ((double) currentBlue / currentTotal) * 100,
                        nonBlue, ((double) nonBlue / currentTotal) * 100);
            }
        }

        System.out.println("\nSimulation Result:");
        System.out.printf("  - Blue balls to remove: %d\n", removedCount);
        System.out.printf("  - Final Total balls: %d\n", currentTotal);
        System.out.printf("  - Final Blue balls: %d (%.1f%%)\n", currentBlue, ((double) currentBlue / currentTotal) * 100);
        System.out.printf("  - Final Non-blue balls: %d (%.1f%%)\n", nonBlue, ((double) nonBlue / currentTotal) * 100);
    }
}