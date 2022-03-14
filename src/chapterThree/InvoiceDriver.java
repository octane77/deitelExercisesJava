//3.12 (Invoice Class) Create a class called Invoice that a hardware store might use to represent
//an invoice for an item sold at the store. An Invoice should include four pieces of information as
//instance variables—a part number (type String), a part description (type String), a quantity of the
//item being purchased (type int) and a price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
//multiplies the quantity by the price per item), then returns the amount as a double value. If the
//quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
//0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.

package chapterThree;

import java.util.Scanner;

public class InvoiceDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Invoice newInvoice = new Invoice(null,null, 0, 0);

        System.out.print("Please enter the part number: ");
        String partNumber = input.nextLine();
        newInvoice.setPartNumber(partNumber);

        System.out.print("Please enter a description of the purchased part: ");
        String partDescription = input.nextLine();
        newInvoice.setPartDescription(partDescription);

        System.out.print("Please enter the part quantity: ");
        int partQuantity = input.nextInt();
        newInvoice.setPartQuantity(partQuantity);

        System.out.print("Please enter the part prices: ");
        int pricePerItem = input.nextInt();
        newInvoice.setPricePerItem(pricePerItem);

        System.out.println(getInvoiceAmount(newInvoice.getPartQuantity(), newInvoice.pricePerItem));
    }

    private static double getInvoiceAmount(double partQuantity, double pricePerItem) {
        if(partQuantity < 0){
            partQuantity = 0;
        }

        if(pricePerItem < 0){
            pricePerItem = 0.0;
        }

        return partQuantity * pricePerItem;
    }
}
