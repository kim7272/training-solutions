package week06d02;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class StoreTest {

    @Test

    public void GetProductByCategoryNameTest(){
        // Given
        int expectedProductsInCategory = 2;
        //When
        Product product_1  =  new Product();
        product_1.setCategory(Category.BACKEDGOODS);
        product_1.setName("bread");
        product_1.setPrice(100);

        Product product_2  =  new Product();
        product_2.setCategory(Category.BACKEDGOODS);
        product_2.setName("cake");
        product_2.setPrice(200);

        Product product_3  =  new Product();
        product_3.setCategory(Category.FROZEN);
        product_3.setName("icecream");
        product_3.setPrice(250);

        int actualProductsInCategory = new Store(Arrays.asList(product_1,product_2,product_3)).
                getProductByCategoryName(Category.BACKEDGOODS);
        //Then
        assertEquals(expectedProductsInCategory, actualProductsInCategory);



    }


}