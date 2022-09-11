package br.com.cardoso.log;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.api.LoggerComponentBuilder;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;

public class CreateCustomLogger {

    public static final String NEW_LOGGER = "NewLogger";

    public CreateCustomLogger() {
        createNewLogger();
    }

    private void createNewLogger() {
        ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();

        builder.setStatusLevel(Level.ALL);
        builder.setConfigurationName(NEW_LOGGER);

        LoggerComponentBuilder newLogger = builder.newLogger(NEW_LOGGER, Level.TRACE);
        newLogger.add(builder.newAppenderRef("Console"));

        builder.add(newLogger);
        Configurator.reconfigure(builder.build());
    }
}
