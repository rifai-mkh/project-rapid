package com.rapidtech.rapidproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "asset_tab")
public class AssetEntity {
    @Id
    @TableGenerator (name = "asset_id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="asset_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "asset_id_generator")
    @Column(name = "id", length = 36)
    private Long id;

    @Column(name = "asset_name", length = 120)
    private String assetName;

    @Column(name = "specification", length = 120)
    private String assetSpecification;

    @Column(name = "serial_number", length = 120)
    private String assetSerialNumber;

    @Column(name = "purchase_year", length = 120)
    private Long assetPurchaseYear;

    @Column(name = "pic_id", insertable = false, updatable = false)
    private Long picId;

    @ManyToOne
    @JoinColumn(name = "pic_id", nullable = false)
    private PICEntity pic;

    @OneToMany(mappedBy = "asset", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<RequestAssetEntity> requestAssetEntities = new HashSet<>();

    @OneToMany(mappedBy = "asset", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AuditEntity> auditEntities = new HashSet<>();

    @OneToMany(mappedBy = "asset", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ReturnAssetEntity> returnAssetEntities = new HashSet<>();

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by", length = 20)
    private String updatedBy;

}
