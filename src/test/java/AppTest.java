import junit.framework.TestCase;
import org.junit.Test;

public class AppTest extends TestCase {
    App a=new App();

    @Test
    public void testXbiggerY(){
        try {
            int[] arr = {10, 20, 30};
            assertEquals(10, a.toplamfarkcarp(arr, 2, 1));
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void testYbiggerX(){
        try {
            int[] arr = {10, 20, 30};
            assertEquals(50, a.toplamfarkcarp(arr, 1, 2));
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void testXequalY(){
        try {
            int[] arr = {10, 20, 30};
            assertEquals(400, a.toplamfarkcarp(arr, 1, 1));
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void testXoutOfBounds(){
        try {
            int[] arr = {10, 20, 30};
            a.toplamfarkcarp(arr, 5, 1);
            fail();
        }catch(Exception e){

        }
    }
    public void testYoutOfBounds(){
        try {
            int[] arr = {10, 20, 30};
            a.toplamfarkcarp(arr, 1, 5);
            fail();
        }catch(Exception e){

        }
    }



}