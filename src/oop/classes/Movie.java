package oop.classes;

public class Movie {

    private String title;
    private int durationInMinute;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationInMinute() {
        return durationInMinute;
    }
    public void setDurationInMinute(int durationInMinute) {
        this.durationInMinute = durationInMinute;
    }

    public void play() { System.out.println("The movie " + title + " is playing"); }

    public void stop() { System.out.println("The movie " + title + " has stopped"); }
}
