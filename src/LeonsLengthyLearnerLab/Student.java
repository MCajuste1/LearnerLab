package LeonsLengthyLearnerLab;

public class Student extends Person implements Learner {

    private double totalStudyTime;
    private int numberofHours;


    public Student(long id, String name, double totalStudyTime) {
        super( id, name );
        this.totalStudyTime = totalStudyTime;
    }


    public Student(long id, String name) {
        super( id, name );
    }

    public void learn(double totalStudyTime, int numberofHours){


    }

    @Override
    public void learn(double numberofHours) {
        totalStudyTime+= numberofHours;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;

    }
}
