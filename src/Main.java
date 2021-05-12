/*
 Program by: Mr. Tarazi, ASK HS Technology teacher
 Date: 05/1/2021
 Objective: At the restaurant, customers can sit at tables that are composed of two single tables pushed together.
 Write a class CombinedTable to represent the result of combining two SingleTable objects, based on the scenario listed
 in the FRQ.

 Question #2

*/

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Assume SingleTable objects t1, t2, and t3 have been created as follows:
        SingleTable t1 = new SingleTable(4,60.0,74);
        SingleTable t2 = new SingleTable(8,70.0,74);
        SingleTable t3 = new SingleTable(12,75.0,76);

        // A CombinedTable is composed of two SingleTable objects
        CombinedTable c1 = new CombinedTable(t1,t2);

        // Since its two single tables have a total of 12 seats, c1 can seat 10 or fewer
        System.out.println("c1 can seat -> " + c1.canSeat(9));
        System.out.println("Desirability View is -> " + c1.getDesirability());

        // A combined Table is composed of two Single Table objects
        CombinedTable c2 = new CombinedTable(t2,t3);
        System.out.println("c2 can seat -> " + c2.canSeat(18));
        System.out.println("Desirability View is -> " + c2.getDesirability());

        // Changing the view quality of one of the tables that makes up c2 changes the desirability of c2
        t2.setViewQuality(80);

        // Because of the view quality of t2 changed, the desirability of c2 has also changed.
        System.out.println("Desirability View is -> " + c2.getDesirability());

    }
}
