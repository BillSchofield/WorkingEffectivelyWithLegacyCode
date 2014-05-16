package com.thoughtworks.legacycode.subclass_and_override_method;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;

public class Monster {

    private Physics physics;
    private Rendering rendering;
    private Integer hitPoints;
    private String state;
    private Vector2 position;
    private Integer damage = 2;
    // many more instance variables


    public Monster(Physics physics, Rendering rendering, Integer hitPoints, String state, Vector2 position) {
        this.physics = physics;
        this.rendering = rendering;
        this.hitPoints = hitPoints;
        this.state = state;
        this.position = position;
        this.physics.add(this);
        this.rendering.render(this);
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

    // Override this method in new subclass because Physics is scary
    // We can also stub this to return the enemy that we will use for our assertion
    public Monster findNearestEnemy() {
        return physics.findNearestEntityTo(position);
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

    public void draw(){
        rendering.render(this);
    }

    // Override this method in new subclass because Physics is scary
    public void moveTo(Vector2 position){
        this.position = position;
        physics.move(this, position);
    }
}
