package models;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public interface JournalPublicationRepository extends CrudRepository<JournalPublication, Long> {
}