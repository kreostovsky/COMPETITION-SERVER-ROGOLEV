package academy.tochkavhoda.competition.database;

import academy.tochkavhoda.competition.model.Participant;
import academy.tochkavhoda.competition.model.Expert;
import academy.tochkavhoda.competition.model.Application;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Database {

    private static Database instance;

    private Map<String, Participant> participants = new ConcurrentHashMap<>();
    private Map<String, Expert> experts = new ConcurrentHashMap<>();
    private List<Application> applications = Collections.synchronizedList(new ArrayList<>());

    private Map<String, String> tokens = new ConcurrentHashMap<>();

    private Database() {}

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public Map<String, Participant> getParticipants() {
        return participants;
    }

    public Map<String, Expert> getExperts() {
        return experts;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public Map<String, String> getTokens() {
        return tokens;
    }

}
