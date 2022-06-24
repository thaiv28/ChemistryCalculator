package io.github.thai.chemcalc.model;

public class DilutionParams {
    private Double molarity;
    private Double amount;
    private Double waterAmount;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(Double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public Double getMolarity() {
        return molarity;
    }

    public void setMolarity(Double molarity) {
        this.molarity = molarity;
    }
}
