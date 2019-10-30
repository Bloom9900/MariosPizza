
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void testGetTotalPris() {
        //Arrange
        Order odr = new Order();
        Pizza vesuvio = new Pizza("Vesuvio", 57, 1, "tomatsauce, ost, skinke og oregano");
        Pizza amerikaner = new Pizza("Amerikaner", 53, 2, "tomatsauce, ost, oksefars og oregano");
	Pizza cacciatore = new Pizza("Cacciatore", 63, 3, "tomatsauce, ost, pepperoni og oregano");
        
        odr.getPizzas().add(vesuvio);
        odr.getPizzas().add(amerikaner);
        odr.getPizzas().add(cacciatore);
        
        //Act
        int result = odr.getTotalPris();
        
        //Assert
        int expected = vesuvio.getPris()+amerikaner.getPris()+cacciatore.getPris();
        
        assertEquals(expected, result);
    }

}
