package cleancode.studycafe.tobe.model.pass;

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
}
