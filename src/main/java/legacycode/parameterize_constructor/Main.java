package legacycode.parameterize_constructor;

public class Main {
    public static void main(String[] args) {
        final ZooManagerBefore zooManager = new ZooManagerBefore();
        zooManager.moveWildAnimalsToEnclosures();

        final ZooManagerAfter zooManagerAfter = new ZooManagerAfter(Animals.wild());
        zooManagerAfter.moveWildAnimalsToEnclosures();
    }
}
