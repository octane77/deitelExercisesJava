package chapterThree;

public class Car {
    private String Model;
    private String Year;
    private Double Price;

    public Car(String Model, String Year, Double Price){
        this.Model = Model;
        this.Year = Year;
        this.Price = Price;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getModel() {
        return Model;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getYear() {
        return Year;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public Double getPrice() {
        return Price;
    }
}
