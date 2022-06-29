package io.github.thai.chemcalc.service;

import io.github.thai.chemcalc.model.StoichiometryMoleculeData;
import io.github.thai.chemcalc.model.StoichiometryParams;
import io.github.thai.chemcalc.model.StoichiometryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import picocli.CommandLine;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    private StoichiometryCalcService stoichService;

    @PostConstruct
    public void init() {
        /*ArrayList<StoichiometryMoleculeData> list = new ArrayList<>();
        list.add(new StoichiometryMoleculeData("CO2", 5d));
        list.add(new StoichiometryMoleculeData("H2O", 6d));

        StoichiometryResult result = stoichService.calc(new StoichiometryParams("2CO2+H2O = O2", list));

        System.out.println(result);
        System.out.println("Yay"); */

    }
}
