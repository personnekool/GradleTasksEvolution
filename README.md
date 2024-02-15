# GradleTasksEvolution
Exercises to get used to gradle Tasks functionalities

> [!IMPORTANT]
> More information related to gradle can be found in :
> [Gradle Documentation](https://docs.gradle.org/current/userguide/userguide.html)
> [Groovy Language Specification](https://groovy-lang.org/documentation.html)
> Gradle in Action (Benjamin Muschko)
> Mastering Gradle (Mainak Mitra)

## Methodology
Implement the exercises in order to understand evolution. IntelliJ IDEA 2023.3.2 (Community Edition) IDE used to solve the exercises. Each commit will provide the solution for each exercise.

## Exercises
1. Create a gradle [project](./images/Project_Config.png) named GradleTasks in Intelij IDEA 
2. Visualize the [gradle icon](./images/Gradle%20Icon.png) in the IDE. 
3. Navigate the tasks [button to execute task](./images/GradleGUI.png)
4. Select the __build__ task and execute it from the GUI [button to execute task](./images/build%20task.png). (Option 1 to run gradle tasks)
5. Open the __Run Anythin (Ctrl+Ctr)__ window and type: __gradle tasks__ (Option 2 to run gradle tasks). Option used most of the time.
6. Open the __build.gradle__ in the terminal. Type __gradle tasks__ (Option 3 to run gradle tasks)
7. Identify the plugin used in the __build.gradle__ file (id java). Each plugin has some tasks associated. Identify all the tasks available in the IDE and print them in the console using __gradle tasks --all__
8. The project has some properties (mutable / immutable). Go to gradle doc [Project properties](https://docs.gradle.org/current/dsl/org.gradle.api.Project.html) and identify how to set Project properties and project extra properties.
9. Identify how to use __task__ and __tasks__ keywords. See gradle [task](https://docs.gradle.org/current/dsl/org.gradle.api.Task.html#N190F3) and [tasks](https://docs.gradle.org/current/userguide/tutorial_using_tasks.html) uses and properties (mutable / immutable) definition. Create 3 tasks and define properties for them. Print a message at the end of each task (do not use tasks methods) and call each tasks from the command line: gradle task_name
10. Identify the [methods](https://docs.gradle.org/current/dsl/org.gradle.api.Task.html#N19210) available for a task. Define tasks and provide an example for each one (if possible).

    
