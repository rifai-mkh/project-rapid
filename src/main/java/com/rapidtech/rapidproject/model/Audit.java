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
@Table(name= "tbl_audit")

public class Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "asset_id")
    private Asset assetList;

    @Column(name = "condition")
    private String condition;

    @Column(name = "type_windows")
    private String typeWindows;

    @Column(name = "license_windows")
    private String licenseWindows;

    @Column(name = "type_office")
    private String typeOffice;

    @Column(name = "license_office")
    private String licenseOffice;

    @Column(name = "antivirus")
    private String antivirus;

    @Column(name = "result")
    private String result;
}
