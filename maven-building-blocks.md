# Maven: Building Blocks

Maven has three main groups of actions for executing builds or other tasks.

Three Main Groups

- Goals
- Phases
- Lifecycles

## Goals

A goal is the lowest level of work in Maven, the equivalent of a task in Ant. For example, a goal would be to package a JAR file.

Often the goal name is a combination of the Maven plugin name and the goal name within that plugin. For example, "compiler:compile".

- Like Ant task
- Plugin + goal name
- *Example*
  - **compiler:compile** (**compile** goal on **Compiler** plugin)

## Phases

Phases map one or many goals that are related into a greater lifecycle. For example, the compile phase may call the "compiler:compile" goal for the JAR projects.

- One or Many Goals
  - Part of Greater Lifecycle
- Example
  - **compile** maps to **compiler:compile**

## Lifecycles

Lifecycle is a collection of related phases. For example, the **package** phase is combined within the default build lifecycle for JAR projects. When you specify a phase within a lifecycle, all phases leading up to that phase are executed. Using the example before, if we call the **package** phase, the compile, test, and several other phases are executed first.

## Summary

- Lifecycles contain Phases
- Phases map to Goals
- Many Lifecycles
- Based on Maven Project
- Enterprise Application vs Simple JAR
