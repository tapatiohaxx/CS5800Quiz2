public class TrafficLight implements Observer {

    private String lightColor;

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor;
        notifyObservers(lightColor);
    }

    private void notifyObservers(String lightColor) {

    }

    public String getLightColor() {
        return lightColor;
    }
    @Override
    public void update(String colorOfLight) {
        
    }
}
