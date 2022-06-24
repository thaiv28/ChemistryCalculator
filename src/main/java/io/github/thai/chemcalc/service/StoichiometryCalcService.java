package io.github.thai.chemcalc.service;

import io.github.thai.chemcalc.model.StoichiometryParams;
import io.github.thai.chemcalc.model.StoichiometryResult;
import org.springframework.stereotype.Service;

@Service
public class StoichiometryCalcService implements CalcService<StoichiometryParams, StoichiometryResult> {
    @Override
    public StoichiometryResult calc(StoichiometryParams parameters) {
        return null;
    }
}
