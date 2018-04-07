package com.example.teamrocket.data;
import com.example.teamrocket.models.TrackingQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface TrackingQuestionDao extends CrudRepository<TrackingQuestion, Integer> {
}
