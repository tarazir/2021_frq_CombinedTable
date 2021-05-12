// Single Table class

public class SingleTable {

    // Instance variables
    private int seat;
    private double quality;
    private int height;

    // Constructor of Single Table class
    public SingleTable(int s, double q, int h) {
        this.seat = s;
        this.quality = q;
        this.height = h;
    }

    // Getter for the Seat variable
    public int getSeat() {
        return seat;
    }

    // Getter for the View Quality variable
    public double getViewQuality() {
        return  quality;
    }

    // Setter for the View Quality variable
    public void setViewQuality(double q) {
        this.quality = q;
    }

    // Getter for the Height variable
    public int getHeight() {
        return height;
    }
}
