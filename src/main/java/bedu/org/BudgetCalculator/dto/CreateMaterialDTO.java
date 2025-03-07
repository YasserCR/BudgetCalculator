package bedu.org.BudgetCalculator.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateMaterialDTO {
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 1, message = "Quantity must be greater than or equal to 1")
    private int quantity;

    @DecimalMin(value = "0.0", message = "Price must be greater than or equal to 0.0")
    private double price;
}
