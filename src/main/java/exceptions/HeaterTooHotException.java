package exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HeaterTooHotException")
public class HeaterTooHotException extends Exception {
    private HeaterTooHotExceptionBean faultBean;

    public HeaterTooHotException(String message, HeaterTooHotExceptionBean faultInfo) {
        super(message);
        this.faultBean = faultInfo;
    }

    public HeaterTooHotException(String message, HeaterTooHotExceptionBean faultInfo, Throwable cause) {
        super(message, cause);
        this.faultBean = faultInfo;
    }

    public HeaterTooHotExceptionBean getInfo() {
        return this.faultBean;
    }
}
