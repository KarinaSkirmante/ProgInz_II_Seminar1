package lv.venta.repo.security;

import org.springframework.data.repository.CrudRepository;

import lv.venta.models.security.MyUser;

public interface IMyUserRepo extends CrudRepository<MyUser, Integer>{

	MyUser findByUsername(String username);

}
