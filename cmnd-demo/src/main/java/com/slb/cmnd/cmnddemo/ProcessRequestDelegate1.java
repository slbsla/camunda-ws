package com.slb.cmnd.cmnddemo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class ProcessRequestDelegate1 implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("Hello-Greetings");

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("The service 1 is now called");
    }
}
