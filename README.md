# Java School Interface

## Purpose

This assignment is to help regain a solid grasp on Java OOP fundamentals by building an interface through which a school can manage their students, teachers, and funds.

This project is created with core Java, no other build packages.

## Assignment

Create a "School Management System".

Steps:

- Money management system:

  - Keep track of students' total fees.
  - Fees already paid.
  - Teachers' salaries.

- School:

  - Teachers.
  - Students.
  - Total money earned.
  - Total money spent - teachers' salaries.

- Teacher:

  - id.
  - name.
  - salary.

- Student:
  - id.
  - name.
  - grade.
  - fees paid.
  - fees total.

## Notes

- To spin up a java package, use the command palette (Cmd + Shift + P) and select Java: Create New Project.
- After this is done, configure the .vscode to use a directory of choice for the output path (I like using out instead of bin).
- Create a package within the src folder using the Java Projects project tree in the workspace editor (left sidebar -> JAVA PROJECTS).
  - Once you find the project name and src directory, on the src directory click the + and select create new package.
  - Each . after each name creates a subdirectory -> school.management.system creates three subdirectories. Next time for a simple project just use a smaller path (school), but for larger projects this comes in handy with multiple packages with some classes and packages depending on others.
    - This is all due somewhat due to semantics but also to project and package structure.
- To compile code once it's ready, cd into the directory that contains the package (school.management.system package is located in the src directory, so cd into there for this case).
  - Then, run javac school/management/system/\*.java (this path depends on your project directory structure, but you must be in the directory that contains the package and then run the javac command with a bash path to the files).
  - The \*.java wildcard signifies to the java compiler to grab all files that have a .java extension and compile.
- Then, run the code by cd into the out directory and running java school.management.system.Main.
