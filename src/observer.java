package Assignment_4;

public interface Observed {
    void addApplicant(Observer observer);
    void removeApplicant(Observer observer);
    void notifyApplicants();
}

