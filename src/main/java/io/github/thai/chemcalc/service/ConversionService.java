package io.github.thai.chemcalc.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class ConversionService {

    //converts from molarity/volume to moles
    public Double molarToMoles(Double volume, Double molarity, String unit) {

        if (unit.equalsIgnoreCase("mL")) {
            return molarity * volume / 1000;
        } else { //units are liters
            return molarity * volume;
        }

    }
}
