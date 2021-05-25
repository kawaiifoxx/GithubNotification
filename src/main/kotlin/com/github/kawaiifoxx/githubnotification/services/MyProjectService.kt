package com.github.kawaiifoxx.githubnotification.services

import com.github.kawaiifoxx.githubnotification.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
