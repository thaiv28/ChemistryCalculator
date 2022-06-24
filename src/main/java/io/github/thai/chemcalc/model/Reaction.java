package io.github.thai.chemcalc.model;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import io.github.thai.chemcalc.model.Molecule;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Reaction {
    private final String reaction;
    private Map<Molecule, Integer> reactants = new LinkedHashMap();
    private Map<Molecule, Integer> products = new LinkedHashMap();

    public Reaction(String tempReaction) {
        this.reaction = tempReaction.replace(" ", "");
        int numEqual = this.reaction.length() - this.reaction.replace("=", "").length();
        if (numEqual == 1) {
            int equalIndex = this.reaction.indexOf("=");
            this.reactants = this.parseHalf(this.reaction.substring(0, equalIndex));
            this.products = this.parseHalf(this.reaction.substring(equalIndex + 1));
        }

        this.clearIfNull();
    }

    public String getReaction() {
        return this.reaction;
    }

    public LinkedHashMap<Molecule, Integer> parseHalf(String rString) {
        LinkedHashMap<Molecule, Integer> map = new LinkedHashMap();
        int plusIndex = rString.indexOf("+");
        int oldPlusIndex = -1;
        int rNumPlus = rString.length() - rString.replace("+", "").length();

        for(int i = 0; i < rNumPlus; ++i) {
            String tempRString;
            if (plusIndex != -1) {
                tempRString = rString.substring(oldPlusIndex + 1, plusIndex);
            } else {
                tempRString = rString.substring(oldPlusIndex + 1);
            }

            map.put(new Molecule(tempRString), Molecule.getCount(tempRString));
            oldPlusIndex = plusIndex;
            plusIndex = rString.indexOf("+", plusIndex + 1);
        }

        if (plusIndex == -1) {
            map.put(new Molecule(rString.substring(oldPlusIndex + 1)), Molecule.getCount(rString.substring(oldPlusIndex + 1)));
        }

        return map;
    }

    public boolean isValid() {
        return !this.reactants.isEmpty() && !this.products.isEmpty();
    }

    public void clearIfNull() {
        Iterator var1 = this.reactants.keySet().iterator();

        Molecule product;
        while(var1.hasNext()) {
            product = (Molecule)var1.next();
            if (product == null || product.toString() == null) {
                this.reactants.clear();
                break;
            }
        }

        var1 = this.products.keySet().iterator();

        while(var1.hasNext()) {
            product = (Molecule)var1.next();
            if (product == null || product.toString() == null) {
                this.products.clear();
                break;
            }
        }

        if (this.reactants.isEmpty() || this.products.isEmpty()) {
            this.products.clear();
            this.reactants.clear();
        }

    }

    public Map<Molecule, Integer> getReactants() {
        return this.reactants;
    }

    public Map<Molecule, Integer> getProducts() {
        return this.products;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        if (!this.reactants.isEmpty() && !this.products.isEmpty()) {
            s.append("Reactants: ");
            Iterator var2 = this.reactants.keySet().iterator();

            Molecule product;
            while(var2.hasNext()) {
                product = (Molecule)var2.next();
                s.append(product.getName()).append(" (").append(this.reactants.get(product)).append("), ");
            }

            s.setLength(s.length() - 2);
            s.append(System.getProperty("line.separator")).append("Products: ");
            var2 = this.products.keySet().iterator();

            while(var2.hasNext()) {
                product = (Molecule)var2.next();
                s.append(product.getName()).append(" (").append(this.products.get(product)).append("), ");
            }

            s.setLength(s.length() - 2);
            return s.toString();
        } else {
            return null;
        }
    }
}
