package ejercicio4Herencias;

import ejercicio4.SmartDevice;

public class SmartPhone extends SmartDevice {
    public Float inches;

    public SmartPhone(){
    }

    public SmartPhone(String marca, String modelo, Float inches) {
        super(marca, modelo);
        this.inches = inches;
    }
}


