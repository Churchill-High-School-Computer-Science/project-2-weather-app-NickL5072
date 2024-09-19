public class Main {
    public static void main(String[] args) {

        //TODO
        WeatherAPI object = new WeatherAPI();
        GUI Gobject = new GUI(object);
        Gobject.createWindow();
        Gobject.setUpButton();
        Gobject.greenBackground();



    }
}
