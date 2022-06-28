package io.github.thai.chemcalc.model;

public class StoichiometryMoleculeData {
    private Double moles;
    private String molecule;

    public StoichiometryMoleculeData(String molecule, Double moles) {
        this.moles = moles;
        this.molecule = molecule;
    }

    public Double getMoles() {
        return moles;
    }

    public void setMoles(Double moles) {
        this.moles = moles;
    }

    public String getMolecule() {
        return molecule;
    }

    public void setMolecule(String molecule) {
        this.molecule = molecule;
    }


}
