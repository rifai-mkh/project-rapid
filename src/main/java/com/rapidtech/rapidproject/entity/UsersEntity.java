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
@Table(name = "users_tab")
public class UsersEntity {
    @Id
    @TableGenerator(name = "users_id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="users_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "users_id_generator")
    @Column(name = "id", length = 36)

    private Long id;

    @Column(name = "usersHistory_id", insertable = false, updatable = false)
    private Long picId;

    @ManyToOne
    @JoinColumn(name = "usersHistory_id", nullable = false)
    private UsersHistoryEntity usersHistory;

    @Column(name = "audit_id", insertable = false, updatable = false)
    private Long assetId;

    @ManyToOne
    @JoinColumn(name = "audit_id", nullable = false)
    private AuditEntity audit;

    @Temporal(TemporalType.DATE)
    @Column(name = "send_date")
    private Date sendDate;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by", length = 20)
    private String updatedBy;
}
