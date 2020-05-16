package p3.jdbctemplate.dao;

import java.util.List;
import java.util.Optional;

import p3.jdbctemplate.model.Cats;

public interface CatDAO extends JpaRepository<Cats,Long>{
	public Optional<List<Cats>> findByType(String type);

	public Optional<Cats> findById(Long id); /* For refined search */
}
