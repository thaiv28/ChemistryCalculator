package io.github.thai.chemcalc.model;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Molecule {
    private final LinkedHashMap<PeriodicTable, Integer> elementList;
    private String name;

    public Molecule(String nameTemp) {
        this.name = nameTemp;
        this.elementList = new LinkedHashMap<>(6);

        char[] chArray;
        for(chArray = this.name.trim().toCharArray(); Character.isDigit(chArray[0]); chArray = this.name.trim().toCharArray()) {
            this.name = this.name.substring(1);
        }

        for(int i = 0; i < chArray.length; ++i) {
            String var10000;
            String letterAfter;
            if (i != chArray.length - 1) {
                var10000 = Character.toString(chArray[i]);
                letterAfter = var10000 + chArray[i + 1];
            } else {
                letterAfter = Character.toString(chArray[i]);
            }

            String letterBefore;
            if (i != 0) {
                var10000 = Character.toString(chArray[i - 1]);
                letterBefore = var10000 + chArray[i];
            } else {
                letterBefore = Character.toString(chArray[i]);
            }

            if (!Character.isDigit(chArray[i])) {
                if (Character.isUpperCase(chArray[i])) {
                    if (PeriodicTable.lookup(letterAfter) != null) {
                        this.elementList.put(PeriodicTable.lookup(letterAfter), 1);
                        ++i;
                    } else {
                        this.elementList.put(PeriodicTable.lookup(Character.toString(chArray[i])), 1);
                    }
                }
            } else {
                label86: {
                    if (i != 0 && (i != 1 || !Character.isLowerCase(chArray[i - 1]))) {
                        int value = Integer.parseInt(Character.toString(chArray[i]));
                        if (Character.isUpperCase(chArray[i - 1])) {
                            this.elementList.put(PeriodicTable.lookup(Character.toString(chArray[i - 1])), value);
                            break label86;
                        }

                        if (Character.isUpperCase(chArray[i - 2]) && Character.isLowerCase(chArray[i - 1])) {
                            Map<PeriodicTable, Integer> var8;
                            var8 = this.elementList;
                            String var10001 = Character.toString(chArray[i - 2]);
                            var8.put(PeriodicTable.lookup(var10001 + chArray[i - 1]), value);
                            break label86;
                        }

                        this.elementList.clear();
                        break;
                    }

                    this.elementList.clear();
                    break;
                }
            }

            if (PeriodicTable.lookup(Character.toString(chArray[i])) == null && PeriodicTable.lookup(letterAfter) == null && PeriodicTable.lookup(letterBefore) == null && !Character.isDigit(chArray[i])) {
                this.elementList.clear();
                break;
            }
        }

    }

    public static int getCount(String mol) {
        char[] ch = mol.trim().toCharArray();
        return Character.isDigit(ch[0]) ? Integer.parseInt(Character.toString(ch[0])) : 1;
    }

    public String getName() {
        return this.elementList.isEmpty() ? null : this.name;
    }

    public String toString() {
        StringBuilder mol = new StringBuilder();
        if (this.elementList.isEmpty()) {
            return null;
        } else {

            for (PeriodicTable elementName : this.elementList.keySet()) {
                mol.append(elementName.name()).append(" (").append(this.elementList.get(elementName)).append(")").append(", ");
            }

            mol.setLength(mol.length() - 2);
            return mol.toString();
        }
    }
}
