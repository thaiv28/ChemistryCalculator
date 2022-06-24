package io.github.thai.chemcalc.model;

import java.util.HashMap;
import java.util.Map;

public enum PeriodicTable {
    //Hydrogen ,Helium,Lithium,Beryllium,Boron,Carbon,Nitrogen,Oxygen,Fluorine,Neon,Sodium,Magnesium,Aluminum,Silicon,Phosphorus,Sulfur,Chlorine,Argon,Potassium,Calcium,Scandium,Titanium,Vanadium,Chromium,Manganese,Iron,Cobalt,Nickel,Copper,Zinc,Gallium,Germanium,Arsenic,Selenium,Bromine,Krypton,Rubidium,Strontium,Yttrium,Zirconium,Niobium,Molybdenum,Technetium,Ruthenium,Rhodium,Palladium,Silver,Cadmium,Indium,Tin,Antimony,Tellurium,Iodine,Xenon,Cesium,Barium,Lanthanum,Cerium,Praseodymium,Neodymium,Promethium,Samarium,Europium,Gadolinium,Terbium,Dysprosium,Holmium,Erbium,Thulium,Ytterbium,Lutetium,Hafnium,Tantalum,Wolfram,Rhenium,Osmium,Iridium,Platinum,Gold,Mercury,Thallium,Lead,Bismuth,Polonium,Astatine,Radon,Francium,Radium,Actinium,Thorium,Protactinium,Uranium,Neptunium,Plutonium,Americium,Curium,Berkelium,Californium,Einsteinium,Fermium,Mendelevium,Nobelium,Lawrencium,Rutherfordium,Dubnium,Seaborgium,Bohrium,Hassium,Meitnerium,Darmstadtium,Roentgenium,Copernicium,Nihonium,Flerovium,Moscovium,Livermorium,Tennessine,Oganesson;
    HYDROGEN(1, "H", 1.007f),
    HELIUM(2, "He", 4.002f),
    LITHIUM(3, "Li", 6.941f),
    BERYLLIUM(4, "Be", 9.012f),
    BORON(5, "B", 10.811f),
    CARBON(6, "C", 12.011f),
    NITROGEN(7, "N", 14.007f),
    OXYGEN(8, "O", 15.999f),
    FLUORINE(9, "F", 18.998f),
    NEON(10, "Ne", 20.18f),
    SODIUM(11, "Na", 22.99f),
    MAGNESIUM(12, "Mg", 24.305f),
    ALUMINUM(13, "Al", 26.982f),
    SILICON(14, "Si", 28.086f),
    PHOSPHORUS(15, "P", 30.974f),
    SULFUR(16, "S", 32.065f),
    CHLORINE(17, "Cl", 35.453f),
    ARGON(18, "Ar", 39.948f),
    POTASSIUM(19, "K", 39.098f),
    CALCIUM(20, "Ca", 40.078f),
    SCANDIUM(21, "Sc", 44.956f),
    TITANIUM(22, "Ti", 47.867f),
    VANADIUM(23, "V", 50.942f),
    CHROMIUM(24, "Cr", 51.996f),
    MANGANESE(25, "Mn", 54.938f),
    IRON(26, "Fe", 55.845f),
    COBALT(27, "Co", 58.933f),
    NICKEL(28, "Ni", 58.693f),
    COPPER(29, "Cu", 63.546f),
    ZINC(30, "Zn", 65.38f),
    GALLIUM(31, "Ga", 69.723f),
    GERMANIUM(32, "Ge", 72.64f),
    ARSENIC(33, "As", 74.922f),
    SELENIUM(34, "Se", 78.96f),
    BROMINE(35, "Br", 79.904f),
    KRYPTON(36, "Kr", 83.798f),
    RUBIDIUM(37, "Rb", 85.468f),
    STRONTIUM(38, "Sr", 87.62f),
    YTTRIUM(39, "Y", 88.906f),
    ZIRCONIUM(40, "Zr", 91.224f),
    NIOBIUM(41, "Nb", 92.906f),
    MOLYBDENUM(42, "Mo", 95.96f),
    TECHNETIUM(43, "Tc", 98f),
    RUTHENIUM(44, "Ru", 101.07f),
    RHODIUM(45, "Rh", 102.906f),
    PALLADIUM(46, "Pd", 106.42f),
    SILVER(47, "Ag", 107.868f),
    CADMIUM(48, "Cd", 112.411f),
    INDIUM(49, "In", 114.818f),
    TIN(50, "Sn", 118.71f),
    ANTIMONY(51, "Sb", 121.76f),
    TELLURIUM(52, "Te", 127.6f),
    IODINE(53, "I", 126.904f),
    XENON(54, "Xe", 131.293f),
    CESIUM(55, "Cs", 132.905f),
    BARIUM(56, "Ba", 137.327f),
    LANTHANUM(57, "La", 138.905f),
    CERIUM(58, "Ce", 140.116f),
    PRASEODYMIUM(59, "Pr", 140.908f),
    NEODYMIUM(60, "Nd", 144.242f),
    PROMETHIUM(61, "Pm", 145f),
    SAMARIUM(62, "Sm", 150.36f),
    EUROPIUM(63, "Eu", 151.964f),
    GADOLINIUM(64, "Gd", 157.25f),
    TERBIUM(65, "Tb", 158.925f),
    DYSPROSIUM(66, "Dy", 162.5f),
    HOLMIUM(67, "Ho", 164.93f),
    ERBIUM(68, "Er", 167.259f),
    THULIUM(69, "Tm", 168.934f),
    YTTERBIUM(70, "Yb", 173.054f),
    LUTETIUM(71, "Lu", 174.967f),
    HAFNIUM(72, "Hf", 178.49f),
    TANTALUM(73, "Ta", 180.948f),
    WOLFRAM(74, "W", 183.84f),
    RHENIUM(75, "Re", 186.207f),
    OSMIUM(76, "Os", 190.23f),
    IRIDIUM(77, "Ir", 192.217f),
    PLATINUM(78, "Pt", 195.084f),
    GOLD(79, "Au", 196.967f),
    MERCURY(80, "Hg", 200.59f),
    THALLIUM(81, "Tl", 204.383f),
    LEAD(82, "Pb", 207.2f),
    BISMUTH(83, "Bi", 208.98f),
    POLONIUM(84, "Po", 210f),
    ASTATINE(85, "At", 210f),
    RADON(86, "Rn", 222f),
    FRANCIUM(87, "Fr", 223f),
    RADIUM(88, "Ra", 226f),
    ACTINIUM(89, "Ac", 227f),
    THORIUM(90, "Th", 232.038f),
    PROTACTINIUM(91, "Pa", 231.036f),
    URANIUM(92, "U", 238.029f),
    NEPTUNIUM(93, "Np", 237f),
    PLUTONIUM(94, "Pu", 244f),
    AMERICIUM(95, "Am", 243f),
    CURIUM(96, "Cm", 247f),
    BERKELIUM(97, "Bk", 247f),
    CALIFORNIUM(98, "Cf", 251f),
    EINSTEINIUM(99, "Es", 252f),
    FERMIUM(100, "Fm", 257f),
    MENDELEVIUM(101, "Md", 258f),
    NOBELIUM(102, "No", 259f),
    LAWRENCIUM(103, "Lr", 262f),
    RUTHERFORDIUM(104, "Rf", 261f),
    DUBNIUM(105, "Db", 262f),
    SEABORGIUM(106, "Sg", 266f),
    BOHRIUM(107, "Bh", 264f),
    HASSIUM(108, "Hs", 267f),
    MEITNERIUM(109, "Mt", 268f),
    DARMSTADTIUM(110, "Ds ", 271f),
    ROENTGENIUM(111, "Rg ", 272f),
    COPERNICIUM(112, "Cn ", 285f),
    NIHONIUM(113, "Nh", 284f),
    FLEROVIUM(114, "Fl", 289f),
    MOSCOVIUM(115, "Mc", 288f),
    LIVERMORIUM(116, "Lv", 292f),
    TENNESSINE(117, "Ts", 295f),
    OGANESSON(118, "Og", 294f);

    //creates HashMap with names to be looked through in lookupByName()
    private static final Map<String, PeriodicTable> NAME_INDEX = new HashMap(PeriodicTable.values().length);

    //creates HashMap with symbols to be looked through in lookupBySymbol()
    private static final Map<String, PeriodicTable> SYMBOL_INDEX = new HashMap(PeriodicTable.values().length);

    static {
        for (PeriodicTable PeriodicTable : PeriodicTable.values()) {
            NAME_INDEX.put(PeriodicTable.name(), PeriodicTable);
        }

        for (PeriodicTable PeriodicTable : PeriodicTable.values()) {
            SYMBOL_INDEX.put(PeriodicTable.getSymbol(), PeriodicTable);
        }
    }

    private final int atomicNumber;
    private final String symbol;
    private final Float molarMass;
    private int numNeutrons;
    private int numProtons;
    private int numElectrons;
    private int period;
    private String phase;
    private boolean radioactive;
    private boolean natural;
    private boolean metal;
    private boolean nonmetal;
    private boolean metalloid;
    private String type;
    private Float atomicRadius;
    private Float electronegativity;
    private Float firstIonization;
    private Double density;
    private Float boilPoint;
    private int numIsotopes;
    private String discoverer;
    private int year;
    private float specficHeat;
    private int numShells;
    private int numValence;

    PeriodicTable(int atomicNumber, String symbol, float molarMass) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.molarMass = molarMass;
    }

    //give PeriodicTable name/symbol and return PeriodicTable enum
    public static PeriodicTable lookupByName(String name) {
        return NAME_INDEX.get(name.toUpperCase());
    }

    public static PeriodicTable lookupBySymbol(String symbol) {
        return SYMBOL_INDEX.get(symbol);
    }

    public static PeriodicTable lookup(String name) {
        PeriodicTable search = null;
        while (search == null) {
            search = PeriodicTable.lookupByName(name);
            search = PeriodicTable.lookupBySymbol(name);
            break;
        }
        return search;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public String getSymbol() {
        return symbol;
    }

    public float getMolarMass() {
        return molarMass;
    }
}