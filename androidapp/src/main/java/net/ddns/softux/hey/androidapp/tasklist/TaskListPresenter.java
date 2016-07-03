package net.ddns.softux.hey.androidapp.tasklist;

import net.ddns.softux.hey.todoapp.task.Task;
import net.ddns.softux.hey.todoapp.tasklist.OnTaskListLoadListener;

import java.util.List;

/**
 * Created by juan on 3/07/16.
 */

public class TaskListPresenter implements OnTaskListLoadListener {
    public TaskListView view;

    @Override
    public void onTaskListLoad(List<Task> tasks) {
        TaskListViewModel taskViewModelList = new TaskListViewModel();
        taskViewModelList.addAll(tasks);
        view.onTaskListLoad(taskViewModelList);
    }
}
