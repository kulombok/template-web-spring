package com.verint.framework.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "authorities")
public class Authority implements Serializable {
    @Id
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "username", nullable = false)
    private User username;

    @Column(name = "authority", nullable = false, length = 50)
    private String authority;

}