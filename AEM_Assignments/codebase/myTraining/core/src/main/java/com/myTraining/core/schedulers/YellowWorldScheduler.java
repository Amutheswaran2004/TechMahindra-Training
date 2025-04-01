package com.myTraining.core.schedulers;


import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicBoolean;

@Component(service = Runnable.class, immediate = true, configurationPid = "com.myproject.core.schedulers.YellowWorldScheduler")
public class YellowWorldScheduler implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(YellowWorldScheduler.class);

    @ObjectClassDefinition(name = "Yellow World Scheduler Configuration", description = "Scheduler to log 'Yellow World' every 5 minutes")
    public @interface Config {
        @AttributeDefinition(name = "Cron Expression", description = "Cron expression for scheduling")
        String scheduler_expression() default "0 */5 * * * ?";
    }

    private final AtomicBoolean running = new AtomicBoolean(false);

    @Activate
    @Modified
    protected void activate(final Config config) {
        LOG.info("YellowWorldScheduler activated with cron expression: {}", config.scheduler_expression());
    }

    @Override
    public void run() {
        if (running.compareAndSet(false, true)) {
            try {
                LOG.info("Yellow World");
            } finally {
                running.set(false);
            }
        }
    }
}
