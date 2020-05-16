/**
 * 
 */
package p3.jdbctemplate.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author maxma
 *
 */
public class CatRowMapper implements RowMapper<Cats>{
	@Override
	public Cats mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cats cat = new Cats();
		cat.setId(rs.getLong("id"));
		cat.setName(rs.getString("name"));
		cat.setType(rs.getString("type"));
		return cat;
	}
}
