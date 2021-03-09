package br.com.gabrielle.springlab.repositories;

import br.com.gabrielle.springlab.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    //Metodo onde vai procurar um unico user atraves do id.

    User findById(Integer id);


}
