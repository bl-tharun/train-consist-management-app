/**
 * =========================================================
 * CLASS – GoodsBogie
 * =========================================================
 *
 * Use Case 12–15: Goods Bogie Domain Model
 *
 * Description:
 * Represents a goods bogie.
 *
 * UC15 adds the ability to assign cargo
 * after creation without breaking
 * earlier use cases.
 *
 * @version 15.0
 */
public class GoodsBogie {

    private String shape;
    private String cargo;

    public GoodsBogie(String shape, String cargo) {
        this.shape = shape;
        this.cargo = cargo;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    // Added a setter here
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return shape + " carrying " + cargo;
    }
}