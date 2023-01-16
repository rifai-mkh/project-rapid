package com.rapidtech.rapidproject.service;

import com.rapidtech.rapidproject.dto.AssetReqDto;
import com.rapidtech.rapidproject.dto.AssetResDto;
import com.rapidtech.rapidproject.dto.AuditReqDto;
import com.rapidtech.rapidproject.dto.AuditResDto;

import java.util.List;

public interface AuditService {
    List<AuditResDto> getAllAudit();
    AuditResDto insertAudit(AuditReqDto auditReqDto);
    AssetResDto updateAudit(Long id, AuditReqDto auditReqDto);
    void deleteAudit(Long id);
}
