package com.rapidtech.rapidproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestAssetResponse {
    private Long id;
    private String approval;
    List<PICModel> pics;
    List<AssetModel> assets;
}
