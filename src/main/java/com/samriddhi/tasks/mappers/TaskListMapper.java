package com.samriddhi.tasks.mappers;

import com.samriddhi.tasks.domain.dto.TaskListDto;
import com.samriddhi.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
