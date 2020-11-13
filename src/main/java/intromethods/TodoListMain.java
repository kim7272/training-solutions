package intromethods;

import java.util.Arrays;

public class TodoListMain {

    public static void main(String[] args) {

        TodoList todoList = new TodoList();

        todoList.addTodo("Mosás");
        todoList.addTodo("Favágás");
        todoList.addTodo("Főzés");
        todoList.addTodo("Programozás");

        System.out.println(todoList);

        todoList.finishTodos("Főzés");

        System.out.println(todoList);

        todoList.finishAllTodos(Arrays.asList("Programozás","Mosás"));
        System.out.println(todoList.todosToFinish());
        System.out.println(todoList.numberOfFinishedTodos());

    }
}
