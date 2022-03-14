/*5.33 (Facebook User Base Growth) According to CNNMoney.com, Facebook hit one billion users
        in October 2012. Using the compound-growth technique you learned in Fig. 5.6 and assuming
        its user base grows at a rate of 4% per month, how many months will it take for Facebook to grow
        its user base to 1.5 billion users? How many months will it take for Facebook to grow its user base
        to two billion users?*/

package chapterFive;

public class FacebookUserBaseGrowth {
    public static void main(String[] args) {
        double userGrowth;
        double users = 1000000000;
        double userGrowthRate = 0.04;

        System.out.printf("%s %s %n", "Users","  User Growth");
        for (int month = 1; month <= 12; month++){
            userGrowth = users * Math.pow(1.0 + userGrowthRate, month);
            System.out.printf("%4d%,20.2f%n", month, userGrowth);
        }
        System.out.println();
        System.out.printf("%s %s %n", "Users","  User Growth");
        for (int month = 1; month <= 24; month++){
            userGrowth = users * Math.pow(1.0 + userGrowthRate, month);
            System.out.printf("%4d%,20.2f%n", month, userGrowth);
        }

    }
}
