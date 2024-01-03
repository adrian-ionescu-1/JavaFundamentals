package Homework.Topic1;

public class TV {
    private String brand;
    private Display display;
    private int screenSize;
    private boolean isSmartTV;
    private int resolutionX;
    private int resolutionY;

    public TV(String brand, int screenSize, boolean isSmartTV, int resolutionX, int resolutionY, Display display) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.isSmartTV = isSmartTV;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isSmartTV() {
        return isSmartTV;
    }

    public void setSmartTV(boolean smartTV) {
        isSmartTV = smartTV;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void displayDetails() {
        String smartTVInfo = isSmartTV ? "Yes" : "No";
        System.out.println("TV: " + brand);
        System.out.println("Screen Size: " + display.getSize() + " inches");
        System.out.println("Technology: " + display.getTechnology());
        System.out.println("Resolution: " + resolutionX + "x" + resolutionY);
        System.out.println("Smart TV: " + smartTVInfo);
    }
}
