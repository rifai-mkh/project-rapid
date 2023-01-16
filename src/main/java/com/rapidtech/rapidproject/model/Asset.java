package com.rapidtech.rapidproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_asset")
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asset_id", length = 120)
    private Long id;

    @Column(name = "asset_no", length = 120)
    private String assetNo;

    @Column(name = "asset_name", length = 120)
    private String assetName;

    @Column(name = "type", length = 120)
    private String type;

    @Column(name = "serial_number", length = 120)
    private String serialNumber;

    @Column(name = "purchase_year", length = 120)
    private Long purchaseYear;

    @Column(name = "status", length = 120)
    private Boolean status;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private RequestAsset requestAsset;

    @OneToOne(mappedBy = "assetList")
    private Audit audit;
}