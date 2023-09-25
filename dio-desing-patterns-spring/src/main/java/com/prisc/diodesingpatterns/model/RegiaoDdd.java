package com.prisc.diodesingpatterns.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
//@ToString
//@NoArgsConstructor
//@RequiredArgsConstructor
public class RegiaoDdd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String state;
    private List<String> cities;
    //private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
