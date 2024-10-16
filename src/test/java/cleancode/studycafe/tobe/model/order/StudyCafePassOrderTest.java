package cleancode.studycafe.tobe.model.order;

import cleancode.studycafe.tobe.model.pass.StudyCafePassType;
import cleancode.studycafe.tobe.model.pass.StudyCafeSeatPass;
import cleancode.studycafe.tobe.model.pass.locker.StudyCafeLockerPass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudyCafePassOrderTest {

    @Test
    void of() {
    }

    @Test
    void getDiscountPrice() {
    }

    @DisplayName("할인이 적용된 총 결제 금액을 반환한다.")
    @Test
    void getTotalPrice() {
        // Given
        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(StudyCafePassType.FIXED, 1, 2000);
        StudyCafeSeatPass seatPass = StudyCafeSeatPass.of(StudyCafePassType.FIXED, 1, 10000, 0.1);

        StudyCafePassOrder passOrder = StudyCafePassOrder.of(seatPass, lockerPass);

        // When
        int totalPrice = passOrder.getTotalPrice();

        // Then
        assertEquals(12000, totalPrice);
    }

    @Test
    void getSeatPass() {
    }

    @Test
    void getLockerPass() {
    }
}
