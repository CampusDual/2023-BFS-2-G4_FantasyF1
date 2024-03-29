package com.campusdual.cd2023bfs2g4.ws.core.rest;

import com.campusdual.cd2023bfs2g4.api.core.service.IRaceService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/races")
public class RaceRestController extends ORestController<IRaceService> {

    @Autowired
    private IRaceService iRaceService;

    @Override
    public IRaceService getService() {
        return this.iRaceService;
    }


}
