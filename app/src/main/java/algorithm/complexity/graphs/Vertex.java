package algorithm.complexity.graphs;

public class Vertex {
    final private String id;
    final private String name;

    public Vertex(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    //TODO: hashCode, equals, toString

    @Override
    public String toString() {
        return name;
    }
}
