/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisonmanagementsystem;

/*
 * Developed by Roa'a.
 */
public class Guard extends Person {

    private String rank;

    public Guard(String name, int id, String rank) {

        super(name, id);
        this.rank = rank;

    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRank: " + getRank();
    }
}
