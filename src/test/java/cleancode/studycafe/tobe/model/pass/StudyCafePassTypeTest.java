package cleancode.studycafe.tobe.model.pass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudyCafePassTypeTest {

    @DisplayName("고정석 이용권인지 확인한다.")
    @Test
    void isLockerType() {
        // Given
        StudyCafePassType hourly = StudyCafePassType.HOURLY;
        StudyCafePassType weekly = StudyCafePassType.WEEKLY;
        StudyCafePassType fixed = StudyCafePassType.FIXED;

        // When & Then
        assertFalse(hourly.isLockerType());
        assertFalse(weekly.isLockerType());

        assertTrue(fixed.isLockerType());
    }

    @Test
    void isNotLockerType() {
    }
}
