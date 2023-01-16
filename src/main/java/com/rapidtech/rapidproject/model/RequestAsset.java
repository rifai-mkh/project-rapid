package com.rapidtech.rapidproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_request_asset")
public class RequestAsset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "requestAsset",cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    private List<Asset> assets;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Approval approval;
}