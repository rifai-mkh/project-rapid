package com.rapidtech.rapidproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuditReqDto {
    private Long assetId;

    private String condition;

    private String typeWindows;

    private String licenseWindows;

    private String typeOffice;

    private String licenseOffice;

    private String antivirus;

    private String result;
}
