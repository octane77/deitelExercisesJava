package chapterThree;

public class PetrolStation {
    private String StationLocation;
    private String TypeOfPetrol;
    private Integer PetrolPurchasedInLiters;
    private Double PricePerLiter;
    private Double PercentageDiscount;

    public PetrolStation (String StationLocation, String TypeOfPetrol, Integer PetrolPurchasedInLiters, Double PricePerLiter, Double PercentageDiscount){
        this.StationLocation = StationLocation;
        this.TypeOfPetrol = TypeOfPetrol;
        this.PetrolPurchasedInLiters = PetrolPurchasedInLiters;
        this.PricePerLiter = PricePerLiter;
        this.PercentageDiscount = PercentageDiscount;
    }

    public void setStationLocation(String StationLocation) {
        this.StationLocation = StationLocation;
    }
    public String getStationLocation(){
        return StationLocation;
    }

    public void setTypeOfPetrol(String TypeOfPetrol) {
        this.TypeOfPetrol = TypeOfPetrol;
    }
    public String getTypeOfPetrol(){
        return TypeOfPetrol;
    }

    public void setPetrolPurchasedInLiters(Integer PetrolPurchasedInLiters) {this.PetrolPurchasedInLiters = PetrolPurchasedInLiters;}
    public Integer getPetrolPurchasedInLiters(){
        return PetrolPurchasedInLiters;
    }

    public void setPricePerLiter(Double PricePerLiter) {this.PricePerLiter = PricePerLiter;}
    public Double getPricePerLiter(){
        return PricePerLiter;
    }

    public void setPercentageDiscount(Double PercentageDiscount) {
        this.PercentageDiscount = PercentageDiscount;
    }
    public Double getPercentageDiscount() {return PercentageDiscount; }
}
