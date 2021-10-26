package com.github.zhsc17.test.services

import com.intellij.openapi.project.Project
import com.github.zhsc17.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
