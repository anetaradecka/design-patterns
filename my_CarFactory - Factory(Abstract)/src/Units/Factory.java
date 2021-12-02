package Units;

import cars.BMWModel;
import cars.Car;
import cars.FordModel;

public interface Factory {
    Car buildFord(FordModel model);
    Car buildBMW(BMWModel model);
}
