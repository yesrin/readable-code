package cleancode.studycafe.tobe.model.pass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudyCafePassTypeTest {

    @DisplayName("좌석 이용권이 라커 타입인지 확인한다")
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

    @DisplayName("좌석이용권이 라커 타입이 아닌지 확인한다.")
    @Test
    void isNotLockerType() {
        // Given
        StudyCafePassType hourly = StudyCafePassType.HOURLY;
        StudyCafePassType weekly = StudyCafePassType.WEEKLY;
        StudyCafePassType fixed = StudyCafePassType.FIXED;

        // When & Then
        assertTrue(hourly.isNotLockerType());
        assertTrue(weekly.isNotLockerType());

        assertFalse(fixed.isNotLockerType());
    }
}
