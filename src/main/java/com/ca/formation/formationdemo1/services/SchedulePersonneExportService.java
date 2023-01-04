package com.ca.formation.formationdemo1.services;

import com.ca.formation.formationdemo1.ProjetSIRApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@EnableAsync
public class SchedulePersonneExportService {
    Logger logger = LoggerFactory.getLogger(SchedulePersonneExportService.class);
    //@Async
    //@Scheduled(fixedDelay = 10000)
    public void envoyerListePersonnes(){
        logger.info(" Envoyer la liste des personne - ",System.currentTimeMillis() / 1000);
    }
}
