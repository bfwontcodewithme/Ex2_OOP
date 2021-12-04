package api;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class VertexTest {
    public static void main(String[] args)
    {
        t1();
    }
    @Test
    public static void t1()
    {
        Vertex v = new Vertex(new Point3D(1, 1, 0), 0);
        assertTrue(v.getInfo().compareTo("1.0,1.0,0.0,0") == 0);
        assertEquals(v.weight, 0);
        assertEquals(v.tag , 0);
    }
}