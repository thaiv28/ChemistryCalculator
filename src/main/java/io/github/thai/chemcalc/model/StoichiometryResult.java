package io.github.thai.chemcalc.model;

import java.util.List;

public class StoichiometryResult {
    private List<StoichiometryElementData> data;

    public List<StoichiometryElementData> getData() {
        return data;
    }

    public void setData(List<StoichiometryElementData> data) {
        this.data = data;
    }
}
