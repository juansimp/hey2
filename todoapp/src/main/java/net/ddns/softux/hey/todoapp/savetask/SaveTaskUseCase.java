package net.ddns.softux.hey.todoapp.savetask;

import net.ddns.softux.hey.todoapp.task.Task;

/**
 * Created by juan on 30/06/16.
 */
public interface SaveTaskUseCase {
    void save(Task task, OnSaveTaskListener onSaveTaskListener);
    void check(Task task, OnSaveTaskListener onSaveTaskListener);
    void uncheck(Task task, OnSaveTaskListener onSaveTaskListener);
}
