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
public class RequestAsset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String picName;
    private String address;

    @OneToMany(mappedBy = "requestAsset",cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    private List<Asset> assets;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    Approval approval;
}