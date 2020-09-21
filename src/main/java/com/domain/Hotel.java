package com.domain;

import jdk.internal.vm.annotation.Stable;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table("hotel")
@Data
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String hotelName;

    @OneToMany
    private List<Room> room;
}
