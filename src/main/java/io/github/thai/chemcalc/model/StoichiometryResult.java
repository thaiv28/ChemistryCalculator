package io.github.thai.chemcalc.model;

import java.util.List;

public class StoichiometryResult {
    private List<StoichiometryMoleculeData> moleculeData;

    public StoichiometryResult(List<StoichiometryMoleculeData> data) {
        this.moleculeData = data;
    }

    public List<StoichiometryMoleculeData> getMoleculeData() {
        return moleculeData;
    }

    public void setMoleculeData(List<StoichiometryMoleculeData> moleculeData) {
        this.moleculeData = moleculeData;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for(StoichiometryMoleculeData data : moleculeData) {
            str.append(data.getMolecule());
            str.append(" (").append(data.getMoles()).append(")\n");
        }

        return str.toString();
    }
}
