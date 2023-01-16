package com.rapidtech.rapidproject.dto;

import com.rapidtech.rapidproject.model.Asset;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuditResDto {
    private Long id;

    private AssetResDto assetResDto;

    private String condition;

    private String typeWindows;

    private String licenseWindows;

    private String typeOffice;

    private String licenseOffice;

    private String antivirus;

    private String result;
}
