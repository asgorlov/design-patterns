package org.novaworld.structural.adapter;

public class AdapterJavaToDataBase extends JavaAppRunner implements DataBase {

    @Override
    public void insert() {
        saveObj();
    }

    @Override
    public void update() {
        updateObj();
    }

    @Override
    public void select() {
        loadObj();
    }

    @Override
    public void remove() {
        deleteObj();
    }
}