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
@Table(name = "requestAsset_tab")
public class RequestAssetEntity {
    @Id
    @TableGenerator (name = "requestAsset_id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="requestAsset_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "requestAsset_id_generator")
    @Column(name = "id", length = 36)

    private Long id;

    @Column(name = "pic_id", insertable = false, updatable = false)
    private Long picId;

    @ManyToOne
    @JoinColumn(name = "pic_id", nullable = false)
    private PICEntity pic;

    @Column(name = "asset_id", insertable = false, updatable = false)
    private Long assetId;

    @ManyToOne
    @JoinColumn(name = "asset_id", nullable = false)
    private AssetEntity asset;

    @Column(name = "approval", length = 15, nullable = false)
    private String approval;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by", length = 20)
    private String updatedBy;

}
