package com.rapidtech.rapidproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditModel {
    private String assetCondition;
    private String assetAntiVirus;
    private Long assetWindowsLicense;
    private Long assetOfficeLicense;
    private Long assetValidation;
}
