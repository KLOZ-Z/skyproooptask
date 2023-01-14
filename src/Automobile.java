public class Automobile {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int year;
    private final String country;

    public Automobile(String brand,String model, double engineVolume, String color, int year, String country){
        if(brand==null)
            this.brand = "default";
        else
        if(brand.isEmpty())
            this.brand = "default";
        else
            this.brand = brand;
        if(model==null)
            this.model = "default";
        else
        if(model.isEmpty())
            this.model = "default";
        else
            this.model = model;
        if(engineVolume<=0)
            this.engineVolume = 1.5;
        else
            this.engineVolume = engineVolume;
        if(color==null)
            this.color = "default";
        else
        if(color.isEmpty())
            this.color = "белый";
        else
            this.color = color;
        if(year<=0)
            this.year = 2000;
        else
            this.year = year;
        if(country==null)
            this.country = "default";
        else
        if(country.isEmpty())
            this.country = "default";
        else
            this.country = country;
    }

    @Override
    public String toString(){
        return this.brand+" "+this.model+", сборка: "+this.country+", Цвет кузова "+this.color+", объем двигателя "+this.engineVolume+" л., год выпуска "+this.year;
    }
}