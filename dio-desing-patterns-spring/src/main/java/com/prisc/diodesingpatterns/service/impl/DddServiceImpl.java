package com.prisc.diodesingpatterns.service.impl;

import com.prisc.diodesingpatterns.model.RegiaoDdd;
import com.prisc.diodesingpatterns.model.DddRepository;
import com.prisc.diodesingpatterns.service.RegiaoDddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DddServiceImpl implements RegiaoDddService {

    @Autowired
    DddRepository dddRepository;
    @Autowired
    RegiaoDddService dddService;


    @Override
    public RegiaoDdd consultarMunicipios(Integer ddd) {
        RegiaoDdd regiaoDdd = dddService.consultarMunicipios(ddd);
        return regiaoDdd;
    }



}
