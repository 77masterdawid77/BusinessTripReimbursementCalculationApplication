public class RateConfiguration {
    private double dailyAllowanceRate;
    private double mileageRate;

    public RateConfiguration(double dailyAllowanceRate, double mileageRate) {
        this.dailyAllowanceRate = dailyAllowanceRate;
        this.mileageRate = mileageRate;
    }

    public double getDailyAllowanceRate() {
        return dailyAllowanceRate;
    }

    public void setDailyAllowanceRate(double dailyAllowanceRate) {
        this.dailyAllowanceRate = dailyAllowanceRate;
    }

    public double getMileageRate() {
        return mileageRate;
    }

    public void setMileageRate(double mileageRate) {
        this.mileageRate = mileageRate;
    }
}
