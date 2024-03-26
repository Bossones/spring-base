package ru.bossones.callbacks;

import org.springframework.context.Lifecycle;

public class CallbacksInitMethod implements Lifecycle {

    boolean isRunning = false;

    public void initMethod() {
        System.out.println("Okay, I want to work! " + this);
    }

    public void destroyMethod() {
        System.out.println("Goodbye! " + this);
    }

    @Override
    public void start() {
        System.out.println("LifeCycle start" + this);
        isRunning = true;
    }

    @Override
    public void stop() {
        System.out.println("Lifecycle stop " + this);
        isRunning = false;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}
