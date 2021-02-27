 package exam03retake02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TodoList {

    private List<Todo> todoList = new ArrayList<>();

    @Override
    public String toString() {
        return "" + todoList + "";
    }

    public List<Todo> addTodo(Todo todo){
        todoList.add(todo);
        return todoList;
    }

    public List<Todo> getTodos(){
        return todoList;
    }

    public int getNumberOfItemsLeft(){
        int counter = 0;
        for (Todo item : todoList){
            if (item.getState() == State.NON_COMPLETED){
                counter =  counter + 1;
            }
        }
        return counter;

    }

    public List<String> getPriorityOne(){
        List<String> texts = new ArrayList<>();
        for (Todo item : todoList) {
            if (item.getPriority() == 1) {
                texts.add(item.getText());
            }
        }
        return texts;
    }

    public List<String> getMostImportantTodosText(){
        List<String> result = new ArrayList<>();
        result = getPriorityOne();
        if (result.isEmpty()){
            Collections.sort(todoList);
            result.add(todoList.get(0).getText());
            return result;
        }
        else {
            return result;
        }
    }

    public void deleteCompleted() {
        List<Todo> toRemove = new ArrayList<>();
        for (Todo item : todoList) {
            if (item.getState() == State.COMPLETED) {
                toRemove.add(item);
            }
        }
        todoList.removeAll(toRemove);
    }
}



