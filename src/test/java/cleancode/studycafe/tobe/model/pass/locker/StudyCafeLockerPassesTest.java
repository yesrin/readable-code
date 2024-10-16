package cleancode.studycafe.tobe.model.pass.locker;

import cleancode.studycafe.tobe.model.pass.StudyCafePassType;
import cleancode.studycafe.tobe.model.pass.StudyCafeSeatPass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StudyCafeLockerPassesTest {

    @Test
    void of() {
    }

    @DisplayName("좌석권에 해당하는 사물함 이용권을 찾아 반환한다.")
    @Test
    void findLockerPassBy() {
        {
            // Given
            StudyCafeSeatPass seatPass = StudyCafeSeatPass.of(StudyCafePassType.FIXED, 1, 10000, 0.1);
            StudyCafeLockerPass lockerPass1 = StudyCafeLockerPass.of(StudyCafePassType.FIXED, 1, 2000);
            StudyCafeLockerPass lockerPass2 = StudyCafeLockerPass.of(StudyCafePassType.HOURLY, 2, 3000);

            List<StudyCafeLockerPass> lockerPassList = Arrays.asList(lockerPass1, lockerPass2);
            StudyCafeLockerPasses lockerPasses = StudyCafeLockerPasses.of(lockerPassList);

            // When
            Optional<StudyCafeLockerPass> result = lockerPasses.findLockerPassBy(seatPass);

            // Then
            assertTrue(result.isPresent());
            assertEquals(lockerPass1, result.get());
        }
    }
}
