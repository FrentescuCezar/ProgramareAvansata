package Homework;

public class Solution {
    private Problem problem = new Problem();
    private RoomH[] rooms;

    public void setProblem(Problem problem) {
        problem = problem;
        rooms = new RoomH[problem.allEvents.length];
    }
}
