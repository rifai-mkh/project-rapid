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
                    .id(Asset.getId())
                    .assetNo(asset.getAssetNo())
                    .assetName(asset.getAssetName())
                    .type(asset.)
        }
        return studentResDtoList;
    }

    @Override
    public AssetResDto insertAsset(AssetReqDto assetReqDto) {
        return null;
    }

    @Override
    public AssetResDto updateAsset(Long id, AssetReqDto assetReqDto) {
        return null;
    }

    @Override
    public void deleteAsset(Long id) {

    }
}
