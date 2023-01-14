package com.rapidtech.rapidproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssetReqDto {
    private String assetNo;
    private String assetName;
    private String type;
    private String assetSerialNumber;
    private Long assetPurchaseYear;
    private Boolean status;
}
