package io.github.thai.chemcalc.service;

import io.github.thai.chemcalc.model.StoichiometryParams;
import io.github.thai.chemcalc.model.StoichiometryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoichiometryCalcService implements CalcService<StoichiometryParams, StoichiometryResult> {

    @Autowired
    private ConversionService convert;

    @Override
    public StoichiometryResult calc(StoichiometryParams parameters) {
        return null;

    }
}
