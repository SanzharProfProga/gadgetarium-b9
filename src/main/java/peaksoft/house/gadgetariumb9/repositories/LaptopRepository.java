package peaksoft.house.gadgetariumb9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.house.gadgetariumb9.models.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}