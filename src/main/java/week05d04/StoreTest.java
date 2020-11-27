    package week05d04;

    import org.junit.Test;

    import java.time.LocalDate;
    import java.util.List;

    import static junit.framework.TestCase.assertEquals;


    public class StoreTest {

        @Test
        public void ProductGetNameTest() {
            //Given
            String name = "apple";
            //When
            name = new Product("apple", 2021, 8, 11).getName();
            //Then
            assertEquals("apple", name);
        }

        @Test
        public void ProductGetExpireDateTest() {
            //Given
            LocalDate expected = LocalDate.of(2020, 12, 21);
            //When
            LocalDate actual = new Product("apple", 2020, 12, 21).getExpireDate();
            //Then
            assertEquals(expected, actual);
        }

        @Test
        public void StoreAddProductNameTest() {
            //Given
            String expectedName = new Product("apple", 2020, 12, 21).getName();
            //When
            Store store = new Store();
            store.addProduct(new Product("apple", 2020, 12, 21));
            String actualName = store.getProductList().get(0).getName();
            //Then
            assertEquals(expectedName, actualName);
        }

        @Test
        public void StoreAddProductExpireDateTest() {
            //Given
            LocalDate expectedExpireDate = new Product("apple", 2020, 12, 21).getExpireDate();
            //When
            Store store = new Store();
            store.addProduct(new Product("apple", 2020, 12, 21));
            LocalDate actualExpireDate = store.getProductList().get(0).getExpireDate();
            //Then
            assertEquals(expectedExpireDate, actualExpireDate);

        }
    }






