package com.rapidtech.rapidproject.model;

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
public class Approval {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean approval;
    private String reason;

    @OneToOne(mappedBy = "approval",cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    private List<RequestAsset> requestAssets;
}
