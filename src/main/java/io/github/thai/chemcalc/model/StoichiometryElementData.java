package io.github.thai.chemcalc.model;

public class StoichiometryElementData {
    private Double moles;

    public Double getMoles() {
        return moles;
    }

    public void setMoles(Double moles) {
        this.moles = moles;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    private String element;
}
