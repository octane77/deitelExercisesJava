//4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
//        The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
//        total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//        these items are as follows:
//        Item Value
//        1 239.99
//        2 129.75
//        3 99.95
//        4 350.89
//        Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
//        displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.

package chapterFour;

import java.util.Scanner;

public class SalesPeopleCommission {
    public void commissionCalculator() {
        Scanner input = new Scanner( System.in );
        int salesPeopleCommission = 200;

        System.out.print("Salespersons Name?: ");
        String salespersonName = input.nextLine();

        System.out.print("How many items has this sales person sold this week?: ");
        int itemsSold = input.nextInt();

        int count = 1;
        int itemEntryTracker = 0;
        int indexItem1 = 0;
        int indexItem2 = 0;
        int indexItem3 = 0;
        int indexItem4 = 0;

        while(count<=itemsSold){
            System.out.println("Enter the index number of item: ");
            int itemNumber = input.nextInt();
            itemEntryTracker++;
            count++;

            switch (itemNumber) {
                case 1 -> indexItem1++;
                case 2 -> indexItem2++;
                case 3 -> indexItem3++;
                case 4 -> indexItem4++;
            }
        }
        System.out.printf("%nSales Report:%n");
        if (itemEntryTracker != 0) {
            double indexItem1Total = indexItem1 * 239.99;
            double indexItem2Total = indexItem2 * 129.75;
            double indexItem3Total = indexItem3 * 99.99;
            double indexItem4Total = indexItem4 * 350.89;
            double total = indexItem1Total + indexItem2Total + indexItem3Total + indexItem4Total;


            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Breakdown of Items Sold: ",
                    "Item 1: ", indexItem1,
                    "Item 2: ", indexItem2,
                    "Item 3: ", indexItem3,
                    "Item 4: ", indexItem4);

            double salesTotal = salesPeopleCommission + (total * 0.09);
            System.out.printf("%nTotal amount sold by %s is $%.2f", salespersonName, total);
            System.out.printf("%nCommission owed to %s is $%.2f", salespersonName, salesTotal);

        }
        else{
            System.out.println("No items were entered");
        }
    }
}
