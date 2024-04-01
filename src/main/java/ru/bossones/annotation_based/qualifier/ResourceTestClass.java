package ru.bossones.annotation_based.qualifier;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ResourceTestClass {

    private TestThree testThreeMain;

    public TestThree getTestThree() {
        return testThreeMain;
    }

    // По умолчанию, аннотация @Resource ищет по имени аргумента бин с именем "testThree"
    // Если не находит, то наиболее предпочтительный бин по типу TestThree.
    @Resource
    public void setTestThree(TestThree testThreeMain) {
        this.testThreeMain = testThreeMain;
    }
}
