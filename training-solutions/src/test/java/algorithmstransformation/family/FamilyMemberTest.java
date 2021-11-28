package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyMemberTest {

	@Test
	void testCreate() {
		FamilyMember familyMember = new FamilyMember("John Doe", 33);

		assertEquals("John Doe", familyMember.getName());
		assertEquals(33, familyMember.getAge());
	}
}