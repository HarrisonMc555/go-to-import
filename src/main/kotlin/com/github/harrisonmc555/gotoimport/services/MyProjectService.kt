package com.github.harrisonmc555.gotoimport.services

import com.github.harrisonmc555.gotoimport.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
