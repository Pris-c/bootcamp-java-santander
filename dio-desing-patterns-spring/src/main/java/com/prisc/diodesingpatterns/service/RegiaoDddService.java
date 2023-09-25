package com.prisc.diodesingpatterns.service;

import com.prisc.diodesingpatterns.model.RegiaoDdd;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "municipiosDdd", url = "https://brasilapi.com.br/api/ddd/v1")
public interface RegiaoDddService {

    @GetMapping("/{ddd}")
    RegiaoDdd consultarMunicipios(@PathVariable("ddd") Integer ddd);
}
