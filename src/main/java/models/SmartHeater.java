package models;

import java.util.Random;

public class SmartHeater {
    Random random = new Random();
    private String name;
    private String producer;
    private String serialNumber;
    private Boolean state;
    private double temperature;
    private double moisture;

    public SmartHeater() {
        name = "Falcon Smart Heater";
        producer = "Falcon d.o.o";
        serialNumber = "BpMU7Ae6";
        state = true;
        temperature = 22.5;
        moisture = random.nextInt(80);
    }

    public SmartHeater getInfo() {
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getMoisture() { return moisture; }

    public void setMoisture(double moisture) { this.moisture = moisture; }

    public void changeState() {
        if(state) {
            state = false;
        }
        else {
            state = true;
        }
    }

    public void changeTemperature(double userInput) {
        temperature += userInput;
    }
}
