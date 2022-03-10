package Homework;

/**
 * Contains a problem and it allocates the size for the rooms that will be assigned for each event.
 */
public class Solution {
    private Problem problem = new Problem();
    private RoomH[] assignedRooms;


    /**
     * Setting the problem for the solution.
     * @param problem Contains allRooms and allEvents
     */
    public void setProblem(Problem problem) {
        this.problem = problem;
        this.assignedRooms = new RoomH[problem.allEvents.length];
    }


    /**
     * Getting the solution for the problem, with an algorithm that assigns events to rooms.
     * The algorithm has the static method "assignEventsToRooms" which takes as parameters the problem and the assignedRooms that are empty.
     */
    public void getSolution() {
        Algorithm.assignEventsToRooms(problem, assignedRooms);
    }
}
