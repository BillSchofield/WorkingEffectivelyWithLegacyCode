package com.thoughtworks.legacycode.primitivize_parameter;

public class Main {
    public static void main(String[] args) {
        final Monster monster1 = new Monster(new Vector2(0, 0));
        final Monster monster2 = new Monster(new Vector2(10, 10));

        MoveToMeetingPointCommand command = new MoveToMeetingPointCommand(monster1, monster2);
        command.execute();
    }
}
