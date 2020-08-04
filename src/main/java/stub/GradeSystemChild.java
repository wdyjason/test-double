package stub;

import java.util.Arrays;
import java.util.List;

public class GradeSystemChild extends GradeSystem{

    @Override
    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(80.0, 90.0, 100.0);
    }
}
