package chapterThree;

public class Invoice {
    String partNumber;
    String partDescription;
    int partQuantity;
    int pricePerItem;

    public Invoice(String partNumber, String partDescription, int partQuantity, int pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.partQuantity = partQuantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getPartQuantity() {
        return partQuantity;
    }

    public void setPartQuantity(int partQuantity) {
        this.partQuantity = partQuantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}