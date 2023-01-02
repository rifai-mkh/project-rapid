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
@Table(name = "pic_tab")
public class PICEntity {
    @Id
    @TableGenerator (name = "pic_id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="pic_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "pic_id_generator")
    @Column(name = "id", length = 36)
    private Long id;

    @Column(name = "pic_name", length = 120)
    private String picName;

    @OneToMany(mappedBy = "pic", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AssetEntity> assetEntities = new HashSet<>();

    @OneToMany(mappedBy = "pic", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<RequestAssetEntity> requestAssetEntities = new HashSet<>();

    @OneToMany(mappedBy = "pic", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
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
