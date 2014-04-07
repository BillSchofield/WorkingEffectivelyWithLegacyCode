package com.thoughtworks.legacycode.break_out_method_object;

public class Monster {

    private Physics physics = Physics.getInstance();
    private Rendering rendering = new Rendering();
    private Integer hitPoints;
    private String state;
    // many more instance variables


    public Monster(Integer hitPoints, String state) {
        this.hitPoints = hitPoints;
        this.state = state;
        physics.add(this);
        rendering.render(this);
    }

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
}
