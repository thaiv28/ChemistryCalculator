package io.github.thai.chemcalc.service;

import io.github.thai.chemcalc.model.*;
import org.springframework.stereotype.Service;
import picocli.CommandLine;

import java.util.*;
import java.util.concurrent.Callable;

@Service
@CommandLine.Command(
        name = "limitedReactantStoichiometry",
        description = "Solves limiting reactant stoichiometry problems."
)
public class StoichiometryCalcService implements CalcService<StoichiometryParams, StoichiometryResult>, Runnable {

    @CommandLine.Parameters(index = "0", description = "Parameters for StoichiometryService")
    private String reactionStr;

    public void run() {
        ArrayList<StoichiometryMoleculeData> list = new ArrayList<>();
        list.add(new StoichiometryMoleculeData("CO2", 5d));
        list.add(new StoichiometryMoleculeData("H2O", 6d));
        System.out.println(calc(new StoichiometryParams(reactionStr, list)));
    }

    // TODO : fix error with negative number (try CO2 + H2O = O2)
    public StoichiometryResult calc(StoichiometryParams parameters) {
        Reaction reaction = new Reaction(parameters.getReaction());
        LinkedHashMap<Molecule, Double> reactantData = new LinkedHashMap<>(); //moles available for each molecule in reactants
        LinkedHashMap<Molecule, Double> productData = new LinkedHashMap<>(); //moles available for each molecule in products
        LinkedHashMap<Molecule, Double> totalMoles = new LinkedHashMap<>(); //moles available * coefficient for each molecule (effective moles) out of reactants
        ArrayList<StoichiometryMoleculeData> results = new ArrayList<>();
        Double reactionTimes; //amount of times a reaction will take place (mole ratio LCD)

        Map<Molecule, Integer> reactCoefficients = reaction.getReactants(); //creates Map<Molecules, coefficient> out of reactants from reaction
        Map<Molecule, Integer>  prodCoefficients = reaction.getProducts(); //creates Map<Molecules, coefficient> out of products from reaction

        //fills reactant data with molecules from reactCoefficients and data from parameters
        for(Molecule molecule : reactCoefficients.keySet()) {
            for(StoichiometryMoleculeData data : parameters.getMoleculeData()) {
                if(data.getMolecule().equals(molecule.getName())) {
                    reactantData.put(molecule, data.getMoles());
                }
            }
        }

        //fills productData with molecules from prodCoefficients
        // TODO: provide functionality to start with mole count other than 0 for products
        for(Molecule molecule : prodCoefficients.keySet()) {
            productData.put(molecule, 0d);
        }

        //for every molecule in reactants: calculate total moles (moles * coefficient)
        for(Molecule molecule : reactantData.keySet()) {
            totalMoles.put(molecule, reactCoefficients.get(molecule) * reactantData.get(molecule));
        }

        //finds highest totalMoles and find reactionTimes
        Double maxNum = 0.0;
        reactionTimes = 1.0;

        for(Molecule molecule : totalMoles.keySet()){
            if (totalMoles.get(molecule) > maxNum) {
                maxNum = totalMoles.get(molecule);
                reactionTimes = reactantData.get(molecule) / reactCoefficients.get(molecule);
            }
        }

        //replaces reactants and products with new mol data, puts in results
        // TODO: allow give product data (ex: start w 5 moles of product)
        for(Molecule molecule : reactantData.keySet()){
            reactantData.replace(molecule, reactantData.get(molecule) - reactionTimes * reactCoefficients.get(molecule));
            results.add(new StoichiometryMoleculeData(molecule.getName(), reactantData.get(molecule)));
        }
        for(Molecule molecule : prodCoefficients.keySet()){
            productData.replace(molecule, reactionTimes * prodCoefficients.get(molecule));
            results.add(new StoichiometryMoleculeData(molecule.getName(), productData.get(molecule)));
        }


        return new StoichiometryResult(results);
    }
}
