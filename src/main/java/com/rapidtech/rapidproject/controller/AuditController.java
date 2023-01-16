package com.rapidtech.rapidproject.controller;

import com.rapidtech.rapidproject.dto.AuditReqDto;
import com.rapidtech.rapidproject.dto.AuditResDto;
import com.rapidtech.rapidproject.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/audit")
@RestController
public class AuditController {
    @Autowired
    private AuditService auditService;

    @GetMapping
    public List<AuditResDto> getAllAudit(){
        return auditService.getAllAudit();
    }

    @PostMapping
    public AuditResDto post(@RequestBody AuditReqDto auditReqDto) {
        return auditService.insertAudit(auditReqDto);
    }
}
