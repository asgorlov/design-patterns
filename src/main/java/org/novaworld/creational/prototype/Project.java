package org.novaworld.creational.prototype;

public class Project implements Copyable{
    private long id;
    private String name;
    private String source;

    public Project(long id, String name, String source) {
        this.id = id;
        this.name = name;
        this.source = source;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public Object copy() {
        return new Project(id, name, source);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}