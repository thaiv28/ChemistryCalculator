package io.github.thai.chemcalc.service;

import io.github.thai.chemcalc.model.DilutionParams;
import io.github.thai.chemcalc.model.DilutionResult;
import org.springframework.stereotype.Service;

@Service
public class DilutionCalcService implements CalcService<DilutionParams, DilutionResult> {
    @Override
    public DilutionResult calc(DilutionParams parameters) {
        return null;
    }
}
