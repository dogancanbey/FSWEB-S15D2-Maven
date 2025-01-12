package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;
import org.example.entity.TaskData;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("workintech", "dummy", "ann", Status.IN_PROGRESS, Priority.HIGH);
        Task taskAnn2 = new Task("workintech", "dummy2", "ann", Status.IN_PROGRESS, Priority.HIGH);
        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);

        Set<Task> bobsTasks = new HashSet<>();
        Task bobsTask = new Task("workintech", "dummy", "bob", Status.IN_PROGRESS, Priority.HIGH);
        Task bobsTasks2 = new Task("workintech", "dummy2", "bob", Status.IN_PROGRESS, Priority.HIGH);
        bobsTasks.add(bobsTask);
        bobsTasks.add(bobsTasks2);

        Set<Task> carolsTasks = new HashSet<>();
        Task carolsTask = new Task("workintech", "dummy", "carol", Status.IN_PROGRESS, Priority.HIGH);
        Task carolsTask2 = new Task("workintech", "dummy2", "carol", Status.IN_PROGRESS, Priority.HIGH);
        carolsTasks.add(carolsTask);
        carolsTasks.add(carolsTask2);




        Set<Task> unassignedTasks = new HashSet<>();
        Task unassignedTask = new Task("workintech", "dummy", null, Status.IN_PROGRESS, Priority.HIGH);
        unassignedTasks.add(unassignedTask);


        TaskData taskData = new TaskData(annsTasks,bobsTasks,carolsTasks,unassignedTasks);
        System.out.println("bobstasks " +taskData.getTasks("bob"));
        System.out.println("annstasks " +taskData.getTasks("ann"));
        System.out.println("alltasks " +taskData.getTasks("all"));

        System.out.println("unassigned tasks : " + taskData.getDifferences(unassignedTasks, taskData.getTasks("all")));

    }
}