package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class RabattAktionTest {

    @Test
    public void RabattAktion0() {

    RabattAktion rabatt = new RabattAktion();
    Assert.assertEquals("Kein Mengenrabatt erhalten", rabatt.convert(0));
    } 
    
    @Test
    public void RabattAktion1() {

    RabattAktion rabatt = new RabattAktion();
    Assert.assertEquals("Kein Mengenrabatt erhalten", rabatt.convert(1));
    } 

    @Test
    public void RabattAktion2() {

        RabattAktion rabatt = new RabattAktion();
        Assert.assertEquals("Kein Mengenrabatt erhalten", rabatt.convert(2));
        }

    @Test
    public void RabattAktion5() {

        RabattAktion rabatt = new RabattAktion();
        Assert.assertEquals("1 % Mengenrabatt erhalten", rabatt.convert(5));
    }

    @Test
    public void RabattAktion7() {

        RabattAktion rabatt = new RabattAktion();
        Assert.assertEquals("1 % Mengenrabatt erhalten", rabatt.convert(7));
    }


    @Test
    public void RabattAktion10() {

        RabattAktion rabatt = new RabattAktion();
        Assert.assertEquals("2 % Mengenrabatt erhalten", rabatt.convert(10));
        }

    
    @Test
    public void RabattAktion100() {

        RabattAktion rabatt = new RabattAktion();
        Assert.assertEquals("20 % Mengenrabatt erhalten", rabatt.convert(100));
    }

    @Test
    public void RabattAktionMaxInt() {

        RabattAktion rabatt = new RabattAktion();
        Assert.assertEquals("429496729 % Mengenrabatt erhalten", rabatt.convert(Integer.MAX_VALUE));
    }
}
