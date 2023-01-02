package com.rapidtech.rapidproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "audit_tab")
public class AuditEntity {
    @Id
    @TableGenerator(name = "audit_id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="audit_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "audit_id_generator")
    @Column(name = "id", length = 36)
    private Long id;

    @Column(name = "asset_id", insertable = false, updatable = false)
    private Long assetId;

    @ManyToOne
    @JoinColumn(name = "asset_id", nullable = false)
    private AssetEntity asset;

    @Column(name = "asset_condition", length = 120)
    private String assetCondition;

    @Column(name = "anti_virus", length = 120)
    private String assetAntiVirus;

    @Column(name = "windows_license", length = 120)
    private Long assetWindowsLicense;

    @Column(name = "office_license", length = 120)
    private Long assetOfficeLicense;

    @Column(name = "validation", length = 120)
    private Long assetValidation;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by", length = 20)
    private String updatedBy;

}
