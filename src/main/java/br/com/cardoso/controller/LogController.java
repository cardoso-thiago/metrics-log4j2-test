package br.com.cardoso.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.cardoso.log.CreateCustomLogger.NEW_LOGGER;

@RestController
public class LogController {

    Logger logger = LogManager.getLogger(NEW_LOGGER);

    @GetMapping("/log")
    public String log() {
        logger.info("teste");
        logger.error("teste");
        logger.warn("teste");
        logger.debug("teste");
        logger.trace("teste");
        logger.fatal("teste");
        return "ok";
    }
}
