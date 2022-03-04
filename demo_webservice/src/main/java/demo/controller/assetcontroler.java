package demo.controller;
import demo.service.*;
import demo.entity.asset_table;

import demo.service.assetservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class assetcontroler {

    @Autowired
    private assetservice service;


//controller for post methods
    @PostMapping("/addAssetTable")
    public asset_table addAssetTable(@RequestBody asset_table s){
        return service.saveAsset(s);
    }

    @PostMapping("/addAssetTables")
    public List<asset_table> addAssetTables(@RequestBody List<asset_table> l){
        return service.saveAssets(l);
    }

//     controller for get methods
    @GetMapping("/getAssetTables")
    public List<asset_table> findAllAssets(){
        return service.getAssetTables();
    }

    @GetMapping("/getAssetById/{id}")
    public asset_table findAssetById(@PathVariable int id){
        return service.getAssetTableById(id);
    }

    @GetMapping("/getAssetByName/{name}")
    public asset_table findAssetTableByName(@PathVariable  String name){
        return service.getAssetTableByName(name);
    }

//    controller for update
    @PutMapping("/updateAsset")
    public asset_table updateAssetTable(@RequestBody  asset_table u){
        return service.updateAssetTable(u);
    }


//    controller for delete

    @DeleteMapping("/deleteAsset/{id}")
    public String deleteAssetTable(@PathVariable   int id){
        return service.deleteAssetTable(id);
    }









}
