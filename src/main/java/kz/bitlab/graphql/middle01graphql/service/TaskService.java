package kz.bitlab.graphql.middle01graphql.service;

import kz.bitlab.graphql.middle01graphql.model.Task;
import kz.bitlab.graphql.middle01graphql.model.TaskStatus;
import kz.bitlab.graphql.middle01graphql.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public Task createTask(String name){
        Task task = new Task();
        task.setName(name);
        task.setTaskStatus(TaskStatus.IN_PROGRESS);
        return taskRepository.save(task);
    }

    public List<Task> getTaskList(){
        List<Task> taskList = taskRepository.findAll();
        return taskList;
    }

}
