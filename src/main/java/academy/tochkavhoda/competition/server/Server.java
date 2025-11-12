package academy.tochkavhoda.competition.server;

import academy.tochkavhoda.competition.ServerResponse;

public class Server {



    public Server() {

    }

    public ServerResponse registerParticipant(String requestJsonString) {

        return new ServerResponse(200, "{\"status\":\"ok\"}");
    }

    public ServerResponse loginParticipant(String requestJsonString) {
        return new ServerResponse(200, "{\"token\":\"example-token\"}");
    }
}
