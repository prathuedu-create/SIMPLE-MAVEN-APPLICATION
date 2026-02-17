package com.example;
public class App {
 public int add(int a, int b) {
 return a + b;
 }
}
COMMIT THE CHANGES

FOR THE AppTest.JAVA use the FOLLOWING CODE:
package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class AppTest {
 @Test
 public void testAdd() {
 App app = new App();
 assertEquals(5, app.add(2, 3));
 }
}
