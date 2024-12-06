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

    private String team;

    public Player() {
    }

    public Player(String name, String nation, String position, Integer age, String team, Integer mp, Integer starts, Double min, Double gls, Double ast, Double pgls, Double crdy, Double crdr, Double xg, Double xa) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getGls() {
        return gls;
    }

    public void setGls(Double gls) {
        this.gls = gls;
    }

    public Double getAst() {
        return ast;
    }

    public void setAst(Double ast) {
        this.ast = ast;
    }

    public Double getPgls() {
        return pgls;
    }

    public void setPgls(Double pgls) {
        this.pgls = pgls;
    }

    public Double getCrdy() {
        return crdy;
    }

    public void setCrdy(Double crdy) {
        this.crdy = crdy;
    }

    public Double getCrdr() {
        return crdr;
    }

    public void setCrdr(Double crdr) {
        this.crdr = crdr;
    }

    public Double getXg() {
        return xg;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public Double getXa() {
        return xa;
    }

    public void setXa(Double xa) {
        this.xa = xa;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
