package com.rapidtech.rapidproject.controller;

import com.rapidtech.rapidproject.dto.AssetReqDto;
import com.rapidtech.rapidproject.dto.AssetResDto;
import com.rapidtech.rapidproject.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/asset")
@RestController
public class AssetController {
    @Autowired
    private AssetService assetService;

    @GetMapping
    public List<AssetResDto> getAllAsset(){
        return assetService.getAllStudent();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AssetResDto insertAsset(@RequestBody AssetReqDto assetReqDto){
        return assetService.insertAsset(assetReqDto);
    }

    @PutMapping("/{id}")
    public AssetResDto put(@PathVariable("id") Long id, @RequestBody AssetReqDto assetReqDto) {
        return assetService.updateAsset(id, assetReqDto);
    }

    @DeleteMapping("/{id}")
    public String deleteAsset(@PathVariable("id") Long id) {
        assetService.deleteAsset(id);
        return "Delete Asset with Id: " + id.toString() + " success";
    }
}
