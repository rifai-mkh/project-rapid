package com.rapidtech.rapidproject.service.impl;

import com.rapidtech.rapidproject.dto.AssetResDto;
import com.rapidtech.rapidproject.dto.AuditReqDto;
import com.rapidtech.rapidproject.dto.AuditResDto;
import com.rapidtech.rapidproject.model.Asset;
import com.rapidtech.rapidproject.model.Audit;
import com.rapidtech.rapidproject.repository.AssetRepository;
import com.rapidtech.rapidproject.repository.AuditRepository;
import com.rapidtech.rapidproject.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuditServiceImpl implements AuditService {
    @Autowired
    private AuditRepository auditRepository;
    @Autowired
    private AssetRepository assetRepository;

    @Override
    public List<AuditResDto> getAllAudit() {
        List<Audit> audits = auditRepository.findAll();
        List<AuditResDto> auditResDtoList = new ArrayList<>();
        for (Audit audit : audits){
            auditResDtoList.add(AuditResDto.builder()
                    .id(audit.getId())
                            .assetResDto(AssetResDto.builder()
                                    .id(audit.getAssetList().getId())
                                    .assetNo(audit.getAssetList().getAssetNo())
                                    .assetName(audit.getAssetList().getAssetName())
                                    .type(audit.getAssetList().getType())
                                    .serialNumber(audit.getAssetList().getSerialNumber())
                                    .purchaseYear(audit.getAssetList().getPurchaseYear())
                                    .status(audit.getAssetList().getStatus()).build())
                    .condition(audit.getCondition())
                    .typeWindows(audit.getTypeWindows())
                    .licenseWindows(audit.getLicenseWindows())
                    .typeOffice(audit.getTypeOffice())
                    .licenseOffice(audit.getLicenseOffice())
                    .antivirus(audit.getAntivirus())
                    .result(audit.getResult()).build());
        }
        return auditResDtoList;
    }

    @Override
    public AuditResDto insertAudit(AuditReqDto auditReqDto) {
        Audit newAudit = Audit.builder()
                .condition(auditReqDto.getCondition())
                .typeWindows(auditReqDto.getTypeWindows())
                .licenseWindows(auditReqDto.getLicenseWindows())
                .typeOffice(auditReqDto.getTypeOffice())
                .licenseOffice(auditReqDto.getLicenseOffice())
                .antivirus(auditReqDto.getAntivirus())
                .result(auditReqDto.getResult()).build();
        Audit audit = auditRepository.save(newAudit);


        newAudit.setAssetList(
                Asset.builder().id(auditReqDto.getAssetId()).build()
        );

        Audit result = auditRepository.save(newAudit);

        /*Audit audit1 = auditRepository.save(newAudit);*/
        Asset asset = assetRepository.findById(result.getAssetList().getId()).get();

        return AuditResDto.builder()
                .id(audit.getId())
                .assetResDto(AssetResDto.builder()
                        .id(asset.getId())
                        .assetNo(asset.getAssetNo())
                        .assetName(asset.getAssetName())
                        .type(asset.getType())
                        .serialNumber(asset.getSerialNumber())
                        .purchaseYear(asset.getPurchaseYear())
                        .status(asset.getStatus()).build())
                .condition(audit.getCondition())
                .typeWindows(audit.getTypeWindows())
                .licenseWindows(audit.getLicenseWindows())
                .typeOffice(audit.getTypeOffice())
                .licenseOffice(audit.getLicenseOffice())
                .antivirus(audit.getAntivirus())
                .result(audit.getResult()).build();
    }

    @Override
    public AssetResDto updateAudit(Long id, AuditReqDto auditReqDto) {
        return null;
    }

    @Override
    public void deleteAudit(Long id) {

    }
}
