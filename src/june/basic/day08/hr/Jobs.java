package june.basic.day08.hr;

public class Jobs {
    private String jon_id;
    private String job_title;
    private int min_salary;
    private int max_salary;

    public Jobs() {
    }

    public Jobs(String jon_id, String job_title, int min_salary,
                int max_salary) {
        this.jon_id = jon_id;
        this.job_title = job_title;
        this.min_salary = min_salary;
        this.max_salary = max_salary;
    }

    public String getJon_id() {
        return jon_id;
    }

    public void setJon_id(String jon_id) {
        this.jon_id = jon_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public int getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(int min_salary) {
        this.min_salary = min_salary;
    }

    public int getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(int max_salary) {
        this.max_salary = max_salary;
    }
}
