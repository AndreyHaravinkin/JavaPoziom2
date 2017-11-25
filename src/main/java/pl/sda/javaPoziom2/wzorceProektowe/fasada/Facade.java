package pl.sda.javaPoziom2.wzorceProektowe.fasada;

public class Facade {
    private Light light = new Light();
    private Windows windows = new Windows();

    public void sctivate(){
        light.on();;
        windows.open();
    }
    public void deactivat(){
        windows.close();
        light.off();
    }
}
