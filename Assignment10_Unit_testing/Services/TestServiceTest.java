package Assignment10_Unit_testing.Services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestServiceTest {
    @InjectMocks
    TestService testService;

    @Test
    public void testFirstMethod() {
        assertEquals(1, testService.test());
    }
}
