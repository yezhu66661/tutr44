import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    public void test1(){
        Student a=new Student("yjh",14);
        assertEquals(14,a.getAge());
    }
}
