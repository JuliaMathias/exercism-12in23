public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int carsPerHour = 221;
        int production = carsPerHour * speed;

        if (speed >= 1 && speed <= 4) {
            double productionRatePerHour = production;
            return productionRatePerHour;
        } else if (speed >= 5 && speed <= 8) {
            double productionRatePerHour = production * 0.9;
            return productionRatePerHour;
        } else if (speed == 9) {
            double productionRatePerHour = production * 0.8;
            return productionRatePerHour;
        } else if (speed == 10) {
            double productionRatePerHour = production * 0.77;
            return productionRatePerHour;
        } else {
            return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double workingCarsPerHour = productionRatePerHour(speed);
        double workingCarsPerMinute = workingCarsPerHour / 60;
        int workingItemsPerMinute = (int) Math.floor(workingCarsPerMinute);
        return workingItemsPerMinute;
    }
}
