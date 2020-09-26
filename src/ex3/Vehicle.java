package ex3;
//Пример №3. Добавление метода range() в класс Vehicle
public class Vehicle {
        int passengers;//количество пассажиров
        int fuelcap;//емкость топливного бака
        int mpg; //потребление топлива в милях на галлон
        //рассчитать и отобразить дальность поездки
        void range() {
            System.out.println("Дaльнocть поездки транспортного средства " + fuelcap * mpg + " миль.");
//Обратите внимание на указание переменных fuelcap и mpg без использования точечной нотации
        }
    }
    class AddMeth {
        public static void main(String args[]) {Vehicle minivan = new Vehicle();
            Vehicle sportscar = new Vehicle();
//Присвоить значения полям в объекте minivan
            int range1, range2;
            minivan.passengers = 7;
            minivan.fuelcap = 16;
            minivan.mpg = 21;
//Присвоить значения полям в объекте sportscar
            sportscar.passengers = 2;
            sportscar.fuelcap = 14;
            sportscar.mpg = 12;
            System.out.print("Мини-фypгoн может перевезти " +
                    minivan.passengers + " пассажиров. ");
            minivan.range();//отобразить дальность поездки мини-фургона
            System.out.print("Cпopтивный автомобиль может перевезти " +
                    sportscar.passengers + " пассажров. ");
            sportscar.range();//отобразить дальность поездки спортивного автомобиля
        }}