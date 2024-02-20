package com.campusdual.cd2023bfs2g4.ws.core.rest;

import com.campusdual.cd2023bfs2g4.api.core.service.IPilotPriceService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pilots_prices")
public class PilotPriceRestController extends ORestController<IPilotPriceService> {

    @Autowired
    private IPilotPriceService pilotPriceService;

    @Override
    public IPilotPriceService getService() {
        return this.pilotPriceService;
    }


}
