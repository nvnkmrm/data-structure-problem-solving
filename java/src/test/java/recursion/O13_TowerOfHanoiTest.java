package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O13_TowerOfHanoiTest {

    @Test
    public void shouldPrintMovesForTOH() {
        O13_TowerOfHanoi towerOfHanoi = new O13_TowerOfHanoi();
        towerOfHanoi.TOH(3,'A','B','C');
        System.out.println();
        towerOfHanoi.TOH(2,'A','B','C');
        System.out.println();
        towerOfHanoi.TOH(1,'A','B','C');
    }

}