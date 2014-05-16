package com.thoughtworks.legacycode.push_down_dependency;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;

public class Monster {

    // Push Physics and Rendering down
    private Physics physics = Physics.getInstance();
    private Rendering rendering = new Rendering();

    private Integer hitPoints;
    private String state;
    private Vector2 position;
    private Integer damage = 2;
    // many more instance variables


    public Monster(Integer hitPoints, String state, Vector2 position) {
        this.hitPoints = hitPoints;
        this.state = state;
        this.position = position;
        // Push Physics and Rendering down
        physics.add(this);
        rendering.render(this);
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

    // Push this down
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

    // Push this down
    public void draw(){
        rendering.render(this);
    }

    // Push this down
    public void moveTo(Vector2 position){
        this.position = position;
        physics.move(this, position);
    }
}
