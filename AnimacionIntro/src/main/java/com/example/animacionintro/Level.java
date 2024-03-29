package com.example.animacionintro;

import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Level {
    private int id;
    private Color color;
    private ArrayList<Enemy> enemies;
    private ArrayList<Bullet> bullets;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }

    public ArrayList<Bullet> getBullets() {
        return bullets;
    }

    public void setBullets(ArrayList<Bullet> bullets) {
        this.bullets = bullets;
    }

    public Level(int i){
        this.id = id;
        enemies = new ArrayList<>();
        bullets = new ArrayList<>();
    }

}
