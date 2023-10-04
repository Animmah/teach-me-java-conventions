package powerpackage;

import org.junit.jupiter.api.Test;

public class PowerTest {
    @Test
    public void OneRaisedToOneIsOne(){
        assert PowerFinder.OF(1,1)==1;
    }
    @Test
    public void TwoRaisedToOneIsTwo() {
        assert PowerFinder.OF(2,1) == 2;
    }

    @Test
    public void TwoRaisedToTwoIsFour() {
        assert PowerFinder.OF(2, 2) == 4;
    }

    @Test
    public void ThreeRaisedToTwoIsNine() {
        assert PowerFinder.OF(3, 2) == 9;
    }
}
