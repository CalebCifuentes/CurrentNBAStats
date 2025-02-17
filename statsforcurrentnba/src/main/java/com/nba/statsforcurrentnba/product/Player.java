package com.nba.statsforcurrentnba.product;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;


@Entity
@Table(name="nba_stats")

public class Player {

    @Id
    private String name;

    private String team;

    private String pos;

    private String age;

    private String gp;

    private String mpg;

    private Double usgPercent;

    private Double toPercent;

    private Integer fta;

    private Double ftPercent;

    private Integer twoPA;

    private Double twoPercent;

    private Integer threePA;

    private Double threePercent;

    private Double efgPercent;

    private Double tsPercent;

    private Double ppg;

    private Double rpg;

    private Double apg;

    private Double spg;

    private Double bpg;

    private Double tpg;

    private Double pplusr;

    private Double pplusa;

    private Double pplusra;

    private Double vi;

    private Double ortg;

    private Double drtg;

    public Player(String name, String team, String age, String pos, String gp, String mpg, Double usgPercent, Double toPercent, Integer fta,
                  Double ftPercent, Integer twoPA, Double twoPercent, Integer threePA, Double threePercent, Double efgPercent, Double tsPercent, Double ppg,
                  Double rpg, Double apg, Double spg, Double bpg, Double tpg, Double pplusr, Double pplusa, Double pplusra, Double vi, Double ortg, Double drtg) {
        this.name = name;
        this.team = team;
        this.age = age;
        this.pos = pos;
        this.gp = gp;
        this.mpg = mpg;
        this.usgPercent = usgPercent;
        this.toPercent = toPercent;
        this.fta = fta;
        this.ftPercent = ftPercent;
        this.twoPA = twoPA;
        this.twoPercent = twoPercent;
        this.threePA = threePA;
        this.threePercent = threePercent;
        this.efgPercent = efgPercent;
        this.tsPercent = tsPercent;
        this.ppg = ppg;
        this.rpg = rpg;
        this.apg = apg;
        this.spg = spg;
        this.bpg = bpg;
        this.tpg = tpg;
        this.pplusr = pplusr;
        this.pplusa = pplusa;
        this.pplusra = pplusra;
        this.vi = vi;
        this.ortg = ortg;
        this.drtg = drtg;
    }

    public Player() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp;
    }

    public String getMpg() {
        return mpg;
    }

    public void setMpg(String mpg) {
        this.mpg = mpg;
    }

    public Double getUsgPercent() {
        return usgPercent;
    }

    public void setUsgPercent(Double usgPercent) {
        this.usgPercent = usgPercent;
    }

    public Double getToPercent() {
        return toPercent;
    }

    public void setToPercent(Double toPercent) {
        this.toPercent = toPercent;
    }

    public Integer getFta() {
        return fta;
    }

    public void setFta(Integer fta) {
        this.fta = fta;
    }

    public Double getFtPercent() {
        return ftPercent;
    }

    public void setFtPercent(Double ftPercent) {
        this.ftPercent = ftPercent;
    }

    public Integer getTwoPA() {
        return twoPA;
    }

    public void setTwoPA(Integer twoPA) {
        this.twoPA = twoPA;
    }

    public Double getTwoPercent() {
        return twoPercent;
    }

    public void setTwoPercent(Double twoPercent) {
        this.twoPercent = twoPercent;
    }

    public Integer getThreePA() {
        return threePA;
    }

    public void setThreePA(Integer threePA) {
        this.threePA = threePA;
    }

    public Double getThreePercent() {
        return threePercent;
    }

    public void setThreePercent(Double threePercent) {
        this.threePercent = threePercent;
    }

    public Double getEfgPercent() {
        return efgPercent;
    }

    public void setEfgPercent(Double efgPercent) {
        this.efgPercent = efgPercent;
    }

    public Double getTsPercent() {
        return tsPercent;
    }

    public void setTsPercent(Double tsPercent) {
        this.tsPercent = tsPercent;
    }

    public Double getPpg() {
        return ppg;
    }

    public void setPpg(Double ppg) {
        this.ppg = ppg;
    }

    public Double getRpg() {
        return rpg;
    }

    public void setRpg(Double rpg) {
        this.rpg = rpg;
    }

    public Double getApg() {
        return apg;
    }

    public void setApg(Double apg) {
        this.apg = apg;
    }

    public Double getSpg() {
        return spg;
    }

    public void setSpg(Double spg) {
        this.spg = spg;
    }

    public Double getBpg() {
        return bpg;
    }

    public void setBpg(Double bpg) {
        this.bpg = bpg;
    }

    public Double getTpg() {
        return tpg;
    }

    public void setTpg(Double tpg) {
        this.tpg = tpg;
    }

    public Double getPplusr() {
        return pplusr;
    }

    public void setPplusr(Double pplusr) {
        this.pplusr = pplusr;
    }

    public Double getPplusa() {
        return pplusa;
    }

    public void setPplusa(Double pplusa) {
        this.pplusa = pplusa;
    }

    public Double getPplusra() {
        return pplusra;
    }

    public void setPplusra(Double pplusra) {
        this.pplusra = pplusra;
    }

    public Double getVi() {
        return vi;
    }

    public void setVi(Double vi) {
        this.vi = vi;
    }

    public Double getDrtg() {
        return drtg;
    }

    public void setDrtg(Double drtg) {
        this.drtg = drtg;
    }

    public Double getOrtg() {
        return ortg;
    }

    public void setOrtg(Double ortg) {
        this.ortg = ortg;
    }
}

