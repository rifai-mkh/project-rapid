package com.rapidtech.rapidproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestAssetReqDto {
    private String picName;
    private String address;
    List<AssetResDto> assetResDtoList;
}
