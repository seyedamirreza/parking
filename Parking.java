package ir.ac.kntu;

public class Parking {

    private String name;
    private int time;
    private boolean[][] occupied;
    private int[][] timeEntered;
    private int baseCost;
    private int hourlyCost;

    public Parking(String name, int baseCost, int hourlyCost, int row, int column) {
        this.name = name;
        this.baseCost = baseCost;
        this.hourlyCost = hourlyCost;
        this.occupied[row][column] = true;

    }

    public Parking() {

    }

    public void addTime() {
        this.time++;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean[][] getOccupied() {
        return occupied;
    }

    public int[][] getTimeEntered() {
        return timeEntered;
    }

    public void setPosition(boolean[][] occupied, int[][] timeEntered) {
        this.occupied = occupied;
        this.timeEntered = timeEntered;
    }

    public int getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(int baseCost) {
        this.baseCost = baseCost;
    }

    public int getHourlyCost() {
        return hourlyCost;
    }

    public void setHourlyCost(int baseCost) {
        this.hourlyCost = baseCost;
    }

    public void carEntered(int row, int column) {
        occupied[row][column] = true;
        timeEntered[row][column] = 0;
    }

    public int carExit(int row, int column) {
        occupied[row][column] = false;
        timeEntered[row][column] = -1;
        return baseCost + hourlyCost * (time);
    }

}