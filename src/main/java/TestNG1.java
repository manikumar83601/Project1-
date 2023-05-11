import org.testng.annotations.Test;

public class TestNG1 {
@Test(priority = 0)
void firstcase(){
    System.out.println("1 case");
}
@Test(priority = 1)
    void secondcase (){
        System.out.println("2 case");
    }
@Test(priority = 2)
    void thirdcase(){
        System.out.println("3 case");
    }



}
