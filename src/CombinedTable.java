// Combined Table class

public class CombinedTable {

    // Instance variable of type Single Table object
    private SingleTable t1, t2;

    // Constructor to instantiate Single Tables
    public CombinedTable (SingleTable t1, SingleTable t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    //Seating of table must be 2 less than the total of seating combined single tables.
    public boolean canSeat(int num) {
        return  num <= t1.getSeat() + t2.getSeat() -2;
    }

    // Desirability method depends on the height of the tables. If tables of same height its desirability is the average
    // otherwise its desirability is the average - 10
    public double getDesirability() {
        double average = (t1.getViewQuality() + t2.getViewQuality()) / 2;
        if(t1.getHeight() == t2.getHeight())
            return average;
        else
            return average - 10;
    }
}
