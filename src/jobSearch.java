package Assignment_4;

public class JobSearch {
    public static void main(String[] args) {
        // Create a computer store job site
        ComputerStoreJobSite jobSite = new ComputerStoreJobSite();

        // Add job openings to the site
        jobSite.addJobOpening("First IT position");
        jobSite.addJobOpening("Second IT position");

        // Create 2 subscribers
        Observer firstApplicant = new Subscriber("Dmitriy Kairgeldin");
        Observer secondApplicant = new Subscriber("Ayanat Zhunis");

        // Add them to the site
        jobSite.addObserver(firstApplicant);
        jobSite.addObserver(secondApplicant);

        // Add a new job opening, notify all subscribers (Observer pattern principle is maintained)
        jobSite.addJobOpening("Third IT position");

        // Remove a job opening and receive a notification about the change in the job openings list
        jobSite.removeJobOpening("First IT position");
    }
}
