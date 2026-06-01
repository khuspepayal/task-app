package com.mappers;

import com.dto.TaskDto;
import com.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);

}
