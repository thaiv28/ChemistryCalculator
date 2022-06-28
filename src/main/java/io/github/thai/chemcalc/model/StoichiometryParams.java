package io.github.thai.chemcalc.model;

import java.util.List;

public class StoichiometryParams {
    private String reaction;

    private List<StoichiometryMoleculeData> moleculeData;

    public StoichiometryParams(String reaction, List<StoichiometryMoleculeData> moleculeData) {
        this.reaction = reaction;
        this.moleculeData = moleculeData;
    }

    public List<StoichiometryMoleculeData> getMoleculeData() {
        return moleculeData;
    }

    public void setMoleculeData(List<StoichiometryMoleculeData> moleculeData) {
        this.moleculeData = moleculeData;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

}
