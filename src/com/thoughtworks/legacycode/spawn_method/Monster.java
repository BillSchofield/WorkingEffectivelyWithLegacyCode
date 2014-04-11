package com.thoughtworks.legacycode.spawn_method;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;

public class Monster {

    private Integer hitPoints;
    private String state;
    private Vector2 position;
    private Integer damage = 2;


    public Monster(Integer hitPoints, String state, Vector2 position) {
        this.hitPoints = hitPoints;
        this.state = state;
        this.position = position;
    }

    public void processAi(){
        if (hitPoints > 5){
            Monster nearestEnemy = findNearestEnemy();
            if (state.equals("Angry")){
                moveTo(nearestEnemy);
                attack(nearestEnemy);
            } else if (state.equals("Afraid")){
                moveAwayFrom(nearestEnemy);
            }
        } else {
            rest();
        }
    }

    public Monster findNearestEnemy() {
        return null;
    }

    public void rest() {
        hitPoints++;
        if (hitPoints > 5){
            state = "Angry";
        }
    }

    public void moveAwayFrom(Monster target) {
        Vector2 offsetFromMonsterToMe = position.minus(target.position);
        moveTo(position.add(offsetFromMonsterToMe));
    }

    public void attack(Monster target) {
        target.hitPoints -= damage;
    }

    public void moveTo(Monster target) {
        moveTo(target.position);
    }

    public void moveTo(Vector2 position){
        this.position = position;
    }
}
