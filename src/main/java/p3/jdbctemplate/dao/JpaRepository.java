/**
 * 
 */
package p3.jdbctemplate.dao;

import java.util.List;
import java.util.Optional;

/**
 * @author maxma
 *
 */
public interface JpaRepository<T, ID> {
	public List<T> findAll();
	public Optional<T> findById();
}
