package com.campusdual.cd2023bfs2g4.ws.core.rest;

import com.campusdual.cd2023bfs2g4.api.core.service.ICompetitionService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/competitions")
public class CompetitionRestController extends ORestController<ICompetitionService> {

    @Autowired
    private ICompetitionService competitionService;

    @Override
    public ICompetitionService getService() {
        return this.competitionService;
    }


}
