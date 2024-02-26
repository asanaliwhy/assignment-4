package Assignment_4;

import java.util.List;

public class JobApplicant implements Observer {
    String name;

    public JobApplicant(String name) {
        this.name = name;
    }

    // Method to display information for the job applicant
    @Override
    public void handleEvent(List<String> jobOpenings) {
        System.out.println("Dear " + name + "\nWe have some changes in job openings:\n" + jobOpenings + "\n=================================\n");
    }
}

