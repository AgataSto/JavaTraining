import modles.Person;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PersonTest {
    @Test //adnotacja
    void shouldCalculateCorrectSalary()
    {
        Person tomekHanks = new Person("Tom","Hanks");
        int actual = tomekHanks.calculateSalary(3, 3);
        int expected = 9;
        //serce testu-asercja
        assertThat(actual).as("Wynagrodzenie policzone nieprawidłowo").isGreaterThan(5);



    }
@Test
    void shouldCaluculateBonus()
{
    Person tomekHanks = new Person("Tom","Hanks");
    int actual = tomekHanks.giveBonus(3,10);
    int expected = 20;
    assertThat(actual).as("Bonus policzony nieprawidłowo").isEqualTo(expected);
}

    @Test
    void shouldCaluculateBonusforRatingGraterThan10()
    {
        Person tomekHanks = new Person("Tom","Hanks");
        int actual = tomekHanks.giveBonus(11,10);
        int expected = 10;
        assertThat(actual).as("Bonus policzony nieprawidłowo").isEqualTo(expected);
    }
}
