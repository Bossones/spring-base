package ru.bossones;

import org.springframework.stereotype.Service;

@Service
public class TestbeanService {

    private int id;

    public int sum() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
