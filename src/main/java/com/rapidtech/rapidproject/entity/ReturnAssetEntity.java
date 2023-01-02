package com.rapidtech.rapidproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "returnAsset_tab")
public class ReturnAssetEntity {
    @Id
    @TableGenerator(name = "returnAsset_id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="returnAsset_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "returnAsset_id_generator")
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

    @Temporal(TemporalType.DATE)
    @Column(name = "return_date")
    private Date returnDate;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by", length = 20)
    private String updatedBy;
}
