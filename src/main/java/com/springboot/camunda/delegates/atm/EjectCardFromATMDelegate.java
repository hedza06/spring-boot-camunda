package com.springboot.camunda.delegates.atm;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;

@Description(value = "Delegate responsible for ejecting card from ATM.")
public class EjectCardFromATMDelegate implements JavaDelegate {

    private Logger logger = LoggerFactory.getLogger(EjectCardFromATMDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception
    {
        logger.info("Ejecting card from ATM...");
        logger.info("Ending ATM transaction process...");
    }
}
