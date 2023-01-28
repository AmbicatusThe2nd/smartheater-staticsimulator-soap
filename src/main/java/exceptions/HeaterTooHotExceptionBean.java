package exceptions;

public class HeaterTooHotExceptionBean {
    private String message;

    public HeaterTooHotExceptionBean(){
    }

    public HeaterTooHotExceptionBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
