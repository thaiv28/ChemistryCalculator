package io.github.thai.chemcalc.service;

public interface CalcService<P, R> {
    R calc(P parameters);
}
