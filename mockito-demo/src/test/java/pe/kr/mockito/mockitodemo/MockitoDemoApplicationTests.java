package pe.kr.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoDemoApplicationTests {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;

	@Test
	public void findTheGreatestFromAllData() {
		
		Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,4});
		
		assertEquals(4, businessImpl.findTheGreatestFromAllData());
	}

}
