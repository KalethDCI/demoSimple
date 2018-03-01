package com.example.demo;

import org.springframework.stereotype.Service;

/**
 * Created by Bartosz on 2018-02-17.
 */
@Service
public interface CalcService {

    public Double calc(Double a, Double b, Operation operation) throws CalcException;
}
