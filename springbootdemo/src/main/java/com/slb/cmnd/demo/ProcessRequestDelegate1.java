package com.slb.cmnd.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class ProcessRequestDelegate1 implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("Hello-Greetings");

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Service 1 ***");
        LOGGER.info("The service 1 is now called");
    }
}
