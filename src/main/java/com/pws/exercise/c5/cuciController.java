/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pws.exercise.c5;

import databasecuci.Nyucidong;
import databasecuci.NyucidongJpaController;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.controller;

/**
 *
 * @author IlhamRobbS
 */
@RestController
public class cuciController {
    NyucidongJpaController nyuciah = new NyucidongJpaController();
    
    @GetMapping(value = "/get")
    public List<Nyucidong> getData(){
        List<Nyucidong> data = new ArrayList<>();
        try{
            data = nyuciah.findNyucidongEntities();
        }catch (Exception e) {
            
        }
        return nyuciah.findNyucidongEntities();
    }
    //create
    @ResponseBody
    @PostMapping(value = "/create")
    public void createData(@RequestBody Nyucidong Nyucidong) throws Exception{
        nyuciah.create(Nyucidong);
    }
    
    @ResponseBody
    @PutMapping(value = "/edit/{id}")
    public void editData(@RequestBody Nyucidong Nyucidong) throws Exception{
        nyuciah.edit(Nyucidong);
    }
    
    @ResponseBody
    @DeleteMapping(value = "/delete/{id}")
    public void deleteData(@PathVariable Integer id) throws Exception{
        nyuciah.destroy(id);
    }
}
