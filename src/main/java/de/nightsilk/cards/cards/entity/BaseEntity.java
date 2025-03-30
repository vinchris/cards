package de.nightsilk.cards.cards.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {

    @CreatedDate @Column(updatable = false)
    private LocalDateTime createdAt;

    /**
     * The user is determined by the {@link org.springframework.data.domain.AuditorAware} interface, which is
     * implemented by the {@link de.nightsilk.cards.cards.audit.AuditAwareImpl} class.
     */
    @CreatedBy @Column(updatable = false)
    private String createdBy;

    @LastModifiedDate @Column(insertable = false)
    private LocalDateTime updatedAt;

    /**
     * The user is determined by the {@link org.springframework.data.domain.AuditorAware} interface, which is
     * implemented by the {@link de.nightsilk.cards.cards.audit.AuditAwareImpl} class.
     */
    @LastModifiedBy @Column(insertable = false)
    private String updatedBy;

}
