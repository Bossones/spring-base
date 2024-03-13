package ru.bossones;

import org.springframework.stereotype.Service;

@Service
public class TestbeanService {

    private final Config.TestBean testBean;

    public TestbeanService(Config.TestBean testBean) {
        this.testBean = testBean;
    }

    public int sum() {
        return testBean.x() + testBean.y();
    }
}
