package io.github.thai.chemcalc.model;

import java.util.List;

public class StoichiometryParams {
    private String reaction;
    private List<StoichiometryElementData> elementData;
    public List<StoichiometryElementData> getElementData() {
        return elementData;
    }

    public void setElementData(List<StoichiometryElementData> elementData) {
        this.elementData = elementData;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

}
