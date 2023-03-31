package pl.edu.pjatk.foodbook.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.edu.pjatk.foodbook.authservice.repository.model.Token;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    @Query(value = "select t from Token t where t.userId = :id and (t.expired = false or t.revoked = false)")
    List<Token> findValidTokensByUserId(@Param("id") UUID id);

    Optional<Token> findByToken(String token);
}