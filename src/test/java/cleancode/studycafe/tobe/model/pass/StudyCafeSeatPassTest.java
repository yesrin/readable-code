package cleancode.studycafe.tobe.model.pass;

import cleancode.studycafe.tobe.model.pass.locker.StudyCafeLockerPass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudyCafeSeatPassTest {

    @DisplayName("좌석 이용권의 할인 금액을 반환한다.")
    @Test
    void getDiscountPrice() {
        // Given
        StudyCafeSeatPass seatPass = StudyCafeSeatPass.of(StudyCafePassType.FIXED, 1, 10000, 0.1);

        // When
        int discountPrice = seatPass.getDiscountPrice();

        // Then
        assertEquals(1000, discountPrice);

    }

    @DisplayName("라커를 이용할 수 없는 좌석이용권이다.")
    @Test
    void cannotUseLocker(){
        //Given
        StudyCafeSeatPass hourlyPass = StudyCafeSeatPass.of(StudyCafePassType.HOURLY, 1, 10000, 0.1);
        StudyCafeSeatPass weeklyPass = StudyCafeSeatPass.of(StudyCafePassType.WEEKLY, 1, 12000, 0.1);

        //When
        boolean hourlyPassResult = hourlyPass.cannotUseLocker();
        boolean weeklyPassResult = weeklyPass.cannotUseLocker();

        //Then
        assertTrue(hourlyPassResult);
        assertTrue(weeklyPassResult);

    }

    @DisplayName("좌석이용권과 사물함 이용권의 타입과 기간이 같은지 확인한다.")
    @Test
    void isSameDurationType() {
        // Given
        StudyCafeSeatPass seatPass = StudyCafeSeatPass.of(StudyCafePassType.FIXED, 1, 10000, 0.1);
        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(StudyCafePassType.FIXED, 1, 2000);

        // When
        boolean result = seatPass.isSameDurationType(lockerPass);

        // Then
        assertTrue(result);
    }
}
