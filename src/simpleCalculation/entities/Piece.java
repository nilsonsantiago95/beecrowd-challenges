package simpleCalculation.entities;

public class Piece {

    private Integer code;
    private Integer quantity;
    private Double unitValue;

    public Piece() {
        
    }

    public Piece(int code, int quantity, double unitValue) {
        this.code = code;
        this.quantity = quantity;
        this.unitValue = unitValue;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(Double unitValue) {
        this.unitValue = unitValue;
    }

    public Double totalValue() {
        return quantity * unitValue;
    }

}
