package com.laliga.laliga_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_statistic")
public class Player {

    @Id
    @Column(name= "name", unique = true)
    private String name;

    private String nation;

    private String position;

    private Integer age;

    private Integer mp;

    private Integer starts;

    private Double min;

    private Double gls;

    private Double ast;

    private Double pgls;

    private Double crdy;

    private Double crdr;

    private Double xg;

    private Double xa;

    private Double team;

    public Player() {
    }

    public Player(String name, String nation, String position, Integer age, Double team, Integer mp, Integer starts, Double min, Double gls, Double ast, Double pgls, Double crdy, Double crdr, Double xg, Double xa) {
        this.name = name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.team = team;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.ast = ast;
        this.pgls = pgls;
        this.crdy = crdy;
        this.crdr = crdr;
        this.xg = xg;
        this.xa = xa;
    }

    public Player(String name) {
        this.name = name;
    }


}
