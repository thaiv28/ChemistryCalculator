package io.github.thai.chemcalc.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Molecule {
    private final Map<PeriodicTable, Integer> elementList;
    private String name;

    public Molecule(String nameTemp){
        this.name = nameTemp;
        elementList = new LinkedHashMap<>(6);
        char[] chArray = name.trim().toCharArray();
        while(Character.isDigit(chArray[0])){
            this.name = this.name.substring(1);
            chArray = name.trim().toCharArray();
        }
        //parses molecule into different elements
        for(int i = 0; i < chArray.length; i++){
            int current = i;
            String letterBefore; //current letter AND letter before
            String letterAfter; //current letter AND letter after

            if(i != chArray.length - 1) {
                letterAfter = Character.toString(chArray[i]) + chArray[i + 1];
            } else {
                letterAfter = Character.toString(chArray[i]);
            }
            if(i != 0) {
                letterBefore = Character.toString(chArray[i-1]) + chArray[i];
            } else {
                letterBefore = Character.toString(chArray[i]);
            }

            //check if char is number
            if(Character.isDigit(chArray[i])){
                if(i == 0 || (i == 1 && Character.isLowerCase(chArray[i-1]))){
                    elementList.clear();
                    break;
                    //if previous is upper case (ex: H5), puts 5 as value for hydrogen
                } else {
                    int value = Integer.parseInt(Character.toString(chArray[i]));
                    if (Character.isUpperCase(chArray[i - 1])) {
                        elementList.put(PeriodicTable.lookup(Character.toString(chArray[i-1])), value);
                        //else if previous two are upper then lower (ex: Mg5), put 5 as value for Magnesium
                    } else if(Character.isUpperCase(chArray[i-2]) && Character.isLowerCase(chArray[i-1])){
                        elementList.put(PeriodicTable.lookup(Character.toString(chArray[i-2]) + chArray[i - 1]), value);
                    } else {
                        elementList.clear();
                        break;
                    }
                }
            } else
                //checks if char is upper case
                if(Character.isUpperCase(chArray[i])){
                    //if upper then lower case (ex: Mg), then adds both upper/lower to elementList; increases i to get to next element
                    if(PeriodicTable.lookup(letterAfter) != null) {
                        elementList.put(PeriodicTable.lookup(letterAfter), 1);
                        i++;
                        //else add char to elementList
                    } else {
                        elementList.put(PeriodicTable.lookup(Character.toString(chArray[i])), 1);
                    }
                }
            //if not a valid element, clear elementList to return null; current used instead of i bc error where i increases out of bounds
            if(PeriodicTable.lookup(Character.toString(chArray[current])) == null
                    && PeriodicTable.lookup(letterAfter) == null
                    && PeriodicTable.lookup(letterBefore) == null
                    && !Character.isDigit(chArray[i])){
                elementList.clear();
                break;
            }
        }
    }

    public String getName(){
        if(elementList.isEmpty()){
            return null;
        } else {
            return name;
        }
    }

    public static int getCount(String mol){
        char[] ch = mol.trim().toCharArray();
        if(Character.isDigit(ch[0])){
            return Integer.parseInt(Character.toString(ch[0]));
        } else {
            return 1;
        }

    }

    public String toString(){
        StringBuilder mol = new StringBuilder();
        if(elementList.isEmpty()){
            return null;
        }
        //goes through list and adds key(element) and value(num elements) to mol
        for(PeriodicTable elementName : elementList.keySet()){
            mol.append(elementName.name()).append(" (").append(elementList.get(elementName)).append(")")
                    .append(", ");
        }

        //remove last comma
        mol.setLength(mol.length() - 2);

        return mol.toString();
    }
}
