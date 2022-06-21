package junit;

import org.junit.jupiter.api.Test;

public class DemoClass {



    public boolean catDog(String str) {
        if(str.contains("cat") && str.contains("dog")){
            return true;
        }
        return false;
    }

//    @Test
//    public void test1(){
//        System.out.println("This is test #1");
//    }
}
