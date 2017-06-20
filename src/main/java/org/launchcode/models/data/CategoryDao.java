package org.launchcode.models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Craig on 6/19/2017.
 */
@Repository
@Transactional
public interface CategoryDao extends CrudRepository {
}
