package Assignment_4;

import java.util.ArrayList;
import java.util.List;

public class ComputerStoreJobSite implements Observed {

    List<String> jobOpenings = new ArrayList<>();
    List<Observer> applicants = new ArrayList<>();

    public void addJobOpening(String jobOpening) {
        this.jobOpenings.add(jobOpening);
        notifyObservers();
    }

    public void removeJobOpening(String jobOpening) {
        this.jobOpenings.remove(jobOpening);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.applicants.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.applicants.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer applicant : applicants) {
            applicant.handleEvent(this.jobOpenings);
        }
    }
}

