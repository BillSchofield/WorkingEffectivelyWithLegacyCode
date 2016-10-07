package com.thoughtworks.legacycode.break_out_method_object;

public class Monster {

    private Physics physics;
    private Rendering rendering;
    private Integer hitPoints;
    private String state;
    // many more instance variables


    public Monster(Physics physics, Rendering rendering, Integer hitPoints, String state) {
        this.physics = physics;
        this.rendering = rendering;
        this.hitPoints = hitPoints;
        this.state = state;
        this.physics.add(this);
        this.rendering.render(this);
    }

    // Move this method to a new class and test that method
    public void processAi(){
        if (hitPoints > 5){
            if (state.equals("Angry")){
                moveToNearestEnemy();
                attack();
            } else if (state.equals("Afraid")){
                moveAwayFromNearestEnemy();
            }
        } else {
            rest();
        }
    }

    private void rest() {
        // lots of code here
        // none of it uses physics or rendering
    }

    private void moveAwayFromNearestEnemy() {
        // lots of code here
        // none of it uses physics or rendering
    }

    private void attack() {
        // lots of code here
        // none of it uses physics or rendering
    }

    private void moveToNearestEnemy() {
        // lots of code here
        // none of it uses physics or rendering
    }

    public void state(String newState) {
        state = newState;
    }

    public Integer hitPoints() {
        return hitPoints;
    }
}
