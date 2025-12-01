package academy.tochkavhoda.competition.model;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Application {

    private String title;
    private String description;
    private List<String> directions;
    private int requestedAmount;

    private String participantLogin;                                // кто подал заявку


    private Map<String, Integer> scores = new ConcurrentHashMap<>();

    public Application(String title, String description, List<String> directions, int requestedAmount, String participantLogin) {
        this.title = title;
        this.description = description;
        this.directions = directions;
        this.requestedAmount = requestedAmount;
        this.participantLogin = participantLogin;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getDirections() {
        return directions;
    }

    public int getRequestedAmount() {
        return requestedAmount;
    }

    public String getParticipantLogin() {
        return participantLogin;
    }

    public Map<String, Integer> getScores() {
        return scores;
    }

    public void addOrUpdateScore(String expertLogin, int score) {
        scores.put(expertLogin, score);
    }

    public void removeScore(String expertLogin) {
        scores.remove(expertLogin);
    }

    public double getAverageScore() {
        if (scores.isEmpty()) {
            return 0.0;
        }
        return scores.values().stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0.0);
    }
}