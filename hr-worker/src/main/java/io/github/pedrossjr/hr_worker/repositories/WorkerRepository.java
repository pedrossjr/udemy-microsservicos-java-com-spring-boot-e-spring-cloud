package io.github.pedrossjr.hr_worker.repositories;

import io.github.pedrossjr.hr_worker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
