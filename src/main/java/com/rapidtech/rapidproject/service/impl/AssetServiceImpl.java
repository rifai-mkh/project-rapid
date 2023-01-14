package com.rapidtech.rapidproject.service.impl;

import com.rapidtech.rapidproject.dto.AssetReqDto;
import com.rapidtech.rapidproject.dto.AssetResDto;
import com.rapidtech.rapidproject.model.Asset;
import com.rapidtech.rapidproject.repository.AssetRepository;
import com.rapidtech.rapidproject.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AssetServiceImpl implements AssetService {

    @Autowired
    private AssetRepository assetRepository;

    @Override
    public List<AssetResDto> getAllStudent() {
        List<Asset> assets = assetRepository.findAll();
        List<AssetResDto> assetResDtoList = new ArrayList<>();
        for (Asset asset : assets) {
            assetResDtoList.add(AssetResDto.builder()
                    .id(asset.getId())
                    .assetNo(asset.getAssetNo())
                    .assetName(asset.getAssetName())
                    .type(asset.getType())
                    .serialNumber(asset.getSerialNumber())
                    .purchaseYear(asset.getPurchaseYear())
                    .status(asset.getStatus()).build());
        }
        return assetResDtoList;
    }

    @Override
    public AssetResDto insertAsset(AssetReqDto assetReqDto) {
        Asset newAsset = Asset.builder()
                .assetNo(assetReqDto.getAssetNo())
                .assetName(assetReqDto.getAssetName())
                .type(assetReqDto.getAssetNo())
                .serialNumber(assetReqDto.getSerialNumber())
                .purchaseYear(assetReqDto.getPurchaseYear())
                .status(assetReqDto.getStatus()).build();
        Asset result = assetRepository.save(newAsset);
        return AssetResDto.builder()
                .id(result.getId())
                .assetNo(result.getAssetNo())
                .assetName(result.getAssetName())
                .type(result.getType())
                .serialNumber(result.getSerialNumber())
                .purchaseYear(result.getPurchaseYear())
                .status(result.getStatus()).build();
    }

    @Override
    public AssetResDto updateAsset(Long id, AssetReqDto assetReqDto) {
        Optional<Asset> updateAsset = assetRepository.findById(id);
        Asset result = new Asset();
        if (updateAsset.isPresent()){
            Asset asset = updateAsset.get();
            asset.setAssetNo(assetReqDto.getAssetNo());
            asset.setAssetName(assetReqDto.getAssetName());
            asset.setType(assetReqDto.getType());
            asset.setSerialNumber(assetReqDto.getSerialNumber());
            asset.setPurchaseYear(assetReqDto.getPurchaseYear());
            asset.setStatus(assetReqDto.getStatus());
            result = assetRepository.save(asset);
        }
        return AssetResDto.builder()
                .id(result.getId())
                .assetNo(result.getAssetNo())
                .assetName(result.getAssetName())
                .type(result.getType())
                .serialNumber(result.getSerialNumber())
                .purchaseYear(result.getPurchaseYear())
                .status(result.getStatus()).build();
    }

    @Override
    public void deleteAsset(Long id) {
        assetRepository.deleteById(id);
    }
}
