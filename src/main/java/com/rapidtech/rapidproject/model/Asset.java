package com.rapidtech.rapidproject.model;

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
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "asset_no", length = 120)
    private String assetNo;

    @Column(name = "asset_name", length = 120)
    private String assetName;

    @Column(name = "type", length = 120)
    private String type;

    @Column(name = "serial_number", length = 120)
    private String assetSerialNumber;

    @Column(name = "purchase_year", length = 120)
    private Long assetPurchaseYear;

    @Column(name = "status", length = 120)
    private Boolean status;
}