package Homework;

public class Solution {
    private Problem problem = new Problem();
    private RoomH[] assignedRooms;

    public void setProblem(Problem problem) {
        this.problem = problem;
        this.assignedRooms = new RoomH[problem.allEvents.length];
    }

    public void getSolution() {
        Algorithm.assignEventsToRooms(problem, assignedRooms);
    }
}
