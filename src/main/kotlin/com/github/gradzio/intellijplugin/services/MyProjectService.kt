package com.github.gradzio.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.gradzio.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
