package may19dbexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Doctor {
	private int did;
	private String name;
	private String spec;
	private int exp;
	private String description;
}
