package com.portfolio.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table (name = "tb_game")  //CONFIGURA O NOME DA TABELA
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year") // customiza o nome da coluna no banco de dados h2
    private int year;
    private String genre;
    private String plataforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    //Construtor Sem Argumentos
    public Games(){
    }

    public Games(Long id, String title, int year, String genre, String plataforms, Double score, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        year = year;
        this.genre = genre;
        this.plataforms = plataforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getyear() {
        return year;
    }

    public void setyear(int year) {
        year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlataforms() {
        return plataforms;
    }

    public void setPlataforms(String plataforms) {
        this.plataforms = plataforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Games games)) return false;
        return Objects.equals(getId(), games.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}
