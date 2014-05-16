package com.thoughtworks.legacycode.wrap_class;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;

public class Monster implements GameEntity{

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
        physics.add(this);
        rendering.render(this);
    }

    @Override
    public void processAi(){
        if (hitPoints > 5){
            String nameOfEnemy = System.console().readLine();
            GameEntity enemy = findEnemyByName(nameOfEnemy);
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

    private GameEntity findEnemyByName(String nameOfEnemy) {
        return null;
    }

    public void rest() {
        hitPoints++;
        if (hitPoints > 5){
            state = "Angry";
        }
    }

    public void moveAwayFrom(GameEntity target) {
        Vector2 offsetFromMonsterToMe = position.minus(target.position());
        moveTo(position.add(offsetFromMonsterToMe));
    }

    public void attack(GameEntity target) {
        target.decreaseHitPoints(damage);
    }

    @Override
    public void moveTo(GameEntity target) {
        moveTo(target.position());
    }

    @Override
    public void draw(){
        rendering.render(this);
    }

    @Override
    public void moveTo(Vector2 position){
        this.position = position;
        physics.move(this, position);
    }

    @Override
    public Vector2 position() {
        return position;
    }

    @Override
    public void decreaseHitPoints(Integer damage) {
        hitPoints -= damage;
    }

    @Override
    public String state() {
        return state;
    }

    @Override
    public void position(Vector2 position) {
        this.position = position;
    }
}
