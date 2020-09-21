package com.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table("room")
@Data
public class Room {
    @Id
    @GeneratedValue
    private Integer id;
    private int number;
    private boolean isBooked;
}
