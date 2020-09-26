package accounts;
class Vehicle {
    int passengers; //количество пассажиров
    int fuelcap; //емкость топливного бака
    int mpg; //потребление топлива в милях на галлон}
// В этом классе объявляется объект типа Vehicle
}

public class TwoVehicles {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        int range1, range2;//расстояния
        // Присвоить значения полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        //Присвоить значения полям объекта sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        //Рассчитать дальность поездки при полном баке
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;
        System.out.println("Мини-фypгoн может перевезти " +
                minivan.passengers + " пассажиров на расстояние " + range1 + " миль");
        System.out.println("Cпopтивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров на расстояние " + range2 + " миль");
    }
}
