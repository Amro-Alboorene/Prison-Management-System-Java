/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisonmanagementsystem;

/*
 * Developed by: Amro Alboorene.
 */
public class Cell {

    private int cellNumber;
    private int capacity;
    private int currentPrisoners;
    private int availableBeds;
    private Guard guard;

// Constructor
    public Cell(int cellNumber,
                int capacity,
                int currentPrisoners,
                Guard guard) {

        this.cellNumber = cellNumber;
        this.capacity = capacity;
        this.currentPrisoners = currentPrisoners;
        setAvailableBeds();
        this.guard = guard;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentPrisoners() {
        return currentPrisoners;
    }

    public void setCurrentPrisoners(int currentPrisoners) {
        this.currentPrisoners = currentPrisoners;
        setAvailableBeds();
    }

    public int getAvailableBeds() {
        return availableBeds;
    }

    public void setAvailableBeds() {
        availableBeds = capacity - currentPrisoners;
    }

    public Guard getGuard() {
        return guard;
    }

    public void setGuard(Guard guard) {
        this.guard = guard;
    }

    @Override
    public String toString() {

        return "Cell Number: " + cellNumber +
               "\nCapacity: " + capacity +
               "\nCurrent Prisoners: " + currentPrisoners +
               "\nAvailable Beds: " + availableBeds +
               "\nGuard Name: " +
               guard.getName();
    }
}