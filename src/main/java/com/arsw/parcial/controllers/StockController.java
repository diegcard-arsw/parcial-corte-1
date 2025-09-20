package com.arsw.parcial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.arsw.parcial.services.StockService;

@RestController
@RequestMapping("/api/tasks")
public class StockController {

    @Autowired
    private StockService tockService;


    @PostMapping()
    public ResponseEntity<?> getTock(){

        

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);

    }
}