package com.revature.day4.family;

public interface Relationship {

    void save(Family family);

    Family read();

    Family update(Family family);

    void delete (int id);

}
