package academy.tochkavhoda.competition.service.service;


import academy.tochkavhoda.competition.database.Database;
import academy.tochkavhoda.competition.dto.request.LoginDtoRequest;
import academy.tochkavhoda.competition.dto.request.RegisterParticipantDtoRequest;
import academy.tochkavhoda.competition.dto.response.ErrorDtoResponse;
import academy.tochkavhoda.competition.dto.response.LoginDtoResponse;
import academy.tochkavhoda.competition.model.Participant;


import java.util.UUID;

//public class ParticipantService {
//
//    private Database database = Database.getInstance();
//    private Gson gson = new Gson();
//
//    // ------ РЕГИСТРАЦИЯ ------
//    public ServerResponse registerParticipant(String json) {
//        RegisterParticipantDtoRequest req =
//                gson.fromJson(json, RegisterParticipantDtoRequest.class);
//
//        if (req.getLogin() == null || req.getLogin().isBlank()) {
//            return error("Login cannot be empty");
//        }
