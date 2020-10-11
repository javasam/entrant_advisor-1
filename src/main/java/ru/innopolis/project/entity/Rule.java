package ru.innopolis.project.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rules")
public class Rule {

    @Id
    @Column(name = "rule_id")
    private Long id;

    @Column(name = "name")
    private String name;
}
