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
11. Define an extra property for the project called __errorFound=false__. Next, define Task1 with extra property __team=['mail1@support.com', 'mail2@support.com']__. Use __onlyIf__ task method in Task1 to send an email to each team member if __errorFound=true__. 
12. Project1: use gradle tasks: copy + javaCompile and sourceSet redefinition.
    - What is the difference between __layout.projectDirectory__ and __layout.buildDirectory__? 
    - Which one do you have to use to copy the content of __src/main/java__ to a new folder __backup_folder__ located in GradleTask folder (project directory) ?
    - Define a copy task (__backupFolder__), that copies the content of __src/main/java/__ to __backup_folder__ in project directory. See [project structure](./images/copy.png) after copy operation.
    - In __backup_folder/org/example__ create the class __Person__ with two private fields (fname, lname) and override the method __toString()__ that returns the whole name. In __Main.java__ (located in __backup_folder/org/example__), create an instance of __Person__ and print it.
    - Set the java source directory equal to __backup_folder__ (sourceSet configuration).
    - Create the folder __classes__ inside the __backup_folder__.
    - Make the __classes__ folder equal to the ouput compilation directory (sourceSet configuration).
    - Create the task compilebackup (__task type = javaCompile__) that generates the .class files after running.
    - From __backup_folder/classes__, use __java__ command to [run](./images/javaRun.png) the __Main.class__ file from the terminal window (cmd in windows).
13. In the previous exercise (__Project 1__), __build__ task did not work because __jar__ settings was not defined. Define the jar configuration that include the __*.class__ files located in __backup_folder/classes/org/example__ and run __clean, build__ gradle tasks. Run the __jar__ [file](./images/Project1_jar.png) generated from the terminal window.