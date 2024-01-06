package com.example.springdataperformance.entity;

import com.example.springdataperformance.type.CustomerType;
import com.example.springdataperformance.type.PhoneType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    @SequenceGenerator(name = "customer_seq", sequenceName = "customer_seq", allocationSize = 1)
    @Column(name = "customer_id") private Long id;
    @Column(name = "customer_name") private String name;
    @Column(name = "customer_phone") private String phone;
    @Column(name = "customer_balance") private BigDecimal balance;
    @Enumerated
    @Column(name = "customer_phone_type") private PhoneType phoneType;
    @Enumerated(EnumType.STRING)
    @Column(name = "customer_type") private CustomerType customerType;
    @Column(name = "customer_is_active") private Boolean isActive;
    @Version
    @Column(name = "customer_version") private int version;
    @CreationTimestamp
    @Column(name = "customer_created_at") private OffsetDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "customer_updated_at") private OffsetDateTime updatedAt;
}
