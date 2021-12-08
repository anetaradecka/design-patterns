package visitor;

import activity.Squash;
import activity.Treadmill;
import activity.Weights;

public interface Visitor {
    void visit(Treadmill treadmill);
    void visit(Weights weights);
    void visit(Squash squash);

}
