package com.samriddhi.tasks.mappers;

import com.samriddhi.tasks.domain.dto.TaskDto;
import com.samriddhi.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
