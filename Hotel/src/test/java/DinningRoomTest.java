import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinningRoomTest {

    DinningRoom dinningRoom;

    @Before
    public void setUp(){
      dinningRoom = new DinningRoom(80, "The Dinner House");
    }

    @Test
    public void testHasAName(){
        assertEquals("The Dinner House", dinningRoom.getName());
    }

    @Test
    public void testHasACapacity(){
        assertEquals(80, dinningRoom.getCapacity());
    }
}
