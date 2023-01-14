package com.rapidtech.rapidproject.service;

import com.rapidtech.rapidproject.dto.AssetReqDto;
import com.rapidtech.rapidproject.dto.AssetResDto;

import java.util.List;

public interface AssetService {
    List<AssetResDto> getAllStudent();
    AssetResDto insertAsset(AssetReqDto assetReqDto);
    AssetResDto updateAsset(Long id, AssetReqDto assetReqDto);
    void deleteAsset(Long id);

}
