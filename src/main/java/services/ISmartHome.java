package services;

import exceptions.HeaterTooHotException;
import models.SmartCar;
import models.SmartHeater;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ISmartHome {
    @WebMethod
    public SmartHeater getSmartHeaterData();

    @WebMethod
    public SmartCar getSmartCarData();

    @WebMethod
    @Oneway
    public void changeState();

    @WebMethod
    public SmartHeater changeTemperature(double userInput) throws HeaterTooHotException;

    @WebMethod
    public String bringDownMoisture();

    @WebMethod
    public String bringUpMoisture();

    @WebMethod
    public String changeCarHeatingState();

    @WebMethod
    public String changeFrontWindowState();

    @WebMethod
    public String changeBackWindowState();

    @WebMethod
    public String changeSeatHeatingState();
}
