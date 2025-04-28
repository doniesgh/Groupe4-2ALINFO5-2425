package tn.esprit.spring;

import org.junit.After;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.class)
@SpringBootTest
public class BlocServiceTest {

    @BeforeAll
    void bedore() {

    }

    @AfterAll
    void after() {

    }

    @BeforeEach
    void beforeEach() {

    }

    @AfterEach
    void afterEach() {

    }

    @Order(1)
    @RepeatedTest(4)
    void test() {

    }

    @Order(4)
    @Test
    void test2() {

    }

    @Order(2)
    @Test
    void test3() {

    }

    @Order(3)
    @Test
    void test4() {

    }
}