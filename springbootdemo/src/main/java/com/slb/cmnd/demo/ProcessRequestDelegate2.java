package com.slb.cmnd.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;


public class ProcessRequestDelegate2 implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("Hello-Greetings");

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Service 2 ***");
        LOGGER.info("The service 2 is now called");
    }
}
