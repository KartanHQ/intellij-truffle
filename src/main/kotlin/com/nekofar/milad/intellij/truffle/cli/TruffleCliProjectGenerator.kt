package com.nekofar.milad.intellij.truffle.cli

import com.intellij.execution.filters.Filter
import com.intellij.lang.javascript.boilerplate.NpmPackageProjectGenerator
import com.intellij.lang.javascript.boilerplate.NpxPackageDescriptor
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ContentEntry
import com.intellij.openapi.vfs.VirtualFile
import com.nekofar.milad.intellij.truffle.TruffleBundle
import com.nekofar.milad.intellij.truffle.TruffleBundle.message
import com.nekofar.milad.intellij.truffle.TruffleIcons
import javax.swing.Icon

class TruffleCliProjectGenerator: NpmPackageProjectGenerator() {
    private val packageName = "truffle"
    private val executable = "truffle"
    private val initCommand = "init"

    override fun getName() = message("truffle.project.generator.name")

    override fun getDescription() = message("truffle.project.generator.description")

    override fun filters(project: Project, baseDir: VirtualFile) = emptyArray<Filter>()

    override fun customizeModule(p0: VirtualFile, p1: ContentEntry?) {}

    override fun packageName() = packageName

    override fun presentablePackageName() = message("truffle.project.generator.presentable.package.name")

    override fun getNpxCommands() = listOf(NpxPackageDescriptor.NpxCommand(packageName, executable))

    override fun generatorArgs(project: Project?, dir: VirtualFile?, settings: Settings?) = arrayOf(initCommand)

    override fun getIcon() = TruffleIcons.ProjectGenerator
}
