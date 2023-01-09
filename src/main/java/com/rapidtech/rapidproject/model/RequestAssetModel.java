package com.rapidtech.rapidproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestAssetModel {
    private Long id;
    private Long picId;
    private Long assetId;
    private String approval;

}
