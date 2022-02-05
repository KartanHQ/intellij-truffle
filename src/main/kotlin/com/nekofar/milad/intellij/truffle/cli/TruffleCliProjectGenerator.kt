package com.nekofar.milad.intellij.truffle.cli

import com.intellij.execution.filters.Filter
import com.intellij.lang.javascript.boilerplate.NpmPackageProjectGenerator
import com.intellij.lang.javascript.boilerplate.NpxPackageDescriptor
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ContentEntry
import com.intellij.openapi.vfs.VirtualFile
import com.nekofar.milad.intellij.truffle.TruffleBundle
import com.nekofar.milad.intellij.truffle.TruffleIcons
import javax.swing.Icon

class TruffleCliProjectGenerator: NpmPackageProjectGenerator() {
    private val packageName = "truffle"
    private val executable = "truffle"
    private val initCommand = "init"

    override fun getName(): String {
        return TruffleBundle.message("truffle.project.generator.name")
    }

    override fun getDescription(): String {
        return TruffleBundle.message("truffle.project.generator.description")
    }

    override fun filters(project: Project, baseDir: VirtualFile): Array<Filter> {
        return emptyArray()
    }

    override fun customizeModule(p0: VirtualFile, p1: ContentEntry?) {}

    override fun packageName(): String {
        return packageName
    }

    override fun presentablePackageName(): String {
        return TruffleBundle.message("truffle.project.generator.presentable.package.name")
    }

    override fun getNpxCommands(): List<NpxPackageDescriptor.NpxCommand> {
        return listOf(NpxPackageDescriptor.NpxCommand(packageName, executable))
    }

    override fun generatorArgs(project: Project?, dir: VirtualFile?, settings: Settings?): Array<String> {
        return arrayOf(initCommand)
    }

    override fun getIcon(): Icon {
        return TruffleIcons.ProjectGenerator
    }
}