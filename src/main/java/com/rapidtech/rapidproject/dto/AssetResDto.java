package com.rapidtech.rapidproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssetResDto {
    private Long id;
    private String assetNo;
    private String assetName;
    private String type;
    private String serialNumber;
    private Long purchaseYear;
    private Boolean status;
}
