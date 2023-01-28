package services;

import com.sun.xml.ws.developer.servlet.HttpSessionScope;
import exceptions.HeaterTooHotException;
import exceptions.HeaterTooHotExceptionBean;
import models.SmartCar;
import models.SmartHeater;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface = "services.ISmartHome")
@HttpSessionScope
@HandlerChain(file = "handlers.xml")
public class SmartHome implements ISmartHome {
    SmartHeater smartHeater = new SmartHeater();
    SmartCar smartCar = new SmartCar();


    @Override
    public SmartHeater getSmartHeaterData() {
        return this.smartHeater;
    }

    @Override
    public SmartCar getSmartCarData() {
        return this.smartCar;
    }

    @Override
    public void changeState() {
        this.smartHeater.changeState();
    }

    @Override
    public SmartHeater changeTemperature(double userInput) throws HeaterTooHotException {
        if(userInput > 15 || userInput < -15) {
            throw new HeaterTooHotException("You cannot use that large or low of a number on the heater", new HeaterTooHotExceptionBean());
        }
        this.smartHeater.changeTemperature(userInput);
        return this.smartHeater;
    }

    @Override
    public String bringDownMoisture() {
        this.smartHeater.setMoisture(30);
        return "Beginning the process of dropping Moisture";
    }

    @Override
    public String bringUpMoisture() {
        this.smartHeater.setMoisture(50);
        return "Beginning the process of bringing up Moisture";
    }

    @Override
    public String changeCarHeatingState() {
        if ((this.smartCar.getCarAC())) {
            this.smartCar.setCarAC(false);
            return "The car AC has shut down";
        } else {
            this.smartCar.setCarAC(true);
            return "The car AC has been turned on";
        }
    }

    @Override
    public String changeFrontWindowState() {
        if(this.smartCar.getFrontWindsShieldHeating()) {
            this.smartCar.setFrontWindsShieldHeating(false);
            return "The windshield heating is turned off";
        }
        else {
            this.smartCar.setFrontWindsShieldHeating(true);
            return "The windshield heating is turned on";
        }
    }

    @Override
    public String changeBackWindowState() {
        if(this.smartCar.getBackWindowHeating()) {
            this.smartCar.setBackWindowHeating(false);
            return "The back window heating has turned off";
        }
        else {
            this.smartCar.setBackWindowHeating(true);
            return "The back window heating has turned on";
        }
    }

    @Override
    public String changeSeatHeatingState() {
        if(this.smartCar.getSeatHeating()) {
            this.smartCar.setSeatHeating(false);
            return "Seat heating has been turned off";
        }
        else {
            this.smartCar.setSeatHeating(true);
            return "Seat heating has been turned on";
        }
    }
}
