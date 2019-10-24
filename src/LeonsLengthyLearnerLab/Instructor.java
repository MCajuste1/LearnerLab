package LeonsLengthyLearnerLab;

public class Instructor extends Person implements Teacher {


    public Instructor(long id, String name) {
        super( id, name );
    }

    public void teach(Learner learner, double numberofHours) {
        learner.learn( numberofHours );


    }

    public void lecture(Learner[] learners, double numberofHours) {
        double numberOfHoursPerLearner = numberofHours/ learners.length;

        for(Learner studensts : learners){
            studensts.learn( numberOfHoursPerLearner );
        }



    }
}

