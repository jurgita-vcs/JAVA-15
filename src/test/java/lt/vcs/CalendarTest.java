package lt.vcs;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class CalendarTest {

    @Test
    public void givenTimeOfDay_whenFindingDateTime_thenIsReturnedNight(){
        //given
        LocalDateTime dayTime = LocalDateTime.now();
        Calendar.getTimeOfDay(dayTime);
        //when

        //then


    }

}