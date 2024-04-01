package ru.bossones.annotation_based;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import ru.bossones.annotation_based.annotation.ComplexQualifier;
import ru.bossones.annotation_based.enums.Format;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Component
public class TestClass {

    private TestTwo testTwo;

    private TestThree testThree;

    private OptionalDependency optionalDependency;

    private Set<MultipleBean> multipleBeans;

    private ObjectProvider<MultipleBean> objectProvider;

    @Autowired(required = false)
    public TestClass(TestTwo testTwo, @Qualifier("mainTestThree") TestThree testThree) {
        this.testTwo = testTwo;
        this.testThree = testThree;
    }

    @Autowired(required = false)
    public TestClass(TestTwo testTwo) {
        this.testTwo = testTwo;
        System.out.println("TestThree is ignored");
    }

    @Autowired(required = false)
    public TestClass(TestThree testThree) {
        this.testThree = testThree;
    }

    public TestClass() {
    }

    public TestTwo getTestTwo() {
        return testTwo;
    }

    public TestThree getTestThree() {
        return testThree;
    }

    public OptionalDependency getOptionalDependency() {
        return optionalDependency;
    }

    @Autowired
    public void setOptionalDependency(Optional<OptionalDependency> optionalDependency) {
        optionalDependency.ifPresent(dependency -> this.optionalDependency = dependency);
    }


    @Autowired
    public void setOptionalDependency(@Nullable OptionalDependency optionalDependency) {
        this.optionalDependency = optionalDependency;
    }

    @Autowired
    public void setMultipleBeans(@Qualifier("multiple") Set<MultipleBean> multipleBeans) {
        this.multipleBeans = multipleBeans;
    }

    public Set<MultipleBean> getMultipleBeans() {
        return multipleBeans;
    }

    public ObjectProvider<MultipleBean> getObjectProvider() {
        return objectProvider;
    }

    @Autowired
    public void setObjectProvider(@ComplexQualifier(genre = "Action", format = Format.DVD) ObjectProvider<MultipleBean> objectProvider) {
        this.objectProvider = objectProvider;
    }
}
