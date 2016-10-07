package com.thoughtworks.legacycode.subclass_and_override_method;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;

public abstract class AiEntity {

    private Integer hitPoints;
    private String state;
    protected Vector2 position;
    private Integer damage = 2;
    // many more instance variables


    public AiEntity(Integer hitPoints, String state, Vector2 position) {
        this.hitPoints = hitPoints;
        this.state = state;
        this.position = position;
    }

    public void processAi(){
        if (hitPoints > 5){
            AiEntity nearestEnemy = findNearestEnemy();
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
    public abstract AiEntity findNearestEnemy();

    public void rest() {
        hitPoints++;
        if (hitPoints > 5){
            state = "Angry";
        }
    }

    public void moveAwayFrom(AiEntity target) {
        Vector2 offsetFromMonsterToMe = position.minus(target.position);
        moveTo(position.add(offsetFromMonsterToMe));
    }

    public void attack(AiEntity target) {
        target.hitPoints -= damage;
    }

    public abstract void moveTo(AiEntity target);

    public abstract void draw();

    // Override this method in new subclass because Physics is scary
    public abstract void moveTo(Vector2 position);
}
