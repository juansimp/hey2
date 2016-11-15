package net.ddns.softux.hey.tests.androidapp.addedittask;

import net.ddns.softux.hey.androidapp.addedittask.AddEditTaskPresenter;
import net.ddns.softux.hey.androidapp.addedittask.AddEditTaskView;
import net.ddns.softux.hey.androidapp.task.TaskViewModel;
import net.ddns.softux.hey.todoapp.task.Task;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AddEditTaskPresenterTest {
    @Test
    public void onSavedTask() throws Exception {
        AddEditTaskView mockAddEditTaskView = mock(AddEditTaskView.class);

        AddEditTaskPresenter addEditTaskPresenter = new AddEditTaskPresenter(mockAddEditTaskView);
        addEditTaskPresenter.onSavedTask(new Task());

        verify(mockAddEditTaskView).setTaskViewModel(any(TaskViewModel.class));
        verify(mockAddEditTaskView).showSuccess();
    }

    @Test
    public void viewGetterAndSetter() {
        AddEditTaskView mockAddEditTaskView = mock(AddEditTaskView.class);
        AddEditTaskPresenter addEditTaskPresenter = new AddEditTaskPresenter();

        addEditTaskPresenter.setView(mockAddEditTaskView);

        assertEquals(mockAddEditTaskView, addEditTaskPresenter.getView());
    }
}