package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

    private static Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        SpeakerService speakerService = new SpeakerServiceImpl();
        logger.log(Level.INFO, speakerService.findAll().get(0).getFirstName());
    }
}
