package com.rapidtech.rapidproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "usersHistory_tab")
public class UsersHistoryEntity {
    @Id
    @TableGenerator(name = "usersHistory_id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="usersHistory_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "usersHistory_id_generator")
    @Column(name = "id", length = 36)

    private Long id;

    @Column(name = "pic_id", insertable = false, updatable = false)
    private Long picId;

    @ManyToOne
    @JoinColumn(name = "pic_id", nullable = false)
    private PICEntity pic;

    @Column(name = "location", length = 120)
    private String assetLocation;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by", length = 20)
    private String updatedBy;
}
