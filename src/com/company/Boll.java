package com.company;

import java.util.Objects;

public class Boll {
    int storlek;
    double posX = 0.0;
    double posY = 0.0;
    double vx = 1.0;
    double vy = 1.0;
    int color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boll boll = (Boll) o;
        return storlek == boll.storlek && posX == boll.posX && posY == boll.posY && Double.compare(boll.vx, vx) == 0 && Double.compare(boll.vy, vy) == 0 && color == boll.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(storlek, posX, posY, vx, vy, color);
    }

    @Override
    public String toString() {
        return "Boll{" +
                "storlek=" + storlek +
                ", posX=" + posX +
                ", posY=" + posY +
                ", vx=" + vx +
                ", vy=" + vy +
                ", color=" + color +
                '}';
    }

    public Boll(int storlek, double posX, double posY, double vx, double vy, int color) {
       this.storlek = storlek;
       this.posX = posX;
       this.posY = posY;
       this.vx = vx;
       this.vy = vy;
       this.color = color;
    }

    public Boll move(){
        return new Boll(storlek,posX + vx, posY + vy, vx, vy, color);
    }

    public Boll studsY(){
        return new Boll(storlek,posX, posY, vx, vy * -1.0 , color);
    }

    public Boll studsX(){
        return new Boll(storlek,posX, posY, vx * -1.0, vy, color);
    }
}
