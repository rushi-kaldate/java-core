package april30LombokPractice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int id;
	private String name;
	private int age;
	private String DoB;

}
