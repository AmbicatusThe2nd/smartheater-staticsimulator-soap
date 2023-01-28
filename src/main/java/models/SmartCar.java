package models;

public class SmartCar {
    private String carName;
    private String serialNumber;
    private double carTemperature;
    private Boolean carAC;
    private Boolean frontWindsShieldHeating;
    private Boolean backWindowHeating;
    private Boolean seatHeating;
    private double percentage;


    public SmartCar(){
        this.carName = "Tesla Model S";
        this.serialNumber = "BG2Xipy4";
        this.carTemperature = 22.8;
        this.carAC = false;
        this.frontWindsShieldHeating = false;
        this.backWindowHeating = false;
        this.seatHeating = false;
        this.percentage = 100;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public double getCarTemperature() {
        return this.carTemperature;
    }

    public void setCarTemperature(double carTemperature) {
        this.carTemperature = carTemperature;
    }

    public Boolean getCarAC() {
        return this.carAC;
    }

    public void setCarAC(Boolean carAC) {
        this.carAC = carAC;
    }

    public Boolean getFrontWindsShieldHeating() {
        return this.frontWindsShieldHeating;
    }

    public void setFrontWindsShieldHeating(Boolean frontWindsShieldHeating) {
        this.frontWindsShieldHeating = frontWindsShieldHeating;
    }

    public Boolean getBackWindowHeating() {
        return this.backWindowHeating;
    }

    public void setBackWindowHeating(Boolean backWindowHeating) {
        this.backWindowHeating = backWindowHeating;
    }

    public Boolean getSeatHeating() {
        return this.seatHeating;
    }

    public void setSeatHeating(Boolean seatHeating){
        this.seatHeating = seatHeating;
    }

    public double getPercentage() {
        return this.percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }


}
