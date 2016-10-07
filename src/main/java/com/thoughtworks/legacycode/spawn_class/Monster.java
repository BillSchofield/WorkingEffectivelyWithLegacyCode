package com.thoughtworks.legacycode.spawn_class;

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
        // Create an instance of a new class here and call a method on it.
        if (hitPoints > 5){
            String enemyName = System.console().readLine();
            Monster enemy = findEnemyByName(enemyName);
            if (state.equals("Angry")){
                moveTo(enemy);
                attack(enemy);
            } else if (state.equals("Afraid")){
                moveAwayFrom(enemy);
            }
        } else {
            rest();
        }
    }

    private Monster findEnemyByName(String enemyName) {
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

    public String state() {
        return state;
    }
}
