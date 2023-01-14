public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 2");
        Automobile carWithConstructor1 = new Automobile("Lada","Granta",1.7,"желтый",2015,"Россия");
        Automobile carWithConstructor2 = new Automobile("Audi","A8 50 L TDI quattro",3.0,"черный",2020,"Германия");
        Automobile carWithConstructor3 = new Automobile("BMW","Z8",3.0,"черный",2021,"Германия");
        Automobile carWithConstructor4 = new Automobile("Kia","Sportage 4-го поколения",2.4,"красный",2018,"Южная Корея");
        Automobile carWithConstructor5 = new Automobile("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея");
        System.out.println(carWithConstructor1.toString());
        System.out.println(carWithConstructor2.toString());
        System.out.println(carWithConstructor3.toString());
        System.out.println(carWithConstructor4.toString());
        System.out.println(carWithConstructor5.toString());
        System.out.println("\nTask 3");
        Automobile carTestConstructorErrors = new Automobile("","",0,"",0,"");
        System.out.println(carTestConstructorErrors.toString());
        Automobile carTestConstructorErrors1 = new Automobile(null,null,0,null,0,null);
        System.out.println(carTestConstructorErrors1.toString());
    }
}