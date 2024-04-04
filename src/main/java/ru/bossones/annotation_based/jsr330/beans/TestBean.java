package ru.bossones.annotation_based.jsr330.beans;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.lang.Nullable;

@Named
public class TestBean {

    private InjectingBean injectingBean;

    public InjectingBean getInjectingBean() {
        return injectingBean;
    }

    @Inject
    public void setInjectingBean(@Named("testInjectingBean") @Nullable InjectingBean injectingBean) {
        this.injectingBean = injectingBean;
    }
}
