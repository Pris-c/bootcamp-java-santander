package com.prisc.diodesingpatterns.controller;

import com.prisc.diodesingpatterns.model.RegiaoDdd;
import com.prisc.diodesingpatterns.service.RegiaoDddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ddd")
public class DddRestController {

    @Autowired
    RegiaoDddService dddService;

    @GetMapping("/{ddd}")
    public ResponseEntity<RegiaoDdd> consultarMunicipios(@PathVariable Integer ddd){
        return ResponseEntity.ok(dddService.consultarMunicipios(ddd));
    }

}
