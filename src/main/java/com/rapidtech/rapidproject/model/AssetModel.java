package com.rapidtech.rapidproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssetModel {
    private Long id;
    private String assetName;
    private String assetSpecification;
    private String assetSerialNumber;
    private Long assetPurchaseYear;

}
