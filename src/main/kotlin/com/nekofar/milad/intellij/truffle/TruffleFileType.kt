package com.nekofar.milad.intellij.truffle

import com.intellij.lang.javascript.JavascriptLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object TruffleFileType: LanguageFileType(JavascriptLanguage.INSTANCE) {
    override fun getName(): String = TruffleBundle.message("truffle.file.type.name")
    override fun getDescription(): String = TruffleBundle.message("truffle.file.type.description")
    override fun getDefaultExtension(): String = "js"
    override fun getIcon(): Icon = TruffleIcons.FileType
}