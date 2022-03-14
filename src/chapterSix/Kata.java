package chapterSix;

public class Kata {
    static int total =0;
    public static int calculateTotalOf(int[] numbers) {
        int total = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        return total;
    }

    public static double calculateAverageOf(int[] numbers) {
        double total = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
         double average = 0.0;
         average = total/(double)numbers.length;
         return average;
    }

    public static int calculateMaximumOf(int[] numbers) {
        int maximumNumber = numbers[0];
        for (int number: numbers){
            maximumNumber = Math.max(maximumNumber, number);
        }
        return maximumNumber;
    }

    public static int calculateMinimumOf(int[] numbers) {
        int minimumNumber =numbers[0];
        for (int number: numbers){
            minimumNumber = Math.min(minimumNumber, number);
        }
        return minimumNumber;

    }

    public char calculateGradeFor(int score) {
        if (score >= 100) return '$';
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }

        public int calculatePricingTier(int tier) {

            int tier1 = tier * 2000;
            int tier2 = tier * 1800;
            int tier3 = tier * 1600;
            int tier4 = tier * 1500;
            int tier5 = tier * 1300;
            int tier6 = tier * 1200;
            int tier7 = tier * 1100;
            int tier8 = tier * 1000;

            if (tier >= 500)
                return tier8;
            if (tier >= 200 & tier < 500)
                return tier7;
            if (tier >= 100 & tier < 200)
                return tier6;
            if (tier >= 50 & tier < 100)
                return tier5;
            if (tier >= 30 & tier < 50)
                return tier4;
            if (tier >= 10 & tier < 30)
                return tier3;
            if (tier >= 5 & tier < 10)
                return tier2;
            if (tier >= 1 & tier < 5)
                return tier1;

            return '0';

        }

    }
