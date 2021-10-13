package ejercicio4Herencias;

import ejercicio4.SmartDevice;

public class SmartWatch extends SmartDevice {
    public String color;

    public SmartWatch(){
    }

    public SmartWatch(String marca, String modelo, String color) {
        super(marca, modelo);
        this.color = color;
    }
}
