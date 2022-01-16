package collectionsset;

import java.util.Objects;

public class RightAnswer {

    private String nameOfSolver;

    public RightAnswer(String nameOfSolver) {
        this.nameOfSolver = nameOfSolver;
    }

    public String getNameOfSolver() {
        return nameOfSolver;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }
        RightAnswer rightAnswer = (RightAnswer) otherObject;
        return nameOfSolver.equals(rightAnswer.nameOfSolver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSolver);
    }
}
