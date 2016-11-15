package net.ddns.softux.hey.androidapp.tasklist;

import net.ddns.softux.hey.androidapp.task.TaskViewModel;
import net.ddns.softux.hey.todoapp.task.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskListViewModel extends ArrayList<TaskViewModel> {
    public void addAll(List<Task> tasks) {
        for (Task task : tasks) {
            add(new TaskViewModel(task));
        }
    }
}
