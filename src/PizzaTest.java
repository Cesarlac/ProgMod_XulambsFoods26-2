import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PizzaTest {

    @Test
    public void adicionaIngredientesCorretamente(){
        //Arrange
        Pizza pizza = new Pizza();

        //Act
        int quantos = 
            pizza.adicionarIngredientes(4);

        //Assert
        assertEquals(4, quantos);
    }
    
    @Test
    public void verificaSePodeAdicionarIngredientesAcima(){
        //Arrange
        Pizza pizza = new Pizza();
        pizza.adicionarIngredientes(6);
        //Act
        int quantos = pizza.adicionarIngredientes(4);

        //Assert
        assertEquals(6, quantos);

    }

    @Test
    public void verificaValorFinal(){
        //Arrange
        Pizza pizza = new Pizza();
        pizza.adicionarIngredientes(3);
        //Act
        double valorFinal = pizza.valorFinal();

        //Assert
        assertEquals(44, valorFinal, 0.01);

    }
    
}
