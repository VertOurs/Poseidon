package fr.vertours.poseidon.repository;

import fr.vertours.poseidon.domain.CurvePoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurvePointRepository extends JpaRepository<CurvePoint, Integer> {
}
