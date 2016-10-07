package com.thoughtworks.legacycode.primitivize_parameter;

public class MoveToMeetingPointCommand {
    private final Monster monster1;
    private final Monster monster2;

    public MoveToMeetingPointCommand(Monster monster1, Monster monster2) {
        this.monster1 = monster1;
        this.monster2 = monster2;
    }

    public void execute() {
        Vector2 goalLocation = findMidpoint(monster1, monster2);
        monster1.moveTo(goalLocation);
        monster2.moveTo(goalLocation);
    }

    private Vector2 findMidpoint(Monster monster1, Monster monster2) {
        return monster1.position().average(monster2.position());
    }

}
