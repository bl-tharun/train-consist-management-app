/**
 * =========================================================
 * CLASS – GoodsBogie
 * =========================================================
 *
 * Use Case 12: Goods Bogie Domain Model
 *
 * Description:
 * Represents a goods bogie with
 * shape and cargo type.
 *
 * This class is intentionally simple
 * and contains no validation logic.
 *
 * @version 12.0
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

    @Override
    public String toString() {
        return shape + " carrying " + cargo;
    }
}