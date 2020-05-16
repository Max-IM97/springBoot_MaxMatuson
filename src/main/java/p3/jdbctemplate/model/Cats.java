package p3.jdbctemplate.model;




import lombok.AllArgsConstructor;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Cats {
	 private Long id;
	 private String name;
	 private String type;

	public Cats(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	
	}
}
